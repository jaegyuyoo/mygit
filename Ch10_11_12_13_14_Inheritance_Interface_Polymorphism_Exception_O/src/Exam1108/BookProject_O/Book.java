package Exam1108.BookProject_O;

public class Book {

	String title;
	int numberOfPage;
	String author;

	public Book() {
		super();
	}

	public Book(String title, int numberOfPage, String author) {
		super();
		this.title = title;
		this.numberOfPage = numberOfPage;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", numberOfPage=" + numberOfPage + ", author=" + author + ", toString()="
				+ super.toString() + "]";
	}

}
