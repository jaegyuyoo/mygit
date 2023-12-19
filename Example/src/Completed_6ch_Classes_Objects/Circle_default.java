package Completed_6ch_Classes_Objects;

public class Circle_default {

	private double x; // 원의 중심 x좌표
	private double y;
	private double radius; // 원의 반지름

/*
	// 1-1 기본생성자 
	public Circle() {
		super();
	}
*/
	// 생성자 super 아래있으면 에러난다
	public Circle_default() {
		this(5, 2, 0);
		
	}
	
	public Circle_default(int raiust) {
		this.radius = radius;
		
	}
	
	// 1-2 
	public Circle_default(double x, double y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// 2
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

/*	
	public double circleArea(double x1, double y1, double radius1) { // 자바 제어자 - 리턴(번환)타입 - 메서드명

		double area;

		x = x1;
		y = y1;
		radius = radius1;
		
		area = radius * radius * 3.14;
		
		return area;
*/
	
	public double circleArea() { // 자바 제어자 - 리턴(번환)타입 - 메서드명
		double area;
		area = radius * radius * 3.14;
		return area;
		
	}
	// 3
	@Override
	public String toString() {
		return "Circle [getX()=" + getX() + ", getY()=" + getY() + ", getRadius()=" + getRadius() + ", circleArea()="
				+ circleArea() + "]";
	}

	

}
