package Completed_4ch_condition_pdf;
import java.util.Scanner;

public class GreatestCommonDivision {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int firstNumber; // 첫번째 정수
		int secondNumber; // 두번째 정수
		int gcd=1; // 최대공약수
		int d=2; // 공약수
		
		System.out.println("두개의 정수를 를 입력받아 최대공약수 찾는 프로그램");
		
		System.out.println("첫번째 정수입력");
		firstNumber = input.nextInt();
		
		System.out.println("두번째 정수입력");
		secondNumber = input.nextInt();
				
		while ((d <= firstNumber) && (d <= secondNumber)) {
			if ((firstNumber % d == 0) && (secondNumber % d == 0)) {
				gcd = d;
			}
			d++; // 큰 d를 찾는게목표이다.
		}
		System.out.println(firstNumber + "와 " + secondNumber + " 의 최대공약수 : " + gcd);
	}

}
