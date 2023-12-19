package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.TrainerVO;

public class TrainerDAO {

	// 트레이너 정보 등록
	public void setTrainerRegister(TrainerVO tvo) throws Exception {

		String sql = "insert into trainer(t_no, t_name, t_number, t_phone, t_address, t_cost, t_available, t_salary, t_specialty) "
				+ "values(trainer_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, tvo.getT_name());
			pstmt.setString(2, tvo.getT_number());
			pstmt.setString(3, tvo.getT_phone());
			pstmt.setString(4, tvo.getT_address());
			pstmt.setInt(5, tvo.getT_cost());
			pstmt.setString(6, tvo.getT_available());
			pstmt.setString(7, tvo.getT_salary());
			pstmt.setString(8, tvo.getT_specialty());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println(tvo.getT_name() + "트레이너 등록 완료.");
				System.out.println("트레이너 등록 성공!!!");
			} else {
				System.out.println("트레이너 등록 실패!!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				// 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
	}

	// 트레이너 정보 수정
	public void setTrainerUpdate(TrainerVO tvo) throws Exception {

		String sql = "update trainer set t_name=?, t_number=?, t_phone=?, t_address=?, t_cost=?, t_available=?, "
				+ "t_salary=?, t_specialty=? where t_no=?";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, tvo.getT_name());
			pstmt.setString(2, tvo.getT_number());
			pstmt.setString(3, tvo.getT_phone());
			pstmt.setString(4, tvo.getT_address());
			pstmt.setInt(5, tvo.getT_cost());
			pstmt.setString(6, tvo.getT_available());
			pstmt.setString(7, tvo.getT_salary());
			pstmt.setString(8, tvo.getT_specialty());
			pstmt.setInt(9, tvo.getT_no());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println(tvo.getT_name() + "회원정보 수정 완료");
			} else {
				System.out.println(tvo.getT_name() + "회원정보 수정 실패");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				// 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
	}

	// 트레이너 정보 삭제
	public void setTrainerDelete(int t_no) throws Exception {

		StringBuffer sql = new StringBuffer();
		sql.append("delete from trainer where t_no = ?");

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, t_no);

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println("트레이너 정보 삭제 완료");
				System.out.println("트레이너 정보 삭제 성공!!!");
			} else {
				System.out.println("트레이너 정보 삭제 실패!!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				// 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}

	}

	// 트레이너 목록 조회
	public void getTrainerTotalList() throws Exception {

		String sql = "select * from trainer order by t_no";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		TrainerVO tvo = null;

		try {

			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("트레이너일련번호\t이름\t주민등록번호\t전화번호\t\t주소\t\tPT수업료\t\t수업요일/오전(오후)\t급여\t특기\tPT결제액");

			while (rs.next()) {
				tvo = new TrainerVO();
				tvo.setT_no(rs.getInt("t_no"));
				tvo.setT_name(rs.getString("t_name"));
				tvo.setT_number(rs.getString("t_number"));
				tvo.setT_phone(rs.getString("t_phone"));
				tvo.setT_address(rs.getString("t_address"));
				tvo.setT_cost(rs.getInt("t_cost"));
				tvo.setT_available(rs.getString("t_available"));
				tvo.setT_salary(rs.getString("t_salary"));
				tvo.setT_specialty(rs.getString("t_specialty"));

				System.out.println(tvo.getT_no() + "\t\t" + tvo.getT_name() + "\t" + tvo.getT_number() + "\t\t"
						+ tvo.getT_phone() + "\t" + tvo.getT_address() + "\t\t" + tvo.getT_cost() + "\t\t"
						+ tvo.getT_available() + "\t\t" + tvo.getT_salary() + "\t" + tvo.getT_specialty());
			}
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		}
	}

	// getT_available 메서드를 생성한다.
	public String getT_available(int t_no) {

		String t_available = "";

		String sql = "select t_available from trainer where t_no = ?"; // trainer 테이블에서 t_available컬럽의 값을 select해 온다.
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t_no);
			rs = pstmt.executeQuery();

			if (rs.next()) { // rs = pstmt.executeQuery(); 실행하기위한 조건문
				t_available = rs.getString("t_available");

			}

		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		}

		return t_available;
	}

	public int getT_cost(int t_no) {

		int t_cost = 0;

		String sql = "select t_cost from trainer where t_no = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t_no);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				t_cost = rs.getInt("t_cost");
			}
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		}
		return t_cost;
	}

	// 트레이너 기본급 
	public void setTrainerTotalSalary() throws Exception {

	}
	
	// getT_salary (트레이너 기본급)
	public int getT_salary(int t_no) {

		int t_salary = 0;

		String sql = "select t_salary from trainer where t_no =?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t_no);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				t_salary = rs.getInt("t_salary");
			}
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		}
		return t_salary;
	}
	
}
