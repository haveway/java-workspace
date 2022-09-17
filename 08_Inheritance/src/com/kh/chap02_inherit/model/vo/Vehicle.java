package com.kh.chap02_inherit.model.vo;

public class Vehicle {
	// Ż���� �̸�, �Ÿ�, ����
	
	private String name;
	private double mileage;
	private String kind;
	
	public Vehicle() {
		super();
	}
	public Vehicle(String name, double mileage, String kind) {
		super();
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	// ���������� information()�� �����ߴ�.
	// -> ObjectŬ������ ������ �ִ� �޼ҵ带 �������̵��ؼ� ���Ŵ�!!
	// information ��� toString�� �������̵� �ؼ� ����!!!!!!
	
	public String toString() {
		return "name : " + this.name + ", mileage : " 
				+ this.mileage + ", kind : " + this.kind; 
	}
	
	public void howToMove() {
		System.out.println("�����δ�~");
	}
	

}
