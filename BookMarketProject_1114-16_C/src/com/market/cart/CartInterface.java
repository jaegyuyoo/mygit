package com.market.cart;

import java.util.ArrayList;

import com.market.bookitem.Book;

public interface CartInterface {

	// void printBookList(Book[] p); // 전체 도서 정보 목록 출력
	void printBookList(ArrayList<Book> boolist); 
	
	boolean isCartInBook (String id); // 장바구니에 담길 갯수로 1씩증가
	void inserBook(Book p); // CartItem에 도서 정보 출력
	void removeCart(int numId); // 장바구니 순번 numId의 항목을 삭제
	void deleteBook(); // 장바구니의 모든 항목을 삭제
}
