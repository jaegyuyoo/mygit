package com.market.bookitem;

public class Book extends Item { // *Item 추상클래스 재정의

	private String author; // 저자
	private String description; // 설명
	private String category; // 분류
	private String releaseDate; // 출판일

	public Book() {
		// super();
	}

	public Book(String bookId, String isbn, String name, int uniPrice) {
		super(bookId, isbn, name, uniPrice);
	}

	public Book(String bookId, String isbn, String name, int uniPrice, String author, String description,
			String category, String releaseDate) {
		super(bookId, isbn, name, uniPrice);
		this.author = author;
		this.description = description;
		this.category = category;
		this.releaseDate = releaseDate;
	}

	@Override
	public String getBookId() {
		return bookId;
	}

	@Override
	public String getIsbn() {
		return isbn;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getUnitPrice() {
		return uniPrice;
	}

	@Override
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	@Override
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setUniPrice(int unitPrice) {
		this.uniPrice = unitPrice;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}	
}
