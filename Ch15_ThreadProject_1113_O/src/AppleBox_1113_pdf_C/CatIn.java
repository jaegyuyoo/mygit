package AppleBox_1113_pdf_C;

public class CatIn extends Thread {

	private AppleBox applebox;
	private String name;
	
	public CatIn(AppleBox a, String name) {
		applebox = a;
		this.name = name;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) { // 시도횟수 강아지와 통일
 			applebox.save(1); // Lists.newArrayList()를 이용하면 호출 한번으로 save로 가능하다.

			System.out.println("++++" + this.name + ", 담을 수량 : 1");
		}
	}
}

