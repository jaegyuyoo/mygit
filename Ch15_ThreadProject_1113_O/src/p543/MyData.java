package p543;

public class MyData {

	int data = 3;
	
	public synchronized void plusData() {
		int mydata = data; // 데이터 가져오기
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		data = mydata + 1;
	}
}
