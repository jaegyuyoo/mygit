package p548;

public class KeyObject_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 공유객체
		MyData myData = new MyData();
		// 3개의 쓰레드 각각의 메서드 호출
		
		new Thread() {
			public void run() {
				myData.abc();
			}
		}.start();
		new Thread() {
			public void run() {
				myData.bcd();
			}
		}.start();
		new Thread() {
			public void run() {
				myData.cde();
			}
		}.start();
		
	}

}
