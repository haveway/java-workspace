package com.kh.operator;

public class D_LogicalNegation {
	
	/*
	 * �� ���� ������ : ����(true, false)�� �ݴ�� �ٲ��ִ� ������
	 * 
	 * [ǥ����] !����
	 * 
	 */
	
	public void method1() {
		System.out.println("true�� ����" + !true); //false
		System.out.println("flase�� ����" + !false); // true
		
		boolean b1 = true;
		boolean b2 = !b1;
		
		System.out.println("b1 : " + !!b1); // 
		System.out.println("b2 : " + b2); //
	}
}
