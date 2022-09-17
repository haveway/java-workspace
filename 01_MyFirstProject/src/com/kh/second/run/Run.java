package com.kh.second.run;

import com.kh.second.MethodTest;// import 문 : 해당 패키지에 있는 클래스를 가져다 쓰겠다.

public class Run {
	
	public static void main(String[] args) {
		
		//methodA();
		
		/*
		 * 다른 클래스에 있는 메소드들을 호출할 때는?
		 * 1. 호출할 메소드가 존재하는 클래스를 생성(new)을 해줘야 함!
		 * [표현법]
		 * "클래스이름" "그 클래스를 대변할이름(별명)" = new 클래스이름();
		 * 
		 * 나중에 객체시간에 이론적으로 깊게 다뤄볼 것!
		 */
		
		MethodTest mt = new MethodTest();
		
		// . 참조연산자
		mt.methodA();
		mt.methodB();
		mt.methodC();
		
	}

}
