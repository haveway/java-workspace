package com.kh.operator;

public class E_Comparison {
	
	/*
	 * �� ������ (���迬����)
	 * �ΰ��� ���� ������ ��, ���׿�����
	 * �񱳿����� �� ��� => ���� ��� true, ������ ��� false
	 * Ư�� ������ ������ �� �ִ� �����ǹ��ڿ��� ���� ����
	 */
	
	/*
	 * ����
	 * 1. ũ�� ������ ��
	 * a < b : a�� b���� �۽��ϱ�?
	 * a > b : a�� b���� Ů�ϱ�?
	 * a <= b : a�� b���� �۰ų� �����ϱ�?
	 * a >= b : a�� b���� ũ�ų� �����ϱ�?
	 * 
	 * 2. ��ġ���� �� : �����
	 * a == b : a�� b�� ��ġ�մϱ�?
	 * a != b : a�� b�� ��ġ���� �ʽ��ϱ�?
	 * 
	 * => �ǿ����ڴ� ����, ������� ����
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a < b : " + (a < b)); // 1. t
		
		System.out.println("a <= b : " + (a <= b)); // 2. t
		System.out.println("25 <= b : " + (25 <= b)); // 3. t
		
		boolean result1 = (a == b);
		System.out.println("result1 : " + result1); // 4. f
		
		boolean result2 = (a != b);
		System.out.println("result2 : " + result2); // 5. t
		
		System.out.println("a - b < 0 : " + (a - b < 0)); // 6. true

		System.out.println("a�� ¦���Դϱ� ? : " + (a % 2 == 0)); // true
		System.out.println("b�� ¦���� �ƴմϱ� ? : " + (b % 2 != 0)); // true
	}
}
