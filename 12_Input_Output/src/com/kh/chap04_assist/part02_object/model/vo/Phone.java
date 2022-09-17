package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{ // ����ȭ�� �ϰڴٰ� �ɼ� �ο� ****
	
	// [ �ʵ�� ]
	// �̸�, �ø���, �귣��, ����
	private String name;
	private String series;
	private String brand;
	private int price;
	
	// [ �����ں� ]
	
	public Phone() {}
	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
	// [ �޼ҵ�� ]
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", series=" + series + ", brand=" + brand + ", price=" + price + "]";
	}

	
	
	


}
