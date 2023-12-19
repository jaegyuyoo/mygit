import java.util.Scanner;

public class CoffeeKioskMenu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		// 변수선언 먼저, 변수끼리 묶어
		// 커피 변수선언
		String americanoRegularHot; // 아메리카노 레귤러 핫 변수
		String americanoLargeHot; // 아메리카노 라지 핫 변수
		String americanoRegularIce; // 아메리카노 레귤러 아이스 변수
		String americanoLargeIce; // 이메리카노 라지 아이스 변수
		String latteRegularHot; // 라떼 레귤러 핫 변수
		String latteLargeHot; // 라떼 라지 핫 변수
		String latteRegularIce; // 라떼 레귤러 아이스 변수
		String latteLargeIce; // 라떼 라지 아이스 변수

		// 커피 가격 변수선언
		int americanoRegularHotValue; // 아메리카노 레귤러 핫 가격 변수
		int americanoLargeHotValue; // 아메리카노 라지 핫 가격 변수
		int americanoRegularIceValue; // 아메리카노 레귤러 아이스 가격 변수
		int americanoLargeIceValue; // 이메리카노 라지 아이스 가격 변수
		int latteRegularHotValue; // 라떼 레귤러 핫 가격 변수
		int latteLargeHotValue; // 라떼 라지 핫 가격 변수
		int latteRegularIceValue; // 라떼 레귤러 아이스 가격 변수
		int latteLargeIceValue; // 라떼 라지 아이스 가격 변수
		
		// string 변수 value
		americanoRegularHot = "아메리카노(R) HOT";
		americanoLargeHot = "아메리카노(L) HOT";
		americanoRegularIce = "아메리카노(R) ICE";
		americanoLargeIce = "아메리카노(L) ICE";
		latteRegularHot = "라떼(R) HOT";
		latteLargeHot = "라떼(L) HOT";
		latteRegularIce = "라떼(R) ICE";
		latteLargeIce = "라떼(L) ICE";

		// int 변수 value
		americanoRegularHotValue = 3500;
		americanoLargeHotValue = 4000;
		americanoRegularIceValue = 3500;
		americanoLargeIceValue = 4000;
		latteRegularHotValue = 4000;
		latteLargeHotValue = 4500;
		latteRegularIceValue = 4000;
		latteLargeIceValue = 4500;
		
		int menuNumber; // 메뉴입력 변수
		char payCheck = 'N'; // 결제확인 // boolean false 도가능
		int selectMenuValue = 0; // 선택한메뉴가격
		String selectMenuName = ""; // 선택한메뉴이름
		int[] totalPeople;

		String receipt; // *입력받을때는 String
		String order_again; // 재주문 변수

		int customerCount; // 고객수
		boolean order = true;
		String selectProductName=""; // 선택한 상품명
		int selectProductPrice = 0; // 선택한 상품 가격
		String[] orderProductName; // (배열) 고객들이 주문한 상품명
		int[] orderProdctuPrice; // (배열) 고객들이 주문한 상품가격
		int orderSumPrice = 0; // 주문 합계금액
		
		System.out.println("인원수를 입력해주세요. : ");
		customerCount = input.nextInt();
		
		orderProductName = new String[customerCount]; // 고객수에 대한 상품명 배열
		orderProdctuPrice = new int[customerCount]; // 고객수에 대한 상품가격 배열 
		
		
		// 재주문하시겠습니까 N하면 올라감
		do {

			System.out.println("★커피 자판기★"); // 프로그램 시작
			System.out.println();

			// 대기화면 음료 list
			System.out.print("1. " + americanoRegularHot + " " + americanoRegularHotValue + " 원 \t");
			System.out.println("2. " + americanoLargeHot + " " + americanoLargeHotValue + " 원");
			System.out.print("3. " + americanoRegularIce + " " + americanoRegularIceValue + " 원 \t");
			System.out.println("4. " + americanoLargeIce + " " + americanoLargeIceValue + " 원");
			System.out.print("5. " + latteRegularHot + " " + latteRegularHotValue + " 원 \t\t");
			System.out.println("6. " + latteLargeHot + " " + latteLargeHotValue + " 원");
			System.out.print("7. " + latteRegularIce + " " + latteRegularIceValue + "원 \t\t");
			System.out.println("8. " + latteLargeIce + " " + latteLargeIceValue + " 원");
			System.out.println();

			// 번호입력 버튼
			System.out.print("메뉴 번호를 입력해주세요 : ");
			menuNumber = input.nextInt(); // 메뉴번호 입력
			
		

			// 입력한 메뉴번호를 통한
			switch (menuNumber) {
			case 1:
				selectMenuName = americanoRegularHot;
				selectMenuValue = americanoRegularHotValue;
				payCheck = 'Y';
				break;
			case 2:
				selectMenuName = americanoLargeHot;
				selectMenuValue = americanoLargeHotValue;
				payCheck = 'Y';
				break;
			case 3:
				selectMenuName = americanoRegularIce;
				selectMenuValue = americanoRegularIceValue;
				payCheck = 'Y';
				break;
			case 4:
				selectMenuName = americanoLargeIce;
				selectMenuValue = americanoLargeIceValue;
				payCheck = 'Y';
				break;
			case 5:
				selectMenuName = latteRegularHot;
				selectMenuValue = latteRegularHotValue;
				payCheck = 'Y';
				break;
			case 6:
				selectMenuName = latteLargeHot;
				selectMenuValue = latteLargeHotValue;
				payCheck = 'Y';
				break;
			case 7:
				selectMenuName = latteRegularIce;
				selectMenuValue = latteRegularIceValue;
				payCheck = 'Y';
				break;
			case 8:
				selectMenuName = latteLargeIce;
				selectMenuValue = latteLargeIceValue;
				payCheck = 'Y';
				break;
			default:
				System.out.println("메뉴 선택이 잘못되었습니다. 재선택 해주세요.");
				
			}
			if (payCheck == 'Y') { // paycheck 확인하여 출력할수있는 조건식
				System.out.println("영수증");
				System.out.println("선택한 메뉴: " + selectMenuName + "\n가격: " + selectMenuValue + " 원");
				
			
			}

			System.out.println();
			System.out.println("주문을 계속 하시겠습니까? Y/N");
			order_again = input.next();

		} while (order_again.charAt(0) == 'Y' || order_again.charAt(0) == 'y'); // 문자열은 보통 string으로 받으니 charAt으로 변환해준다
		System.out.println("종료");
		}
}

/*
 * 삼항연산자를 통해 메뉴1번에 대한 정보를 출력 System.out.print("선택 하신메뉴 : " + ((menuNumber == 1)
 * ? americanoRegularHot + " " + americanoRegularHotValue : "1 번이 아닙니다."));
 */