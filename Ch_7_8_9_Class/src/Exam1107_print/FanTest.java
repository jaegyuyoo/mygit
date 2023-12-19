package Exam1107_print;

import java.util.Scanner;

public class FanTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 소스를 읽을수있게 하려고
		final int SLOW = 1;
		final int MEDIUM = 2;
		final int FAST = 3;
		
		final int OBJECT = 2;

		int speed; // 현재속도
		boolean on; // 동작
		double radius; // 선풍기크기
		String color; // 선풍기색상

		for (int i = 0; i < OBJECT; i++) {
			
			Fan fani = new Fan();
			
			// 입력부분
			System.out.println("선풍기의 속도를 입력해주세요 ");
			speed = input.nextInt();
			fani.setSpeed(speed); // 객체를 통해 얻어올 set을 설정해야한다.

			switch (fani.getSpeed()) {
			case SLOW:
				System.out.println("최저속도");
				break;
			case MEDIUM:
				System.out.println("중간속도");
				break;
			case FAST:
				System.out.println("최고속도");
				break;
			}

			// 상태
			System.out.println("선풍기 상태입력 - 작동(true), 정지(false)");
			on = input.nextBoolean();
			fani.setOn(on);

			System.out.print("선풍기의 상태는: ");
			fani.fanworking();

			System.out.println("선풍기 지름(radius) 입력: ");
			radius = input.nextDouble();
			fani.setRadius(radius);

			System.out.println("선풍기 지름(radius): " + fani.getRadius());

			System.out.println("선풍기 색상 입력: ");
			color = input.next();
			fani.setColor(color);

			System.out.println("선풍기 컬러: " + fani.getColor());
			
		}
	}
}
