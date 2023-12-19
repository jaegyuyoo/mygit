package Exam1108.EmployeeProject_pdf_O;

public class HourlyEmployee extends Employee {

	private double hourlyWage; // 시간당 수당 
	private double workingHour; // 일한시간 
	private double computeSalary; // 계약직 수당

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(double hourlyWage, double workingHour) {
		super();
		this.hourlyWage = hourlyWage;
		this.workingHour = workingHour;
	}

	public HourlyEmployee(String name, String number, double hourlyWage, double workingHour) {
		super(name, number);
		this.hourlyWage = hourlyWage;
		this.workingHour = workingHour;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(double workingHour) {
		this.workingHour = workingHour;
	}

	
	/*
	public void computeSalary() {
		// 계약직 급여를 정하는 방법 
		System.out.println("시간당수당: " + hourlyWage + " " + "일한시간: " + workingHour);
		System.out.println("계약직 급여: " + (hourlyWage * workingHour));
	}
	*/
	
	@Override
	public void computeSalary() {
		// TODO Auto-generated method stub
		System.out.println("시간당수당: " + hourlyWage + " " + "일한시간: " + workingHour);
		System.out.println("계약직 급여: " + (hourlyWage * workingHour));
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [hourlyWage=" + hourlyWage + ", workingHour=" + workingHour + ", toString()="
				+ super.toString() + "]";
	}
	void salary() {
		System.out.println("계약직 월급");
	}


}
