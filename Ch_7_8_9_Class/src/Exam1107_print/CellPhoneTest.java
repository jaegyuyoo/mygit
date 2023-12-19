package Exam1107_print;

import java.util.Scanner;

public class CellPhoneTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String model; // 모델
		String company; // 제조회사
		String color; // 색상
		String power; // 전원
		String camera; // 카메라

		int working; // 전원 작동 
		
		CellPhone cellphone1 = new CellPhone();
		CellPhone cellphone2 = new CellPhone();
		CellPhone cellphone3 = new CellPhone();

		System.out.println("모델명 입력 : ");
		model = input.next();
		cellphone1.setModel(model); // 객체 모델 불러오기	
		System.out.println("제조회사 입력 : ");
		company = input.next();
		cellphone1.setCompany(company);; // 객체 제조회사 불러오기	
		System.out.println("색상 입력 : ");
		color = input.next();
		cellphone1.setColor(color);; // 객체 색상 불러오기		
		System.out.println("전원 장착여부 : ");
		power = input.next();
		cellphone1.setPower(power);; // 객체 전원장착 불러오기	
		System.out.println("카메라 장착여부 : ");
		camera = input.next();
		cellphone1.setCamera(camera);; // 객체 카메라 장착 불러오기	
		System.out.println("카메라 동작여부(1(ture) or 0(false)) : ");
		working = input.nextInt();
		cellphone1.setWorking(working);; // 객체 카메라 장착 불러오기
				
		System.out.println("모델명 입력 : ");
		model = input.next();
		cellphone2.setModel(model); // 객체 모델 불러오기	
		System.out.println("제조회사 입력 : ");
		company = input.next();
		cellphone2.setCompany(company);; // 객체 제조회사 불러오기	
		System.out.println("색상 입력 : ");
		color = input.next();
		cellphone2.setColor(color);; // 객체 색상 불러오기		
		System.out.println("전원 장착여부 : ");
		power = input.next();
		cellphone2.setPower(power);; // 객체 전원장착 불러오기	
		System.out.println("카메라 장착여부 : ");
		camera = input.next();
		cellphone2.setCamera(camera);; // 객체 카메라 장착 불러오기	
		System.out.println("카메라 동작여부(1(ture) or 0(false)) : ");
		working = input.nextInt();
		cellphone2.setWorking(working);; // 객체 카메라 장착 불러오기

		System.out.println("모델명 입력 : ");
		model = input.next();
		cellphone3.setModel(model); // 객체 모델 불러오기	
		System.out.println("제조회사 입력 : ");
		company = input.next();
		cellphone3.setCompany(company);; // 객체 제조회사 불러오기	
		System.out.println("색상 입력 : ");
		color = input.next();
		cellphone3.setColor(color);; // 객체 색상 불러오기		
		System.out.println("전원 장착여부 : ");
		power = input.next();
		cellphone3.setPower(power);; // 객체 전원장착 불러오기	
		System.out.println("카메라 장착여부 : ");
		camera = input.next();
		cellphone3.setCamera(camera);; // 객체 카메라 장착 불러오기	
		System.out.println("카메라 동작여부(1(ture) or 0(false)) : ");
		working = input.nextInt();
		cellphone3.setWorking(working);; // 객체 카메라 장착 불러오기

	
		System.out.println("모델명: " + cellphone1.getModel());
		System.out.println("제조회사: " + cellphone1.getCompany());	
		System.out.println("색상: " + cellphone1.getColor());
		System.out.println("전원 장착여부: "  + cellphone1.getPower());
		System.out.println("카메라 장착여부: "  + cellphone1.getCamera());	
		System.out.println("파워 작동여부: " + cellphone1.powerWorking());	
		System.out.println(cellphone1);
		
		System.out.println(cellphone2);
		System.out.println(cellphone3);

	}

}
