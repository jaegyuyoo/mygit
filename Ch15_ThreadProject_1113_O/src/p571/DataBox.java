package p571;

public class DataBox {

	int data;
	synchronized void inputData(int data) {
		this.data = data;
		System.out.println("입력 데이터: " + data);
	}
	synchronized void outputData() {
		System.out.println("출력 데이터: " + data);
	}
}
