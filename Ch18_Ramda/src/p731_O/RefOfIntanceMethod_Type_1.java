package p731_O;

public class RefOfIntanceMethod_Type_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A() {
			
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		// 2. 람다식으로 표현
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		// 3. 정의된 인스턴스 메서드 참조
		B b = new B();
		A a3 = b::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
	}

}
