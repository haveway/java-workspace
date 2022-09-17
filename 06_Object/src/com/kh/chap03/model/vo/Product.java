package com.kh.chap03.model.vo;

public class Product {
	// 상품가격, 상품명, 브랜드명
	// [ 필드부 ]
	private int price;
	private String productName;
	private String brand = "애플";
	
	// [ 생성자부 ]
	// [ 메소드부 ]
	public void setPrice(int price) {
		this.price = price;
	}
	public void setProducName(String productName) {
		this.productName = productName;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getProductName() {
		return this.productName;
	}
	public String getBrand() {
		return this.brand;
	}
	public int getPrice() {
		return this.price;
	}
	// information()
	public String information() {
		return "상품명 : " + this.productName + " 가격 : " + this.price + " 브랜드 : " + this.brand;
	}

}