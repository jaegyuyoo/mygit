package Exam1110.InterfaceProject_O;

public class SmartTV extends TV implements Internet {

	@Override
	public void commication() { // 통신사 재정의 
		
		System.out.println("통신사: SKT");
		System.out.println("인터넷 속도: " + Internet.SPEED + "Mbps"); // 인터넷 인터페이스에서 스피드 필드 가져옴 
	}

}
