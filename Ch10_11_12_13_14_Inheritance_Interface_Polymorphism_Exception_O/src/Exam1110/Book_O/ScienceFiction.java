package Exam1110.Book_O;

public class ScienceFiction extends Book {

	private int day3; // 연체날짜
	
	public ScienceFiction() {
		super();
	}

	public ScienceFiction(int day3) {
		super();
		this.day3 = day3;
	}

	public int getDay() {
		return day3;
	}

	public void setDay(int day3) {
		this.day3 = day3;
	}

	public void calculation() {
		System.out.println("과학서적(ScienceFiction) 연체료 계산: " + (day3 * FEE.SCIENCEFICTION));
	}
}
