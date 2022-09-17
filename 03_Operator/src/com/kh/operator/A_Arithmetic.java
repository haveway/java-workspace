package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	/*
	 * 산술 연산자 => 이항연산자 연산 방법, 우선순이가 일반 수학 산술과 동일
	 */
	
	// + : 덧셈
	// - : 뺄셈
	// * : 곱셈
	// / : 나눗셈
	// % : 모듈러(Modular) => 나눗셈에서의 나머지를 구함
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num 1 : " + num1 + "\nnum 2 : " + num2);
		
		System.out.println("num1 + num2 : " + (num1 + num2)); // 결과값은?
		// (num1 + num2) 괄호로 묶어줘야 13이라는 결과값이 나옴!
		// 만약에 묶지않고 출력하면 String(문자열)로 인식을 하기 때문에 "10" + "3"결과값 103이 찍힘!
		
		// ctrl + +,- : 화면 확대, 축소
		
		System.out.println("num1 - num2 : " + (num1 - num2));
		// 뺄셈의 경우 괄호로 묶지않으면
		// 문자열과 num1을 하나로 묶어서 새로운 문자열을 만들기 때문에 오류 발생!
		
		System.out.println("num1 x num2 : " + (num1 * num2));
		System.out.println("num1 ÷ num2 : " + (num1 / num2));
		System.out.println("num1 % num2 : " + (num1 % num2));
		
		// *, /, % 우선순위가 +, -보다 높기 때문에 묶지않아도 먼저 연산이 됨
		// 단, 가독성을 위해 괄호를 사용할것을 권장
		
		// 특이케이스!!
		// System.out.println(5/0);
		// 정수를 0으로 나눌 순 없다!
		// ArithmeticException : /by zero 
	}
	
	// 사탕 나눠주기 프로그램
	
	// 메소드명 : methodCandy()
	// 입력받을 값 : 1. 인원 수
	//			 2. 사탕 갯수
	
	// 1인당 가질 수 있는 사탕의 갯수 : 사탕 갯수 / 인원 수
	// 남은 사탕의 갯수 : 사탕갯수 % 인원 수
	
	// 출력 형식
	// 1인당 가질 수 있는 사탕의 갯수 : X 개
	// 남는 사탕의 갯수 : X 개
	
	public void methodCandy() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수는 몇 명인가요? > ");
		int person = sc.nextInt();
		
		System.out.println("사탕은 몇 개 인가요? > ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 가질 수 있는 사탕의 갯수 : " + (candy / person));
		System.out.println("남는 사탕의 갯수 : " + (candy % person));
	}
	
	
}

