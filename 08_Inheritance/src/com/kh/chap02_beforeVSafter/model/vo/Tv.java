package com.kh.chap02_beforeVSafter.model.vo;

public class Tv extends Product {
	
	// [ 필드부 ]
	private int inch;
	
	// [ 생성자부 ]
	public Tv() {}
	
	// 모든 필드에 대해 매개변수가 있는 생성자
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		
		
		// 부모에 있는 필드나 메소드에 접근하고자 할때는??? super.
		// super.brand = 해당 필드는 private이므로 접근 불가!!!
		
		// 해결방법 1. 부모의 private을 protected로 바꾼다.
		// 해결방법 2. 부모의 setter 메소드를 호출해서 초기화 한다. super.set필드이름();
		// 해결방법 3. 부모의 모든 매개변수가 있는 생성자를 호출해서 초기화한다. super(매개변수들);
		
		// 2번 방법 이용
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		this.inch = inch;
	}

	// [ 메소드부 ]
	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	/*
	 * 여기까지가 필수 작성요소들 모두 작성한 상태!!!
	 * 
	 * information이라는 메소드는 이미 부모로부터 상속 받음!!!! => 덮어쓰기를 할 수 있음!!
	 * 오버라이딩
	 * 
	 */
	
	public String information() {
		return super.information() + "inch : " + this.inch;
	}

}
