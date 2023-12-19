package model;

public class TrainerVO {

	private int t_no; // 트레이너일련번호
	private String t_name; // 이름
	private String t_number; // 주민등록번호
	private String t_phone; // 전화번호
	private String t_address; // 주소
	private int t_cost; // PT수업료(회당 가격)
	private String t_available; // 수업요일/오전(오후)
	private String t_salary; // 급여
	private String t_specialty; // 특기
	private int t_totalsalary; // 트레이너 총급여

	public TrainerVO() {
		super();
	}

	public TrainerVO(int t_no, String t_name, String t_number, String t_phone, String t_address, int t_cost,
			String t_available, String t_salary, String t_specialty, int t_totalsalary) {
		super();
		this.t_no = t_no;
		this.t_name = t_name;
		this.t_number = t_number;
		this.t_phone = t_phone;
		this.t_address = t_address;
		this.t_cost = t_cost;
		this.t_available = t_available;
		this.t_salary = t_salary;
		this.t_specialty = t_specialty;
		this.t_totalsalary = t_totalsalary;
	}

	public int getT_no() {
		return t_no;
	}

	public void setT_no(int t_no) {
		this.t_no = t_no;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_number() {
		return t_number;
	}

	public void setT_number(String t_number) {
		this.t_number = t_number;
	}

	public String getT_phone() {
		return t_phone;
	}

	public void setT_phone(String t_phone) {
		this.t_phone = t_phone;
	}

	public String getT_address() {
		return t_address;
	}

	public void setT_address(String t_address) {
		this.t_address = t_address;
	}

	public int getT_cost() {
		return t_cost;
	}

	public void setT_cost(int t_cost) {
		this.t_cost = t_cost;
	}

	public String getT_available() {
		return t_available;
	}

	public void setT_available(String t_available) {
		this.t_available = t_available;
	}

	public String getT_salary() {
		return t_salary;
	}

	public void setT_salary(String t_salary) {
		this.t_salary = t_salary;
	}

	public String getT_specialty() {
		return t_specialty;
	}

	public void setT_specialty(String t_specialty) {
		this.t_specialty = t_specialty;
	}

	public int getT_totalsalary() {
		return t_totalsalary;
	}

	public void setT_totalsalary(int t_totalsalry) {
		this.t_totalsalary = t_totalsalary;
	}

}