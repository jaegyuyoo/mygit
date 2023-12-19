package Completed_4ch_condition_pdf;
import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final int NUMBER_OF_QUESTIONS = 5; // 총 문제 갯수
		int correctionCount = 0; // 정답 갯수
		int count = 0; // 반복문 탈출
		long startTime; // 시작시각
		long endTime; // 종료시각
		long testTime; // 테스트 전체 초
		long currentSecond; // 테스트 초 계산
		long totalMinutes; // 테스트 분 계산

		startTime = System.currentTimeMillis() / 1000; // 밀리나노초로 변경
		String output = "";

		System.out.println("다섯개의뺄샘문제테스트프로그램");

		while (count < NUMBER_OF_QUESTIONS) {
			int number1; // 첫번째 랜덤수
			int number2; // 두번째 랜덤수

			number1 = (int) (Math.random() * 101);
			number2 = (int) (Math.random() * 101);

			if (number1 < number2) {
				int temp;
				temp = number1;
				number1 = number2;
				number2 = temp;
			}
			count++; // 문제번호

			System.out.println("\n문제 " + count + "번");
			System.out.println(number1 + " - " + number2 + " = ");
			int answer = input.nextInt();

			if (number1 - number2 == answer) {
				System.out.println("정답!");
				correctionCount++;
			} else {
				System.out.println("오답\n" + number1 + " - " + number2 + " = " + (number1 - number2));
			}

			output += "\n" + count + "번문제 : " + number1 + " - " + number2 + " = " + answer
					+ ((number1 - number2 == answer) ? " 정답 " : " 오답 ");

			endTime = System.currentTimeMillis() / 1000; // 밀리나노초 변경
			testTime = endTime = startTime;
			currentSecond = (int) (testTime % 60);
			totalMinutes = testTime / 60;

			System.out.println("\n정답갯수 : " + correctionCount);
			System.out.println("테스트시간  : " + totalMinutes + " 분 " + currentSecond + "  초\n " + output);

		}

	}

}
