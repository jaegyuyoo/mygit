package com.market.bookitem;

public abstract class Item {

	String bookId; // 도서 ID
	String isbn; // ISBN
	String name; // 도서명
	int uniPrice; // 도서단가

	public Item() {
		// super();
	}

	public Item(String bookId, String isbn, String name, int uniPrice) {
		super();
		this.bookId = bookId;
		this.isbn = isbn;
		this.name = name;
		this.uniPrice = uniPrice;
	}

	public abstract String getBookId();

	public abstract String getIsbn();

	public abstract String getName();

	public abstract int getUnitPrice();

	public abstract void setBookId(String bookId);

	public abstract void setIsbn(String isbn);

	public abstract void setName(String name);

	public abstract void setUniPrice(int unitPrice);
	
}