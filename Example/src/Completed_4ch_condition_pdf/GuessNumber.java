package Completed_4ch_condition_pdf;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);// 입력선언

		int number;// 난수
		int guess;// 추축
		int count;// 시도횟수

		number = (int) (Math.random() * 101); // 난수생성
		System.out.println("생성 난수 : " + number);
		
		
		count = 0;
		// while(input + count) - if(비교)
		while (true) {
			System.out.println("0-100숫자입력");
			guess = input.nextInt();
			
			// count = 0; 여기다 초기화해주면 계속 0이되서안된다. 조건문밖에서 초기화 
			count = count + 1; /// count += count;

			if (guess == number) {
				System.out.println("정답 : " + number);
				System.out.println(count + "번에 맞추었습니다.");
				break;
			} else if (guess > number) {
				System.out.println("추측 숫자가 크다");
			} else {
				System.out.println("추측 숫자가 더작다");
			}
			System.err.println(count);
		}
	}
}
