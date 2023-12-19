package Completed_4ch_condition_print;

import java.util.Scanner;

public class MiltesToKilometers {

	public static void main(String[] args) {

		// 마일값 입력을 위해 scanner
		Scanner input = new Scanner(System.in);

		// 변수선언
		double miles;
		double kilometers;

		// 마일을 입력
		System.out.println("miles을 입력하시오: ");
		miles = input.nextDouble();

		// 양수를 mile값을 받기위한 조건문
		if (miles > 0) {
			kilometers = miles * 1.609; // 마일을 킬로미터 계산
			System.out.println("변환된 kilometers 값은 = " + kilometers); // true 결과값 출력
		} else if (miles == 0) {
			System.out.println("0을 제외한 값을 입력하세요"); // false 결과값 출력 (0인 경우)
		} else {
			System.out.println("양수인 mile값을 입력하세요."); // false 결과값 출력 (음수인 경우)
		}
	}
}
