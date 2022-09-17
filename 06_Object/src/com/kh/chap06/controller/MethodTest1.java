package com.kh.chap06.controller;

import java.util.Scanner;

public class MethodTest1 {
	/*
	 * 메소드(Method) : 입력을 가지고 어떤일을 수행한 다음에 결과물을 내놓는다!!!!!
	 * 
	 * [ 표현법 ]
	 * 접근제한자 예약어(생략가능) 반환형 메소드식별자(매개변수의자료형 매개변수식별자){
	 * 			수행할 코드;
	 * 
	 * 			return 반환값;
	 * }
	 * 생략 가능한 것 : 예약어, 매개변수, return문 부분(반환형이 void일 경우!)
	 * 반환형 : 반환할 값의 자료형
	 * 호출할 때 인자값 => 매개변수의 자료형과 갯수가 일치해야함 반드시!!!
	 * 
	 * 한 번 정의해두고 필요할때마다 호출 사용 언제든!!!
	 */
	
	// 1. 매개변수가 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수랑 반환값이 둘 다 없는 메소드입니다.");
		
		int sum = 0;
		for(int i = 1; i<= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		// return;
		// void일 경우 return이 생략 JVM이 자동으로 만들어줌!
	}
	
	
	// 2. 매개변수는 없고 반환값은 있는 메소드
	public int method2() {
		System.out.println("매개변수는 없고 반환값은 있는 메소드입니다.");
		// 1에서부터 100까지의 랜덤값을 발생시켜 돌려주고싶다.
		return (int)(Math.random() * 100) + 1;
	}
	
	// 3. 매개변수는 있고 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수는 있고 반환값은 없는 메소드입니다.");
		
		int min = 0;
		int max = 0;
		
		if(num1 < num2) {
			max = num2;
			min = num1;
		}else {
			max = num1;
			min = num2;
		}
		
		System.out.println("최소값 : " + min + ", 최대값 : " + max);
	}
	
	//4. 매개변수도 있고 반환값도 있는 메소드
	public int method4(int a, int b) {
		System.out.println("매개변수도 있고 반환값도 있따.");
		

		return a+b;
	}
	
	/*
	 * 반환형이 없는 메소드 : 출력문을 작성하는 편 
	 * 반환형이 있는 메소드 : 호출하는 부분에서 출력문을 작성
	 */
	
	
	
	

}