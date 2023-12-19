package Completed_6ch_Classes_Objects;

public class Triangle {

	private double base; // 밑변
	private double height; // 높이
	
	public Triangle() {
		super();
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double triangleArea() {
		double area;
		area = (base * height) / 2;
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [getBase()=" + getBase() + ", getHeight()=" + getHeight() + ", triangleArea()="
				+ triangleArea() + "]";
	}
	
	
}
