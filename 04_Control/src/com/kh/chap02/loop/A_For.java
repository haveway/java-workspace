package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * for��
	 * for() {
	 * 
	 * }
	 * ��ȣ �ȿ� �ݺ��� �����ϴ� �κ��� �ְ�,
	 * �ʱ��; ���ǽ�; ������ �������� �̷������.
	 * ;; ���� �����ݷ����� �����Ѵ�!
	 * 
	 * [ ǥ���� ]
	 * for(�ʱ��; ���ǽ�; ������) { // �ݺ�Ƚ���� �����ϴ� ��ҵ�
	 * 		�ݺ������� �����Ű���� �ϴ� �ڵ�
	 * }
	 * 
	 * - �ʱ�� : �ݺ����� ���۵� �� "�ʱ⿡ �� �ѹ��� ����"�� ����
	 * 				�ݺ������� ����� ������ �����ϰ� �ʱ�ȭ�ϴ� ���� => int i = 0;
	 * 
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 * 			���ǽ��� true�� ��� �ݺ��� ����
	 * 			���ǽ��� false�� ��� �ݺ����� ���߰� �������� => i < 10;
	 * 
	 * - ������ : "�ݺ����� �����ϴ� ���� ��"�� ������Ű�� ����
	 * 			���� �ʱ�Ŀ��� ����� ������ ������ ������ �ۼ�
	 * 			�̶�, ���������� �ַ� ���� => i++
	 * 
	 */
	
	
	public void method1() {
		// "�ȳ��ϼ���"�� 5�� �ݺ��ؼ� ����ϰ� �ʹ�.
		
		/*
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		*/
		// ����Ƚ���� �󸶵��� ������ ����!
		// 136, 7375�� �ݺ��ϰ� ��������???? �������� �� ���� �ƴ�
		
		for(int i = 0;i < 5;i++) {
			System.out.println("�ȳ��ϼ���!");
		}
	}
	
	public void method2() {
		
		// ������ ���ڿ��� �ƴ� �Ź� �޶����� ��� ����� Ȯ���غ���!!!
		// i : 1
		// i : 2
		// i : 3
		
		/*
		for(int i = 0; i < 3; i++) {
			System.out.println("i : " + (i + 1));
		}
		*/
		
		/*
		for(int i = 1; i <= 3; i++) {
			System.out.println("i : " + i);
		}
		*/
		
		// i ���� 1�������� 5�� ������������ 1�� ����
		for(/*1*/int i = 1; /*2*/i <= 5; /*4*/i++) {
			/*3*/System.out.println(i + "�� �ݺ�");
		}
		
		// �����ϴ� ��
		// i���� 10�������� 6���� ũ�ų� ���������� 1�� �����ϸ鼭 �ݺ� ����
		// 10 9 8 7 6
		
		// return;
		
		for(int i = 10; i >= 6; i--) {
			System.out.println("i : " + i);
		}
		
		System.out.println("--------------------------------------------");
		
		// ���� 1�� => 2�� ����!!!
		// 1 3 5
		for(int i = 1; i < 6; i += 2) {
			System.out.println("i : " + i);
		}
	}
	
	public void method5() {
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		
		
		System.out.println("��ø for�� \n");
		/*
		for(int i = 1; i <= 5; i++) {
			System.out.println("*");
		}
		*/
		
		System.out.println("----------------------------");
		
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 1; j <= 3; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		
		
		System.out.println("for���ȿ� if�� ����");
		
		for(int i = 0; i < 30; i++) {
			System.out.println((i + 1) + "�� ° �ݺ��Դϴ�.");
			
			// if������ 10��° �ݺ����� �� ����ֱ�. 10 20 30 40 50
			if((i + 1) % 10 == 0) {
				System.out.println("��");
			}
			
		}
		
		

	}
	
	
	public void gugudan() {
		// ������
		// ��������� ���� �Է¹޾Ƽ�
		// �������� ����غ���!
		// �޼ҵ� �̸� gugudan
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է����ּ��� > ");
		int dan = sc.nextInt();
		
		System.out.println(dan + "��");
		// �ݺ��Ǵ°� �ݺ������� ġȯ�� �����ϴ�.
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}
		
	}
	

}
