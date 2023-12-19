package p548;

public class MyData {
	synchronized void abc() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}

	synchronized  void bcd() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	void cde() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "번째");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

