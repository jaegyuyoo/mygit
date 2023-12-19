package Completed_4ch_condition_print;
import java.util.Scanner;

public class AlphanumericCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String op;

		double number1; // 임의수 변수1
		double number2; // 임의수 변수2
		double total; // 연산의 합

		System.out.println("사칙연산중 하나의 문자를 입력해주세요");
		op = input.next(); // string 입력

		System.out.println("첫번째 숫자를 입력해주세요.");
		number1 = input.nextDouble();
		System.out.println("두번째 숫자를 입력해주세요.");
		number2 = input.nextDouble();

		switch (op) {
		case "+": // 덧셈
			total = number1 + number2;
			System.out.println(total);
			break;
		case "-": // 뺄셈
			total = number1 - number2;
			System.out.println(total);
			break;
		case "*": // 곱셈
			total = number1 * number2;
			System.out.println(total);
			break;
		case "/": // 나눗셈
			if (number2==0) { // 분모값이 0이 되면안되는 조건식
				System.out.println("분모값이 0이되어 계산할수 없습니다.");		
			} else {
				total = number1 / number2;
				System.out.println(total);				
			}
			break;
		default:
			System.out.println("올바른 사칙연산 문자를 입력해주세요");
		}
	}
}
