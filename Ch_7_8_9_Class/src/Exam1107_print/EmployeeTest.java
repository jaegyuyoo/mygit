package Exam1107_print;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// 여기는 변수선언해줘야한다 상속개념이아니다.
		String name; // 이름  
		String telNumber; // 전화번호
		int salary; // 연봉 
		
		Employee employee = new Employee();
		Employee employee1 = new Employee();

		System.out.println("이름 입력1 : ");
		name = input.next(); 
		employee.setName(name); // 객체 이름 불러오기
		
		System.out.println("전화번호 입력1 : ");
		telNumber = input.next(); 
		employee.setTelNumber(telNumber); // 전화번호 불러오기
		
		System.out.println("연봉 입력1 : ");
		salary = input.nextInt();
		employee.setSalary(salary); // 연봉 불러오기
		
		System.out.println("이름 입력2 : ");
		name = input.next(); 
		employee1.setName(name); // 객체 이름 불러오기
		System.out.println("전화번호 입력2 : ");
		telNumber = input.next(); 
		employee1.setTelNumber(telNumber); // 전화번호 불러오기
		System.out.println("연봉 입력2 : ");
		salary = input.nextInt();
		employee1.setSalary(salary); // 연봉 불러오기
		
		System.out.println(employee);
		System.out.println(employee1);
		
	}

}
