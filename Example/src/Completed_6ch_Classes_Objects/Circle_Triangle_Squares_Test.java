package Completed_6ch_Classes_Objects;
import java.util.Scanner;

public class Circle_Triangle_Squares_Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double x;
		double y;
		double radius;
		double area;
		
		double base; 
		double height;

		double width;
		double lenght;
		
		// 원 
		Circle_default circle = new Circle_default(); // 반지름 구하게 계산객체 생성 
		Circle_default circle1 = new Circle_default(); // 반지름 구하게 계산객체 생성 
		System.out.println(circle); // 생성자
		
		// 삼각형
		Triangle triangle = new Triangle();
		
		// 사각형
		Square square = new Square();
		
		/*
		// 원
		System.out.println("x 입력 ");
		x = input.nextDouble();
		circle.setX(x); // "객체."으로 값을 set하고 밑에 get하여 결과를 출력하는게 포인트  
		
		System.out.println("y 입력 ");
		y = input.nextDouble();
		circle.setY(y);
		
		System.out.println("radius 입력 ");
		radius = input.nextDouble();
		circle.setRadius(radius);
		
		// 원1
		System.out.println("x 입력 ");
		x = input.nextDouble();
		circle1.setX(x); // "객체."으로 값을 set하고 밑에 get하여 결과를 출력하는게 포인트  
		
		System.out.println("y 입력 ");
		y = input.nextDouble();
		circle1.setY(y);
		
		System.out.println("radius 입력 ");
		radius = input.nextDouble();
		circle1.setRadius(radius);
		
		
		// 삼각형 
		System.out.println("밑변 입력 ");
		base = input.nextDouble();
		triangle.setBase(base);
		
		System.out.println("높이 입력 ");
		height = input.nextDouble();
		triangle.setHeight(height);
		
		// 사각형 
		System.out.println("가로 입력 ");
		width = input.nextDouble();
		square.setWidth(width);
		
		System.out.println("세로 입력 ");
		lenght = input.nextDouble();
		square.setLenght(lenght);
		
		

		// 원
		// System.out.println(circle);
		System.out.println("중심점 : " + circle.getX() + " , " + circle.getY());
		System.out.println("반지름 : " + circle.getRadius());
		System.out.println("원면적 : " + circle.circleArea());
		System.out.println("원면적 : " + circle);

		// 원2
		System.out.println("중심점 : " + circle1.getX() + " , " + circle1.getY());
		System.out.println("반지름 : " + circle1.getRadius());
		System.out.println("원면적 : " + circle1.circleArea());
		System.out.println("원면적 : " + circle1);

		// 삼각형 
		System.out.println("삼각형 밑변 : " + triangle.getBase());
		System.out.println("삼각형 높이 : " + triangle.getHeight());
		System.out.println("삼각형 면적  : " + triangle.triangleArea());
		System.out.println("삼각형 면적  : " + triangle);
		
		// 사각형 
		System.out.println("사각형 가로 : " + square.getWidth());
		System.out.println("사각형 세로 : " + square.getLenght());
		System.out.println("사각형 면적  : " + square.squareArea());
		System.out.println("사각형 면적  : " + square);
		*/
		
		
		// 생성자 사용 
		Circle_default c1 = new Circle_default(5, 10, 3); // 초기화
		System.out.println(c1);
	}

}
