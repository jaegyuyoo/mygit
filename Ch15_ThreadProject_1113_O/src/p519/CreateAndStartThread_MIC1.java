package p519;

public class CreateAndStartThread_MIC1 {

	public static void main(String[] args) {

		// SMIFileThread 객체 생성 및 시작
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		// 비디오 프레임 번호 1~5
		int[] intArry = {1, 2, 3, 4, 5};
		
		// 비디오 프레임 번호 출력
		for (int i = 0; i < intArry.length; i++) {
			System.out.print("(비디오 프로그램" + intArry[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {} 
		}
	}

}
