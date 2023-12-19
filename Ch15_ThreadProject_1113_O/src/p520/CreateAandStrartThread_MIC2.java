package p520;

public class CreateAandStrartThread_MIC2 {

	public static void main(String[] args) {

		// SMIFileThread 객체 생성 및 시작 
		Thread smiThread = new SMIFileThread();
		smiThread.start();
		
		// VideoFileThread 객체 생성 및 시작
		VidoeFileThread videoFileThread = new VidoeFileThread();
		videoFileThread.start();
	}

}
