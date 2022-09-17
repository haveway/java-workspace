package com.kh.chap03.run;

import com.kh.chap03.model.vo.Person;
import com.kh.chap03.model.vo.Product;

public class Run {
	
	public static void main(String[] args) {

		// == 내가 만든 나만의 자료형(1. 참조자료형, 2. 주소값을 저장, 3. 여러개의 자료형에 여러개 값을 보관 + 기능)
		// == 사용자 정의 자료형
		// Person이라는 클래스를 통해 객체 생성
		
		
		Person person = new Person(); // 인스턴스화
		
		person.setName("김명래");
		System.out.println(person.information());
		// 기본값이 들어있음 => 기본형은 0, 0.0, 공백 // 참조형은 null
		
		// 값 대입 => setter
		person.setId("774343-2323232");
		person.setGender('M');
		System.out.println(person.information());
		
		person.setAge(65);
		person.setPhoneNumber("010-2323-3434");
		person.setEmailAddress("kim@kim.com");
		System.out.println(person.information());
		System.out.println(person);
		
		Product pd = new Product();
		
		pd.setProducName("아이폰13");
		pd.setPrice(1380000);
		
		System.out.println(pd.information());
		
		pd.setBrand("삼성");
		System.out.println(pd.information());
		
		
	}
}
