package Exam1107_print;

public class BankAccount {

	private String name; // 이름
	private String account; // 계좌
	private String number; // 번호
	private double balance; // 잔액
	private double interestRate; // 이자율
	
	private int data; // 모든데이터 
	
	// 1-1 Generate Constructor using Fields
	public BankAccount() {
		super();
	}

	// 1-1 Generate Constructor using Fields
	public BankAccount(String name, String account, String number, double balance, double interestRate, int data) {
		super();
		this.name = name;
		this.account = account;
		this.number = number;
		this.balance = balance;
		this.interestRate = interestRate;
		this.data = data;
	}

	// 2. Generate Getters and Setters
	// 이름 반환
	public String getName() {
		return name;
	}
	// 이름 변경
	public void setName(String name) {
		this.name = name;
	}
	// 계좌 반환
	public String getAccount() {
		return account;
	}
	// 계좌 변경
	public void setAccount(String account) {
		this.account = account;
	}
	// 번호 반환
	public String getNumber() {
		return number;
	}
	// 번호 변경
	public void setNumber(String number) {
		this.number = number;
	}
	// 잔액 반환
	public double getBalance() {
		return balance;
	}
	// 잔액 변경
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// 이자율 반환
	public double getInterestRate() {
		return interestRate;
	}
	// 이자율 변경
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String emptyCheck() {
		String emptysatus;
		if (getData() == 1) { // getter를 불러와 조건
			emptysatus = "모든 데이터를 받지 않았습니다. 공란입니다.";
		} else {
			emptysatus = "데이터 입력을 완료했습니다.";
		}
		return emptysatus; 
	}
	
	
}
