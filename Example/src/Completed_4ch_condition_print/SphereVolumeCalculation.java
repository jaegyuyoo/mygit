
package Completed_4ch_condition_print;

import java.util.Scanner;

public class SphereVolumeCalculation {

	public static void main(String[] args) {

		// 반지름의 값을 입력받기 위한 Scanner함수
		Scanner input = new Scanner(System.in);

		double radius; // 반지름 변수선언
		double volume; // 구의 부피 변수선언

		System.out.println("구의 반지름을 입력받아, 구의 부피를 계산."); // 제목
		System.out.println("");

		System.out.println("반지름의 길이를 입력해주세요(실수)");
		radius = input.nextDouble(); // 반지름값 입력

		if (radius >= 0) {
			volume = 4.0 / 3.0 * 3.14 * Math.pow(radius, 3);
			// 결과출력
			System.out.println("반지름이 " + radius + " 인 구의 부피는 " + volume + " 입니다");
		} else {
			System.out.println("양수인 반지름값을 입력하세요");
		}

	}

}

//volume = 4.0 / 3.0 * 3.14 * radius * radius * radius;
//// 구의 부피는 4 / 3 * 3.14 * 반지름의 3제곱근이다
