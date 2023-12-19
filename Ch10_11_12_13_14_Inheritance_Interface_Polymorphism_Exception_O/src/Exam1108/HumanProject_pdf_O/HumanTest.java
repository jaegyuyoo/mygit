package Exam1108.HumanProject_pdf_O;

import java.util.Scanner;

import javax.swing.InputMap;

public class HumanTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		int studentID;
		
		Student yoo = new Student();
		Human yoo1 = new Student();
		
		System.out.println("나이입력: ");
		try {
		age = input.nextInt();
		} catch (Exception e) {
			System.out.println("데이터를 잘못 입력");
		}
	
		
//		HightStudent yoo = new HightStudent();

/*
		yoo.setName("유재규");
		yoo.setAge(37);
		yoo.setStudentID(1);
		yoo.setSchoolName("제천");
		yoo.setGrade(3);

		System.out.println(yoo);
*/
		
		// HightStudent hs = new HightStudent();
		// hs.test();
		
/*		HighSchool hs = new HighSchool("가산", 3);
		System.out.println(hs);
*/

	}

}
