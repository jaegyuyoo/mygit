package Exam1106_pdf;

public class Loan {

	private double annualInterestRate; // 연이율 (기본값 2.5)
	private int numberOfYears; // 대출기간 (기본값 1)
	private double loanAmount; // 대출금액 (기본값 1000)
	private java.util.Date loadDate; // 대출일자

	/** 기본생성자 */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/** 주어진 이율, 기간, 금액의 생성자 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loadDate = new java.util.Date();
	}

	/** 연이율 반환 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** 연이율 변경 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/** 대출기간 반환 */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** 대출기간 변경 */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/** 대출금액 반환 */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** 대출금액 변경 */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/** 월 상환액 반환 */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12));
		return monthlyPayment;
	}
	/** 총 상환액 반환 */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	/** 대출일 반환 */
	public java.util.Date getLoadDate() {
		return loadDate;
	}

}
