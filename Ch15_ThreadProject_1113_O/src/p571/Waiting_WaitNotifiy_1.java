package p571;

public class Waiting_WaitNotifiy_1 {

	public static void main(String[] args) {
		DataBox databox = new DataBox();
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i < 9; i++) {
					databox.inputData(i);
				}
			};
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i < 9; i++) {
					databox.outputData();
				}
			};
		};
		
		t1.start();
		t2.start();
	}
}