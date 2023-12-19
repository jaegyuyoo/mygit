package Exam1110.PhoneBookProject_1110_I;

public class PhoneInfo {

	private String name; // 이름 
	private String phoneNumber; // 전화번호 

	public PhoneInfo() {
		super();
	}

	public PhoneInfo(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// (이해하기) 이름(name), 전화번호(phoneNumber)
	public void showPhoneInfo(){
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
	}
	
	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", phoneNumber=" + phoneNumber + ", toString()=" + super.toString() + "]";
	}

	// (이해하기)
	public String getName() {
		return name;
	}
}
