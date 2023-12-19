package p562;

public class TimeWaiting_Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread myThread = new MyThread();
		myThread.start();
		
		
		try {Thread.sleep(100);
		} catch (InterruptedException e) {}
		System.out.println("MyThread State = " + myThread.getState());
		// Timed_Wating 
		myThread.interrupt();
		try {Thread.sleep(100);
		} catch (InterruptedException e) {}
		System.out.println("MyThread State = " + myThread.getState());
	}

}
