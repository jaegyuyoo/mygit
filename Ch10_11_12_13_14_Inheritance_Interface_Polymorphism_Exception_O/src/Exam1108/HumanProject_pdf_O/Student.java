package Exam1108.HumanProject_pdf_O;

public class Student extends Human {

	private int studentID;

	public Student() {
	//	super();
	System.out.println("학생 클래스(부모)");
	}

	
	public Student(int studentID) {
		super();
		this.studentID = studentID;
	}


	public Student(String name, int age, int studentID) { // 부모 객체를 가져옴 
		super(name, age);
		this.studentID = studentID;
	}


	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", toString()=" + super.toString() + "]";
	}

	
}
