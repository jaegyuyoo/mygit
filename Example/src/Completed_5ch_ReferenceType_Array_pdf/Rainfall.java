package Completed_5ch_ReferenceType_Array_pdf;
import java.util.Scanner;

public class Rainfall {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int YEARS = 3; //년도
		final int QUARTERS = 4; // 분기
		double[][] rain = new double[YEARS][QUARTERS]; // 년도 + 분기 배열생성 3x4
		
		System.out.println(YEARS +" 년간 강수량을 계산하는 프로그램");
		
		
		// 강수량입력 *작은거(분기별) 에서 큰걸로(연도)
		for (int y = 0; y < YEARS; y++) {
			for (int q = 0; q < QUARTERS; q++) {
				System.out.println((y+1) + " 년도 " + (q+1) + " 분기 강수량 : "); // y가 0이니 y+1
					rain[y][q] = scan.nextDouble();
			}
		}
		System.out.println();
		System.out.println(YEARS +" 년치 연도별 강수량 결과");
		
		// 년도별 강수량 계산 
		for (int y = 0; y < YEARS; y++) {
			double total = 0.0;
			for (int q = 0; q < QUARTERS; q++) {
				total += rain[y][q]; // 분기별 년도별로 더해줌 rain[y][q]에 분기별로 강수량이 저장됨 (계산x)
				
				System.out.println(total); 
			}
			System.out.println((y+1) + " 차년도 전체강수량: " + total);
		}
	}

}
