package Exam1107_print;

import java.util.Scanner;

public class BoxTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		final int NUMBEROFBOX;
		NUMBEROFBOX = 4;
		
		double height; // 높이
		double width; // 너비, 폭 
		int empty; // 비어있다.
	
		for (int i = 0; i < NUMBEROFBOX; i++) {
		
		Box boxi = new Box();
			
		System.out.println("높이 입력: ");
		height = input.nextDouble(); 
		boxi.setHeight(height);
		
		System.out.println("너비 입력: ");
		width = input.nextDouble();
		boxi.setWidth(width);
		
		System.out.println("높이 너비 모두 입력하셨습니까? 네(0), 아니오(1)");
		empty = input.nextInt();
		boxi.setEmpty(empty);
		
		System.out.println("높이: " + boxi.getHeight());
		System.out.println("너비: " + boxi.getWidth());
		System.out.println("공란: " + boxi.emptyCheck());
		}
		
		
	}

}
