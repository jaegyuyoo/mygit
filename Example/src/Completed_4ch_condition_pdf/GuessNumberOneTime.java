package Completed_4ch_condition_pdf;

import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number; // 난수
		int guess;// 추측

		number = (int) (Math.random() * 101);// 난수생성 // *101, int선언

		System.out.println("숫자 맞추기 게임");
		// System.out.println(number);

		// 값입력
		System.out.println("0~100 값입력");
		guess = input.nextInt();
		
		// 조건문
		if (number == guess) {
			System.out.println("정답입니다.");
		} else if (guess > number) {
			System.out.println("추측 더크다");
		} else {
			System.out.println("추측 더작다");
		}
	}

}
