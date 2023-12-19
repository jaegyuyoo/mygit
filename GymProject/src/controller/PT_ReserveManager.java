package controller;

import java.util.Scanner;

import model.MemberVO;
import model.PT_ReserveVO;
import model.TrainerVO;

public class PT_ReserveManager {

	// PT회원 입력
	public void pt_reserveRegistr() throws Exception {

		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		PT_ReserveDAO pd = new PT_ReserveDAO();
		PT_ReserveVO pvo = new PT_ReserveVO();

		MemberDAO md = new MemberDAO();
		MemberVO mvo = new MemberVO();

		TrainerDAO td = new TrainerDAO();
		TrainerVO tvo = new TrainerVO();

		int p_no; // pt등록 일련번호
		int p_count; // pt예약 횟수
		String p_date; // pt등록일자
		int p_payment; // PT결젝금액

		int m_no; // 멤버 일련번호

		int t_no; // 트레이너 일련번호
		String t_available; // 수업가능시간
		int t_cost; // 회당 가격

		System.out.println("회원 전체 리스트");
		md.getMemberTotalList();

		System.out.println("회원 일련번호 입력: "); // FK
		m_no = input.nextInt();

		System.out.println("트레이너 전체 리스트");
		td.getTrainerTotalList();

		System.out.println("트레이너 일련번호 입력: "); // FK
		t_no = input.nextInt();

		t_available = td.getT_available(t_no); // t_no에 따른 t_available 값을 꺼내와서 t_available이라 한다. -> Trainer DAO메서트 생성

		System.out.println("PT 전체 리스트");
		pd.getPT_ReserveTotalList();

		System.out.println("PT횟수 입력: ");
		p_count = input.nextInt();

		System.out.println("해당 트레이너 1회당 PT비용: " + td.getT_cost(t_no) + " 원");
		System.out.println("입력받은 PT 횟수 : " + p_count + " 회");

		// 트레이너 비용 = 회당 비용 * 횟수
		p_payment = td.getT_cost(t_no) * p_count;// pd.getP_count(t_no); // pt dao에서 정의한 메서드를 곱셈했다.

		System.out.println("PT 결제금액: " + p_payment + " 원");

		pvo.setM_no(m_no);
		pvo.setT_no(t_no);
		pvo.setT_available(t_available);
		pvo.setP_count(p_count);
		pvo.setP_payment(p_payment); // 업데이트된값을 다시 vo

		pd.setPT_reserveRegiste(pvo); // vo들어간값을 다시 dao로

		System.out.println("PT회원 전체 리스트");
		pd.getPT_ReserveTotalList();
	}

	// 멤버 삭제 관리
	public void pt_reserveDelete() throws Exception {

		Scanner input = new Scanner(System.in);

		PT_ReserveDAO pd = new PT_ReserveDAO();
		PT_ReserveVO pvo = new PT_ReserveVO();

		int p_no; // pt회원 일련번호

		System.out.println("PT회원 전체 리스트");
		pd.getPT_ReserveTotalList();

		System.out.println("삭제할 PT회원 일련번호 입력");
		System.out.println("일련번호: ");
		p_no = input.nextInt();

		pd.setPT_reservDelete(p_no); // setPT_reservDelete 메서드와 연결

		System.out.println();
		System.out.println("PT회원 전체 리스트");
		pd.getPT_ReserveTotalList();
		System.out.println();
	}

	// PT회원 목록
	public void pt_reserveList() throws Exception {

		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		PT_ReserveDAO pd = new PT_ReserveDAO();
		MemberDAO md = new MemberDAO();

		int p_no; // pt등록 일련번호
		int p_count; // pt예약 횟수
		String p_date; // pt등록일자

		int m_no; // 멤버 일련번호

		int t_no; // 트레이너 일련번호
		int t_available; // 수업가능시간

		System.out.println("PT회원 전체 리스트");
		pd.getPT_ReserveTotalList();
	}
}
