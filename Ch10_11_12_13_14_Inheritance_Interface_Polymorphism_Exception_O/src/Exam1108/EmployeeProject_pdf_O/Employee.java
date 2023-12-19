package Exam1108.EmployeeProject_pdf_O;

public abstract class Employee { // abstract 추상 class안에는 주성 메서드
	
	String name;
	String number;
	
	public Employee() {
		super();
	}
	public Employee(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public abstract void computeSalary(); // abstract 메서드
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", toString()=" + super.toString() + "]";
	}
	void salary() {
	}
}