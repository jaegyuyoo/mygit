package p746_O;

public class RefOfClassConstrutor_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A() {
			
			public B abc(int k) {
				return new B(3);
			}
		};
		
		// 2. 람다식
		A a2 = (int k) -> new B(3);
		
		// 3. 클래스 생성자 참조
		A a3 = B::new;
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		
	}

}
