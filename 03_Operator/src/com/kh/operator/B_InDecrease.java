package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * ���������� : ���׿����ڷμ� �ѹ��� 1�� ����(���ϰų�)�ϰų� ����(���ų�) �ϴ� ������ �Ѵ�.
	 * => ���� ������ �Ұ���, ���߿� ������ �Ұ��� �������� ��ġ�� ���� �޶�����.
	 * 
	 * [ ǥ���� ]
	 * ++ : ���� 1���� ������Ű�� ������
	 * -- : ���� 1���� ���ҽ�Ű�� ������
	 * 
	 * �������� ��ġ
	 * �������� : ++��, --�� => ���� ���� �����ϰ� �� ���� ó��
	 * �������� : ��++, ��-- => ���� ���� ó���ϰ� ���� �����ϰų� �����ϰڴ�. 
	 * 
	 */
	
	//��������
	public void method1() {
		int num = 10;
		System.out.println("num : " + num); // 10
		
		num++; // num �̶�� �̸��� ���� ������ �����ٰ� 1�� ������Ű�ڴ�.
			   // num + 1
		
		System.out.println("��ó���� num : " + num); // 11
		
		num--;
		System.out.println("num : " + num); // 10
		
		System.out.println("num : " + num++); // 10 
		System.out.println("num : " + num); // 11
	}
	
	public void method2() {
		int a = 10;
		int b = a++;
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 10
		// b��� ������ a���� ���� �����ϰ� (�� ó�� �κ�)
		// a��� ���� ���� ��Ų�� (�� ����)
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : " + c); // 19
		System.out.println("d : " + d); // 20
	}
	// ���� ����
	public void method3() {
		int a = 10;
		int b = ++a; // b���� 11(������)�� ��(��ó��)
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 11
		
		System.out.println("a : " + --a); // 10
	}
	public void method4() {
		// ����������
		int num1 = 20;
		int result = num1++*3;
		
		System.out.println("num1 : " + num1);     // 20 21 23 61 63
		System.out.println("result : " + result); // 63 60 20 60 20
		
		// ����������
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + result2);
	}
}

