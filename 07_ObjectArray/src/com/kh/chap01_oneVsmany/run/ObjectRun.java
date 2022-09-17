package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		System.out.println(b1.information());
		
		Book b2 = new Book("신", "열린책들", "베르나르베르베르");
		System.out.println(b2.information());
		
		Book b3 = new Book("자바의 정석", "자바출판사", "남궁성", 15000, 0.1);
		System.out.println(b3.information());
		
		// 도서정보를 입력받아서 도서들의 정보를 출력해주는 프로그램!
		// 책 3권의 정보를 입력받겠다고 가정할것!
		// 객체 따로따로 관리!
		// 입력은 스캐너 사용!!
		
		b1 = null;
		b2 = null;
		b3 = null; // Reset
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			// 입력받을 정보 : 도서명, 출판사, 저자, 가격, 할인률
			System.out.println("제목 > ");
			String title = sc.nextLine();
			
			System.out.println("출판사 > ");
			String publisher = sc.nextLine();
			
			System.out.println("저자 > ");
			String author = sc.nextLine();
			
			System.out.println("가격 > ");
			int price = sc.nextInt();
			
			System.out.println("할인률 > ");
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
		
		// 사용자로부터 검색할 도서의 제목을 입력받아서
		// 각 전체 도서들의 제목과 하나하나 비교해서 일치하는 도서의 가격을 알려주는 프로그램
		
		System.out.println("검색할 책 제목 입력 > ");
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
