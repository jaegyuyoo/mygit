package Exam1108.EmployeeProject_pdf_O;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String name;
		String number;
		double salary; // 월급 
		double computeSalary; // 월급
		double hourlyWage; // 시간당 수당 
		double workingHour; // 일한시간 
		
		Employee employee; 
		Employee employee1;
		
		System.out.println("정직원 이름: ");
		name = input.next();
		System.out.println("정직원 사번: ");
		number = input.next();
		System.out.println("정직원 급여 입력: ");
		computeSalary = input.nextDouble();

		employee = new SalariedEmployee(name, number, computeSalary);
		employee.computeSalary();
		
		System.out.println("계약직원 이름: ");
		name = input.next();
		System.out.println("계약직원 사번: ");
		number = input.next();
		System.out.println("비정규직 시간당 수당 입력: ");
		hourlyWage = input.nextDouble();
		System.out.println("비정규직 근무시간 입력: ");
		workingHour = input.nextDouble();
		
		employee1 = new HourlyEmployee(name, number, hourlyWage, workingHour); 
		employee1.computeSalary();
				
		/*
		Employee ab = new SalariedEmployee();
		Employee ac = new HourlyEmployee();
		ab.salary();
		ac.salary();
		System.out.println();
		
		Employee[] employees = {ab, ac};
		for(Employee employee : employees) {
			employee.salary();
		}
		*/
	}

}
