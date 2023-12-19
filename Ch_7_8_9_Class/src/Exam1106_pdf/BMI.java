package Exam1106_pdf;

public class BMI {

	private String name;
	private int age;
	private double weight; // kg 단위
	private double height; // 미터단위
	
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}
	public double getBMI(){
		double bmi = weight / (height * height);
		return Math.round(bmi * 100) / 100.0;
	}
	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 16) {
			return "당신은 심각한 저체중";
		} else if (bmi < 18) {
			return "당신은 저체중";
		} else if (bmi < 24) {
			return "당신은 정상체중";
		} else if (bmi < 29) {
			return "당신은 과체중";
		} else if (bmi < 35) {
			return "당신은 심각한 과체중";
		} else {
			return "당신은 위험한 과체중";
	}	
}
	public String getName() {
		return name;
	} 
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
}

