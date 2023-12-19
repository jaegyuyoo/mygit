package Exam1110.PhoneBookProject_1110_I;

public class PhoneCompanyInfo extends PhoneInfo {

	private String compnay; // 화사명

	public PhoneCompanyInfo() {
		super();
	}

	public PhoneCompanyInfo(String compnay) {
		super();
		this.compnay = compnay;
	}

	public PhoneCompanyInfo(String name, String phoneNumber, String compnay) {
		super(name, phoneNumber); // info에 표기 super
		this.compnay = compnay;
		// TODO Auto-generated constructor stub
	}

	// (이해하기) 회사명(compnay)
	public void showPhoneInfo(){
		super.showPhoneInfo(); // 왜씀이것만? 
		System.out.println("company: " + compnay);
	}
	
	@Override
	public String toString() {
		return "PhoneCompanyInfo [compnay=" + compnay + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
