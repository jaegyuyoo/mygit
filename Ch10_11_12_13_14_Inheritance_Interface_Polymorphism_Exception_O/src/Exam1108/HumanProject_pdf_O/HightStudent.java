package Exam1108.HumanProject_pdf_O;

public class HightStudent extends Student {

	private String schoolName;
	private int grade;

	public HightStudent() {
	//	super();
	System.out.println("유재규 부모-학생(고등)");
	}

	public HightStudent(String schoolName, int grade) {
		super(3); // 매개변수 갯수에 맞게 출력한다
		this.schoolName = schoolName;
		this.grade = grade;
	}


	public HightStudent(String name, int age, int studentID, String schoolName, int grade) {
		super(name, age, studentID);
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "HightStudent [schoolName=" + schoolName + ", grade=" + grade + ", toString()=" + super.toString() + "]";
	}
	
	public void test() {
		System.out.println("고등"); // 가까운 고등 출력 
		super.test(); // 가장 상위 출력 p.351 원래 한단계지만 - 매게변수1개가없어서 휴먼까지 최상위까지 올라간다
	}
}