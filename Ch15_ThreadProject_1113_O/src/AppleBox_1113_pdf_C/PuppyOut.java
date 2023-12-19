package AppleBox_1113_pdf_C;

public class PuppyOut extends Thread {

	private AppleBox applebox;
	private String name;
	
	public PuppyOut(AppleBox a, String name) {
		applebox = a;
		this.name = name;
	}
	
	public void run() {
		int value = 0;
		for (int i = 0; i < 5; i++) { // 시도횟수 고양이와와 통일
			value = applebox.get((int) (Math.random() * 5 + 1));
			System.out.println("-----" + this.name + ", 가지려는 수량:" + value);
		}
	}
}
