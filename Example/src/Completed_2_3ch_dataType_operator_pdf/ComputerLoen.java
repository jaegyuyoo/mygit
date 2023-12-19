package Completed_2_3ch_dataType_operator_pdf;

import java.util.Scanner;

public class ComputerLoen {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double annualInterestRate; // 연간 이자율
		double monthlyInterestRate; // 매월 금리
		int numberOfYears; // 대출 연수
		double loanAmount; // 대출 금액
		double monthlyPayment; // 매월 지불금
		double totalPayment; // 전체 대출액

		// 연간 이자율 입력
		System.out.println("연간 이자율을 입력(예: 8.25) : ");
		annualInterestRate = input.nextDouble();

		// 매월 금리를 구한다.
		monthlyInterestRate = annualInterestRate / 1200;

		// 연수 입력
		System.out.println("연수를 정수로 입력(예: 5) : ");
		numberOfYears = input.nextInt();

		// 대출금액을 입력
		System.out.println("대출 금액을 입력(예:300000) : ");
		loanAmount = input.nextDouble();

		// 지불금 계산
		monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		totalPayment = monthlyPayment * numberOfYears * 12;

		// 소수점뒤에 2자리를 유지하기 위해
		monthlyPayment = (int) (monthlyPayment * 100) / 100.0;
		totalPayment = (int) (totalPayment * 100) / 100.0;

		// 결과출력
		System.out.println("매달 지불금 : " + (int) monthlyPayment + "원");
		System.out.println("전체 지불금 : " + (int) totalPayment + "원");

	}

}
