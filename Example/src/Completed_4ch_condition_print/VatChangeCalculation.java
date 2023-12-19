/* 231030 
받은돈, 상품가격 입력받아 부가세 거름돈 계산 및 출력
*/
package Completed_4ch_condition_print;

import java.util.Scanner;

public class VatChangeCalculation {

	public static void main(String[] args) {

		// 받은돈, 상품의총액을 입력받기 위한 Scanner
		Scanner input = new Scanner(System.in);

		int money; // 받은돈
		int sum; // 상품의총액
		double vat; // 부가세
		int change; // 거스름돈

		System.out.println("받은돈, 상품가격을 입력받아 부가세 거스름돈을 계산하여 영수증을 출력"); // 제목
		System.out.println("");

		System.out.print("받은돈을 입력해주세요 : ");
		money = input.nextInt(); // 받은돈 입력받기

		System.out.print("상품의 총액을 입력해주세요 : ");
		sum = input.nextInt(); // 상품의총액 입력받기

		if (money >= 0 && sum >= 0) {
			vat = sum * 0.1; // 부가세 계산 (상품의 총액의 10%, sum/10)
			change = money - sum; // 거스름돈 계산 (받은돈 - 상품의총액)

			System.out.println("= 영수증 =" + "\n" + "받은 돈 : " + money + "\n" + "상품의 총액 : " + sum + "\n" + "부가세 : " + vat
					+ "\n" + "거스름돈 : " + change);
			// 예시에 나온것처럼 영수증 표기 줄넘김 \n 이용
			// (Q) 상품의총액이 한자리면 부가세가 안나올수다... 예저처럼 INT로해야하는가?
		} else if (money < 0 && sum >= 0) {
			System.out.println("받은돈이 0보다 작습니다.");
		} else if (money >= 0 && sum < 0) {
			System.out.println("상품의 총액이 0보다 작습니다.");
		} else {
			System.out.println("두값모두 0보다 작습니다.");
		}
	}
}
