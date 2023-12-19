package Exam1110.Book_O;

public class Novel extends Book {

	private int day1; // 소설 연체날짜

	public Novel() {
		super();
	}

	public Novel(int day1) {
		super();
		this.day1 = day1;
	}

	public int getDay() {
		return day1;
	}

	public void setDay(int day1) {
		this.day1 = day1;
	}

	public void calculation() {
		System.out.println("소설(Novel) 연체료 계산: " + (day1 * FEE.NOVEL));
	}
	

}
