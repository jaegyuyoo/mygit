package p524;

public class SMIFileRunnable implements Runnable {

	@Override
	public void run() {
		// 자막 번호 하나~다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		// 자막 번호 출력
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막 번호) " + strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {} 
		}
		
	}

}
