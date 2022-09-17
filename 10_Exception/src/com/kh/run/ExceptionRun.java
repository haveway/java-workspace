package com.kh.run;

import com.kh.controller.A_UncheckedException;
import com.kh.controller.B_CheckedException;

public class ExceptionRun {
	
	/*
	 *  에러(오류)의 종류
	 * 
	 * - 시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러
	 * 					=> 소스코드로 해결이 안됨(심각한)
	 * 
	 * 
	 * - 컴파일 에러 : 프로그램 실행 전 소스코드상의 문법적인 문제로 발생하는 에러
	 * 					=> 소스코드 수정으로 해결(빨간줄로 오류 알려줌)
	 * 
	 * - 런타임 에러 : 프로그램 실행 중 발생하는 에러
	 * 				소스코드상 문법적인 문제는 없는데 발생!!!!
	 * 				=> 개발자가 예측 가능한 경우 제대로 처리를 안해놓았을 경우
	 * 				=> 사용자의 잘못일 가능성도 있음
	 * 
	 * - 논리 에러 : 소스코드상 문법적인 문제도 없고,
	 * 			 실행했을 때도 굳이 문제가 발생하진 않지만
	 * 			 프로그램 의도상 맞지 않는 것 (기획과 설계가 잘못되었을 경우 발생)
	 * 
	 * 예외 : 시스템 에러를 제외한 나머지 컴파일, 런타임, 논리에러와 같이 비교적 덜 심각한 에러들
	 * 		특히 런타임에러를 주로 예외로 다룬다!!!!
	 * 
	 * 예외처리 : 예외들이 발생했을 경우에 대비해서 처리하는 방법을 정의해두는 것
	 * 
	 * 방법
	 * 
	 * 1. try ~ catch문을 이용
	 * 2. throws를 이용(떠넘기기)
	 * 
	 */
	
	public static void main(String[] args) {
		
		A_UncheckedException a = new A_UncheckedException();
		
		//a.method1();
		//a.method2();
		//a.method3();
		
		B_CheckedException b = new B_CheckedException();
		
		b.method2();
		
		
	}

}
