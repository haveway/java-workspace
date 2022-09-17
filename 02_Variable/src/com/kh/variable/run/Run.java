package com.kh.variable.run;

import com.kh.variable.A_Variable;// 1단계 : 내가 사용하고자 하는 클래스의 경로
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.casting.Casting;

public class Run {
	
	public static void main(String[] args) {
		// A_Variable 클래스의 calPay()를 호출
		
		A_Variable a = new A_Variable(); // 2단계(생성) : 클래스를 대표하는 이름
		
		//a.calPay();
		//a.declareVariable();
		//a.constant();
		
		B_KeyboardInput b = new B_KeyboardInput();
		
		//b.inputTest();
		
		Casting c = new Casting();
		
		//c.autoCasting();
		c.forceCasting();
		
		
		
	}

}
