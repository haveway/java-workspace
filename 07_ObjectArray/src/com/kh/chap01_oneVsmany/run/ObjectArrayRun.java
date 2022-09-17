package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		// 배열의 특징
		// 참조형이다, 인덱스는 0번부터, 순서가 있다, ☆ 같은 자료형 끼리만 묶을 수 있다. ★
		// int[] iArr = new int[5]; => iArr 정수형 배열 5칸짜리
		// String[] sArr = new String[5] => sArr 문자열형 배열 5칸짜리
		// Book[] bArr = new Book[3];
		
		// 객체 배열의 선언 및 할당!
		// [ 표현법 ]
		// 클래스이름[] 배열이름 = new 클래스이름[배열크기];
		
		Book[] arr = new Book[3]; // arr[0], arr[1], arr[2]
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i< arr.length; i++) {
			
			System.out.println("제목");
			String title = sc.nextLine();
			
			System.out.println("출판사");
			String publisher = sc.nextLine();
			
			System.out.println("저자 ");
			String author = sc.nextLine();
			
			System.out.println("가격");
			int price = sc.nextInt();
			
			System.out.println("할인률");
			double discountRate = sc.nextDouble();
			sc.nextLine();
			
			arr[i] = new Book(title, publisher, author, price, discountRate);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		System.out.println("검색할 책 제목");
		String searchTitle = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getTitle().equals(searchTitle)) {
				System.out.println(arr[i].getPrice());
			}
		}
	}

}
