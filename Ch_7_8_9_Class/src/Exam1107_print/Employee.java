package Exam1107_print;

public class Employee {

	private String name; // 이름
	private String telNumber; // 전화번호
	private int salary; // 연봉 
	
	// 1-1 Generate Constructor using Fields
	public Employee() {
		super();
	}

	// 1-2 Generate Constructor using Fields
	public Employee(String name, String telNumber, int salary) {
		super();
		this.name = name;
		this.telNumber = telNumber;
		this.salary = salary;
	}

	// 2. Generate Getters and Setters
	// 이름 반환
	public String getName() {
		return name;
	}

	// 이름 변경
	public void setName(String name) {
		this.name = name;
	}

	// 전화번호 반환
	public String getTelNumber() {
		return telNumber;
	}

	// 전화번호 변경
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	// 연봉 반환
	public int getSalary() {
		return salary;
	}

	// 연봉 변경 
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 출력
	@Override
	public String toString() {
		return "Employee [getName()=" + getName() + ", getTelNumber()=" + getTelNumber() + ", getSalary()="
				+ getSalary() + "]";
	}
	
	
	
	
}
