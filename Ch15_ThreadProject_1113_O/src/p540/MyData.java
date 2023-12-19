package p540;

public class MyData {

	int data = 3;
	
	public void plusData() {
		int mydata = data; // 데이터 가져오기
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		data = mydata + 1;
	}
}
