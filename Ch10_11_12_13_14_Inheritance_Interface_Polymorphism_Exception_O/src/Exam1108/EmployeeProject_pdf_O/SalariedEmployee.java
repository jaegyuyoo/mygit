package Exam1108.EmployeeProject_pdf_O;

public class SalariedEmployee extends Employee {

	private double computeSalary; // 월급 

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(double computeSalary) {
		super();
		this.computeSalary = computeSalary;
	}

	public SalariedEmployee(String name, String number, double computeSalary) {
		super(name, number);
		this.computeSalary= computeSalary;
	}

	public double getSalary() {
		return computeSalary;
	}

	public void setSalary(double computeSalary) {
		this.computeSalary = computeSalary;
	}
	
	/*
	public void computeSalary() {
		// 정규직 급여를 정하는 방법 
	}
	*/
	
	@Override
	public void computeSalary() {
		System.out.println("정직원 세전 급여: " + computeSalary);
		System.out.println("정직원 세후 급여: " + (computeSalary - (computeSalary * 0.033)));		
	}

	@Override
	public String toString() {
		return "SalariedEmployee [computeSalary=" + computeSalary + ", toString()=" + super.toString() + "]";
	}
	void salary() {
		System.out.println("정직원 월급");
	}


}
