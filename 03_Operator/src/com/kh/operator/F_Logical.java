package com.kh.operator;

import java.util.Scanner; // 1단계

public class F_Logical {
	
	/*
	 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
	 * [표현법]
	 * 논리값 논리연산자 논리값 => 결과값도 논리값
	 * 
	 * 종류
	 * 
	 * 1. AND 연산자 : 논리값 && 논리값
	 * 				좌항과 우항의 값이 모두 true여야만 최종 결과가 true
	 * 2. OR 연산자 : 논리값 || 논리값
	 * 				좌항 또는 우항의 값중 하나로 true 이면 최종 결과가 true
	 * 
	 */
	
	// AND
	public void method1() {
		// 사용자가 입력한 정수값이 양수 "이면서(이고)" 짝수인지 확인해보자
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해 주세요 :");
		int num = sc.nextInt();
		
		boolean result = (num > 0) && (num % 2 == 0);
		// &&의 의미 : ~~ 이면서, ~~이고, 그리고
		
		System.out.println("사용자가 입력한 정수가 양수이면서 짝수 입니까? : " + result);
	}
	
	public void method2() {
		// 입력한 정수값이 1이상 100이하인지 확인해보자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요 ~ :");
		int num = sc.nextInt();
		
		// 1 <= num <= 100
		// num이 1보다 크거나 같고 "그리고" 100보다 작거나 같습니까?
		
		boolean result = (1 <= num) && (num <= 100);
		
		System.out.println("정수가 1 이상 100 이하 입니까? : " + result);
		
		sc.close();
	}
	
	// OR
	public void method3() {
		
		// 사용자가 입력한 값이 A 또는 a인지 확인해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("한글자만 입력해주세요 : ");
		char ch = sc.next().charAt(1);
		
		// index : 순서 **0부터시작
		
		// 비교연산자의 경우 피연산자 == 숫자
		// 문자의 경우 비교연산이 가능한가 ? 가능하다!!! => 왜 ?? int로 자동형변환이 되기 때문에(int)
		boolean result = (ch == 'A') || (ch == 'a');
		// || : ~~이거나, 또는
		
		System.out.println("사용자가 입력한 알파벳이 A또는 a입니까 ? :" + result);
	}
	
	/*
	 * 
	 * && : 두개의 조건이 모두 true일 때 결과가 true
	 * 
	 * true && true => true
	 * true && false => false
	 * false && true => false
	 * false && false => false
	 * 
	 * || : 두개의 조건 중 하나로 true이면 결과가 true
	 * 
	 * true || true => true
	 * true || false => true
	 * false || true => true
	 * false || false => false
	 * 
	 */
	
	public void method4() {
		
		int num = 10;
		
		boolean result = false && (num > 0);
		
		// Deadcode : 뒤의 비교연산 구문이 실행되지 않음
		// 실행오류는 나지 않지만 굳이 결과값은 false일텐데 왜 쓰지??
		
		System.out.println("result : " + result);
		
		
		
	}
}
