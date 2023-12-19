package p744_O;

public class RefOfClassConstructor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 익명 이너 클래스
		A a1 = new A() {
			
			public B abc() {
				return new B();
			}
		};
		
		// 2. 란다식
		A a2 = () -> new B();
		// 3. 클래스 생성자  참조
		A a3 = B::new;
		a1.abc();
		a2.abc();
		a3.abc();
		
	}

}
