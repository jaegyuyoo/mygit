package Exam1106_pdf;

public class Course {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStrings() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudents(String student) {

	}
}
