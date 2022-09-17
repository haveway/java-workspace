package com.kh.run;

//import java.lang.*;
// ������ ���� �������� ������ �׻� import�� �Ǿ��ִ�.
// �ڹ� ���α׷����ϸ鼭 �ʼ����� Ŭ�������� ��Ƶ� ��Ű��

public class MathRun {
	public static void main(String[] args) {
		
		// Math Ŭ����(���а� ����)
		// MathŬ�������� �����ϴ� ������ ��ɵ��� ���캸��!!!!
		
		/*
		 * Math Ŭ������ Ư¡
		 * - java.lang�̶�� ��Ű���ȿ� �����Ѵ�.
		 * - ��� �ʵ�� �޼ҵ尡 �� static���� �Ǿ��ִ�.
		 * - ��ü�� ������ �ʿ䰡 �����Ƿ� �����ڰ� private�̴�.
		 */
		
		// �ʵ�
		// ���� => MathŬ���� ���� ����ʵ�� ���ǵǾ�����
		//Math mt = new Math();
		System.out.println("���� : " + Math.PI);
		
		// �޼ҵ�
		// �޼ҵ��(�Ű����� Ÿ��) : ��ȯ��
		// 1. �ø� => Math.ceil(double) : double
		double num1 = 4.24242;
		System.out.println("�ø� : " + Math.ceil(num1));
		
		// 2. �ݿø� => Math.round(double) : long
		System.out.println("�ݿø� : " + Math.round(num1));
		
		// 3. ���� => Math.floor(double) : double
		System.out.println("���� : " + Math.floor(num1));
		
		// 4. ���밪 => Math.abs(int/double/long/float)
		// : int/double/long/float �״��
		int num2 = -13;
		System.out.println("���밪 : " + Math.abs(num2));
		
		// 5. �ּҰ� => Math.min(int, int) : int
		System.out.println("�ּҰ� : " + Math.min(5, 10));
		
		// 6. �ִ밪 => Math.max(int, int) : int
		System.out.println("�ִ밪 : " + Math.max(5, 10));
		
		// 7. ������(��Ʈ) => Math.sqrt(double) : double
		System.out.println("4�� ������ : " + Math.sqrt(4));
		
		// 8. ���� => Math.pow(double, double) : double
		System.out.println("2�� 5���� : " + Math.pow(2, 5));
		
		
		/*
		 * ���� �� static�̱� ������ ��ü ������ �ʿ䰡 ����
		 * => �̱��� ����
		 * 		(���α׷� ����� ���ÿ� �޸𸮿����� �÷����� �����ϴ� ����)
		 * (��ü �ϳ������� ��𿡼����� ������ �� �� �ִ� ���� == ����)
		 * �̱������� ������ JDBC
		 */
		
	}
}
