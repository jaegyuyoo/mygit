package Exam1108.UniversityProject_O;

public class AllStudent {

	String name;
	String studentID;
	String department;
	int grade; // 학년
	int creditEarned; // 이수학점 
	
	public AllStudent() {
		super();
	}

	public AllStudent(String name, String studentID, String department, int grade, int creditEarned) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.department = department;
		this.grade = grade;
		this.creditEarned = creditEarned;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCreditEarned() {
		return creditEarned;
	}

	public void setCreditEarned(int creditEarned) {
		this.creditEarned = creditEarned;
	}

	@Override
	public String toString() {
		return "AllStudent [name=" + name + ", studentID=" + studentID + ", department=" + department + ", grade="
				+ grade + ", creditEarned=" + creditEarned + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
