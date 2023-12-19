package p733_O;

import p723_O.B;

public class RefOfIntanceMethod_Type1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 익명 이너 클래서
		A a1 = new A() {
			public void abc(int k) {
				System.out.println(k);
			}
		};
		
		// 2. 람다식으로 표현 
		A a2 = (int k) -> {
			System.out.println(k);
		};
		
		// 3. 정의된 인스턴스 메서드 참조
		A a3 = System.out::println;
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
	}

}
