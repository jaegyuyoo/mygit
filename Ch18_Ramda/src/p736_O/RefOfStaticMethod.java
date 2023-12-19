package p736_O;

public class RefOfStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A() {
			
			public void abc() {
				B.bcd();
			}
		};
		
		// 2. 람다식으로 표현
		A a2 = () -> {B.bcd();};
		
		// 3. 정적 메서드 참조
		A a3 = B::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
		
	}

}
