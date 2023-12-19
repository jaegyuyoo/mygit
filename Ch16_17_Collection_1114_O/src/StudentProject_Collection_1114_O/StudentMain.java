// 객체배열과 ArrayList 1 먼저보고 2실시
package StudentProject_Collection_1114_O;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain {
	static Scanner input = new Scanner(System.in); // main외에 다른 메서드에도 사용하기 위해
	static ArrayList<Student> infoStudent = new ArrayList<Student>(); // 학생 정보 객체 (for 검색, 삭제)

	public static void main(String[] args) {

		int choice; // 메뉴 선택 번호
		Student inputData = null; // 입력자료 객채 선언
		boolean isAdded = false; // 입력 자료 추가 성공 확인
		
		Student info; // 학생객체 선언
		
/* 1109는 30명이라는 전제조건 
		static Student [] info = new Student[30]; // 학생 정보 객체 배열
	
				 for (int i = 0; i < info.length; i++) { 
					 info[i] = new Student(); 
				 }
*/
		
		do {
			showMenu();
			choice = input.nextInt();
			input.nextLine();

			info = new Student(); // *학생 객체 생성
			
			switch (choice) {
			case 1:
				inputData = inputStudnetInfo(); // 입력 학생 정보 - "inputStudnetInfo"
				isAdded = infoStudent.add(inputData); // 입력한 학생 정보 추가
				if (isAdded == true) {
					System.out.println("데이터 입력이 완료되었습니다. \n");
				} else {
					System.out.println("데이터가 저장되지 않았습니다. \n");
				}
				break;
			case 2:
				searchData(); // 학생 검색
				break;
			case 3:
				deleteData(); // 학생 삭제
				break;
			case 4:
				System.out.println("학생 전체 목룍");
				for (Student outData : infoStudent) {
					System.out.println(outData);
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘목 입력하여 프로그램을 종료합니다.");
				return;
			}
		} while (true);
	}

	// 메뉴
	public static void showMenu() {
		System.out.println("학생 정보 등록 프로그램");
		System.out.println("선택하세요...");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 이름으로 검색");
		System.out.println("3. 학생 이름으로 삭제");
		System.out.println("4. 전체 학생 목록");
		System.out.println("5. 프로그램 종료");
		System.out.println("선택: ");
	}

	// 학생정보입력, case 1 - "inputStudnetInfo"
	public static Student inputStudnetInfo() { // 위에 매개변수 만들어짐 private -> public
		// static 이유 - scanner static 선언한이유
		String name; // 이름
		String addr; // 주소
		String tel; // 전화
		String grade; // 학년

		System.out.println("이름 : ");
		name = input.nextLine();
		System.out.println("주소 : ");
		addr = input.nextLine();
		System.out.println("전화 : ");
		tel = input.nextLine();
		System.out.println("학년 : ");
		grade = input.nextLine();

		return new Student(name, addr, tel, grade);
		// public static "Student" 이기대문에 -> new Student (return value)

	}

	// 학생 검색 시작, case 2 = 이름만 입력받는 메서드
	public static void searchData() {
		String searchName; // 검색할 이름
		Student info; // 검색한 학생 정보

		System.out.println("데이터 검색을 시작합니다..");

		System.out.println("이름 : ");
		searchName = input.nextLine();

		// 학생이름으로 검색
		info = search(searchName);
		if (info == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			System.out.println("검색된 학생 정보");
			info.showStudentInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}

	// 학생 이름으로 검색, case 2 = search
	public static Student search(String name) {
		// 학생 목록의 요소에 대한 박복자(학생객채: 정보)를 적절한 순서를 반환.
		Iterator<Student> itr = infoStudent.iterator();

		while (itr.hasNext()) {
			Student curInfo = itr.next(); // 다음 학생 객체
			if (name.compareTo(curInfo.getName()) == 0) {
				return curInfo;
			}
		}
		return null;
	}

	// 학생이름으로 삭제, case 3 = deleteData
	public static void deleteData() {
		String deleteName; // 삭제할 이름

		System.out.println("데이터 삭제를 시작합니다..");

		System.out.println("이름: ");
		deleteName = input.nextLine();

		Iterator<Student> itr = infoStudent.iterator();

		while (itr.hasNext()) {
			Student curInfo = itr.next();
			if (deleteName.compareTo(curInfo.getName()) == 0) {
				itr.remove(); // 컬렉션 - 리스트 
				System.out.println("데이터 삭제가 완료되었습니다 \n");
				return;
			}
		}
		System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
	}
}
