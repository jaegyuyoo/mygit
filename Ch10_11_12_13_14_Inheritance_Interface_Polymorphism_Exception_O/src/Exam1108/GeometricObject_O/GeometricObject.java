package Exam1108.GeometricObject_O;

public class GeometricObject {
	
	String color;
	boolean filled;

	public GeometricObject() {
		super();
	}

	public GeometricObject(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + ", toString()=" + super.toString() + "]";
	}
	
	

}
