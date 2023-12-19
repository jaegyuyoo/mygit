package Completed_4ch_condition_pdf;

import java.util.Scanner;

public class DayInMonth {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int month; // 입력월
		int year; // 입력년도
		int days = 0; // 일수

		System.out.println("달의 일수를 알아보는 프로그램");
		System.out.println();

		// 년도입력
		System.out.println("년도 입력 : ");
		year = input.nextInt();

		// 월입력
		System.out.println("월 입력");
		month = input.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			// 운년계산
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
				days = 29;
			} else {
				// 평년
				days = 28;
			}
			break;
		default:
			System.out.println("월이 잘못 입력되었습니다.");
			break;
		}
		System.out.println(year + "년 " + month + "월 ");
		System.out.println("일수는 " + days + "일");
	}
}
