package com.kh.second.run;

import com.kh.second.MethodTest;// import �� : �ش� ��Ű���� �ִ� Ŭ������ ������ ���ڴ�.

public class Run {
	
	public static void main(String[] args) {
		
		//methodA();
		
		/*
		 * �ٸ� Ŭ������ �ִ� �޼ҵ���� ȣ���� ����?
		 * 1. ȣ���� �޼ҵ尡 �����ϴ� Ŭ������ ����(new)�� ����� ��!
		 * [ǥ����]
		 * "Ŭ�����̸�" "�� Ŭ������ �뺯���̸�(����)" = new Ŭ�����̸�();
		 * 
		 * ���߿� ��ü�ð��� �̷������� ��� �ٷﺼ ��!
		 */
		
		MethodTest mt = new MethodTest();
		
		// . ����������
		mt.methodA();
		mt.methodB();
		mt.methodC();
		
	}

}
