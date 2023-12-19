package Exam1106_pdf;

public class TestCourse {

	public static void main(String[] args) {
		Course course1 = new Course("자료 구조");
		Course course2 = new Course("데이터 베이스");
				
		course1.addStudent("홍길동");
		course1.addStudent("이순신");
		course1.addStudent("강감찬");
		course2.addStudent("홍길동");
		course2.addStudent("김유신");
		
		System.out.println("course1 의 학생수 : " + course1.getNumberOfStudents());
		String[] students1 = course1.getStrings();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.println(students1[i] + ", ");
		}
		System.out.println();
		System.out.println("coruse2의 학생수 : " + course2.getNumberOfStudents());
		String[] students2 = course2.getStrings();
		for (int i = 0; i < course2.getNumberOfStudents(); i++) {
			System.out.println(students2[i] + ", ");
		}
	}

}
