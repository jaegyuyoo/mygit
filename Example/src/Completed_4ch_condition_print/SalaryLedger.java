/* 231030
근무시간, 시간당급여 인력받아 총급여, 세금액, 수령금여 계산
*/
package Completed_4ch_condition_print;

import java.util.Scanner;

public class SalaryLedger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char name; // 이름 변수
		double hours; // 주당 근무시간 변수
		double salary; // 시간당 급여 변수
		double tax; // 세금 변수
		double total; // 총급여 변수
		double receivedSalary; // 수령금액 변수

		String string; // 문자열
		String stringline;

		System.out.println("근무시간, 시간당급여 인력받아 총급여, 세금액, 수령금여 계산"); // 제목
		System.out.println();

		System.out.print("직원의 이름 (예: 유재규) : ");
		string = input.next(); // 직원 이름 입력

		System.out.print("주당 근무 시간 (예: 40) : ");
		hours = input.nextDouble(); // 주당 근무시간 입력

		System.out.print("시간당 급여 (예 : 4320) : ");
		salary = input.nextDouble(); // 시간당 급여 입력

		System.out.print("소득 세금 (예 : 3.3%) : ");
		tax = input.nextDouble(); // 세금 입력

		// 2^3 8가지 경우의수 조건식
		if ((hours >= 0 && hours <= 52) && salary >= 0 && tax >= 0) {
			total = hours * salary; // 총 급여 계산
			tax = total * (tax / 100); // 세금액 계산
			receivedSalary = total - tax; // 수령급여 계산

			System.out.print(
					"총 급여 " + total + " 원 " + "\n" + "세금액 " + tax + " 원 " + "\n" + "수령금여 " + receivedSalary + " 원 ");
			// 결과출력
		} else if (hours < 0 && salary >= 0 && tax >= 0) {
			System.out.println("시간이 음수입니다.");
		} else if (hours >= 0 && salary < 0 && tax >= 0) {
			System.out.println("급여수당 음수입니다.");
		} else if (hours >= 0 && salary >= 0 && tax < 0) {
			System.out.println("소득세금이 음수입니다.");
		} else if (hours < 0 && salary < 0 && tax >= 0) {
			System.out.println("시간/급여수당 이 음수입니다.");
		} else if (hours < 0 && salary >= 0 && tax < 0) {
			System.out.println("시간/소득세금 가 음수입니다.");
		} else if (hours >= 0 && salary < 0 && tax < 0) {
			System.out.println("급여수당/소득세금 가 음수입니다.");
		} else if (hours < 0 && salary < 0 && tax < 0) {
			System.out.println("시간/급여수당/소득세금 이 모두 음수입니다.");
		} else {
			System.out.println("주간근무시간 초과");
		}
	}
}