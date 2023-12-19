package Exam1108.HumanProject_pdf_O;

public class HighSchool extends Student {

	private String schoolName;
	private int grade;

	public HighSchool() {
		super();
	}

	public HighSchool(String schoolName, int grade) {
		super(999); // 상위 Student에서  studentID 값을 여기서 지정해주고싶다면 
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public HighSchool(String name, int age, int studentID) {
		super(name, age, studentID);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "HighSchool [schoolName=" + schoolName + ", grade=" + grade + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
