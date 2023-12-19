package p562;

public class MyThread extends Thread {

		public void run() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(" -- sleep() 진행중 interrupt() 발생");
				for (int i = 0; i < 1000000000L; i++) {
					
				}
			}
		}
}
