package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	
	// ���� ����
	private int wing;
	private int tire;
	public Airplane() {
		super();
	}
	public Airplane(String name, double mileage, String kind, int wing, int tire) {
		
		super(name, mileage, kind);
		this.wing = wing;
		this.tire = tire;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public String toString() {
		return super.toString() + ", wing : " + this.wing + ", tire : " + this.tire;
	}
	public void howToMove() {
		System.out.println("������ �����ٰ� ������ ����.");
	}

}
