package com.kh.variable.run;

import com.kh.variable.A_Variable;// 1�ܰ� : ���� ����ϰ��� �ϴ� Ŭ������ ���
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.casting.Casting;

public class Run {
	
	public static void main(String[] args) {
		// A_Variable Ŭ������ calPay()�� ȣ��
		
		A_Variable a = new A_Variable(); // 2�ܰ�(����) : Ŭ������ ��ǥ�ϴ� �̸�
		
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
