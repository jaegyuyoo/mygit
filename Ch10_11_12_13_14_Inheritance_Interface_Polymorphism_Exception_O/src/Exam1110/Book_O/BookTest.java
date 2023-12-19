package Exam1110.Book_O;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String number; // 관리번호
		String title; // 제목
		String author; // 저자 
		
		int day1; // 소설 연체날짜
		int day2; // 시 연체날짜
		int day3; // 과학서적 연체날짜
	
		Book book = new Book(); 
		Book book1 = new Book(); 
		Book book2 = new Book();
		
		System.out.println("소설 관리번호 입력: ");
		number = input.next();
		book.setNumber(number); // 꼭해주자!
 		
		System.out.println("제목 입력: ");
		title = input.next();
		System.out.println("저자 입력: ");
		author = input.next();
		
		System.out.println("소설의 연체일: ");
		day1 = input.nextInt();
		
		book = new Book(number, title, author);
		book.calculation();
		book = new Novel(day1);
		book.calculation();

		System.out.println("시 관리번호 입력: ");
		number = input.next();
		System.out.println("제목 입력: ");
		title = input.next();
		System.out.println("저자 입력: ");
		author = input.next();
		System.out.println("시의 연체일: ");
		day2 = input.nextInt();

		book1 = new Book(number, title, author);
		book1.calculation();
		book1 = new Poet(day2);
		book1.calculation();

		System.out.println("과학서적 관리번호 입력: ");
		number = input.next();
		System.out.println("제목 입력: ");
		title = input.next();
		System.out.println("저자 입력: ");
		author = input.next();
		System.out.println("과학서적의 연체일: ");
		day3 = input.nextInt();

		book2 = new Book(number, title, author);
		book2.calculation();
		book2 = new ScienceFiction(day2);
		book2.calculation();

	}
	}