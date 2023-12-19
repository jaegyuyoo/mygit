package Completed_6ch_Classes_Objects;

public class Square {

	private double width; // 가로
	private double lenght; // 세로
	
	public Square() {
		super();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	
	public double squareArea() {
		double area;
		area = width * lenght;
		return area;
	}

	@Override
	public String toString() {
		return "Square [getWidth()=" + getWidth() + ", getLenght()=" + getLenght() + ", squareArea()=" + squareArea()
				+ "]";
	}
	
	
	
}
