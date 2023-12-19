package controller;

import java.util.Scanner;

import model.MemberVO;

public class MemberManager {

	// 멤버 목록
	public void memberList() throws Exception {

		MemberDAO md = new MemberDAO();

		System.out.println("회원 전체 리스트");
		md.getMemberTotalList();
		System.out.println();
	}

	// 멤버 등록 관리
	public void memberRegistr() throws Exception {
		Scanner input = new Scanner(System.in); // 관리자용
		Scanner input1 = new Scanner(System.in);

		MemberDAO md = new MemberDAO();
		MemberVO mvo = new MemberVO();

		String m_name; // 회원 이름
		String m_number; // 회원 주민번호
		String m_phone; // 회원 전화번호
		String m_address; // 회원 주소
		String m_period; // 회원권 기간
		String m_startdate; // 회원권 시작일
		String m_enddate; // 회원권 종료일
		String pw;

		System.out.println();
		System.out.println("회원 정보 입력 메뉴 입니다. 관리자 로그인해주세요.");

		System.out.println("관리자 비밀번호: ");
		pw = input.next();

		if (pw.equals("admin1234")) {
			System.out.println("회원 전체 리스트");
			md.getMemberTotalList();
		} else {
			System.out.println("관리자 비밀번호가 틀립니다.");
		}

		System.out.println("회원이름: ");
		m_name = input1.nextLine();
		System.out.println("회원 주민번호: ");
		m_number = input1.nextLine();
		System.out.println("회원 전화번호: ");
		m_phone = input1.nextLine();
		System.out.println("회원 주소: ");
		m_address = input1.nextLine();
		System.out.println("회원권 기간: ");
		m_period = input1.nextLine();
		System.out.println("회원권 시작일: ");
		m_startdate = input1.nextLine();
		System.out.println("회원권 종료일: ");
		m_enddate = input1.nextLine();

		mvo.setM_name(m_name);
		mvo.setM_number(m_number);
		mvo.setM_phone(m_phone);
		mvo.setM_address(m_address);
		mvo.setM_period(m_period);
		mvo.setM_startdate(m_startdate);
		mvo.setM_enddate(m_enddate);

		md.setMemberRegiste(mvo);

		System.out.println();
		System.out.println("회원 전체 리스트");
		md.getMemberTotalList();
		System.out.println();

	}

	// 멤버 수정 관리
	public void memberUpdate() throws Exception {
		Scanner input = new Scanner(System.in); // 관리자용
		Scanner input1 = new Scanner(System.in); // 수정한 일련번호
		Scanner input2 = new Scanner(System.in); // 수정 데이터용

		MemberDAO md = new MemberDAO();
		MemberVO mvo = new MemberVO();

		int m_no; // 회원 일련 번호
		String m_name; // 회원 이름
		String m_number; // 회원 주민번호
		String m_phone; // 회원 전화번호
		String m_address; // 회원 주소
		String m_period; // 회원권 기간
		String m_startdate; // 회원권 시작일
		String m_enddate; // 회원권 종료일
		String pw;

		System.out.println();
		System.out.println("회원 정보 수정 메뉴 입니다. 관리자 로그인해주세요.");

		System.out.println("관리자 비밀번호: ");
		pw = input.next();

		if (pw.equals("admin1234")) {
			System.out.println("회원 전체 리스트");
			md.getMemberTotalList();
		} else {
			System.out.println("관리자 비밀번호가 틀립니다.");
		}

		System.out.println("수정할 회원 일련번호 입력");
		System.out.println("일련번호: ");
		m_no = input1.nextInt();

		System.out.println();
		System.out.println("새로운 정보 모두 입력");
		System.out.println("회원이름: ");
		m_name = input2.nextLine();
		System.out.println("회원 주민번호: ");
		m_number = input2.nextLine();
		System.out.println("회원 전화번호: ");
		m_phone = input2.nextLine();
		System.out.println("회원 주소: ");
		m_address = input2.nextLine();
		System.out.println("회원권 기간: ");
		m_period = input2.nextLine();
		System.out.println("회원권 시작일: ");
		m_startdate = input2.nextLine();
		System.out.println("회원권 종료일: ");
		m_enddate = input2.nextLine();

		mvo.setM_no(m_no);
		mvo.setM_name(m_name);
		mvo.setM_number(m_number);
		mvo.setM_phone(m_phone);
		mvo.setM_address(m_address);
		mvo.setM_period(m_period);
		mvo.setM_startdate(m_startdate);
		mvo.setM_enddate(m_enddate);

		md.setMemberUpdate(mvo);

		System.out.println();
		System.out.println("회원 전체 리스트");
		md.getMemberTotalList();
		System.out.println();
	}

	// 멤버 삭제 관리
	public void memberDelete() throws Exception {
		Scanner input = new Scanner(System.in);

		MemberDAO md = new MemberDAO();
		MemberVO mvo = new MemberVO();

		int m_no; // 회원 일련 번호
		String pw;

		System.out.println();
		System.out.println("회원 정보 삭제 메뉴 입니다. 관리자 로그인해주세요.");

		System.out.println("관리자 비밀번호: ");
		pw = input.next();

		if (pw.equals("admin1234")) {
			System.out.println("회원 전체 리스트");
			md.getMemberTotalList();
		} else {
			System.out.println("관리자 비밀번호가 틀립니다.");
		}

		System.out.println("삭제할 회원 일련번호 입력");
		System.out.println("일련번호: ");
		m_no = input.nextInt();

		md.setMemberDelete(m_no);

		System.out.println();
		System.out.println("회원 전체 리스트");
		md.getMemberTotalList();
		System.out.println();
	}		
}
