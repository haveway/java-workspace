package com.kh.chap06.run;

import com.kh.chap06.controller.MethodTest1;
import com.kh.chap06.controller.OverloadingTest;

public class Run {
	
	public static void main(String[] args) {
		
		MethodTest1 mt1 = new MethodTest1();
		
		/*
		mt1.method1();
		int a = mt1.method2();
		System.out.println("랜덤값" + a);
		System.out.println("랜덤값" + mt1.method2());
		mt1.method3(10, 120);
		
		int b = mt1.method4(a, 50);
		System.out.println(b);
		*/
		
		//Math.random();
		//MethodTest2 mt2 = new MethodTest2();
		// static : 객체를 생성하지 않아도 호출 가능!!
		// [ 표현법 ] 클래스이름.메소드이름(); ex) Math.random()
		
		/*
		MethodTest2.method1();
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("이승철", 500);
		System.out.println(MethodTest2.method4("이승철", 500));
		*/
		
		OverloadingTest ot = new OverloadingTest();
		
		ot.test();
		ot.test(1);
		ot.test(1, "a");
		ot.test("a", 1);
		ot.test(1, 2);
		
		
	}

}
