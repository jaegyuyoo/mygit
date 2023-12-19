package p540;

public class TheNeedsForSynchonized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 공유 객체 생성
		MyData myData = new MyData();

		// plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		} // 1초 기다림

		// plusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();

	}

}
