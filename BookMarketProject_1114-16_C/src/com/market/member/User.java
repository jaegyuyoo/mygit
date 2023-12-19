package com.market.member;

public class User extends Customer {

	public User(String name, String phone) {
		super(name, phone);	 // (질문) 이것의 의미
	}
	public User(String name, String phone, String address) {
		super(name, phone);	
	}	
}
