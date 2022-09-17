package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If { // Ŭ�������� ����
	/*
	 * �ܵ� if��
	 * [ ǥ���� ]
	 * if(���ǽ�) {
	 * 			���ǽ��� true�� ��� ������ �ڵ�
	 * }
	 * 
	 * 
	 * => ���ǽ��� ����� true�� ��� : {}(�߰�ȣ) ���� �ڵ���� ���� ��
	 * => ���ǽ��� ����� false�� ��� : {}(�߰�ȣ) ���� �ڵ���� �ǳ� ��
	 */
	
	// ���׿��� �ǽ�����
	public void method1() { // �޼ҵ� 1 ���� ����
		// ������ �Է¹ް� ��� / 0 / ���� ���
		
		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		// 1. sout => ctrl + space, 2. syso => ctrl + space, 3 sysout => ctrl + space
		System.out.println("������ �Է��� �ּ��� > ");
		int num = sc.nextInt();
		
		// ���࿡ ����ڰ� �Է��� ���� 0���� ũ�� == ����̸� ? true
		if(num > 0) { // ������ 1 ���� ����
			System.out.println("����Դϴ�.");
		} // ������ 2 ���� ��
				
		// ���࿡ ����ڰ� �Է��� ���� 0�̸�
		if(num == 0) {System.out.println("0�̴�.");}
		
		// ���࿡ ����ڰ� �Է��� ���� 0���� ������
		if(num < 0) System.out.println("�����Դϴ�.");
	} // �޼ҵ� 1���� ��
	
	
	
	
	public void method2() { // �޼ҵ� 2���� ����
		
		// if���� ����ؼ� Ȧ�� ¦�� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է� : ");
		int num = sc.nextInt();
		
		
		// ����� ��츸 ���ǹ��� �����Ͻÿ�
		// &&
		
		
		// ���࿡		����ڰ� �Է��� ���� 		2�� ������ �� �������� 			  0
		// if		    num					% 2						== 0
		// �̸鼭
		// &&
		// ����ڰ� �Է��� ���� 		0���� ũ�ٸ�
		//		num					> 0
		//if((num % 2 == 0) && (num > 0)) {System.out.println("¦�����  ? ");}
		
		// ���࿡		����ڰ� �Է��� ���� 		2�� ������ �� �������� 			1
		// if		    num					% 2						== 1
		// �̸鼭
		// &&
		// ������� �Է��� ���� 		0���� ũ�ٸ�
		//		num					> 0
		//if(num % 2 == 1 && num > 0) {System.out.println("Ȧ�����  ? ");}
		
		// ��ø if��
		// ����� ����
		if(num > 0) { // �ܺ� if�� ���� ����
			if(num % 2 == 0) {System.out.println("¦�����  ? ");}
			if(num % 2 == 1) {System.out.println("Ȧ�����  ? ");}
		} // �ܺ� if�� ���� ��
		
		System.out.println("������������");
	} // �޼ҵ� 2 ���� ��
	
	
	// �ֹι�ȣ üũ
	// �ֹι�ȣ�� �Է¹޾Ƽ� ����(1,3) / ����(2,4)
	public void method3() {
		
		// ����ڷκ��� �ֹι�ȣ �Է¹ޱ� XXXXXX-1(2)XXXXXX
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ�� �Է����ּ��� (-����) : ");
		String personId = sc.nextLine();
		
		// "������ �ִ� ���ڵ��� ����"
		// "a b c d e f g " => ���ڿ�
		// 0 1 2 3 4 5 6
		// ������ index��� �� *index�� 0������ ����
		
		//	1 2 3 4 5 6 - 8 9 3 4 5 6 7
		// 0 1 2 3 4 5 6 7 8 9 ..
		
		// �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� '����'�� ����
		// charAt(7) => �ֹι�ȣ�� 8��°�� �ִ� 7�� �ε����� �����ϰڴ�.
		char gender = personId.charAt(7);
		
		// 1 == '1' ??
		// 3 == '3' ??
		
		// ���࿡ ����ڰ� �Է��� �ֹε�Ϲ�ȣ���� 8��° ���ڰ� 			1 �Ǵ� 3�̸�
		//	if							gender			== 1	||	== 3
		if(gender == '1' || gender == '3') {
			System.out.println("�����Դϴ�.");
		}
		
		// ���࿡ ����ڰ� �Է��� �ֹε�Ϲ�ȣ���� 8��° ���ڰ�			2�Ǵ� 4�̸�
		//  if							gender			== 2	||	== 4
		if(gender == '2' || gender == '4') {
			System.out.println("�����Դϴ�.");
		}
		
		// ���࿡ ����ڰ� �Է��� ���ڰ� 1�� �ƴϰ� 2�� �ƴϰ� 3�� �ƴϰ� 4�� �ƴϸ�
		// if		gender		!= '1'     != '2'    != '3'      != '4'
		if(gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.println("�߸��� �ֹι�ȣ�� �Է��ϼ̽��ϴ�.");
		}
		
		if(gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.println("�߸��� �ֹι�ȣ�� �Է��ϼ̽��ϴ�.");
			// �긦 �ٱ����� ��� ��������????
			
			
			if(gender == '1' || gender == '3') {
				System.out.println("�����Դϴ�.");
			}
			if(gender == '2' || gender == '4') {
				System.out.println("�����Դϴ�.");
			}
			
		}
		
		
		
		
	} // �޼ҵ念�� ��
	
	
	
} // Ŭ���� ���� ��
