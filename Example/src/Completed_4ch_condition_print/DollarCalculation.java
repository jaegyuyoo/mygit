/* 231030 
원화 입력받아 달러화 계산
*/
package Completed_4ch_condition_print;

import java.util.Scanner;

public class DollarCalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double exchangeRate; // 환율 변수
		int krw; // 원화 변수
		double calculate; // 환율 계산 변수

		System.out.println("원화를 입력받아 달러화 계산"); // 제목
		System.out.println("");

		System.out.print("환율을 입력하시오 : ");
		exchangeRate = input.nextInt(); // 환율 입력

		System.out.print("원화 금액을 입력하시오 : ");
		krw = input.nextInt(); // 원화 입력

		if (exchangeRate >= 0 && krw >= 0) {
			calculate = (krw / exchangeRate);
			// 달러화 계산 (원화 / 환율)

			System.out.println("원화는 " + (double)krw + " 은 " + calculate + " 달러 입니다.");
			// 결과출력
		} else if (exchangeRate < 0 && krw >= 0) {
			System.out.println("환율이 0보다 작습니다.");
		} else if (exchangeRate >= 0 && krw < 0) {
			System.out.println("원화가 총액이 0보다 작습니다.");
		} else {
			System.out.println("두값모두 0보다 작습니다.");
		}
		

	}

}
