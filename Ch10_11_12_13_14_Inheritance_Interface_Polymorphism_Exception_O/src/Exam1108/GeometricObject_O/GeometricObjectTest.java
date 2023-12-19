package Exam1108.GeometricObject_O;

public class GeometricObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// GeometricObject yoo = new GeometricObject("노란", true);
		
		// System.out.println(yoo);
		
		// Circle yoo = new Circle("노란", true, 3.14);
		// System.out.println(yoo);
	
		Circle yoo = new Circle(1);
		GeometricObject yoo1 = new Circle(2);
		
		
		System.out.println("면적" + yoo.getArea()); // get으로 출력 
		
	}

}
