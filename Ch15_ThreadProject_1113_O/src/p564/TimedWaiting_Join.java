package p564;

public class TimedWaiting_Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성 
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		
		// TIMED_WATTING
		myThread2.interrupt();
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		
		
	}

}
