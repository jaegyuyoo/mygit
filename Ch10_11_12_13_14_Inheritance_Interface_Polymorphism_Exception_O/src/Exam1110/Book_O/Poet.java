package Exam1110.Book_O;

public class Poet extends Book {

	private int day2; // 연체날짜

	public Poet() {
		super();
	}

	public Poet(int day2) {
		super();
		this.day2 = day2;
	}

	public int getDay() {
		return day2;
	}

	public void setDay(int day2) {
		this.day2 = day2;
	}

	public void calculation() {
		System.out.println("시(Poet) 연체료 계산: " + (day2 * FEE.POET));
	}
	
}
