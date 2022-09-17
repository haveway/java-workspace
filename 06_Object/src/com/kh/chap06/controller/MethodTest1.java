package com.kh.chap06.controller;

import java.util.Scanner;

public class MethodTest1 {
	/*
	 * �޼ҵ�(Method) : �Է��� ������ ����� ������ ������ ������� �����´�!!!!!
	 * 
	 * [ ǥ���� ]
	 * ���������� �����(��������) ��ȯ�� �޼ҵ�ĺ���(�Ű��������ڷ��� �Ű������ĺ���){
	 * 			������ �ڵ�;
	 * 
	 * 			return ��ȯ��;
	 * }
	 * ���� ������ �� : �����, �Ű�����, return�� �κ�(��ȯ���� void�� ���!)
	 * ��ȯ�� : ��ȯ�� ���� �ڷ���
	 * ȣ���� �� ���ڰ� => �Ű������� �ڷ����� ������ ��ġ�ؾ��� �ݵ��!!!
	 * 
	 * �� �� �����صΰ� �ʿ��Ҷ����� ȣ�� ��� ������!!!
	 */
	
	// 1. �Ű������� ���� ��ȯ���� ���� �޼ҵ�
	public void method1() {
		System.out.println("�Ű������� ��ȯ���� �� �� ���� �޼ҵ��Դϴ�.");
		
		int sum = 0;
		for(int i = 1; i<= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		// return;
		// void�� ��� return�� ���� JVM�� �ڵ����� �������!
	}
	
	
	// 2. �Ű������� ���� ��ȯ���� �ִ� �޼ҵ�
	public int method2() {
		System.out.println("�Ű������� ���� ��ȯ���� �ִ� �޼ҵ��Դϴ�.");
		// 1�������� 100������ �������� �߻����� �����ְ�ʹ�.
		return (int)(Math.random() * 100) + 1;
	}
	
	// 3. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		System.out.println("�Ű������� �ְ� ��ȯ���� ���� �޼ҵ��Դϴ�.");
		
		int min = 0;
		int max = 0;
		
		if(num1 < num2) {
			max = num2;
			min = num1;
		}else {
			max = num1;
			min = num2;
		}
		
		System.out.println("�ּҰ� : " + min + ", �ִ밪 : " + max);
	}
	
	//4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
	public int method4(int a, int b) {
		System.out.println("�Ű������� �ְ� ��ȯ���� �ֵ�.");
		

		return a+b;
	}
	
	/*
	 * ��ȯ���� ���� �޼ҵ� : ��¹��� �ۼ��ϴ� �� 
	 * ��ȯ���� �ִ� �޼ҵ� : ȣ���ϴ� �κп��� ��¹��� �ۼ�
	 */
	
	
	
	

}