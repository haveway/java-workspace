package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * ���׿����� : �� �����ڰ� 3�� => �� 3���� ������ 1���� �̷����(���ǽ��������� ����)
	 * 
	 * ���ǽ� : ������� ���� ������ ó���ϴ� ���
	 * 		  ������� ���� ��� �� 1�� ó���ϰ�
	 *  		������� ������ ��� �� 2�� ó��.
	 * 
	 * [ ǥ���� ]
	 * ���ǽ� ? ������ true�� ��� ����� : ������ false�� ��� �����
	 */
	
	public void method1() {
		// ����ڰ� �Է��� ���� ������� �ƴ��� �Ǻ� �� �׿� �´� ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
//		String result = (num > 0) ?            "�����!" : "����� �ƴϴ�!";
		
		String result = (num > 0) ? "�����!" : ((num == 0) ? "0�̴�!" : "����� �ƴϴ�!");
		//                   ���ǽ� ? ������ true�� ��� ����� : ������ false�� ��� �����
		
		System.out.println(num + "�� " + result);
	}
	
	public void method2() {
		
		// ¦��, Ȧ�� �Ǻ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� > ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "¦��" : "Ȧ��";
//		(num % 2 != 0) ? "Ȧ��" : "¦��";
//		(num % 2 == 1)
		
		System.out.println(num + "��" + result);
		sc.close();
	}
	
	public void method3() { // �ǽ����� **
		// ������ �ϳ��� �Է¹޾Ƽ� �빮������ �ƴ��� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ڸ� �Է��ϼ��� : ");
		
		char ch = sc.nextLine().charAt(0);
		
		 //'a' ~ ch ~ 'z'
		
		String result = ('a' <= ch && ch <= 'z') ? "�빮�ڰ� �ƴմϴ�." : "�빮�� �Դϴ�";
		
		System.out.println(result);
		sc.close();
		
 
	}
	
	
	
	public void homework1() {
		
		// 3�� �Է¹޾Ƽ� �� �Ȱ����� true �ƴϸ� false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϳ� : ");
		int one = sc.nextInt();
		
		System.out.println("�� : ");
		int two = sc.nextInt();
		
		System.out.println("�� : ");
		int three = sc.nextInt();
		
		String flag = (one == two) ? ((two == three) ? "true" : "false") : "false";
		
		System.out.println(flag);
		
		
	}
	
	public void homework2() {
		
		// Ű����� ������ �Է¹ް� ����鼭 ¦���� "¦����" ����ϰ�
		// ¦���� �ƴϸ� "Ȧ����"
		// ����� �ƴϸ� "������� !!" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �ϳ� �����ƶ� : ");
		int num = sc.nextInt();
		
		String flag = (num < 0) ? "�������!!!" : ((num % 2 == 0) ? "¦��" : "Ȧ��");
		System.out.println(flag);
		
	}
	
	
	
	

}
