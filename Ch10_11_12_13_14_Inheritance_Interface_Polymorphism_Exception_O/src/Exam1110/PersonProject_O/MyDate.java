package Exam1110.PersonProject_O;

public class MyDate extends Employee {

	private int year; // 년도
	private int month; // 월
	private int day; // 일 

	public MyDate() {
		super();
	}

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public MyDate(String office, double salary, String date, int year, int month, int day) {
		super(office, salary, date);
		this.year = year;
		this.month = month;
		this.day = day;
		// TODO Auto-generated constructor stub
	}

	public MyDate(String name, String addr, String phoneNumber, String mailaddr, String office, double salary,
			String date) {
		super(name, addr, phoneNumber, mailaddr, office, salary, date);
		// TODO Auto-generated constructor stub
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "myDate [year=" + year + ", month=" + month + ", day=" + day + ", toString()=" + super.toString() + "]";
	}
	
	
}
