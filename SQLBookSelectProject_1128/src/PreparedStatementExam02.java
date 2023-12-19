import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExam02 {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

	public static void main(String arg[]) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "1234");

			// 생성
			String sql = "create table syh1011(id varchar2(10)," + "password varchar2(10))";
			pstmt = con.prepareStatement(sql);
			int updateCount = pstmt.executeUpdate();
			System.out.println("createCount: " + updateCount);

			// 삽입
			sql = "insert into syh1011 values(?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "syh2022");
			pstmt.setString(2, "1111");
			updateCount = pstmt.executeUpdate();
			System.out.println("insetCount: " + updateCount);

			// 결과확인
			sql = "select * from syh1011";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("id: " + rs.getString(1));
				System.out.println(" , password: " + rs.getString(2));
			}

			// 삭제(drop)
			sql = "drop table syh1011";
			pstmt = con.prepareStatement(sql);
			updateCount = pstmt.executeUpdate();
			System.out.println("dropCount: " + updateCount);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException sqle) {
			}
		}
	}
}
