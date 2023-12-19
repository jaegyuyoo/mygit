package p531_priority;

public class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 1000000000; i++) {}
		System.out.println(getName() + " 우선순위 " + getPriority());	
		}
	}
	

