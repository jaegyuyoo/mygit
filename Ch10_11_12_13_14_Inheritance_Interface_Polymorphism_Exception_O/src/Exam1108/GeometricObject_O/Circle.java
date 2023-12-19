package Exam1108.GeometricObject_O;

public class Circle extends GeometricObject {

	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() { // 원의 면적
		return radius * radius * Math.PI;
	}
	public double getDiameter() { // 지름변환
		return 2 * radius;
	}
	public double getPerimeter() { // 원의 둘레
		return 2 * radius * Math.PI;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", toString()=" + super.toString() + "]";
	}
	
}
