package Completed_4ch_condition_pdf;

import java.util.Scanner;

public class ComputeBMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double weight;
		double height;
		double bmi;

		// 제목
		System.out.println("BMI(Body Mass Index) 체질량 지수 측정 프로그램");
		System.out.println();

		System.out.println("몸무게를 입력해주세요(예: 85kg) : ");
		weight = input.nextDouble();

		System.out.println("키를 입력해주세요(예: 172cm) : ");
		height = input.nextDouble();

		bmi = (weight) / (height/100 * height/100);

		System.out.println("당신의 BMI : " + (float) bmi);
		if (bmi < 16) {
			System.out.println("당신은 심각한 저체중");
		} else if (bmi < 18) {
			System.out.println("당신은 저체중");
		} else if (bmi < 24) {
			System.out.println("당신은 정상체중");
		} else if (bmi < 29) {
			System.out.println("당신은 과체중");
		} else if (bmi < 35) {
			System.out.println("당신은 심각한 과체중");
		} else {
			System.out.println("당신은 위험한 과체중");
		}
	}

	
}
