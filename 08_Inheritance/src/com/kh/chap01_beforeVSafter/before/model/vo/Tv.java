package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv {
	// �ʵ��
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private int inch;
	
	// Alt + Shift + s => o => Alt + D => Alt + G => �⺻������
	//								   => Alt + G => �Ű����� �ִ� ������
	// �����ں�
	public Tv() {
	}
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.inch = inch;
	}
	

	// �޼ҵ��
	
	// Alt + Shift + s => r => Alt + a => Alt + r
	// getter / setter �ڵ��ϼ�
	
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
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	public String information() {
		return this.brand + ", " + this.pCode + ", " + this.pName + ", " + this.price + ", " + this.inch;
	}

}
