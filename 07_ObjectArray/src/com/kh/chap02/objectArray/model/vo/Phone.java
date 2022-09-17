package com.kh.chap02.objectArray.model.vo;

public class Phone {
	// [ 필드부 ]
	// 이름, 시리즈, 브랜드, 가격
	// name, series, brand, price
	
	private String name;
	private String series;
	private String brand;
	private int price;
	
	// [ 생성자부 ]
	// 기본생성자
	// 모든 필드에 대한 매개변수 생성자
	public Phone() {}
	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
	// [ 메소드부 ]
	// getter/setter
	// information
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeries() {
		return this.series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return this.name + "," + this.series + "," + this.brand + "," + this.price;
	}
	

}
