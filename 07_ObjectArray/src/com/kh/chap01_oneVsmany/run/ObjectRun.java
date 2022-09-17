package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		System.out.println(b1.information());
		
		Book b2 = new Book("��", "����å��", "����������������");
		System.out.println(b2.information());
		
		Book b3 = new Book("�ڹ��� ����", "�ڹ����ǻ�", "���ü�", 15000, 0.1);
		System.out.println(b3.information());
		
		// ���������� �Է¹޾Ƽ� �������� ������ ������ִ� ���α׷�!
		// å 3���� ������ �Է¹ްڴٰ� �����Ұ�!
		// ��ü ���ε��� ����!
		// �Է��� ��ĳ�� ���!!
		
		b1 = null;
		b2 = null;
		b3 = null; // Reset
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			// �Է¹��� ���� : ������, ���ǻ�, ����, ����, ���η�
			System.out.println("���� > ");
			String title = sc.nextLine();
			
			System.out.println("���ǻ� > ");
			String publisher = sc.nextLine();
			
			System.out.println("���� > ");
			String author = sc.nextLine();
			
			System.out.println("���� > ");
			int price = sc.nextInt();
			
			System.out.println("���η� > ");
			double discountRate = sc.nextDouble();
			sc.nextLine();
			
			if(i == 0) {
				b1 = new Book(title, publisher, author, price, discountRate);
			}else if(i == 1) {
				b2 = new Book(title, publisher, author, price, discountRate);
			}else {
				b3 = new Book(title, publisher, author, price, discountRate);
			}
		}
		
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println(b3.information());
		/*
		for(int i = 0; i < 3; i++) {
			System.out.println(bi.information());
		}
		*/
		
		// ����ڷκ��� �˻��� ������ ������ �Է¹޾Ƽ�
		// �� ��ü �������� ����� �ϳ��ϳ� ���ؼ� ��ġ�ϴ� ������ ������ �˷��ִ� ���α׷�
		
		System.out.println("�˻��� å ���� �Է� > ");
		String searchTitle = sc.nextLine();
		
		if(b1.getTitle().equals(searchTitle)) {
			System.out.println(b1.getPrice());
		}
		if(b2.getTitle().equals(searchTitle)) {
			System.out.println(b2.getPrice());
		}
		if(b3.getTitle().equals(searchTitle)) {
			System.out.println(b3.getPrice());
		}
		
		
		/*
		for(int i = 0; i < 3; i++) {
			if(bi.getTitle().equals(searchTitle)) {
				System.out.println(bi.getPrice());
			}
		}
		*/
		
		

	}
}
