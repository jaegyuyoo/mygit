/* 231030
물, 최종, 초기온도 입력받아 에너지 계산
*/
package Completed_4ch_condition_print;

import java.util.Scanner;

public class EnergyToHeatWater {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double m; // 물의 무게 변수
		double q; // 에너지의 변수
		double initialTemperate; // 초기온도의 변수
		double finalTemperate; // 최종온도의 변수

		System.out.println("물, 최종, 초기온도 입력받아 에너지 계산"); // 제목
		System.out.println();

		System.out.println("물의무게를 입력해주세요(kg)");
		m = input.nextDouble(); // 물의 무게 입력

		System.out.println("초기온도를 입력해주세요(C)");
		initialTemperate = input.nextDouble(); // 초기온도 입력

		System.out.println("최종온도를 입력해주세요(C)");
		finalTemperate = input.nextDouble(); // 최종온도 입력

		q = m * (finalTemperate - initialTemperate) * 4184;

		System.out.println("물(kg) : " + m + " ,초기온도(C): " + initialTemperate + " ,최종온도(C) : " + finalTemperate + " 의 에너지는 " + q + " (J)입니다.");

	}

}