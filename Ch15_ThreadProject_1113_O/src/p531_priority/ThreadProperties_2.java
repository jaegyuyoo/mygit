package p531_priority;

public class ThreadProperties_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CPU 코어 수
		System.out.println("코어 수: " + Runtime.getRuntime().availableProcessors());
		
		// 우선순위 자동 지정
		for (int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// 우선순위 직접 결정
		for (int i = 0; i < 10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + " 번째 스레드");
			if(i==9) thread.setPriority(10);
			thread.start();
		}
	}

}
