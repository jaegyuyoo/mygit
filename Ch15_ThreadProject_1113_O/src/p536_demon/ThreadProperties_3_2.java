package p536_demon;

public class ThreadProperties_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		// 3.5초 후 main 쓰레드 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
		
	}

}
