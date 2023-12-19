package p557;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		// 스레드 상태 저장 클래스
		Thread.State state;
		
		// 1. 객채 생성(NEW)
		Thread myThread = new Thread() {
			public void run() {
				for (long i = 0; i < 100000000L; i++) {} // 시간지연  
			}
		};
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		// 2. myThread 
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		// 3. myThread 종료
		try {
			myThread.join();
		} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state = " + state);
	
}
}
