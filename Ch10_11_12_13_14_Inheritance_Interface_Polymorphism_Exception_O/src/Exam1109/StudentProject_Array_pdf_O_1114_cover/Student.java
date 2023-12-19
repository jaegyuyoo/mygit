package Exam1109.StudentProject_Array_pdf_O_1114_cover;

public class Student {

	private String name; // 이름
	private String addr; // 주소
	private String tel; // 전화
	private String grade; // 학년

	public Student() {
		// super();
		this("", "", "", "");
	}

	public Student(String name, String addr, String tel, String grade) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "[이름: getName()=" + getName() + ", 주소: getAddr()=" + getAddr() + ", 전번: getTel()=" + getTel()
				+ ", 성적: getGrade()=" + getGrade() + ", toString()=" + super.toString() + "]";
	}

	// 학생 정보 출력
	public void showStudentInfo() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("전화 : " + tel);
		System.out.println("학년 : " + grade);
		
	}
}
