package Exam1110.PhoneBookProject_1110_I;

public class PhoneUnivInfo extends PhoneInfo {

	private String major; // 전공
	private int year; // 학년
	
	public PhoneUnivInfo() {
		super();
	}

	public PhoneUnivInfo(String major, int year) {
		super();
		this.major = major;
		this.year = year;
	}

	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajro(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// 전공(major), 학년(year)
	public void showPhoneinfo(){
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}
	
	@Override
	public String toString() {
		return "PhoneUnivInfo [majro=" + major + ", year=" + year + ", toString()=" + super.toString() + "]";
	}
}
