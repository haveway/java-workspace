package com.kh.chap02.objectArray.model.vo;

public class Phone {
	// [ �ʵ�� ]
	// �̸�, �ø���, �귣��, ����
	// name, series, brand, price
	
	private String name;
	private String series;
	private String brand;
	private int price;
	
	// [ �����ں� ]
	// �⺻������
	// ��� �ʵ忡 ���� �Ű����� ������
	public Phone() {}
	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
	// [ �޼ҵ�� ]
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
