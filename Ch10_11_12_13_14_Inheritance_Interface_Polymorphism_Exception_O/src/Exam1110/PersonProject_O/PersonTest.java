package Exam1110.PersonProject_O;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String name; // 이름
		String addr; // 주소
		String phoneNumber; // 전화번호 
		String mailaddr; // 메일주소;
		int grade = 0;
		
		Student student = new Student();
		
		System.out.println("학년입력: ");
		grade = input.nextInt();
		student.setGrade(grade);
		
		switch (grade) { // grade는 true상태이다
		case GRADE.JUNIOR_FREASHMAN: 
			System.out.println("1학년이네요");
			break;
		case GRADE.SEMI_FREASHMAN: 
			System.out.println("2학년이네요");
			break;
		case GRADE.TERIAN_FREASHMAN: 
			System.out.println("3학년이네요");
			break;
		case GRADE.MAGISTRAND: 
			System.out.println("4학년이네요");
			break;
		default:
			System.out.println("제대로 입력하세요");
		}
		
		student.setName("유재규");
		// student.setGrade(GRADE.JUNIOR_FREASHMAN);
		
		System.out.println(student.getName());
	}

}
