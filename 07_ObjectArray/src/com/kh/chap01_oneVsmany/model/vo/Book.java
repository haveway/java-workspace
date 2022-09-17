package com.kh.chap01_oneVsmany.model.vo;

public class Book {
	
	// �ʵ��
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// �����ں�
	public Book() {}
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	// �޼ҵ��
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return this.discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	// �̻ڰ� �̻ڰ�
	public String information() {
		return this.title + " " + this.publisher + " " + this.author + " " + this.price + " " + this.discountRate;
	}

}
