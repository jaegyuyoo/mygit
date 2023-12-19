package Completed_4ch_condition_pdf;

import java.util.Scanner;

public class Sales_print {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		int[][] sales = new int[5][4]; // 5분기 4분기 
		
		System.out.println("미래회사 대출액 관리 프로그램");
		
		// 부서별 분기 매출액 입력
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 4; i++) {
				do {
					System.out.print("영업" + (j + 1) + "부서" + (i + 1) + "분기 매출액 입력: ");
					sales[j][i] = input.nextInt();
				} while (sales[j][i] < 0);
			}
		}
		
		// 분기명 출력
		System.out.println();
		System.out.println("\t\t부서별 분기 매출액");
		System.out.println("\t\t1분기\t2분기\t3분기\t4분기");
		
		// 부서별 분기 매출액 출력
		System.out.println();
		System.out.println("\t부서별 전체 매출액");
		for (int j = 0; j < 5; j++) {
			int departmentTotal = 0;
			System.out.print("영업 " + (j + 1) + "부서 : ");
			for (int i = 0; i < 4; i++) {
				departmentTotal += sales[j][i];
			}
			System.out.print("\t" + departmentTotal);
			System.out.println();
		}
		
		// 분기별 전체 매출액
		System.out.println();
		System.out.println("\t분기별 전체 매출액");
		System.out.println("\t1분기\t2분기\t3분기\t4분기");
		for (int j = 0; j < 4; j++) {
			int quarterTotal = 0;
			for (int i = 0; i < 5; i++) {
				quarterTotal += sales[i][j];
			}
			System.out.print("\t" + quarterTotal);
		}
		
		// 분기별 전체 평균 매출액 
		System.out.println();
		System.out.println();
		System.out.println("\t분기별 전체 평균 매출액");
		System.out.println("\t1분기\t2분기\t3분기\t4분기");
		for (int j = 0; j < 4; j++) {
			int quarterTotal = 0;
			for (int i = 0; i < 5; i++) {
				quarterTotal += sales[i][j];
			}
			System.out.println("\t" + quarterTotal / 5);
		}
		
		// 연간 회사 총 매출액
		System.out.println();
		System.out.println();
		System.out.println("\t연간 회사 총 매출액");
		int companyTotal = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 5; i++) {
				companyTotal += sales[i][j];
			}
		}
		System.out.print("\t" + companyTotal + "\n");
		
		// 위의 방법을 하나로 묶어서 출력 
	
		// 분기명 출력
		System.out.println();
		System.out.println("===============================================");
		System.out.println("\t\t\t부서별 분기 매출액");
		System.out.println("\t\t1분기\t2분기\t3분기\t4분기\t합계");
		
		// 부서별 분기별 매출액 출력
		for (int j = 0; j < 5; j++) {
			System.out.println("영업" + (j + 1) + "부서: ");
			for (int i = 0; i < 4; i++) {
				System.out.print("\t" + sales[j][i]);
			}
			int departmentTotal = 0;
			for (int i = 0; i < 4; i++) {
				departmentTotal += sales[j][i];
			}
			System.out.print("\t" + departmentTotal);
			System.out.println();
		}
		
		System.out.println("합계 :\t");
		for (int j = 0; j < 4; j++) {
			int quarterTotal = 0;
			for (int i = 0; i < 5; i++) {
				quarterTotal += sales[i][j];
			}
		}
		System.out.print("\t" + companyTotal);
		System.out.println();
		
		System.out.print("평균 :\t");
		for (int j = 0; j < 4; j++) {
			int quarterTotal = 0;
			for (int i = 0; i < 5; i++) {
				quarterTotal += sales[i][j];
			}
			System.out.print("\t" + quarterTotal / 5);
		}
	}

}
