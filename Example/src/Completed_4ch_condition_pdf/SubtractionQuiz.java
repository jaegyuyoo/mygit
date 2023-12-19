package Completed_4ch_condition_pdf;
import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int ramdomNumber1; // 첫번째 랜덤수
		int ramdomNumber2; // 두번재 랜덤ㅅ무
		int answer; // 정답

		// 제목
		System.out.println("두개의 랜덤수를 생성하여, 음수가 아닌 뺄셈값을 구한다.");
		System.out.println();

		ramdomNumber1 = (int) (Math.random() * 101); // 임이의 한자리 정수 생성 함수
		ramdomNumber2 = (int) (Math.random() * 101); // 임이의 한자리 정수 생성 함수

		if (ramdomNumber1 < ramdomNumber2) { // 조건식 random1 < random2 이면, 서로 교환한다/
			int temp; // 임시변수

			temp = ramdomNumber1;
			ramdomNumber1 = ramdomNumber2;
			ramdomNumber2 = temp;
		}

		// 문력 출력 및 결과 입력
		System.out.println("뺄셈을 맞추는 퀴즈");
		System.out.print(ramdomNumber1 + " - " + ramdomNumber2 + " = ");
		answer = input.nextInt();

		// 계산 및 결과 제출 (조건식)
		if (ramdomNumber1 - ramdomNumber2 == answer) {
			System.out.println("정답입니다.");
		} else {
			System.out.println(
					"오답입니다. \n정답 : " + ramdomNumber1 + " - " + ramdomNumber2 + " = " + (ramdomNumber1 - ramdomNumber2));
		}
	}

}
