package com.market.member;

public class Admin extends Customer {

	private String id = "Admin";
	private String password = "Admin1234";
	
	public Admin(String name, String phone) {
		super(name, phone);
	}
	
	public String getId() { // 관리자 정보 변경되면안되니 setter는없다.
		return id;
	}
	public String getPassword() {
		return password;
	}
		
}
