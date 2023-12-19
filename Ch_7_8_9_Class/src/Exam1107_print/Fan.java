package Exam1107_print;

public class Fan {

	private int speed; // 현재속도
	private boolean on; // 동작
	private double radius; // 선풍기크기
	private String color; // 선풍기색상
	
	
	// 1-1 Generate Constructor using Fields
	public Fan() {
		super();
	}

	// 1-1 Generate Constructor using Fields
	public Fan(int speed, boolean on, double radius, String color) {
		super();
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}

	// 2. Generate Getters and Setters
	// 현재속도 반납
	public int getSpeed() {
		return speed;
	}

	// 현재속도 변경
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 동작 반납
	public boolean isOn() {
		return on;
	}

	// 동작 변경
	public void setOn(boolean On) {
		this.on = on;
	}

	// 선풍기 크기 반납
	public double getRadius() {
		return radius;
	}

	// 선풍기 크기 변경
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// 선풍기 색상 반납
	public String getColor() {
		return color;
	}

	// 선풍기 색상 변경
	public void setColor(String color) {
		this.color = color;
	}
	// 전원상태 반납

	public void fanworking() { // 동작결제 메서드
		if (isOn()) {
			System.out.println("꺼져 있다");
		} else {
			System.out.println("동작중이다");
		}
	}
}
