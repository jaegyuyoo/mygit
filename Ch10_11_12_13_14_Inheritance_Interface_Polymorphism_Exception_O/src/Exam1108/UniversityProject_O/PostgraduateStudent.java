package Exam1108.UniversityProject_O;

public class PostgraduateStudent extends AllStudent {

	private String teachingAssistnceType;
	private double scholarshipRate;

	public PostgraduateStudent() {
		super();
	}

	public PostgraduateStudent(String teachingAssistnceType, double scholarshipRate) {
		super();
		this.teachingAssistnceType = teachingAssistnceType;
		this.scholarshipRate = scholarshipRate;
	}

	public PostgraduateStudent(String name, String studentID, String department, int grade, int creditEarned, String teachingAssistnceType, double scholarshipRate) {
		super(name, studentID, department, grade, creditEarned);
		this.teachingAssistnceType = teachingAssistnceType;
		this.scholarshipRate = scholarshipRate;
	}

	public String getTeachingAssistnceType() {
		return teachingAssistnceType;
	}

	public void setTeachingAssistnceType(String teachingAssistnceType) {
		this.teachingAssistnceType = teachingAssistnceType;
	}

	public double getScholarshipRate() {
		return scholarshipRate;
	}

	public void setScholarshipRate(double scholarshipRate) {
		this.scholarshipRate = scholarshipRate;
	}

	@Override
	public String toString() {
		return "PostgraduateStudent [teachingAssistnceType=" + teachingAssistnceType + ", scholarshipRate="
				+ scholarshipRate + ", toString()=" + super.toString() + "]";
	}
}
