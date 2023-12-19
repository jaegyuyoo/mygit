package p522;

public class CreateAandStrartThread_M2C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SMIRunnable 객체 생성
		Runnable smiRunnable = new SMIFileRunnable();
		// smiFileRunnable.start();
		Thread thread = new Thread(smiRunnable);
		thread.start();
		
		// 비디오 프레임 번호1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		// 비디오 프레임 번호출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임" + intArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}

}
