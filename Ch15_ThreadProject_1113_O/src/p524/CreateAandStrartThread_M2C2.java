package p524;

import p522.SMIFileRunnable;

public class CreateAandStrartThread_M2C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SMIRunnable 객체 생성
		Runnable smiRunnable = new SMIFileRunnable();
		// smiFileRunnable.start();
		Thread thread1 = new Thread(smiRunnable);
		thread1.start();
	
		// VideoFileRunabl 객체 생성 
		Runnable videoFileRunnable = new VidoeFileThread();
		// smiFileRunnable.start();
		Thread thread2 = new Thread(videoFileRunnable);
		thread2.start();
	
	}

}
