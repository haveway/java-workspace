package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/*
	 * 
	 * CheckedException
	 * 
	 * 문법적으로 반드시 예외처리를 해줘야하는 예외들!!!
	 * (즉, 예측 불가한 곳에서 발생하기 때문에 미리 예외처리 구문을 작성해야함!!!!)
	 * => 주로 외부매체와 어떤 입출력 시 발생!! 
	 * 
	 */
	
	public void method1() {
		
		try {
			method2();
		} catch(IOException e) {
			System.out.println("예외가 발생했어요!!");
		}
		
	}
	
	
	
	public void method2() throws IOException {
		
		System.out.println(" 아무 문자열이나 입력해주세요 ~ > ");
		
		/*
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		*/
		
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(단, 문자열로만 가능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		/*
		// 방법 1. try ~ catch : 내가 해결하겠다!!
		try {
			String str = br.readLine(); // 이 메소드를 호출 시 IOException이 발생할수도 있음
										// 미리 알려줌 빨간밑줄로
			System.out.println("문자열의 길이 : " + str.length());
		} catch(IOException e) {
			System.out.println("IO익셉션 발생!!");
		}
		*/
		
		// 방법 2. throws : 지금 여기서(method2)에서 말고 현재 이 메소드를 호출한곳(method1)에서 예외를 떠넘겨서(위임해서) 처리하게끔 하겠다.
		String str = br.readLine();
		System.out.println("문자열의 길이 : " + str.length());
	}
	
	

}
