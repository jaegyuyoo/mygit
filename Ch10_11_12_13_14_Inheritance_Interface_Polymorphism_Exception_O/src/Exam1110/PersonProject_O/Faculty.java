package Exam1110.PersonProject_O;

public class Faculty extends Employee {

	private String consultationTime; // 상담시간
	private int rank; // (우선)순위

	public Faculty() {
		super();
	}

	public Faculty(String consultationTime, int rank) {
		super();
		this.consultationTime = consultationTime;
		this.rank = rank;
	}

	public Faculty(String office, double salary, String date, String consultationTime, int rank) {
		super(office, salary, date);
		this.consultationTime = consultationTime;
		this.rank = rank;
		// TODO Auto-generated constructor stub
	}

	public Faculty(String name, String addr, String phoneNumber, String mailaddr, String office, double salary,
			String date) {
		super(name, addr, phoneNumber, mailaddr, office, salary, date);
		// TODO Auto-generated constructor stub
	}

	public String getConsultationTime() {
		return consultationTime;
	}

	public void setConsultationTime(String consultationTime) {
		this.consultationTime = consultationTime;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty [consultationTime=" + consultationTime + ", rank=" + rank + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
