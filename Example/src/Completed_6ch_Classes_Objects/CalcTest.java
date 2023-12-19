package Completed_6ch_Classes_Objects;
import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) { 
		// static 정적메서드 - 프로그램이 시작되면 제일먼저 메모리를 차지, 프로그램에 가장 늦게 종료

		Scanner input = new Scanner(System.in);

		int firstNumber;
		int secondNumber;
		int result; // 결과값

		Calc calc = new Calc(); // 더하기 계산객체 생성
		System.out.println("첫 번째수 입력: ");
		firstNumber = input.nextInt();

		calc.setFirstnumber(firstNumber); // 첫번째수 객체에게 신고

		System.out.println("두 번째수 입력: ");
		secondNumber = input.nextInt();

		calc.setSecondnumber(secondNumber); // 두번째수 객체에게 신고

		System.out.println(calc);

		
	}

}

