package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.PT_ReserveVO;
import model.TrainerVO;
import oracle.jdbc.internal.PDBChangeEvent;
import model.MemberVO;

//pt예약관리 DAO클래스
public class PT_ReserveDAO {

	// PT회원 입력(등록)
	public void setPT_reserveRegiste(PT_ReserveVO pvo) throws Exception {

		String sql = "insert into pt_reserve(p_no, m_no, t_no, t_available, p_count, p_date, p_payment)"
				+ "values(pt_reserve_seq.nextval, ?, ?, ?, ?, sysdate, ?)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pvo.getM_no());
			pstmt.setInt(2, pvo.getT_no());
			pstmt.setString(3, pvo.getT_available());
			pstmt.setInt(4, pvo.getP_count());
			pstmt.setInt(5, pvo.getP_payment());
			// 물음표의 갯수와 같아야한다.

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println(pvo.getM_no() + " PT회원 등록완료");
				System.out.println("PT회원 등록 성공!!!");
			} else {
				System.out.println("PT회원 등록 실패!!!");
			}
		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
	}

	// PT회원 등록 삭제
	public void setPT_reservDelete(int p_no) throws Exception {

		StringBuffer sql = new StringBuffer();
		sql.append("delete from pt_reserve where p_no = ?");

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, p_no);

			int i = pstmt.executeUpdate();

			if (i == 1) { // 쿼리문이 제대로 실행되면 1이다.
				System.out.println("PT회원 삭제 완료.");
				System.out.println("PT회원 삭제 성공!!!");
			} else {
				System.out.println("회원 삭제 실패!!!");
			}
		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
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

	// PT회원 목록
	public void getPT_ReserveTotalList() throws Exception {

		String sql = "select * from pt_reserve";

		// 실행하기위해 pstmt = con.prepareStatement(sql);

		Connection con = null;
		PreparedStatement pstmt = null; // SQL문을 실행할 때 사용하는 인터페이스이다.
		ResultSet rs = null; // 쿼리문결과를 resultset에 넣어준다.

		PT_ReserveDAO pd = new PT_ReserveDAO();
		PT_ReserveVO pvo = new PT_ReserveVO();

		MemberDAO md = new MemberDAO();
		MemberVO mvo = new MemberVO();

		TrainerDAO td = new TrainerDAO();
		TrainerVO tvo = new TrainerVO();

		try {

			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("PT일련번호\tPT피티횟수\tPT등록일자\t\t회원일련번호\t트레이너일련번호\t수업가능시간\tPT결제금액");

			while (rs.next()) {
				pvo = new PT_ReserveVO(); // PT_ReserveVO통해 온 값은 pvo이다.
				pvo.setP_no(rs.getInt("p_no"));
				pvo.setP_count(rs.getInt("p_count"));
				pvo.setP_date(rs.getDate("p_date"));
				pvo.setM_no(rs.getInt("m_no"));

				pvo.setT_no(rs.getInt("t_no"));
				pvo.setT_available(rs.getString("t_available"));

				pvo.setP_payment(rs.getInt("p_payment"));

				System.out
						.println(pvo.getP_no() + "\t" + pvo.getP_count() + "\t" + pvo.getP_date() + "\t" + pvo.getM_no()
								+ "\t\t" + pvo.getT_no() + "\t\t" + pvo.getT_available() + "\t\t" + pvo.getP_payment());
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

	// getT_payment 메서드를 생성한다. (p_count * t_cost) 계산은 sql쿼리문으로 해야한다
	// getP_count 메서드 생성

	public int getP_count(int t_no) {

		int p_count = 0;

		String sql = "select p_count from pt_reserve where t_no = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t_no); // 매게변수
			rs = pstmt.executeQuery();

			if (rs.next()) {
				p_count = rs.getInt("p_count"); // 컬럼명
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
		return p_count;
	}

	// getP_payment(트레이너 기본급)
	// pt_reserve 테이블에서 p_payment 값을(t_no) 가져오기 위해 메서드 생성
	public int getP_payment(int t_no) {

		int p_payment = 0;

		String sql = "select p_payment from pt_reserve where t_no =?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t_no);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				p_payment = rs.getInt("p_payment");
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
		return p_payment;
	}
}

//(추후) PT 횟수연장, 연기, 환불

/*
 * // getT_cost 메서드 public int getT_cost(int t_no) {
 * 
 * int t_cost = 0;
 * 
 * String sql = "select t_cost from trainer where t_no = ?"; Connection con =
 * null; PreparedStatement pstmt = null; ResultSet rs = null;
 * 
 * try {
 * 
 * con = DBUtil.getConnection(); pstmt = con.prepareStatement(sql);
 * pstmt.setInt(1, t_no); rs = pstmt.executeQuery();
 * 
 * if (rs.next()) { // rs = pstmt.executeQuery(); 실행하기위한 조건문 t_cost =
 * rs.getInt("t_cost");
 * 
 * }
 * 
 * } catch (SQLException se) { System.out.println(se); } catch (Exception e) {
 * System.out.println(e); } finally { try { if (rs != null) rs.close(); if
 * (pstmt != null) pstmt.close(); if (con != null) con.close(); } catch
 * (SQLException se) { } }
 * 
 * return t_cost; }
 * 
 * // getP_count 메서드 public int getP_count(int p_no) {
 * 
 * int p_count = 0;
 * 
 * String sql = "select p_count from pt_reserve where p_no = ?"; Connection con
 * = null; PreparedStatement pstmt = null; ResultSet rs = null;
 * 
 * try {
 * 
 * con = DBUtil.getConnection(); pstmt = con.prepareStatement(sql);
 * pstmt.setInt(1, p_no); rs = pstmt.executeQuery();
 * 
 * if (rs.next()) { // rs = pstmt.executeQuery(); 실행하기위한 조건문 p_count =
 * rs.getInt("p_count");
 * 
 * }
 * 
 * } catch (SQLException se) { System.out.println(se); } catch (Exception e) {
 * System.out.println(e); } finally { try { if (rs != null) rs.close(); if
 * (pstmt != null) pstmt.close(); if (con != null) con.close(); } catch
 * (SQLException se) { } }
 * 
 * return p_count; }
 */