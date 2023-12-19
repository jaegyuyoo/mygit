package Completed_4ch_condition_print;

import java.util.Scanner;

public class RockPaperScissorsGame_print {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner nameInput = new Scanner(System.in);

		int comChoice; // 컴퓨터 랜덤 번호
		int userChoice; // 사용자 랜덤번호 
		int comWin = 0; // 컴퓨터 이김 횟수
		int userWin = 0; // 사용자 이김 횟수
		
		String userName; // 사용자이름 
		
		int tieCount = 0; // 비김횟수
		int userWinCount = 0; // 사용자 승리횟수
		int comWinCount = 0; // 사용자 승리횟수

		int gameCount = 0;
		String yes = "";
		
		System.out.println("가위바위보 게임");
		System.out.println("사용자 이름 입력: ");
		userName = nameInput.nextLine();
		
		do {
			System.out.println("게임 횟수 입력: ");
			gameCount = input.nextInt();
			
			for (int i = 1; i <= gameCount; i++) {
				System.out.println();
				System.out.println(i + "회 게임 시작\n");
				do {
					// 가위: 0, 바위: 1, 보: 2
					comChoice = (int) (Math.random() * 3);
					
					System.out.println("가위0, 바위1, 보2 중 숫자입력: ");
					userChoice = input.nextInt();
					
					switch (userChoice) {
						case 0:
							if (comChoice == 0) {
									System.out.println("둘 다 가위로 비김");
									tieCount++;
									System.out.println("비김 횟수 : " + tieCount);
							} else if (comChoice == 2){
									System.out.println(userName + "가 이김");
									userWinCount++;
								if (userWin == 2) {
										System.out.println(userName + " 가 두번 이김");
										userWinCount++;
										
										System.out.println();
										System.out.println(userName + " 대 컴퓨터");
										System.out.println(userWinCount + " 대" + comWinCount + "\n");
										break;
									}
							} else {
								System.out.println("컴이 이김");
								comWin++;
								if (comWin == 2) {
									System.out.println("컴퓨터가 두번 이김");
									comWinCount++;
									
									System.out.println();
									System.out.println(userName + " 대 컴퓨터");
									System.out.println(userWinCount + " 댜 " + comWinCount + "\n");
									break;
								}
							}
							break;
						case 1:
							if (comChoice == 1) {
							System.out.println("둘 다 바위로 비김");
							tieCount++;
							System.out.println("비김 횟수 : " + tieCount);
							} else if (comChoice == 0) {
								System.out.println(userName + " 가 이김");
								userWin++;
								if (userWin == 2) {
								System.out.println(userName + "가 두번 이김");
								userWinCount++;
								
								System.out.println();
								System.out.println(userName +" 대 컴퓨터");
								System.out.println(userWinCount+ " 대 " + comWinCount + "\n");
								break;
								}
							} else {
							 	System.out.println("컴이 이김");
								comWin++;
								if (comWin == 2) {
								System.out.println("컴퓨터가 두번 이김");
								comWinCount++;
								
								System.out.println();
								System.out.println(userName + " 대 컴퓨터");
								System.out.println(userWinCount + " 대 " + comWinCount + "\n");
								break;
								}
							}
							break;
						case 2:
							if (comChoice == 2) {
								System.out.println("둘 다 보로 비김");
								tieCount++;
								System.out.println("비김 횟수 : " + tieCount);
							} else if (comChoice == 1) {
								System.out.println(userName + " 가 이김");
								userWin++;
								if (userWin == 2) {
								System.out.println(userName + "가 두번 이김");
								userWinCount++;
								
								System.out.println();
								System.out.println(userName +" 대 컴퓨터");
								System.out.println(userWinCount + " 대 " + comWinCount + "\n");
								break;
								}
							} else {
							 	System.out.println("컴이 이김");
								comWin++;
								if (comWin == 2) {
								System.out.println("컴퓨터가 두번 이김");
								comWinCount++;
								
								System.out.println();
								System.out.println(userName + " 대 컴퓨터");
								System.out.println(userWinCount + " 대 " + comWinCount + "\n");
								break;
								}
							}
							break;
						default:
							System.out.println("가위:0, 바위:1, 보:2 중에 숫자를 바르게 입력하세요.");
							break;
							}
				} while (!(userWin == 2 || comWin == 2));
				userWin = 0;
				comWin = 0;
			}
		
			System.out.println("최종 게임 결과 \n");
			if(userWinCount > comWinCount) {
			System.out.println(userName + " 대 컴퓨터");
			System.out.println(userWinCount + " 대 " + comWinCount);
			System.out.println(userName + "의 우승");
		}else if(userWinCount<comWinCount)
		{
			System.out.println(userName + " 대 컴퓨터");
			System.out.println(userWinCount + " 대 " + comWinCount);
			System.out.println("컴퓨터의 우승");
		}else
		{
			System.out.println(userName + " 대 컴퓨터");
			System.out.println(userWinCount + " 대 " + comWinCount);
			System.out.println("무승부");
		}
	
		System.out.println("게임을 다시 시작하겠습니까?(y/Y))");
		yes=input.next();
		
		} while(yes.charAt(0)=='y'||yes.charAt(0)=='Y');
		System.out.println("\n 전체 게임종료");
	}
}