import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class SQLSelectTest {

	public static Connection makeConnection() {
		Scanner input1 = new Scanner(System.in);
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:mysql://localhost:3306/book_db
		// 127.0.0.1, 192.168.0.36, 타인ip도가능(방화벽)
		String id = "hr"; // root
		String password = "1234"; // 1234
		Connection con = null;
		
		do {
			System.out.println("아이디: ");
			id = input1.next();
			System.out.println("패스워드: ");
			password = input1.next();
			
			if(id.equals("hr") && password.equals("1234")) {
				break; // 가장가까운 반복문 탈출 
			}
		}while(true); // 무한반복 시키려고
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // com.mysql.jdbc.Driver
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = null;
		// ResultSet rs = stmt.executeQuery("SELECT  * FROM EMPLOYEES");

		String sql; 
		int inputSal;
		
		int empNo;
		String eName;
		String job;
		String mgr;
		Date hireDate;
		int sal;
		double comm;
		String deptNo;

		System.out.println("직원의 급여 입력: ");
		inputSal = input.nextInt(); 
		
		System.out.println("입력한 급여 " + inputSal + " 보다 많은 직원");
		
		sql = "select * from employees where salary >= " + inputSal + " order by salary desc"; // " "쌍따옴표 안에는 대소문자 상관없다.
		rs = stmt.executeQuery(sql);
		
				
		System.out.println("사원번호\t사원명\t\t업무\t\t상관번호\t\t입사일\t\t금여\t\t커미션\t\t부서번호");

		while (rs.next()) {
			empNo = rs.getInt("EMPLOYEE_ID");
			eName = rs.getString("FIRST_NAME");
			job = rs.getString("JOB_ID");
			mgr = rs.getString("MANAGER_ID");
			hireDate = rs.getDate("HIRE_DATE");
			sal = rs.getInt("SALARY");
			comm = rs.getDouble("COMMISSION_PCT");
			deptNo = rs.getString("DEPARTMENT_ID");

			System.out.println(empNo + "\t" + eName + "   \t" + job + "  \t" + mgr + "\t" + hireDate + "\t" + sal + "\t"
					+ comm + "\t" + deptNo);
		}

	}
}
