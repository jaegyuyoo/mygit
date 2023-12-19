package Exam1108.UniversityProject_O;

import java.util.Scanner;

public class AllStudnetTest {

	public static void main(String[] args) {

		String teachingAssistnceType; // 조교유형
		double scholarshipRate; // 장학금 비율 

		//UndergraduteStudent yoo = new UndergraduteStudent("발명");
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		System.out.println("조교유형 *(교육/연구)");
		teachingAssistnceType = input.next();
		
		System.out.println("장학금 *비율(0~1)을 입력해주세요");
		scholarshipRate = input1.nextDouble();

			if (scholarshipRate < 0 || scholarshipRate > 1) {
				System.out.println("틀렸습니다. 장학금 비율을 다시입력해주세요");
			} else 
				System.out.println("맞았습니다. 올바른 장학금 비율입니다.");

		PostgraduateStudent yoo = new PostgraduateStudent(teachingAssistnceType, scholarshipRate);
		System.out.println(yoo);	
}
}