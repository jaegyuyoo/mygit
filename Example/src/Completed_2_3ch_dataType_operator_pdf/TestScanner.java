package Completed_2_3ch_dataType_operator_pdf;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		int intValue; // 정수숫자
		int intValue1;
		int intValue2;
		double doubleValue; // 실수숫자

		String string; // 문자열
		String stringline;

		/*
		System.out.print("다양한 입력 형식 예제");
		// 정수입력
		System.out.print("정수 입력: ");
		intValue = input.nextInt();
		System.out.println("입력한 정수: " + intValue);

		System.out.print("첫 번째, 두 번재 정수 입력: ");
		intValue1 = input.nextInt();
		intValue2 = input.nextInt();
		System.out.println("첫 번째 입력한 정수 : " + intValue1);
		System.out.println("첫 번째 입력한 정수 : " + intValue2);

		// 실수입력
		System.out.print("실수 입력: ");
		doubleValue = input.nextDouble();
		System.out.println("입력한 실수 : " + doubleValue);
*/
		
		// 문자열 입력
		System.out.print("공백없는 문자열 입력: ");
		string = input.next();
		System.out.println("입력한 문자열: " + string);

		// 공백있는 문자열입력
		System.out.print("공백있는문자열입력: ");
		stringline = input1.nextLine();
		System.out.println("입력한문자열 : " + stringline);
	}

}
