package Exam1110.PersonProject_O;

public class Person {

	private String name; // 이름
	private String addr; // 주소
	private String phoneNumber; // 전화번호 
	private String mailaddr; // 메일주소;

	public Person() {
		super();
	}

	public Person(String name, String addr, String phoneNumber, String mailaddr) {
		super();
		this.name = name;
		this.addr = addr;
		this.phoneNumber = phoneNumber;
		this.mailaddr = mailaddr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMailaddr() {
		return mailaddr;
	}

	public void setMailaddr(String mailaddr) {
		this.mailaddr = mailaddr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", phoneNumber=" + phoneNumber + ", mailaddr=" + mailaddr
				+ ", toString()=" + super.toString() + "]";
	}
}
