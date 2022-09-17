package com.kh.chap02_inherit.model.vo;

public class Vehicle {
	// 탈것의 이름, 거리, 종류
	
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
	
	
	// 마지막으로 information()를 선언했다.
	// -> Object클래스의 기존에 있던 메소드를 오버라이딩해서 쓸거다!!
	// information 대신 toString을 오버라이딩 해서 쓸것!!!!!!
	
	public String toString() {
		return "name : " + this.name + ", mileage : " 
				+ this.mileage + ", kind : " + this.kind; 
	}
	
	public void howToMove() {
		System.out.println("움직인다~");
	}
	

}
