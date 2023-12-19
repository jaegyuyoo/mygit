package controller;

import java.util.Scanner;

import model.PT_ReserveVO;
import model.TrainerVO;

public class TrainerManager {

	// 트레이너 목록
	public void trainerList() throws Exception {
		TrainerDAO td = new TrainerDAO();
		System.out.println("트레이너 전체 목록");
		td.getTrainerTotalList();
		System.out.println();
	}

	// 트레이너 등록 관리
	public void trainerRegistr() throws Exception {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		TrainerDAO td = new TrainerDAO();
		TrainerVO tvo = new TrainerVO();

		String t_name; // 이름
		String t_number; // 주민등록번호
		String t_phone; // 전화번호
		String t_address; // 주소
		int t_cost; // PT수업료(회당 가격)
		String t_available; // 수업요일/오전(오후)
		String t_salary; // 급여
		String t_specialty; // 특기

		System.out.println("트레이너 전체 목록");
		td.getTrainerTotalList();
		System.out.println();

		System.out.println("트레이너 정보 입력");
		System.out.print("이름 : ");
		t_name = input.nextLine();
		System.out.print("주민등록번호 : ");
		t_number = input.nextLine();
		System.out.print("전화번호 : ");
		t_phone = input.nextLine();
		System.out.print("주소 : ");
		t_address = input.nextLine();
		System.out.print("PT수업료(회당, 예) 50000) : ");
		t_cost = input1.nextInt();
		System.out.print("수업요일/오전(오후) : ");
		t_available = input.nextLine();
		System.out.print("급여(기본급, 예) 2000000 : ");
		t_salary = input2.nextLine();
		System.out.print("특기 : ");
		t_specialty = input2.nextLine();

		tvo.setT_name(t_name);
		tvo.setT_number(t_number);
		tvo.setT_phone(t_phone);
		tvo.setT_address(t_address);
		tvo.setT_cost(t_cost);
		tvo.setT_available(t_available);
		tvo.setT_salary(t_salary);
		tvo.setT_specialty(t_specialty);

		td.setTrainerRegister(tvo);

		System.out.println();
		System.out.println("트레이너 전체 목록");
		td.getTrainerTotalList();
		System.out.println();
	}

	// 트레이너 정보 수정 관리
	public void trainerUpdate() throws Exception {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		TrainerDAO td = new TrainerDAO();
		TrainerVO tvo = new TrainerVO();

		int t_no; // 입력한 일련번호
		String t_name; // 이름
		String t_number; // 주민등록번호
		String t_phone; // 전화번호
		String t_address; // 주소
		int t_cost; // PT수업료(회당 가격)
		String t_available; // 수업요일/오전(오후)
		String t_salary; // 급여
		String t_specialty; // 특기

		System.out.println("트레이너 전체 목록");
		td.getTrainerTotalList();
		System.out.println();

		System.out.println("수정할 학과 일련번호 입력");
		System.out.print("일련번호 : ");
		t_no = input1.nextInt();

		System.out.println();
		System.out.println("새로운 정보 모두 입력");
		System.out.print("이름 : ");
		t_name = input.nextLine();
		System.out.print("주민등록번호 : ");
		t_number = input.nextLine();
		System.out.print("전화번호 : ");
		t_phone = input.nextLine();
		System.out.print("주소 : ");
		t_address = input.nextLine();
		System.out.println("PT수업료(회당 가격) : ");
		t_cost = input.nextInt();
		System.out.println("수업요일/오전(오후) : ");
		t_available = input.nextLine();
		System.out.println("급여 : ");
		t_salary = input.nextLine();
		System.out.println("특기 : ");
		t_specialty = input.nextLine();

		tvo.setT_no(t_no);
		tvo.setT_name(t_name);
		tvo.setT_number(t_number);
		tvo.setT_phone(t_phone);
		tvo.setT_address(t_address);
		tvo.setT_cost(t_cost);
		tvo.setT_available(t_available);
		tvo.setT_salary(t_salary);
		tvo.setT_specialty(t_specialty);

		td.setTrainerUpdate(tvo);

		System.out.println();
		System.out.println("트레이너 전체 목록");
		td.getTrainerTotalList();
		System.out.println();
	}

	// 트레이너 정보 삭제 관리
	public void trainerDelete() throws Exception {
		Scanner input = new Scanner(System.in);

		TrainerDAO td = new TrainerDAO();
		TrainerVO tvo = new TrainerVO();

		int t_no; // 입력한 일련번호

		System.out.println("트레이너 전체 목록");
		td.getTrainerTotalList();
		System.out.println();

		System.out.println("삭제할 학과 일련번호 입력");
		System.out.print("일련번호 : ");
		t_no = input.nextInt();

		td.setTrainerDelete(t_no);

		System.out.println();
		System.out.println("트레이너 전체 목록");
		td.getTrainerTotalList();
		System.out.println();
	}

	// 급여조회
	public void trainerSalary() throws Exception {

		Scanner input = new Scanner(System.in);

		int t_totalsalary;
		
		TrainerDAO td = new TrainerDAO();
		TrainerVO tvo = new TrainerVO();

		PT_ReserveDAO pd = new PT_ReserveDAO();
		PT_ReserveVO pvo = new PT_ReserveVO();
		
		int t_no; // 트레이너 일련번호

		System.out.println("PT회원 전체 리스트");
		pd.getPT_ReserveTotalList();

		System.out.println("급여 조회 트레이너 일련번호 입력");
		System.out.println("트레이너 일련번호: ");
		t_no = input.nextInt();

		System.out.println("해당 트레이너 기본급여: " + td.getT_salary(t_no) + " 원");
		System.out.println("해당 트레이너 PT결제액: " + pd.getP_payment(t_no) + " 원");
		System.out.println("트레이너의 총급여는 기본급 + PT결제액의 40%입니다");

		t_totalsalary = (int) (td.getT_salary(t_no) + (pd.getP_payment(t_no) * 0.4)); 
		
		System.out.println("해당 트레이너의 총급여: " + t_totalsalary + " 원");
		
		tvo.setT_no(t_no);
		pvo.setT_no(t_no);
		tvo.setT_totalsalary(t_totalsalary);
		
		
		
	}

}