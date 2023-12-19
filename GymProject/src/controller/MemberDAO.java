package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.MemberVO;

//멤버등록 DAO클래스
public class MemberDAO {

	// 멤버 등록
	public void setMemberRegiste(MemberVO mvo) throws Exception {

		String sql = "insert into member(m_no, m_name, m_number, m_phone, m_address, m_period, m_startdate, m_enddate)"
				+ " values(member_seq.nextval, ?, ?, ?, ?, ? ,? ,?)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mvo.getM_name());
			pstmt.setString(2, mvo.getM_number());
			pstmt.setString(3, mvo.getM_phone());
			pstmt.setString(4, mvo.getM_address());
			pstmt.setString(5, mvo.getM_period());
			pstmt.setString(6, mvo.getM_startdate());
			pstmt.setString(7, mvo.getM_enddate());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println(mvo.getM_name() + " 회원 등록완료.");
				System.out.println("회원 등록 성공!!!");
			} else {
				System.out.println("회원 등록 실패!!!");
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

	// 멤버 수정
	public void setMemberUpdate(MemberVO mvo) throws Exception {

		String sql = "update member set m_name=?, m_number=?, m_phone=?, m_address=?, m_period=?, m_startdate=?, m_enddate=? where m_no =?";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mvo.getM_name());
			pstmt.setString(2, mvo.getM_number());
			pstmt.setString(3, mvo.getM_phone());
			pstmt.setString(4, mvo.getM_address());
			pstmt.setString(5, mvo.getM_period());
			pstmt.setString(6, mvo.getM_startdate());
			pstmt.setString(7, mvo.getM_enddate());
			pstmt.setInt(8, mvo.getM_no());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println(mvo.getM_name() + " 회원 수정 완료.");
				System.out.println("회원 수정 성공!!!");
			} else {
				System.out.println("회원 수정 실패!!!");
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

	// 멤버 삭제
	public void setMemberDelete(int m_no) throws Exception {

		StringBuffer sql = new StringBuffer();
		sql.append("delete from member where m_no = ?");

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, m_no);

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println("회원 삭제 완료.");
				System.out.println("회원 삭제 성공!!!");
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

	// 멤버 목록
	public void getMemberTotalList() throws Exception {

		String sql = "select * from member order by m_no";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO mVo = null;

		try {

			con = DBUtil.getConnection(); // db연결
			pstmt = con.prepareStatement(sql); // 메서드, ? 통해 데이전달
			rs = pstmt.executeQuery(); // ResultSet은 prepareStatement를 통해 값을 저장
			// 이때 사용하는 메소드는 executeQurery(String sql) 메소드를 통해 저장

			System.out.println("일련번호\t이름\t주민번호\t전화번호\t\t주소\t회원권기간\t회원권시작일\t회원권종료일");

			while (rs.next()) {// 한행씩 반복처리
				mVo = new MemberVO();
				mVo.setM_no(rs.getInt("m_no"));
				mVo.setM_name(rs.getString("m_name"));
				mVo.setM_number(rs.getString("m_number"));
				mVo.setM_phone(rs.getString("m_phone"));
				mVo.setM_address(rs.getString("m_address"));
				mVo.setM_period(rs.getString("m_period"));
				mVo.setM_startdate(rs.getString("m_startdate"));
				mVo.setM_enddate(rs.getString("m_enddate"));

				System.out.println(mVo.getM_no() + "\t" + mVo.getM_name() + "\t" + mVo.getM_number() + "\t"
						+ mVo.getM_phone() + "\t" + mVo.getM_address() + "\t" + mVo.getM_period() + "\t"
						+ mVo.getM_startdate() + "\t" + mVo.getM_enddate());
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

}
