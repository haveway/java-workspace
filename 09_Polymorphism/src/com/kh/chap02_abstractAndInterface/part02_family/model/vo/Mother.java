package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic {
	
	private String babyBirth; // 출산 // 입양 // 없음

	public Mother() {}
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	@Override
	public String toString() {
		return "Mother [" + super.toString() + "babyBirth=" + babyBirth + "]";
	}
	
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 10);
	}
	@Override
	public void sleep() {
		super.setHelath(super.getHelath() + 10);
	}

}
