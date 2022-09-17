package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

/*
 * 인터페이스
 * [ 표현법 ]
 * 접근제한자 interface 인터페이스이름{
 * 
 * 		상수필드
 * 
 * 		추상메소드
 * 
 * }
 * 
 * - 상수필드와 추상메소드만으로 이루어진 추상 클래스의 변형체
 * - 인터페이스에서 필드는 "무조건" 상수필드
 * - 인터페이스에서 메소드는 "무조건" 추상메소드
 * 
 * - 인터페이스는 다중상속을 허용한다.
 * => 메소드가 겹치더라도 최종 구현 부분은 실제 구현 클래스에서 기술하기 때문
 * 
 * - "무조건" 구현해야 하는게 있을 때 인터페이스 틀만 만들어두고 상속하게 => 오버라이딩!!
 * 
 * 추상클래스보다 좀 더 강한 규칙성, 강제성을 가진다.
 * 
 * 추상클래스와 인터페이스
 * 
 * 1. 공통점
 * - 객체 생성은 안되나, 참조변수로 사용이 가능하다(다형성을 적용할 수 있다)
 * - 상속하는 클래스에서 추상메소드를 오버라이딩하도록 강제한다.
 * 
 * 2. 차이점
 * - 추상클래스 : 클래스 멤버로, 일반필드, 일반메소드 생성이 가능하고
 * 				추상메소드가 포함되어있거나 abstract키워드를 통해 정의됨
 * - 인터페이스 : 모든 필드는 상수 필드, 모든 메소드가 추상메소드로 정의해야함.
 * 
 * => 존재하는 목적이 다름
 * 		추상클래스 추상클래스를 상속받아서 기능을 이용하고 클래스를 확장하기 위한 용도
 * 
 * 인터페이스는 클래스의 기능(메소드) 구현을 강제하기 위해서 사용!!!
 * 
 * 
 * extends와 implements 
 * 
 * - 클래스간의 상속 관계 : 자식클래스 extends 부모클래스
 * - 클래스와 인터페이스 구현 관계 : 클래스 implements 인터페이스
 * - 인터페이스 간의 상속 관계 : 자식인터페이스 extends 부모인터페이스1, 부모인터페이스2
 * 
 */

public interface Basic {
	
	
	// 인터페이스에서는 무조건 상수필드와 추상메소드밖에 정의가 불가하므로
	// 접근제한자, 예약어 생략 가능
	
	/*public static final */int NUM = 10;
	
	// 추상메소드
	/*public abstract*/ void eat();
	void sleep();
	
	// => 인터페이스의 모든 필드들은 암묵적으로 public, static final이다.
	// => 인터페이스의 모든 메소드들은 암묵적으로 public abstract 이다.

}
