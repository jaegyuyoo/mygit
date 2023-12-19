package p572;

public class DataBox {

	boolean isEmpty = true;
	int data;
	synchronized void inputData(int data) {
		if(!isEmpty) {
			try { wait(); } catch (InterruptedException e) {} // WATTING 
 		}
		this.data = data;
		isEmpty = false;
		System.out.println("입력 데이터: " + data);
		notify();
	}
	
	synchronized void outputData() {
		if(isEmpty) {
			try { wait(); } catch (InterruptedException e) {} // WATTING 
		}
		isEmpty = true;
		System.out.println("출력 데이터: " + data);
		notify();
	}
}

