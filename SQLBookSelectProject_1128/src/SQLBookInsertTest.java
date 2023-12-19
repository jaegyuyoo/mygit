import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLBookInsertTest {
	public static Connection makeConnection() {
		String url = "jdbc:oracle:thin:@192.168.0.36:1521:xe"; // jdbc:mysql://localhost:3306/book_db
		// localhost, 127.0.0.1, 타인ip도가능(방화벽)
		String id = "hr"; // root
		String password = "1234"; // 1234
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // com.mysql.jdbc.Driver
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연걸 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}
		return con;
	}

	public static void main(String arg[]) {
		addBook("Artificial Intellegence", "Addison Wesley", "2002", 35000);
	}

	private static void addBook(String title, String publishser, String year, int price) {
		Connection con = makeConnection();
		try {
			Statement stmt = con.createStatement();
			String s = "INSERT INTO book(book_id, title, publisher, year, price) VALUES";
			s += "(" + "book_id_seq.nextval" + ",'" + title + "','" + publishser + "','" + year + "','" + price + "')";
			System.out.println(s);
			int i = stmt.executeUpdate(s);
			if (i == 1)
				System.out.println("레코드 추가 성공");
			else
				System.out.println("레코드 추가 실패");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}
