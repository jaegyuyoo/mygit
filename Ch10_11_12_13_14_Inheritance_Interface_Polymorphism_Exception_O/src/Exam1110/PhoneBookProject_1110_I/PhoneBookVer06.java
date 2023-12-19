package Exam1110.PhoneBookProject_1110_I;

public class PhoneBookVer06 {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst(); // 메니저클래스의  public static PhoneBookManager createManagerInst() 메서드 사용  
		// + static이 붙어 있기에호출가능 
		int choice;
		
		while(true) {  // 몇명이 등록할지모르기때문에 while 
			try{ // 예외처리
			
			MenuViewer.showMenu(); // 메뉴보여준다 
			choice=MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine(); 
			
			if(choice<INIT_MENU.INPUT || choice > INIT_MENU.EXIT) // 예외처리
				throw new MenuChoiceException(choice);
			
			switch(choice) { // switch문써서 숫자 입력받는다. int choice
			case INIT_MENU.INPUT:
				manager.inputData();
				break;
			case INIT_MENU.SEARCH:
				manager.searchData();
				break;
			case INIT_MENU.DELETE:
				manager.deleteDate();
				break;	
			case INIT_MENU.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
		catch(MenuChoiceException e) { // 예외처리
			e.showWrongChoice();
			System.out.println("메뉴 선택을 처음부터 다시 진행하빈다. \n");
		}
		}
	}

}
