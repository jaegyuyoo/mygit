package p558;

public class MyThread extends Thread {

	boolean yieldFlag;
	
	public void run() {
		while(true) {
			if(yieldFlag) {
				Thread.yield();
			} else {
				System.out.println(getName() + " 실행");
				for (long i = 0; i < 10000000000L; i++) {}
			}
		}
	}
}
