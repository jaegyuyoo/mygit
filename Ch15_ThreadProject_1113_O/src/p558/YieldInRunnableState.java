package p558;

public class YieldInRunnableState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;
		thread1.setDaemon(true);
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread1");
		thread2.yieldFlag = true;
		thread2.setDaemon(true);
		thread2.start();
		
		// 6초마다 지연 (1초마다 한번씩 양복)
		for (int i = 0; i < 6; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			thread1.yieldFlag = !thread1.yieldFlag;
			thread2.yieldFlag = !thread2.yieldFlag;	
		}
		
	}

}
