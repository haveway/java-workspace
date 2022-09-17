package com.kh.chap03_override.model.vo;

public class Book /* extends Object  */ {
	
	// ��� Ŭ������ �ֻ��� �θ�Ŭ������ Object => ���� ����
	
	// �ʵ��
	// ����, ���ڸ�, ����
	private String title;
	private String author;
	private int price;
	
	// �����ں�
	public Book() {
	}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// �޼ҵ��
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
	
	// toSTring�� �ڵ��ϼ��� �����ϴ�
	// Alt + Shift + s => s => Alt + g
	// source - Generate toString... => Generate
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	/*
	 * �������̵�(Overriding)
	 * - ��ӹް� �ִ� �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� ������(���ۼ�) �ϴ� ��
	 * - �θ�Ŭ������ �����ϰ��ִ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ�
	 * - �ڽ�Ŭ������ ������� �� �޼ҵ尡 �켱���� ������ ȣ��ȴ�.
	 * 
	 * �������̵��� ��������
	 * 1. �θ�޼ҵ��� �޼ҵ��� ����
	 * 2. �Ű������� �ڷ���, ����, ������ ����(�Ű���������� ����)
	 * 3. ��ȯ���� ����
	 * => �Ծ��� ����
	 * 4. �θ�޼ҵ��� ���������ں��� ���ų� ���� ������ �о����
	 * 
	 * 
	 * @Override
	 * ������̼�(annotation)
	 * ������ �ּ�
	 * - ���� ����
	 * 		=> ��ø� ���ص� �θ�޼ҵ�� ���°� ������ �������̵� �� ������ �Ǵ�.
	 * - ������̼��� ���̴� ����???
	 * 		=> �Ǽ��� ������.
	 * 		=> �������� �������̵�
	 * 
	 * �����ڵ鳢���� ���
	 * ������ ���������� �ۼ��ϴ� ������ ������!
	 * 
	 */
	
	
	

}
