package Completed_2_3ch_dataType_operator_pdf;


import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// 사용자로 부터 입력을 받기 위해 Scanner를 생선한다.
		Scanner input = new Scanner(System.in);
		
		int firstNumber; // 첫번째 숫자저장
		int secondNumber; // 두번째 숫자저장
		int sum; // 합을저장 
		
		System.out.println("두 수의 합을 구하는 프로그램"); 
		
		System.out.print("첫 번째숫자(정수)를 입력하시오: "); //입력안내 출력
		firstNumber = input.nextInt(); // 사용자로부터 첫번째 숫자를 읽는다.
		
		System.out.print("두 번째숫자(정수)를 입력하시오: "); // 입력안내 출력
		secondNumber = input.nextInt(); // 사용자로부터 두번째 숫자를 읽는다.

		
		sum = firstNumber + secondNumber; // 두개의 숫자를 더한다.
		
		System.out.println("두수의 합 계산");
		System.out.println(firstNumber + " + " + secondNumber + " = " + sum); // 합을 출력한다.
		
	}

}
