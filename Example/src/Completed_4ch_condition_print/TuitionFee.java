/* 231030
등록금을 입력받아 4년동안 등록금 출력
*/
package Completed_4ch_condition_print;

import java.util.Scanner;

public class TuitionFee {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double tuition; // 등록금 변수 
		double tuition_2years; // 2년 등록금 변수
		double tuition_3years; // 3년 등록금 변수
		double tuition_4years; // 4년 등록금 변수
	
		
		double increaseRate; // 인상율 변수
		double increase; // 1년 등록금 인상금액
		double increase_2years; // 2년 등록금 인상금액
		double increase_3years; // 3년 등록금 인상금액
		
		System.out.println("등록금을 입력받아 4년동안 등록금 출력"); // 제목
		System.out.println();

		System.out.println("등록금을 입력해주세요");
		tuition = input.nextDouble(); // 등록금 입력
		
		increase = tuition * 0.045;
		tuition_2years = tuition + increase;
		
		increase_2years = tuition_2years * 0.045;
		tuition_3years = tuition_2years + increase_2years;
		
		increase_3years = tuition_3years * 0.045;
		tuition_4years = tuition_3years + increase_3years;
		
		System.out.println("1년차 등록금" + tuition);
		System.out.println("2년차 등록금" + tuition_2years);
		System.out.println("3년차 등록금" + tuition_3years);
		System.out.println("4년차 등록금" + tuition_4years);
		
		
	}

}
