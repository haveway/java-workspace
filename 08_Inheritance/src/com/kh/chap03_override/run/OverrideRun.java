package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {
	
	
	public static void main(String[] args) {
		
		Book b = new Book("�ڹ�������", "���ü�", 10000);
		
		System.out.println(b.toString());
		System.out.println(b/*.toString()*/);
		
	}
}
