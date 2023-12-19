package Exam1108.UniversityProject_O;

public class UndergraduteStudent extends AllStudent {

	private String clueName;

	public UndergraduteStudent() {
		super();
	}

	public UndergraduteStudent(String clueName) {
		super();
		this.clueName = clueName;
	}

	public UndergraduteStudent(String name, String studentID, String department, int grade, int creditEarned, String clueName) {
		super(name, studentID, department, grade, creditEarned);
		this.clueName = clueName;
	}

	public String getClueName() {
		return clueName;
	}

	public void setClueName(String clueName) {
		this.clueName = clueName;
	}

	@Override
	public String toString() {
		return "UndergraduteStudent [clueName=" + clueName + ", toString()=" + super.toString() + "]";
	}

	
	
}
