package Exam1107_print;

import java.util.Scanner;

public class CellPhoneTest_for {

	private static final String Final = null;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final int CUSTERMER; // 전체 인원
		CUSTERMER = 3;
		
		String model; // 모델
		String company; // 제조회사
		String color; // 색상
		String power; // 전원
		String camera; // 카메라

		int working; // 전원 작동 
		String total = null;
		
		for (int i = 0; i < CUSTERMER; i++) {
			
		CellPhone cellphonei = new CellPhone();
		
		System.out.println("모델명 입력 : ");
		model = input.next();
		cellphonei.setModel(model); // 객체 모델 불러오기	- *Setter : 외부로부터 데이터를 전달받아 멤버변수에 저장. 매개변수만 있고, 리턴값은 없는 메서드로 정의.
		System.out.println("제조회사 입력 : ");
		company = input.next();
		cellphonei.setCompany(company);; // 객체 제조회사 불러오기	
		System.out.println("색상 입력 : ");
		color = input.next();
		cellphonei.setColor(color);; // 객체 색상 불러오기		
		System.out.println("전원 장착여부 : ");
		power = input.next();
		cellphonei.setPower(power);; // 객체 전원장착 불러오기	
		System.out.println("카메라 장착여부 : ");
		camera = input.next();
		cellphonei.setCamera(camera);; // 객체 카메라 장착 불러오기	
		System.out.println("카메라 동작여부(1(ture) or 0(false)) : ");
		working = input.nextInt();
		cellphonei.setWorking(working);; // 객체 카메라 장착 불러오기

		/*
		// Q. 출력도 한꺼번에 출력하고싶다.

		String totalModel = null;
		String totalCompany = null;
		String totalCamera = null;
		String totalPower = null;
		String totalWorking = null;
				
		totalModel += cellphonei.getModel();
		System.out.println("모델명: " + totalModel);		
		totalCompany += cellphonei.getCompany();
		System.out.println("제조회사: " + totalCompany);		
		totalPower += cellphonei.getPower();
		System.out.println("전원 장착여부: "  + totalPower);		
		totalCamera += cellphonei.getCamera();
		System.out.println("카메라 장착여부: " + totalCamera);
		totalWorking += cellphonei.getWorking();
		System.out.println("파워 작동여부: " + totalWorking);
		*/
		
		System.out.println("모델명: " + cellphonei.getModel());
		System.out.println("제조회사: " + cellphonei.getCompany());	
		System.out.println("색상: " + cellphonei.getColor());
		System.out.println("전원 장착여부: "  + cellphonei.getPower());
		System.out.println("카메라 장착여부: "  + cellphonei.getCamera());	
		System.out.println("파워 작동여부: " + cellphonei.powerWorking());	
	
		}
	}
}
