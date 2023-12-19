package com.market.member;

public class Customer { // *영수증 출력할때 필요

	private String name; // 고객이름
	private String phone; // 연락처
	private String address; // 주소

/*
	public Customer() {
		super();
	}
*/
	public Customer(String name, String phone) {
		// super();
		this.name = name;
		this.phone = phone;
	}

	public Customer(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
