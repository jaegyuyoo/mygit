import controller.MemberManager;
import controller.PT_ReserveManager;
import controller.TrainerManager;
import view.MEMBER_CHOICE;
import view.MENU_CHOICE;
import view.MenuViewer;
import view.PT_RESERVE_CHOICE;
import view.TRAINER_CHOICE;

public class GymProjectMain {

	public static void main(String[] args) {
		mainMenu();
	}

	// 메인메뉴
	private static void mainMenu() {

		int choiceNum;

		while (true) {
			try {
				MenuViewer.mainMenuView();
				choiceNum = MenuViewer.choice.nextInt();
				MenuViewer.choice.nextLine();

				switch (choiceNum) {
				case MENU_CHOICE.MEMBER:
					memberMenu();
					break;
				case MENU_CHOICE.TRAINER:
					trainerMenu();
					break;
				case MENU_CHOICE.PT_RESERVE:
					pt_reserveMenu();
					break;
				case MENU_CHOICE.EXIT:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("해당 메뉴 번호만 입력하세요");
				}
			} catch (Exception e) {
				System.out.println("\n입력에 오류가 있습니다. \n프로그램을 다시 시작하세요.");
				return;
			}
		}
	}

	// 멤버 메뉴
	private static void memberMenu() throws Exception {

		int choice;

		MemberManager memberManager = new MemberManager();
		MenuViewer.memberMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case MEMBER_CHOICE.LIST:
			System.out.println("");
			memberManager.memberList();
			break;
		case MEMBER_CHOICE.INSERT:
			System.out.println("");
			memberManager.memberRegistr();
			break;
		case MEMBER_CHOICE.UPDATE:
			System.out.println("");
			memberManager.memberUpdate();
			break;
		case MEMBER_CHOICE.DELETE:
			System.out.println("");
			memberManager.memberDelete();
			break;
		case MEMBER_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

	// 트레이너 정보 메뉴
	public static void trainerMenu() throws Exception {
		int choice;

		TrainerManager trainerManager = new TrainerManager();
		MenuViewer.trainerMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case TRAINER_CHOICE.INSERT:
			System.out.println("");
			trainerManager.trainerRegistr();
			break;
		case TRAINER_CHOICE.UPDATE:
			System.out.println("");
			trainerManager.trainerUpdate();
			break;
		case TRAINER_CHOICE.DELETE:
			System.out.println("");
			trainerManager.trainerDelete();
			break;
		case TRAINER_CHOICE.SALARY:
			System.out.println("");
			trainerManager.trainerSalary();
			break;
		case TRAINER_CHOICE.LIST:
			System.out.println("");
			trainerManager.trainerList();
		}

	}

	// PT관리예약 메뉴
	private static void pt_reserveMenu() throws Exception {

		int choice;

		PT_ReserveManager pt_reserveManger = new PT_ReserveManager();
		MenuViewer.pt_reserveMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case PT_RESERVE_CHOICE.LIST:
			System.out.println("");
			pt_reserveManger.pt_reserveList();
			break;
		case PT_RESERVE_CHOICE.INSERT:
			System.out.println("");
			pt_reserveManger.pt_reserveRegistr();
			break;
		case PT_RESERVE_CHOICE.DELETE:
			System.out.println("");
			pt_reserveManger.pt_reserveDelete();
			break;
		case PT_RESERVE_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요");
		}

	}
}