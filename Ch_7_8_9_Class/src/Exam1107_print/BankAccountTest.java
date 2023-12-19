package Exam1107_print;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class BankAccountTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final int CUSTERMER; // 전체 인원
		CUSTERMER = 4;

		String name; // 이름
		String account; // 계좌
		String number; // 번호
		double balance; // 잔액
		double interestRate; // 이자율
		
		int data; // 모든데이터

		for (int i = 0; i < CUSTERMER; i++) {

			BankAccount bankaccounti = new BankAccount();

			System.out.println("이름입력: ");
			name = input.next();
			bankaccounti.setName(name);

			System.out.println("계좌입력: ");
			account = input.next();
			bankaccounti.setAccount(account);

			System.out.println("번호입력: ");
			number = input.next();
			bankaccounti.setNumber(number);

			System.out.println("잔액 입력: ");
			balance = input.nextDouble();
			bankaccounti.setBalance(balance);

			System.out.println("이자율: ");
			interestRate = input.nextDouble();
			bankaccounti.setInterestRate(interestRate);

			System.out.println("모든 데이터를 입력하셨습니까? 네(0), 아니오(1)");
			data = input.nextInt();
			bankaccounti.setData(data);

			System.out.println("이름: " + bankaccounti.getName());
			System.out.println("계좌: " + bankaccounti.getAccount());
			System.out.println("번호: " + bankaccounti.getNumber());
			System.out.println("잔액: " + bankaccounti.getBalance());
			System.out.println("이자율: " + bankaccounti.getInterestRate());
			System.out.println("데이터: " + bankaccounti.emptyCheck());
		}
	}

}
