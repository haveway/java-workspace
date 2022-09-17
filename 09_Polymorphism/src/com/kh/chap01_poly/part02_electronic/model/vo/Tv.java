package com.kh.chap01_poly.part02_electronic.model.vo;

public class Tv extends Electronic {
	
	private int inch;

	public Tv() {
	}

	public Tv(String name, String brand, int price, int inch) {
		super(name, brand, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return super.toString() + ", inch : " + this.inch;
	}
	
	
	
	

}
