package p537_demon;

import p535_demon.MyThread;

public class ThreadProperties_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 일반 스레드
		Thread thread1 = new MyThread();
		thread1.setDaemon(false); 
		thread1.setName("thread1");
		thread1.start();
		
		// 데몬 스레드
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		// 3.5초 후 main 쓰레드 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
	}

}
