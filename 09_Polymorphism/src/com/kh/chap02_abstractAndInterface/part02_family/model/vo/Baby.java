package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic {
	
	// 필드부
	// 없음
	
	// 생성자부
	// 기본, 매개변수
	public Baby() {}
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// 메소드부
	// toString
	@Override
	public String toString() {
		return "Baby [" + super.toString() + "]";
	}
	
	@Override
	public void eat() { // 애기가 밥먹을 때는?
		// 몸무게 5증가
		// 몸무게가 5증가해야함
		// weight == 부모의 필드 + 5
		// 수정할 몸무게 == 기존의 몸무게 + 5
		super.setWeight(super.getWeight() + 5);
		// 건강도 5증가
		super.setHelath(super.getHelath() + 5);
	}
	
	@Override
	public void sleep() {
		// 건강도 10 증가
		super.setHelath(super.getHelath() + 10);
	}

}
