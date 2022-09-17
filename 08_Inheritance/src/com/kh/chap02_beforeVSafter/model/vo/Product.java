package com.kh.chap02_beforeVSafter.model.vo;

/*
 * ���
 * �� Ŭ�������� �ߺ��� �ʵ�, �޼ҵ���� �� �ѹ� �� �ϳ��� Ŭ����(�θ�Ŭ����)�� �����ص� ��
 * �ش� Ŭ������ ������ ������ ���� ����
 * 
 * 
 * ������ Ŭ������ �̿��ؼ� ���ο� Ŭ������ �����.
 */

public class Product {
	// ����Ǵ� �ʵ� : brand, pCode, pName, price
	// �ʵ��
	private String brand;
	private String pCode;
	private String pName;
	private int price;

	// �����ں�
	public Product() {
		System.out.println("�θ� ��ü ����~");
	}
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	
	// �޼ҵ��
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
