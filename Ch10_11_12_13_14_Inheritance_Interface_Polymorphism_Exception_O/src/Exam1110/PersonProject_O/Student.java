package Exam1110.PersonProject_O;

import Exam1110.Book_O.FEE;

public class Student extends Person {

	private int grade;

	
	public Student() {
		super();
		
	}


	public Student(int grade) {
		super();
		this.grade = grade;
	}


	public Student(String name, String addr, String phoneNumber, String mailaddr) {
		super(name, addr, phoneNumber, mailaddr);
		// TODO Auto-generated constructor stub
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}

	
}