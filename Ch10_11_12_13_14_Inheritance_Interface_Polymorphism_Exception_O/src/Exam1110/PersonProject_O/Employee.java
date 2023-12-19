package Exam1110.PersonProject_O;

public class Employee extends Person {

	private String office; // 사무실
	private double salary; // 봉급
	private String date; // 고용날짜
	
	public Employee() {
		super();
	}

	public Employee(String office, double salary, String date) {
		super();
		this.office = office;
		this.salary = salary;
		this.date = date;
	}

	public Employee(String name, String addr, String phoneNumber, String mailaddr, String office, double salary, String date) {
		super(name, addr, phoneNumber, mailaddr);
		this.office = office;
		this.salary = salary;
		this.date = date;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", date=" + date + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
