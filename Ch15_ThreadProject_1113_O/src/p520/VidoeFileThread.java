package p520;

public class VidoeFileThread extends Thread {

	public void run () {
		int [] intArray = {1, 2, 3, 4, 5};
		
		// 비디오 프래임 번호 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
	
}
