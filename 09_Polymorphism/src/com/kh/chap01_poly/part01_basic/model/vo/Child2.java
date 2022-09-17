package com.kh.chap01_poly.part01_basic.model.vo;

public class Child2 extends Parent {
	// 필드부
	// int x, int y
	private int n;

	// 기본생성자, 모든 필드가 매개변수인 생성자, getter/setter, printChild2
	// 생성자부
	public Child2() {}
	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}
	
	// 메소드부
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void printChild2() {
		System.out.println("나 두번째 자식이야 ~");
	}
	
	@Override
	public void print() {
		System.out.println("나 두번째 자식이야 ~");
	}
	
	

}
