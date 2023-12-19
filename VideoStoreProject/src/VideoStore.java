import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class VideoStore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menuNumber; // 메뉴번호 선택

		while (true) {
			menu(); // 메뉴호출

			System.out.println("번호 입력: ");
			menuNumber = input.nextInt();

			switch (menuNumber) {
			case 1:
				gogekRegister();
				break;
			case 2:
				gogekSearch();
				break;
			case 3:
				videoRegister();
				break;
			case 4:
				videoList();
				break;
			case 5:
				leadReturn();
				break;
			case 6:
				leadReturnList();
				break;
			case 7:
				System.out.println("\n미래 비디오 대여 시스템 종료 GoobBye!");
				System.exit(1);
			default:
				System.out.println("해당 번호만 입력하세요");
				break;
			}
		}
	}

	// 비디오 대여 목록
	public static void leadReturnList() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_gogek = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in_video = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // com.mysql.jdbc.Driver
			System.out.println("DB 접속 성공");
		} catch (ClassNotFoundException ex1) {
			System.out.println("드라이버 로딩 에러 : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB 접속 실패 : " + ex2.toString());
			return;
		}

		try {

			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.36:1521:xe", "hr", "1234");

			String sql = "";

			sql = "select lr_code, g.g_name, v.v_title, i_date, r_plan_date, i_total_pay"
					+ " from lend_return l, v_gogek g, video v" // 한칸띄우고 하겠다.
					+ " where g.g_code = l.g_code and l.v_code = v.v_code";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("\n대여 리스트");

			System.out.println("대여번호\t고객번호\t비디오번호\t대여일자\t\t\t반납예정일\t\t\t대여총액");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getInt(6) + "원");
			}
		} catch (Exception sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					;
				con.close();
			} catch (Exception sqle) {
			}
		}
	}

	// 비디오 대여
	public static void leadReturn() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_gogek = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in_video = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // com.mysql.jdbc.Driver
			System.out.println("DB 접속 성공");
		} catch (ClassNotFoundException ex1) {
			System.out.println("드라이버 로딩 에러 : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB 접속 실패 : " + ex2.toString());
			return;
		}

		try {

			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.36:1521:xe", "hr", "1234");

			String searchName; // 고객 이름 검색
			String searchTitle; // 비디오 검색
			String sql = "";
			int g_code; // 고객코드
			int v_code; // 비디오코드
			int v_pay; // 대여금액
			int insertCount;

			System.out.println("\n=== 고객 검색 ===");
			System.out.println("고객 이름 입력: ");
			searchName = in_gogek.readLine();

			System.out.println("\n=== 비디오 검색 ===");
			System.out.println("비디오 제목 입력: ");
			searchTitle = in_video.readLine();

			sql = "select g_code, v_code, v_pay" 
					+ " from v_gogek, video" 
					+ " where g_name = ? and v_title =?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, searchName);
			pstmt.setString(2, searchTitle);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				g_code = rs.getInt("g_code");
				v_code = rs.getInt("v_code");
				v_pay = rs.getInt("v_pay");

				sql = "insert into lend_return" + " values(lend_retrun_seq.nextval , ?, ?, sysdate, sysdate+3, ?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, g_code);
				pstmt.setInt(2, v_code);
				pstmt.setInt(3, v_pay);

				insertCount = pstmt.executeUpdate();

				if (insertCount == 1) {
					sql = "select lr_code, g.g_name, v.v_title, i_date, r_plan_date, i_total_pay"
							+ " from lend_return l, v_gogek g, video v" + " where g.g_code = ?";

					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, g_code);

					rs = pstmt.executeQuery();

					System.out.println("\n 대여정보");

					System.out.println("대여번호\t고객번호\t비디오번호\t대여일자\t\t\t반납예정일\t\t\t대여총액");

					if (rs.next()) {
						System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
								+ rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getInt(6) + "원");
					}
				}

			} else {
				System.out.println("고객 또는 비디오가 없습니다.");
			}
		} catch (Exception sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					;
				con.close();
			} catch (Exception sqle) {
			}
		}
	}

	// 비디오 목록
	public static void videoList() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_video = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // com.mysql.jdbc.Driver
			System.out.println("DB 접속 성공");
		} catch (ClassNotFoundException ex1) {
			System.out.println("드라이버 로딩 에러 : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB 접속 실패 : " + ex2.toString());
			return;
		}

		try {

			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.36:1521:xe", "hr", "1234");

			String sql = "";

			sql = "select v_code, v_title, v_genre, v_pay, v_lend_state, v_make_company, to_char(v_make_date, 'YYYY'), v_view_age from video";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("\n비디오 리스트");

			System.out.println("일련번호\t제목\t\t\t장르\t대여료\t대여구분(재고:1, 대여:2)\t출시사\t\t출시년도\t\t관람등갑(전체관람:1, 19금:2)");

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5) + "\t\t\t" + rs.getString(6) + "\t\t"
						+ rs.getString(7) + "\t\t" + rs.getString(8));
			}
			System.out.println();

		} catch (Exception sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					;
				con.close();
			} catch (Exception sqle) {
			}
		}
	}

	// 비디오 등록
	public static void videoRegister() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_video = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // com.mysql.jdbc.Driver
			System.out.println("DB 접속 성공");
		} catch (ClassNotFoundException ex1) {
			System.out.println("드라이버 로딩 에러 : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB 접속 실패 : " + ex2.toString());
			return;
		}

		try {

			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.36:1521:xe", "hr", "1234");

			String title; // 제목
			String genre; // 장르
			int pay; // 대여료
			int lend_state; // 대여구분(재고:1, 대여:2)
			String make_company; // 출시사
			String make_date; // 출시년도
			int view_age; // 관람등갑(전체관람:1, 19금:2)

			String sql = "";
			int insertCount;

			System.out.println("\n=== 비디오 등록 ===");
			System.out.print("비디오 제목 입력: ");
			title = in_video.readLine();
			System.out.print("비디오 장르 입력: ");
			genre = in_video.readLine();
			System.out.print("비디오 대여료 입력: ");
			pay = Integer.parseInt(in_video.readLine());
			System.out.println("비디오 대여구분(재고:1, 대여:2) 입력: ");
			lend_state = Integer.parseInt(in_video.readLine());
			System.out.println("비디오 출시사 입력: ");
			make_company = in_video.readLine();
			System.out.println("비디오 출시년도 입력(예: 1988) : ");
			make_date = in_video.readLine();
			System.out.println("관람등급(전체관람: 1, 19금: 2) 입력: ");
			view_age = Integer.parseInt(in_video.readLine());

			sql = "insert into video values(video_seq.nextval, ?, ?, ?, ?, ?, to_date(?, 'YYYY'), ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, genre);
			pstmt.setInt(3, pay);
			pstmt.setInt(4, lend_state);
			pstmt.setString(5, make_company);
			pstmt.setString(6, make_date);
			pstmt.setInt(7, view_age);
			insertCount = pstmt.executeUpdate();

			if (insertCount == 1) {
				System.out.println("비디오 등록 성공: " + insertCount);

				sql = "select v_code, v_title, v_genre, v_pay, v_lend_state, v_make_company, to_char(v_make_date, 'YYYY'), v_view_age from video";

				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();

				System.out.println("\n비디오 리스트");

				System.out.println("일련번호\t제목\t\t\t장르\t대여료\t대여구분(재고:1, 대여:2)\t출시사\t\t출시년도\t\t관람등갑(전체관람:1, 19금:2)");

				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t\t" + rs.getString(3) + "\t"
							+ rs.getString(4) + "\t" + rs.getString(5) + "\t\t\t" + rs.getString(6) + "\t\t"
							+ rs.getString(7) + "\t\t" + rs.getString(8));
				}
				System.out.println();
			} else {
				System.out.println("비디오 등록 실패");
			}
		} catch (Exception sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					;
				con.close();
			} catch (Exception sqle) {
			}
		}
	}

	// 고객 검색
	public static void gogekSearch() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_gogek = new BufferedReader(new InputStreamReader(System.in));

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

			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.36:1521:xe", "hr", "1234");

			String searchName; // 고객 검색 이름
			String sql = "";

			System.out.println("\n=== 고객 검색 ===");
			System.out.print("고객 이름 입력: ");
			searchName = in_gogek.readLine();

			sql = "select *" + " from v_gogek" + " where g_name = ? "  ;

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, searchName);
			rs = pstmt.executeQuery();

			System.out.println("\n고객 검색 리스트");
			System.out.println("일련번호\t이름\t나이\t주소\t\t\t전화번호");

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getShort(3) + "\t"
						+ rs.getString(4) + "\t\t\t" + rs.getString(5));
			}
			System.out.println();

		} catch (Exception sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					;
				con.close();
			} catch (Exception sqle) {
			}
		}
	}

	// 고객등록
	public static void gogekRegister() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_gogek = new BufferedReader(new InputStreamReader(System.in));

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

			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.36:1521:xe", "hr", "1234");

			String name; // 고객이름
			int age; // 고객나이
			String addr; // 고객 주소
			String tel; // 고객 전화번호

			String sql = "";
			int insertCount;

			System.out.println("\n=== 고객 등록 ===");
			System.out.print("고객 이름 입력: ");
			name = in_gogek.readLine();
			System.out.print("고객 나이 입력: ");
			age = Integer.parseInt(in_gogek.readLine());
			System.out.print("고객 주소 입력: ");
			addr = in_gogek.readLine();
			System.out.print("고객 전화번호 입력: ");
			tel = in_gogek.readLine();

			sql = "insert into v_gogek values(v_gogek_seq.nextval, ?, ?, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, addr);
			pstmt.setString(4, tel);
			insertCount = pstmt.executeUpdate();

			if (insertCount == 1) {
				System.out.println("고객 등록 성공: " + insertCount);

				sql = "select * from v_gogek";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();

				System.out.println("\n 고객 리스트");

				System.out.println("일련번호\t이름\t나이\t주소\t\t\t전화번호");

				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getShort(3) + "\t"
							+ rs.getString(4) + "\t\t\t" + rs.getString(5));
				}
				System.out.println();
			} else {
				System.out.println("고객 등록 실패");
			}
		} catch (Exception sqle) {
		}
	}

	// 메뉴
	public static void menu() {
		System.out.println("미래 비디오 대여 시스템");
		System.out.println("1. 고객 등록");
		System.out.println("2. 고객 검색");
		System.out.println("3. 비디오 등록");
		System.out.println("4. 비디오 목록");
		System.out.println("5. 비디오 대여");
		System.out.println("6. 비디오 대여 목록");
		System.out.println("7. 종료");
	}

}
