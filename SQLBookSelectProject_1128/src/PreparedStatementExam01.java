import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class PreparedStatementExam01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String url = "jdbc:oracle:thin:@192.168.0.36:1521:xe"; // jdbc:mysql://localhost:3306/book_db
		// localhost, 127.0.0.1, 타인ip도가능(방화벽)
		String user = "hr"; // root
		String passwd = "1234"; // 1234

		BufferedReader in_empno = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // com.mysql.jdbc.Driver
		} catch (ClassNotFoundException ex1) {
			System.out.println("드라이버 로딩 에러 : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB 접속 실패 : " + ex2.toString());
			return;
		}

		try {
			conn = DriverManager.getConnection(url, user, passwd);
			String empno; // 사워번호
			System.out.print("사원번호 입력: ");
			empno = in_empno.readLine();

			String sql = "select FIRST_NAME, JOB_ID, SALARY from EMPLOYEES where EMPLOYEE_ID = ?";

			pstmt = conn.prepareStatement(sql); // sql문 전송 객체 생성
			pstmt.setString(1, empno);
			rs = pstmt.executeQuery(); // 질의문 수행

			while (rs.next()) {
				System.out.println(
						"ename : " + rs.getString(1) + "   job: " + rs.getString(2) + "   sal: " + rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(" 실패!! : " + e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ex) {
			}

		}
	}
}
