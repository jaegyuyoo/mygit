package Exam1108.BookProject_O;

public class Magazine extends Book {

	private String relaseDate; // 발매일

	public Magazine() {
		super();
	}

	public Magazine(String relaseDate) {
		super();
		this.relaseDate = relaseDate;
	}

	public Magazine(String title, int numberOfPage, String author, String relaseDate) {
		super(title, numberOfPage, author);
		this.relaseDate = relaseDate;
	}

	public String getRelaseDate() {
		return relaseDate;
	}

	public void setRelaseDate(String relaseDate) {
		this.relaseDate = relaseDate;
	}

	@Override
	public String toString() {
		return "Magazine [relaseDate=" + relaseDate + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
