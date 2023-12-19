import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTable {
	public static void main(String args[]) {

		Connection conn = null;
		Statement stmt = null;

		String url = "jdbc:oracle:thin:@192.168.0.36:1521:xe"; // jdbc:mysql://localhost:3306/book_db
		// localhost, 127.0.0.1, 타인ip도가능(방화벽)
		String user = "hr"; // root
		String passwd = "1234"; // 1234
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // com.mysql.jdbc.Driver
			conn = DriverManager.getConnection(url, user, passwd);
		} catch (ClassNotFoundException ex1) {
			System.out.println("드라이버 로딩 에러 : " + ex1.toString());
			return;
		} catch (SQLException ex2) {
			System.out.println("DB 접속 실패 : " + ex2.toString());
			return;
		}
		// sql
		String sql = "create table test01_tbl(num number(6), id varchar2(10), name varchar2(20), age number(3))";

		try {
			System.out.println("DB연결 성공");
			stmt = conn.createStatement(); // 질의 객체 생성
			stmt.executeUpdate(sql); // 질의 수행
		} catch (Exception ex3) {
			System.out.println("SQL 문 수행 오류 : " + ex3.toString());
			return;
		} finally {
			try {
				stmt.close(); // 객체반환
				conn.close(); // 연결 끊기
			} catch (Exception ex4) {
			}
		}
			System.out.println("DB 접속 및 SQL 문 수행 성공!");
	} // main end 
} // class end 
