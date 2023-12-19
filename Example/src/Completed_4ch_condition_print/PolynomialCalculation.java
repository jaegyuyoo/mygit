/* 231030 
x값 입력받아 다항식계산
*/
package Completed_4ch_condition_print;

import java.util.Scanner;

public class PolynomialCalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x; // 입력받을 x 변수선언
		int sum; // 다항식의 결과값 변수선언

		System.out.println("x값을 입력받아 다항식 계산."); // 제목
		System.out.println("");

		System.out.println("x값을 입력해주세요");
		x = input.nextInt(); // x값을 입력

		sum = (3 * (x ^ 3)) + (7 * (x * x)) + (11 * x) + 6;
		// 주어진 다항식의 결과 계산식

		System.out.println("3x^3+7x^2+11x+6 의 x 값을 " + x + " 넣으면 이 다항식의 값은 " + sum + " 입니다");
		// 결과출력
	}

}
