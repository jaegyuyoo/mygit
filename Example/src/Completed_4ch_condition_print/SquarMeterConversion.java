/* 231030
평입력 받아 평방미터 계산
*/
package Completed_4ch_condition_print;

import java.util.Scanner;

public class SquarMeterConversion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double squar; // 평 변수
		double squarMeter; // 평방미터 변수
		
		System.out.println("평입력 받아 평방미터 계산"); // 제목
		System.out.println();

		System.out.println("평을 입력해주세요");
		squar = input.nextDouble(); // 평값 입력
		
		if (squar >= 0) {
			squarMeter = squar * 3.3058; // 평방미터 계산 = 평 * 3.3058
			
			System.out.println(squar + " 평 의 평방미터는 " + squarMeter + " m^2 입니다.");
			// 결과출력
		} else {
			System.out.println("음수입니다.");
		}
	}
}