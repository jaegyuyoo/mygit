package AppleBox_1113_pdf_C;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AppleBox a = new AppleBox();
		CatIn cat = new CatIn(a, "야옹이");
		PuppyOut puppy = new PuppyOut(a, "멍멍이");
		cat.start();
		puppy.start();
	}

}
