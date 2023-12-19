package Exam1106_pdf;

import java.util.Scanner;

public class TestLoanClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("연 이율을 입력하세요(예 5.25) : ");
		double annualInterestRate = input.nextDouble();
		
		System.out.println("대출기간을 년 단위로 입력하세요 : " );
		int numberOfYears = input.nextInt();
		
		System.out.println("대출금액을 입력하세요(예: 120000) : ");
		double loanAmount = input.nextDouble();
		
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		
		// 소수점 이후 두 자리를 유지하는 형식
		double monthlyPayment = (int)(loan.getMonthlyPayment() * 100) / 100.0;
		double totalPayment = (int)(loan.getTotalPayment() * 100) / 100.0;
		
		// 결과출력
		System.out.println("대출시작날짜" + loan.getLoadDate() + "\n 매월 상황금액 : " + monthlyPayment + "\n 총상환금액" + totalPayment);
		
	}

}
