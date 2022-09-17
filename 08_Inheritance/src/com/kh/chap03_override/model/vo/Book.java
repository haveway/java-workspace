package com.kh.chap03_override.model.vo;

public class Book /* extends Object  */ {
	
	// 모든 클래스의 최상위 부모클래스는 Object => 생략 가능
	
	// 필드부
	// 제목, 저자명, 가격
	private String title;
	private String author;
	private int price;
	
	// 생성자부
	public Book() {
	}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// 메소드부
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// toSTring도 자동완성이 가능하다
	// Alt + Shift + s => s => Alt + g
	// source - Generate toString... => Generate
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	/*
	 * 오버라이딩(Overriding)
	 * - 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의(재작성) 하는 것
	 * - 부모클래스가 제공하고있는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 * - 자식클래스의 오버라드 된 메소드가 우선권을 가져서 호출된다.
	 * 
	 * 오버라이딩의 성립조건
	 * 1. 부모메소드의 메소드명과 동일
	 * 2. 매개변수의 자료형, 갯수, 순서가 동일(매개변수명과는 무관)
	 * 3. 반환형이 동일
	 * => 규약의 개념
	 * 4. 부모메소드의 접근제한자보다 같거나 공유 범위가 넓어야함
	 * 
	 * 
	 * @Override
	 * 어노테이션(annotation)
	 * 일종의 주석
	 * - 생략 가능
	 * 		=> 명시를 안해도 부모메소드와 형태가 같으면 오버라이딩 된 것으로 판단.
	 * - 어노테이션을 붙이는 이유???
	 * 		=> 실수를 줄이자.
	 * 		=> 누가봐도 오버라이딩
	 * 
	 * 개발자들끼리의 약속
	 * 생략은 가능하지만 작성하는 습관을 들이자!
	 * 
	 */
	
	
	

}
