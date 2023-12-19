package Completed_4ch_condition_print;
import java.util.Scanner;

public class PolygonAreaCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String op;

		double squar; // 사각형
		double width; // 가로
		double length; // 세로

		double triangle; // 삼각형
		double base; // 밑변
		double height; // 높이

		double circle; // 원
		double radius; // 반지름 

		System.out.println("R/T/C 문자중 하나를 입력해주세요: ");
		op = input.next();

		switch (op) {
		case "R": // 사각형
			System.out.println("가로, 세로 값을 입력해주세요: "); // 가로,세로 값을 입력
			width = input.nextDouble();
			length = input.nextDouble();
			squar = width * length;
			System.out.println("사각형의 넓이는 : " + squar); 
			break;
		case "T": // 삼각형 
			System.out.println("밑변, 높이 값을 입력해주세요: "); // 밑변, 높이 값을 입력
			base = input.nextDouble();
			height = input.nextDouble();
			triangle = (base * height) / 2;
			System.out.println("삼각형의 넓이는 : " + triangle);
			break;
		case "C": // 원 
			System.out.println("반지름 값을 입력해주세요: "); // 반지름 값을 입력
			radius = input.nextDouble();
			circle = 2 * 3.14 * Math.pow(radius, 2);
			System.out.println("삼각형의 넓이는 : " + circle);
			break;
		default:
			System.out.println("제대로 R/T/C 문자중 하나를 입력해주세요: ");
		}
	}
}
