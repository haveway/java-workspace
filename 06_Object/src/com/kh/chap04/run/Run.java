package com.kh.chap04.run;

import com.kh.chap04.model.vo.FieldTest1;
import com.kh.chap04.model.vo.FieldTest3;

public class Run {
	
	public static void main(String[] args) {
		
		
		//------------------- 1. FieldTest1 -------------------
		FieldTest1 f1 = new FieldTest1(); 
		// ��ü ���� ��(new Ű���� ����!) global ������� �Ҵ�!
		
		f1.test(10); // test �޼ҵ� ȣ�� ��!!, num, local�������� �Ҵ�!
				//test ȣ�� ���� �� num, local �������� �Ҹ�!
		
		System.out.println(f1);
		f1 = null; // global ������� �Ҹ�
		System.out.println(f1);
		
		
		//------------------- 3. FieldTest3 -------------------
		//FieldTest3 f3 = new FieldTest3();
		
		System.out.println(FieldTest3.sta); // public static String sta
		System.out.println(FieldTest3.NUM); // public static final int NUM
		// new FieldTest3();
		
		System.out.println(Math.PI);
		
	}

}
