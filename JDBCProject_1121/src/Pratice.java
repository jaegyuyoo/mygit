import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Pratice {

	public static Connection makeConnection() {
		
		String url = "jdbc:oracle:thin:@192.168.0.36:1521:xe";
		String id = "hr";
		String password = "1234";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("오라클 접속 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}
		return con;
	}
	public static void main(String[] agrs) throws SQLException{
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEES");
		
		int empNo;
		String eName;
		String job;
		String mgr;
		Date hireDate;
		int sal;
		double comm;
		String deptNo;
		
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
