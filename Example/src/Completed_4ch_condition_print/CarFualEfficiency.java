/* 231030
출발, 도착 주행거리계눈금(주행거리), 사용한 연료의양 입력받아 자동차의 연비계산
*/
package Completed_4ch_condition_print;

import java.util.Scanner;

public class CarFualEfficiency {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// 사용자로 부터 입력을 받기 위해 Scanner를 생선한다.

		System.out.println("출발, 도착 주행거리계눈금(주행거리), 사용한 연료의양 입력받아 자동차의 연비계산"); // 제목
		System.out.println();

		int start; // 출발 주행거리계 눈금
		int end; // 도착 주행거리계 눈금
		int used; // 사용한 연료의 양
		int efficiency; // 연비

		System.out.print("출발 지점의 주행 거리계 : ");
		start = input.nextInt(); // 출발 주행거리 눈금 입력

		System.out.print("도착 지점의 주행 거리계 : ");
		end = input.nextInt(); // 도착 주행거리 눈금 입력

		System.out.print("사용한 연료랑 : ");
		used = input.nextInt(); // 사용한 연료 입력

		// 3입력 모두 양수이면서 조건식 end < start 이면, 서로 교환한다
		// 우선순위는 괄호를 이용한다.
		if ((((start >= 0) && (end >= 0)) && (used >= 0)) && (end < start)) {
		int temp; // 임시변수

			temp = start;
			start = end;
			end = temp;

			efficiency = (end - start) / used; // 연비계산 (도착-시작) / 연료
			System.out.print("연비 : " + efficiency + "km/l"); // 결과출력
			
		} else if (start < 0 && end >= 0 && used >= 0) {
			System.out.println("출발주행거리계 가 음수입니다.");
		} else if (start >= 0 && end < 0 && used >= 0) {
			System.out.println("도착 주행거리계 가 음수 입니다.");
		} else if (start >= 0 && end >= 0 && used < 0) {
			System.out.println("사용 연료의양 이 음수 입니다.");
		} else if (start < 0 && end < 0 && used >= 0) {
			System.out.println("출발주행거리계/도착주행거리계 가 음수입니다.");
		} else if (start < 0 && end >= 0 && used < 0) {
			System.out.println("출발주행거리계/사용한 연료의양 이 음수입니다.");
		} else if (start >= 0 && end < 0 && used < 0) {
			System.out.println("도착주행거리계/사용한 연료의양 이 음수입니다.");
		} else {
			System.out.println("세 값모두 음수입니다.");
		}
	}
}