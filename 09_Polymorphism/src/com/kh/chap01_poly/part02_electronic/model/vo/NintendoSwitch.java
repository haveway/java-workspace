package com.kh.chap01_poly.part02_electronic.model.vo;

public class NintendoSwitch extends Electronic {
	
	private boolean joycone;

	public NintendoSwitch() {}
	public NintendoSwitch(String brand, String name, int price, boolean joycone) {
		super(brand, name, price);
		this.joycone = joycone;
	}

	public boolean isJoycone() {
		return joycone;
	}

	public void setJoycone(boolean joycone) {
		this.joycone = joycone;
	}

	@Override
	public String toString() {
		return super.toString() + "joycone" + this.joycone;
	}
	
}
