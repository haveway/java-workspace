package com.kh.model.vo;

public class Car {
	
	// 필드부
	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;
	
	// 생성자부
	public Car() {
		super();
	}
	public Car(int carNum, int carType, String owner) {
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}
	public Car(int parkingNum, int carNum, int carType, String owner) {
		super();
		this.parkingNum = parkingNum;
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}
	
	//메소드부
	public int getParkingNum() {
		return parkingNum;
	}
	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public int getCarType() {
		return carType;
	}
	public void setCarType(int carType) {
		this.carType = carType;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
	@Override
	public String toString() {
		
		String cType = "";
		
		if(carType == 1) { // 1: 경차
			cType = "경차";
		}else if(carType == 2) { // 2: 세단
			cType = "세단";
		}else if(carType == 3) { // 3: SUV
			cType = "SUV";
		}else if(carType == 4) { // 4: 트럭
			cType = "트럭";
		}
		
		return "Car [parkingNum=" + parkingNum + ", carNum=" + carNum + ", carType=" + cType + ", owner=" + owner
				+ "]";
	}


}
