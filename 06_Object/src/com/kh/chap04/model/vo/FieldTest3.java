package com.kh.chap04.model.vo;

// 클래스 변수(static 변수)와 상수 필드(static fianl)에 대해!
public class FieldTest3 {
	
	// 필드(field)
	// [ 표현법 ] 접근제한자 예약어(생략가능) 자료형 필드이름;
	
	public static String sta = "static 변수";
	
	// 생성시점 : 프로그램 실행과 동시에 메모리의 static 영역에 할당됨
	// 소멸시점 : 프로그램 종료시 소멸됨
	// => 객체를 생성하지않고 할당됨!!!
	
	// static "공유"의 개념이 강함!!!!
	// 프로그램 실행과 동시에 메모리영역에 공간을 만들어두고 그 안게 값을 공유해서 쓰자!!!
	
	/*
	 * 상수 필드
	 * 
	 * [ 표현법 ]
	 * public static final 자료형 상수필드이름 = 값;
	 * => 한 번 지정된 값을 고정해서 쓰겠다. 그래서 무조건 초기화 해줘야됨!!!!!!!!!!!
	 * => 예약어 순서는 상관없음 public final static으로 써도됨!!
	 * 
	 * static : 공유의 개념(재사용성)
	 * final : 한 번 지정해놓고 변경하지 않겠다(상수 선언)
	 * 
	 * 값이 변경되어서는 안되는 고정적인 값을 메모리상(static)에 올려놓고
	 * (프로그램 시작과 동시에 메모리 영역에 할당, 값이 변하지도 않음)
	 * 공유할 목적으로 사용
	 * 
	 * 상수필드 이름도 반드시 항상 모두 대문자여야한다!!!
	 * 
	 */
	
	public static final int NUM = 10;
	
	
	/*
	 * 
	 * Math클래스 random() 호출 시 객체 생성했어요??????
	 * 이유는 ??? random() static메소드였기 때문에!
	 * 
	 * Math클래스의 PI상수 필드도 제공
	 * 
	 */
	

}
