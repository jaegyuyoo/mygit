package Exam1107_print;

import java.util.Scanner;

public class StockTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String name; // 종목명(회사명)
		double proviousClosingPrice; // 어제의 종가
		double currentPrice; // 현재가
		
		double getChangePercent; // 변동율 
	
		Stock stock = new Stock(); 
		
		
		System.out.println("종목명 입력 : " );
		name = input.next();
		stock.setName(name);
		
		System.out.println("어제의 종가(원): ");
		proviousClosingPrice = input.nextDouble();
		stock.setProviousClosingPrice(proviousClosingPrice);

		System.out.println("현재가(원): ");
		currentPrice = input.nextDouble();
		stock.setCurrentPrice(currentPrice);
		
		getChangePercent = ((currentPrice - proviousClosingPrice) / currentPrice) * 100;
		System.out.println("변동율: " +  getChangePercent + " % ");
	}

}
