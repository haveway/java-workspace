package com.kh.chap01_poly.part02_electronic.model.vo;

public class SmartPhone extends Electronic {
	
	private String phoneNumber;

	public SmartPhone() {
	}
	
	public SmartPhone(String name, String brand, int price, String phoneNumber) {
		super(name, brand, price);
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return super.toString() + ", phoneNumber : " + this.phoneNumber;
	}
}
