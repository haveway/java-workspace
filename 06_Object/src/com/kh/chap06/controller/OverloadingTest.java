package com.kh.chap06.controller;

public class OverloadingTest {
	
	/*
	 * 메소드 오버로딩
	 * 
	 * - 한 클래스 안에 같은 메소드명으로 여러 메소드들을 정의할 수 있는 방법!!
	 * - 매개변수의 자료형의 갯수, 순서, 종류가 다 다르게 작성되어야한다.
	 * - 단, 매개변수명, 접근제한자, 반환형은 메소드 오버로딩에 영향을 주지 않는다.
	 * 
	 */
	
	// 메소드이름은 test로 통일
	public void test() {
		System.out.println("안녕하세요~~~~");
		System.out.println("오늘 수업 12분 남았습니다~~~");
	}
	public void test(int a) {
		System.out.println("이건 인트 a 하나만 받았어요 ~");
	}
	public void test(int a, String s) {
		System.out.println("이건 인트 a 먼저 스트링 s 두 번째로 받았어요 ~");
	}
	public void test(String s, int a) {
		System.out.println("이건 스트링 s 먼저 인트 a 두 번째로 받았어요 ~");
	}
	public void test(int a, int b) {
		System.out.println("이건 인트 a 인트 b 받았어요  ~");
	}
	
	/*
	 * 정수형 두개를 받는 test를 하나 더 만든다면??
	 * 매개변수의 이름이랑은 상관없이 자료형의 갯수 순서가 같기 때문에 에러가 발생함!!!!
	 * - 즉! 매개변수 자료형의 갯수와 순서가 항상 다르게 작성되어야만 한다.
	public void test(int c, int d) {
		
	}
	*/
	public void test(int a, int b, String s) {
		System.out.println("int a int b String s");
	}
	
	// 반환형이 다르다고 오버로딩이 적용되지 않는다.
	// 메소드를 호출하는 시점에서 매개변수가 동일하면 무조건 에러가 발생
	// 반환형과 상관없이 매개변수의 자료형의 갯수와 순서가 다르게 작성되어야한다.
	/*
	public int test(int a, int b, String s) {
		
	}
	*/
	
	/*
	 * 접근제한자가 다르다고 오버로딩이 적용되지 않음.
	 * 접근제한자와는 상관없이 매개변수의 자료형의 갯수와 순서는 다르게 작성되어야한다.
	private void test(int a, int b, String s) {
		
	}
	*/
	

}
