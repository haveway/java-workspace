package com.kh.chap02.loop;

public class C_DoWhile {
	
	/*
	 * do-while문
	 * 별도의 조건검사 없이 무조건 1회는 실행!
	 * 조건이 맞지 않더라도 한번은 수행
	 * while(false)
	 * 
	 * [ 표현법 ]
	 * 초기식; // 필수는 아님
	 * do {
	 * 		System.out.println("한번은 해봐 ~ ");
	 * 		증감식; // 필수는 아님
	 * } while(조건식);
	 * 
	 * while문은 처음 수행할 때도 조건식 검사 후 true여야 실행
	 * do-while은 첫 실행은 별도의 조건검사 없이 무조건 한 번 실행!!
	 */
	
	public void method1() {
		
		// 애초에 조건이 맞지 않아도 한번은 실행!!!
		int num = 1; // 초기식
		
		do {
			System.out.println("무조건 한 번은 해봐~~");
		}while(num == 0);
		
	}
	
	public void method2() {
		
		int i = 1;
		
		do {
			System.out.println(i++ + " ");
		}while(i <= 5);
		
	}

}
