package Completed_2_3ch_dataType_operator_pdf;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {

		// 사용자로부터 입력을 받기위해 Scanner를 생선한다.
		Scanner input = new Scanner(System.in);

		int salary; // 월급
		int deposit; // 저축액
		
		System.out.println("10년동안 월급을 모두 저금할 경우, 얼마나 모을수 있는지를 계산하는 프로그램");
		
		
		//사용자에게 월급의 액수를 입력받는다.
		System.out.print("월급여(만원)을 입력하시오: ");
		salary = input.nextInt();
		
		//연봉의 연수를 곱하낟.
		deposit = 10 * 12 * salary;
		
		//저축액을 출력한다.
		System.out.println("10년 동안의 저축액 : " + deposit + "만원");
	}

}
