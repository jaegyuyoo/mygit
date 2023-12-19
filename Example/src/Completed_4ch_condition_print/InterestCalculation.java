/* 231030
예금액, 연이율을 입력받아 2년간 복리이자 계산 
*/
package Completed_4ch_condition_print;

import java.util.Scanner;

public class InterestCalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double deposit; // 예금 변수
		double annualInterestRate; // 연이율 변수
		double interest; // 1년간 이자
		double interest_2years; // 2년간 이자
		double total; // 예금 + 이자

		System.out.println("예금액, 연이율을 입력받아 2년간 복리이자 계산"); // 제목
		System.out.println();

		System.out.print("예금액을 입력하세요 : ");
		deposit = input.nextDouble(); // 예금액 입력

		System.out.print("연이율을 입력하세요(단위 퍼센트) : ");
		annualInterestRate = input.nextDouble(); // 연이율 입력

		if (deposit >= 0 && annualInterestRate >= 0) {
			interest = (deposit * (annualInterestRate / 100)); // 1년 이자 계산
			interest_2years = ((deposit + interest) * (annualInterestRate / 100)); // 2년 이자계산

			total = interest + interest_2years + deposit; // 원금 + 1년이자 + 2년이자 합

			System.out.println(interest);
			System.out.println(interest_2years);
			System.out.print("2년 후의 예금액 : " + total);
			// 결과출력

		} else if (deposit < 0 && annualInterestRate >= 0) {
			System.out.println("예금이 음수입니다.");
		} else if (deposit >= 0 && annualInterestRate < 0) {
			System.out.println("연이율이 음수입니다.");
		} else {
			System.out.println("두값모두 0보다 작습니다.");
		}
	}
}
