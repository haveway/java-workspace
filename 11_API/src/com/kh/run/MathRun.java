package com.kh.run;

//import java.lang.*;
// 생략이 가능 보이지는 않지만 항상 import가 되어있다.
// 자바 프로그래밍하면서 필수적인 클래스들을 모아둔 패키지

public class MathRun {
	public static void main(String[] args) {
		
		// Math 클래스(수학과 관련)
		// Math클래스에서 제공하는 유용한 기능들을 살펴보자!!!!
		
		/*
		 * Math 클래스의 특징
		 * - java.lang이라는 패키지안에 존재한다.
		 * - 모든 필드와 메소드가 다 static으로 되어있다.
		 * - 객체를 생성할 필요가 없으므로 생성자가 private이다.
		 */
		
		// 필드
		// 파이 => Math클래스 내에 상수필드로 정의되어있음
		//Math mt = new Math();
		System.out.println("파이 : " + Math.PI);
		
		// 메소드
		// 메소드명(매개변수 타입) : 반환형
		// 1. 올림 => Math.ceil(double) : double
		double num1 = 4.24242;
		System.out.println("올림 : " + Math.ceil(num1));
		
		// 2. 반올림 => Math.round(double) : long
		System.out.println("반올림 : " + Math.round(num1));
		
		// 3. 버림 => Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num1));
		
		// 4. 절대값 => Math.abs(int/double/long/float)
		// : int/double/long/float 그대로
		int num2 = -13;
		System.out.println("절대값 : " + Math.abs(num2));
		
		// 5. 최소값 => Math.min(int, int) : int
		System.out.println("최소값 : " + Math.min(5, 10));
		
		// 6. 최대값 => Math.max(int, int) : int
		System.out.println("최대값 : " + Math.max(5, 10));
		
		// 7. 제곱근(루트) => Math.sqrt(double) : double
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 8. 제곱 => Math.pow(double, double) : double
		System.out.println("2의 5제곱 : " + Math.pow(2, 5));
		
		
		/*
		 * 모든게 다 static이기 때문에 객체 생성할 필요가 없음
		 * => 싱글톤 패턴
		 * 		(프로그램 실행과 동시에 메모리영역에 올려놓고 재사용하는 개념)
		 * (객체 하나만으로 어디에서든지 가져다 쓸 수 있는 개념 == 공유)
		 * 싱글톤패턴 개념은 JDBC
		 */
		
	}
}
