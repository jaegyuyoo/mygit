package Exam1108.HumanProject_pdf_O;

public class Human {

	private String name;
	private int age;
	
	void eat() {}
	void sleep() {}
	
	public Human() {
	//	super();
		System.out.println("부모 클래스");
	}
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", toString()=" + super.toString() + "]";
	}
	
	public void test() {
		System.out.println("휴먼");
	}
}
