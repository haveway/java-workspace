package com.kh.chap02_beforeVSafter.model.vo;

/*
 * 상속
 * 매 클래스마다 중복된 필드, 메소드들을 단 한번 또 하나의 클래스(부모클래스)로 정의해둔 후
 * 해당 클래스의 내용을 가져다 쓰는 개념
 * 
 * 
 * 기존의 클래스를 이용해서 새로운 클래스를 만든다.
 */

public class Product {
	// 공통되는 필드 : brand, pCode, pName, price
	// 필드부
	private String brand;
	private String pCode;
	private String pName;
	private int price;

	// 생성자부
	public Product() {
		System.out.println("부모 객체 생성~");
	}
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	
	// 메소드부
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "brand : " + this.brand + "pCode : " + this.pCode + "pName : " + this.pName  
				+ "price : " + this.price;	
	}
	
	
	
	

}
