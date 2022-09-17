package com.kh.chap04.run;

import com.kh.chap04.model.vo.FieldTest1;
import com.kh.chap04.model.vo.FieldTest3;

public class Run {
	
	public static void main(String[] args) {
		
		
		//------------------- 1. FieldTest1 -------------------
		FieldTest1 f1 = new FieldTest1(); 
		// 객체 생성 시(new 키워드 사용시!) global 멤버변수 할당!
		
		f1.test(10); // test 메소드 호출 시!!, num, local지역변수 할당!
				//test 호출 종료 시 num, local 지역변수 소멸!
		
		System.out.println(f1);
		f1 = null; // global 멤버변수 소멸
		System.out.println(f1);
		
		
		//------------------- 3. FieldTest3 -------------------
		//FieldTest3 f3 = new FieldTest3();
		
		System.out.println(FieldTest3.sta); // public static String sta
		System.out.println(FieldTest3.NUM); // public static final int NUM
		// new FieldTest3();
		
		System.out.println(Math.PI);
		
	}

}
