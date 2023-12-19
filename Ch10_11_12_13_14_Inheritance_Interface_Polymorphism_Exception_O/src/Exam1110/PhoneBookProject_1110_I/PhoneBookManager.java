package Exam1110.PhoneBookProject_1110_I;

public class PhoneBookManager {

	final int MAX_CNT = 100; // 전화번호 100명까지 저장
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT]; // 전화번호정보 객체배열
	int curCnt = 0; // 현재 카운트
	static PhoneBookManager inst = null; // static 어디서든 호출에서 사용하기 위해, null=비워둔다. 
	
	// 기존에 설정되어있으면 만들지마라! 카카오톡 메신저 
	public static PhoneBookManager createManagerInst() { // 반환타입 PhoneBookManager
		if (inst == null) { // null과 같지 않으면 생성하시오, 싱글톤 - 어떤객체를 1개이상 생성하지못하도록 막는것.
			inst = new PhoneBookManager();
		}
		return inst; // 기존생성 사용 
	}

	public PhoneInfo readFriendInfo() { // 친구읽기 메서드
		System.out.println("이름: ");
		String name = MenuViewer.keyboard.nextLine(); // MenuViewer 게시판
		System.out.println("전화번호: ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone); // 이름, 전화번호 PhoneInfo에 리턴
	}

	public PhoneInfo readUnivFriendInfo() {
		System.out.println("이름: ");
		String name = MenuViewer.keyboard.nextLine(); // nextLine - enter까지 
		System.out.println("전화번호: ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("전공: ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.println("학년: ");
		int year = MenuViewer.keyboard.nextInt();
		return new PhoneUnivInfo(name, phone, major, year); // 이름, 전화번호, 전공, 학년, PhoneUnivInfo 리턴
	}

	public PhoneInfo readCompanyFriendInfo() {
		System.out.println("이름: ");
		String name = MenuViewer.keyboard.nextLine(); // (추후) 키보드함수
		System.out.println("전화번호: ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("회사: ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company); // 이름, 전화번호, 회사명, PhoneCompanyInfo 리턴
	}

	public void inputData() throws MenuChoiceException { // (기존)public void inputData(), 예외처리 추가 
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");
		System.out.println("선택>> ");
		int choice = MenuViewer.keyboard.nextInt(); // + 예외처리
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null; // 비워둔다.

		if(choice<INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY) { // 예외처리추가 
			throw new MenuChoiceException(choice);
		}
		
		switch (choice) {
		case INPUT_SELECT.NORMAL: // 인터페이스 INPUT_SELECT
			info = readFriendInfo(); // 상단 "public PhoneInfo readFriendInfo() {" 이동
		case INPUT_SELECT.UNIV:
			info = readUnivFriendInfo(); // 
			break;
		case INPUT_SELECT.COMPANY:
			info = readCompanyFriendInfo();
			break;
		}
		infoStorage[curCnt++] = info; // 객체배열(infoStorage) 안에 switch문 조건문에 의거 증감을 넣는다.
		System.out.println("데이터 입력이 완료되었습니다. \n");
	}

	public void searchData() { // search 메서드 생성

		System.out.println("데이터 검색을 시작합니다.");
		System.out.println("이름: ");
		String name = MenuViewer.keyboard.nextLine();

		int dataldx = search(name); // 아래 "private int search(String name" 설정
		// (*질문) dataldx는 name을 int화 시킨것인가?
		if (dataldx < 0) { // 저장된이름과 같은지 비교 
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			infoStorage[dataldx].showPhoneInfo(); // PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT]; // 전화번호정보 객체배열 불러온다.
			System.out.println("데이터 검색이 완료되었습니다. \n");

		}
	}
	
	// step1.
	private int search(String name) { 
		for (int idx = 0; idx < curCnt; idx++) { // idx(for변수)
			PhoneInfo curInfo = infoStorage[idx];
			if (name.compareTo(curInfo.getName()) == 0) {
				return idx;
			} // 이름이 다르면 빠저나간다.
		}
		return -1; // 없다. -1
	}
	
	// step2.
	public void deleteDate() {
		System.out.println("데이터를 삭제를 시작합니다.");
		System.out.println("이름: ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataldx = search(name); //위와같은질문 
		if(dataldx<0) { // 찾은이름이 맞지않으면 
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else { 
			for (int idx = 0; idx < (curCnt-1); idx++) { // 인덱스번호가 같으면안되니 (curCnt-1)
				infoStorage[idx]=infoStorage[idx+1]; // 덮어쓴다.
			}
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다.");
		}
	}


}
