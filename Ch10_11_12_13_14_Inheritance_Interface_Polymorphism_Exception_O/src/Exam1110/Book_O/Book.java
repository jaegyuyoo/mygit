package Exam1110.Book_O;

public class Book {

	private String number; // 관리번호
	private String title; // 제목
	private String author; // 저자 

	public Book() {
		super();
	}

	public Book(String number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void calculation() {
		System.out.println("관리번호: " + number + ", 제목" + title + ", 저자 : " + author);
	}

	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + ", toString()=" + super.toString()
				+ "]";
	}

	
}
