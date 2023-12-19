package p728_O;

public class FunctionToLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스 함수 구현 -> 람다식
		// 1. 입력x, 리턴x
		// 1-1. 익명 이너 클래스 방식
		A a1 = new A() {
			public void method1() {
				System.out.println("입력x 리턴x 함수");
			}
		};
		
		// 1-2. 람다식 표현 
		A a2 = () -> {System.out.println("입력x 리턴x 함수");};
		A a3 = () -> System.out.println("입력x 리턴x 함수"); // 1줄이면 중괄호 생략가능 
		
		// 2. 입력 o, 리턴 x
		// 2-1. 익명 이너 클래스 방식
		
		B b1 = new B() {
			
			public void method2(int a) {
				System.out.println("입력 o, 리턴 x 함수");
			}
		};
		
		
		// 2-2. 람다식 표현 
		B b2 = (int a) -> {System.out.println("입력 o, 리턴 x 함수");};
		B b3 = (a) -> {System.out.println("입력 o, 리턴 x 함수");}; // 입력매게 변수 생략가능 
		B b4 = (a) -> System.out.println("입력 o, 리턴 x 함수"); // 1줄 명령이면 중괄호 생략 가능 
		B b5 = a -> System.out.println("입력 o, 리턴 x 함수"); // 입력 매게변수가 1개일때 소괄호도 생략가능
		
		// 3. 입력 x, 리턴 o
		// 3-1. 익명 이너 클래스 방식
		
		C c1 = new C() {
			
			public int method3() {
				return 4;
			}
		};
		
		// 3-2. 람다식 표현 
		
		C c2 = () -> {return 4;}; // 실행문에 return만 있는 경우 생략 가능 
		C c3 = () -> 4; // return이 생략되면 중괄호도 함께 생락 
		
		// 4. 입력 o, 리턴 o
		// 4-1. 익명 이너 클래스 방식
		D d1 = new D() {
			
			public double method4(int a, double b) {
				return a + b;
			}
		};
		
		// 4-2 람다식 표현
		D d2 = (int a, double b) -> {return a + b;};
		D d3 = (a, b) -> {return a+ b;};
		D d4 = (a, b) -> a + b;
		
		
		
	}

}
