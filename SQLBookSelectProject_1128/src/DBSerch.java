import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSerch {
	public static void main(String[] args) {

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

		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM TEST01_TBL"; // Select 문작성
			ResultSet rs = stmt.executeQuery(sql); // 질의진행
			while (rs.next()) { // 결과셋을 가지고 있는 rs객체를 통해서 결과문 얻기
				String s = rs.getInt("num") + "\t";
				s += rs.getString("id") + "\t";
				s += rs.getString("name") + "\t";
				s += rs.getInt("age") + "\n";
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println("SELECT 실패! : " + e.getMessage());
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception ex) {
			}
		}
	} // main end
} // class end
