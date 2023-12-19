package Exam1107_print;

public class Box {
	
	private double height; // 높이
	private double width; // 너비, 폭 
	
	private int empty; // 비어있다. 

	// 1-1 Generate Constructor using Fields
	public Box() {
		super();
	}

	// 1-1 Generate Constructor using Fields
	public Box(double height, double width, int empty) {
		super();
		this.height = height;
		this.width = width;
		this.empty = empty;
	}

	// 2. Generate Getters and Setters
	// 높이 반환
	public double getHeight() {
		return height;
	}
	// 높이 변경
	public void setHeight(double height) {
		this.height = height;
	}
	// 너비 반환
	public double getWidth() {
		return width;
	}
	// 너비 변경
	public void setWidth(double width) {
		this.width = width;
	}
	// 빈공간 반환
	public int getEmpty() {
		return empty;
	}
	// 빈공간 변경 
	public void setEmpty(int empty) {
		this.empty = empty;
	}

	public String emptyCheck() {
		String emptysatus;
		if (getEmpty() == 1) { // getter를 불러와 조건
			emptysatus = "모든 데이터를 받지 않았습니다. 공란입니다.";
		} else {
			emptysatus = "데이터 입력을 완료했습니다.";
		}
		return emptysatus; 
	}
	
	// 3. Generate toString
	@Override
	public String toString() {
		return "Box [getHeight()=" + getHeight() + ", getWidth()=" + getWidth() + ", getEmpty()=" + getEmpty() + "]";
	}

}
