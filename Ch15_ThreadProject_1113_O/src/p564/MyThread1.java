package p564;

public class MyThread1 extends Thread {

	public void run() {
		for (long i = 0; i < 1000000000L; i++) {} // 시간지연 
	}
}
