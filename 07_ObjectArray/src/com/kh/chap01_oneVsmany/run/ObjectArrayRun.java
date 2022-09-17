package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		// �迭�� Ư¡
		// �������̴�, �ε����� 0������, ������ �ִ�, �� ���� �ڷ��� ������ ���� �� �ִ�. ��
		// int[] iArr = new int[5]; => iArr ������ �迭 5ĭ¥��
		// String[] sArr = new String[5] => sArr ���ڿ��� �迭 5ĭ¥��
		// Book[] bArr = new Book[3];
		
		// ��ü �迭�� ���� �� �Ҵ�!
		// [ ǥ���� ]
		// Ŭ�����̸�[] �迭�̸� = new Ŭ�����̸�[�迭ũ��];
		
		Book[] arr = new Book[3]; // arr[0], arr[1], arr[2]
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i< arr.length; i++) {
			
			System.out.println("����");
			String title = sc.nextLine();
			
			System.out.println("���ǻ�");
			String publisher = sc.nextLine();
			
			System.out.println("���� ");
			String author = sc.nextLine();
			
			System.out.println("����");
			int price = sc.nextInt();
			
			System.out.println("���η�");
			double discountRate = sc.nextDouble();
			sc.nextLine();
			
			arr[i] = new Book(title, publisher, author, price, discountRate);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		System.out.println("�˻��� å ����");
		String searchTitle = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getTitle().equals(searchTitle)) {
				System.out.println(arr[i].getPrice());
			}
		}
	}

}
