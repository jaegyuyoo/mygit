package p723_O;

public class OOPvsFP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 객체 지향 프로그래밍 문법 1
		A a1 = new B();
		a1.abc(); // 메서드 내용
		
		// 2. 객체 지향 
		A a2 = new A() {
			
			public void abc() {
				System.out.println("메서드 내용 2");
			}
		};
	a2.abc(); // 메서드 내용
	
	// 3. 함수형 프로그래밍 문법 (람다식)
	A a3 = () -> {System.out.println("메서드 내용 3");};
	a3.abc();
	}

}
