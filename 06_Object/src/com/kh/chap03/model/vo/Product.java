package com.kh.chap03.model.vo;

public class Product {
	// ��ǰ����, ��ǰ��, �귣���
	// [ �ʵ�� ]
	private int price;
	private String productName;
	private String brand = "����";
	
	// [ �����ں� ]
	// [ �޼ҵ�� ]
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
		return "��ǰ�� : " + this.productName + " ���� : " + this.price + " �귣�� : " + this.brand;
	}

}