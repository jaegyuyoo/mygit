package p738_O;

public class RefOfInstanceMethod_Type2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A() {
			
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// 람다식
		A a2 = (B b, int k) -> {b.bcd(k);};
		
		// 직접 정의한 인스턴스 메서드 참조
		A a3 = B::bcd;
		a1.abc(new B(), 3);
		a2.abc(new B(), 3);
		a3.abc(new B(), 3);
		
	}

}
