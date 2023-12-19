package Exam1110.PersonProject_O;

public class Staff extends Employee {
	
	private String position;

	public Staff() {
		super();
	}

	public Staff(String position) {
		super();
		this.position = position;
	}

	public Staff(String office, double salary, String date, String position) {
		super(office, salary, date);
		this.position = position;
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String addr, String phoneNumber, String mailaddr, String office, double salary,
			String date) {
		super(name, addr, phoneNumber, mailaddr, office, salary, date);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
