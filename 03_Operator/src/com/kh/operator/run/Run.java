package com.kh.operator.run;

import com.kh.operator.A_Arithmetic; // 1단계;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Compound;
import com.kh.operator.E_Comparison;
import com.kh.operator.F_Logical;
import com.kh.operator.G_Triple;

public class Run {
	public static void main(String[] args) {
		
		A_Arithmetic a = new A_Arithmetic(); // 2단계
		
		//a.method1();
		//a.methodCandy();
		
		B_InDecrease b = new B_InDecrease();
		
//		b.method2();
//		b.method4();
		
		C_Compound c = new C_Compound();
//		c.method1();
		
		E_Comparison e = new E_Comparison();
//		e.method1();
		
		F_Logical f = new F_Logical();
//		f.method1();
//		f.method2();
//		f.method3();
		
		G_Triple g = new G_Triple();
		
//		g.method1();
//		g.method2();
//		g.method3();
		
	}
}
