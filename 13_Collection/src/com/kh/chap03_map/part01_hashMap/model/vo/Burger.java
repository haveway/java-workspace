package com.kh.chap03_map.part01_hashMap.model.vo;

public class Burger {
	
	private String flavor; // ¸À
	private int calore; // ¿­·®
	
	public Burger() {
	}
	public Burger(String flavor, int calore) {
		this.flavor = flavor;
		this.calore = calore;
	}
	
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalore() {
		return calore;
	}
	public void setCalore(int calore) {
		this.calore = calore;
	}
	
	@Override
	public String toString() {
		return "Burger [flavor=" + flavor + ", calore=" + calore + "]";
	}

}
