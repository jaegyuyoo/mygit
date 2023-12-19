package Exam1107_print;

public class CellPhone {

	private String model; // 모델 
	private String company; // 제조회사
	private String color; // 색상
	private String power; // 전원
	private String camera; // 카메라
	
	private int working; // 전원 작동 
	
	// 1-1 Generate Constructor using Fields
	public CellPhone() {
		super();
	}

	// 1-1 Generate Constructor using Fields
	public CellPhone(String model, String company, String color, String power, String camera) {
		super();
		this.model = model;
		this.company = company;
		this.color = color;
		this.power = power;
		this.camera = camera;
	}

	// 2. Generate Getters and Setters
	// 모델 반환
	public String getModel() {
		return model;
	}
	// 모델 변경
	public void setModel(String model) {
		this.model = model;
	}
	// 제조회사 반환 
	public String getCompany() {
		return company;
	}
	// 제조회사 변경
	public void setCompany(String company) {
		this.company = company;
	}
	// 색상 반환
	public String getColor() {
		return color;
	}
	// 색상 변경
	public void setColor(String color) {
		this.color = color;
	}
	// 전원 반환
	public String getPower() {
		return power;
	}
	// 전원 변경
	public void setPower(String power) {
		this.power = power;
	}
	// 카메라 반환
	public String getCamera() {
		return camera;
	}
	// 카메라 변경 
	public void setCamera(String camera) {
		this.camera = camera;
	}
	// 전원 작동 반환
	public int getWorking() {
		return working;
	}
	// 전원 작동 변경
	public void setWorking(int working) {
		this.working = working;
	}

	public String powerWorking() {
		String power;
		if (getWorking() == 1) { // getter를 불러와 조건
			power = "작동";
		} else {
			power = "오작동";
		}
		return power ; 
		
	}

	@Override
	public String toString() {
		return "CellPhone [model=" + model + ", company=" + company + ", color=" + color + ", power=" + power
				+ ", camera=" + camera + ", working=" + working + "]";
	}
	
	
	
	
}
