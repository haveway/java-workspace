package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * 삼항연산자 : 피 연산자가 3개 => 값 3개와 연산자 1개로 이루어짐(조건식형식으로 쓰임)
	 * 
	 * 조건식 : 결과값에 따라서 연산을 처리하는 방식
	 * 		  결과값이 참일 경우 식 1을 처리하고
	 *  		결과값이 거짓일 경우 식 2를 처리.
	 * 
	 * [ 표현식 ]
	 * 조건식 ? 조건이 true일 경우 결과값 : 조건이 false일 경우 결과값
	 */
	
	public void method1() {
		// 사용자가 입력한 값이 양수인지 아닌지 판별 후 그에 맞는 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
//		String result = (num > 0) ?            "양수다!" : "양수가 아니다!";
		
		String result = (num > 0) ? "양수다!" : ((num == 0) ? "0이다!" : "양수가 아니다!");
		//                   조건식 ? 조건이 true일 경우 결과값 : 조건이 false일 경우 결과값
		
		System.out.println(num + "은 " + result);
	}
	
	public void method2() {
		
		// 짝수, 홀수 판별
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수" : "홀수";
//		(num % 2 != 0) ? "홀수" : "짝수";
//		(num % 2 == 1)
		
		System.out.println(num + "은" + result);
		sc.close();
	}
	
	public void method3() { // 실습문제 **
		// 영문자 하나를 입력받아서 대문자인지 아닌지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영문자를 입력하세요 : ");
		
		char ch = sc.nextLine().charAt(0);
		
		 //'a' ~ ch ~ 'z'
		
		String result = ('a' <= ch && ch <= 'z') ? "대문자가 아닙니다." : "대문자 입니다";
		
		System.out.println(result);
		sc.close();
		
 
	}
	
	
	
	public void homework1() {
		
		// 3개 입력받아서 다 똑같으면 true 아니면 false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하나 : ");
		int one = sc.nextInt();
		
		System.out.println("둘 : ");
		int two = sc.nextInt();
		
		System.out.println("셋 : ");
		int three = sc.nextInt();
		
		String flag = (one == two) ? ((two == three) ? "true" : "false") : "false";
		
		System.out.println(flag);
		
		
	}
	
	public void homework2() {
		
		// 키보드로 정수를 입력받고 양수면서 짝수면 "짝수다" 출력하고
		// 짝수가 아니면 "홀수다"
		// 양수가 아니면 "양수내놔 !!" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 하나 내놓아라 : ");
		int num = sc.nextInt();
		
		String flag = (num < 0) ? "양수내놔!!!" : ((num % 2 == 0) ? "짝수" : "홀수");
		System.out.println(flag);
		
	}
	
	
	
	

}
