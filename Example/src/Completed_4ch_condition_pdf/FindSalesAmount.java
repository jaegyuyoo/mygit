package Completed_4ch_condition_pdf;
import java.util.Scanner;

public class FindSalesAmount {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long commision_target; // 목표 커미션
		long year_salay; // 기본 연봉
		long salay_target; // 목표 연봉
		
		long commision = 0;
		double salesAmount = 1;
		
		System.out.println("직원의 급여에서 커미션 계산하는 프로그램");
		
		System.out.println("기본연봉");
		year_salay = input.nextLong();
		
		System.out.println("목표연봉");
		salay_target = input.nextLong();
		
		// 목표 커미션계산
		commision_target = salay_target = year_salay;
		
		do {
			// 1원씩 판매금액을 늘리시오
			salesAmount += 1;
			
			// 현재판매금액에서 커미션을 계산
			if (salesAmount >= 100000001) {
				commision = (long) (50000000 * 0.08 + 50000000 + (salesAmount = 100000000) * 0.12);
			} else if (salesAmount >= 50000001) {
				commision = (long) (50000000 * 0.08 + (salesAmount = 50000000));
			} else {
				commision = (long) (salesAmount * 0.08);
			}
		} while (commision < commision_target);
		
		// 목표 커미션과 추가로 필요한 판대금액 표시
		System.out.println("필요한 커미션 금액 :" + commision_target + "원");
		System.out.println("추가 판매 금액 :" + (salesAmount * 100) / 100 + "원");
		
	}
}
