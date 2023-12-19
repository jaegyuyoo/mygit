package p740_O;

public class RefOfInstanceMethod_Type2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A() {
			public int abc(String str) {
				return str.length();
			}
		};
		
		// 2. 람다식
		A a2 = (String str) -> str.length();
		
		// 3. 자바가 제공하는 인스턴스 메서드 참조
		A a3 = String::length;
		System.out.println(a1.abc("안녕"));
		System.out.println(a2.abc("안녕"));
		System.out.println(a3.abc("안녕"));
	}

}
