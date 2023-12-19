package view;

import java.util.Scanner;

public class MenuViewer {

	public static Scanner choice = new Scanner(System.in);

	// 메인 메뉴
	public static void mainMenuView() {
		System.out.println();
		System.out.println("헬스장 회원 관리 프로그램");
		System.out.println("해당 번호를 입력하세요.");
		System.out.println("1. 회원 정보 목록/입력/수정/삭제");
		System.out.println("2. 트레이너 정보 목록/입력/수정/삭제/급여조회");
		System.out.println("3. PT등록회원 목록/입력/삭제");
		System.out.println("4. 프로그램 종료");
	}

	// 회원 메뉴
	public static void memberMenuView() {
		System.out.println();
		System.out.println("회원 정보 메뉴 번호를 입력하세요.");
		System.out.println("1. 회원 정보 목록");
		System.out.println("2. 회원 정보 입력");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 정보 삭제");
		System.out.println("5. 메인메뉴");
	}

	// 트레이너 메뉴
	public static void trainerMenuView() {
		System.out.println();
		System.out.println("트레이너 정보 메뉴 번호를 입력하세요.");
		System.out.println("1. 트레이너 정보 목록");
		System.out.println("2. 트레이너 정보 입력");
		System.out.println("3. 트레이너 정보 수정");
		System.out.println("4. 트레이너 정보 삭제");
		System.out.println("5. 트레이너 급여 조회");
		System.out.println("6. 메인메뉴");
	}

	// PT등록 회원 입력
	public static void pt_reserveMenuView() {
		System.out.println();
		System.out.println("PT 등록회원 정보 메뉴 번호를 입력하세요.");
		System.out.println("1. PT 등록회원 목록");
		System.out.println("2. PT 등록회원 입력");
		System.out.println("3. PT 등록회원 삭제");
		System.out.println("4. 메인메뉴");
	}
}
