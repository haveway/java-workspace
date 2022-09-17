package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break; : break���� ������ ���� "���� ����� �ݺ���"�� ����������.
	 * 			�ش� break���� �����ִ� �ݺ��� "�Ѱ�"�� ��������!!!!!!!!!!!!!!!!!!!!!!!!
	 * 
	 * * ������ �� : switch�� �ȿ� break;�� �ٸ�����
	 * 				switch�� ���ο� �����ϴ� break�� �ش� switch���� ���������� �뵵�� ���̴�!!!!!
	 * 
	 */
	
	public void method1() {
		
		// �� �� �ݺ������� ���Ӱ� �߻��Ǵ� ������ ���(1~100) => �����ϰ�
		// �� �������� Ȧ �� �� ��� �ݺ����� ���������� �� ��!
		
		// 1. for(;;)
		// 2. while(true)
		
		for(;;) {// for�� ����
			int random = (int)(Math.random() * 100) + 1;
			
			if(random % 2 == 1) {
				System.out.println("�ݺ��� Ż��!");
				break;
			} else {
				System.out.println(random);
			}
			
		} // for�� ��
	}
	
	
	public void method2() {
		
		// �� �� ����ڿ��� ���ڿ��� �Է� ���� ��
		// �ش� ���ڿ��� ���̸� �������!!!!!!!!!!
		// ��, ����ڰ� "exit"�� �Է��� ��� �ݺ����� ���������� ������
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("���ڿ��� �Է��� �ּ��� > ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			System.out.println(str.length());
		}
		
	}
	
	/*
	1. ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
	1 �̸��� ���ڰ� �Էµƴٸ�
	��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
	ex.
	1�̻��� ���ڸ� �Է��ϼ��� : 4 		1 �̻��� ���ڸ� �Է��ϼ��� : 0
	4 3 2 1 					1 �̻��� ���ڸ� �Է����ּ���.
								1 �̻��� ���ڸ� �Է��ϼ��� : 5
								5 4 3 2 1
	*/
	
	public void hw1() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("\n 1�̻��� ���� : ");
			num = sc.nextInt();
		}while(num < 1);
		
		for(; num > 0; num--) {
			System.out.println(num + " ");
		}
		
	}
	
	/*
	2. ����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
	������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���.
	��, ��µǴ� ���ڴ� �� 10���Դϴ�.
	* ���������� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���Ѵ�.
	ex) 2, 7, 12, 17, 22 ��
	5 5 5 5 => ���⼭ ������ 5
	ex.
	���� ���� : 4
	���� : 3
	4 7 10 13 16 19 22 25 28 31
	*/
	
	public void hw2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� : ");
		int num = sc.nextInt(); // ex) 3
		System.out.println("���� : ");
		int gongcha = sc.nextInt(); // ex) 3
		
		/*
		for(int i = 0; i < 10; i ++) {
			System.out.printf("%d ", num + (gongcha * i));
		}
		*/
		
		/*
		int sum = num;
		String str = "";
		
		for(int a = 1; a<= 9; a++) {
			sum += gongcha;
			str += sum + " ";
		}
		
		System.out.println(num + " " + str);
		*/
	}
	
	public void method3() {
		// �� �� ����ڷκ��� ���� �Է¹ް�
		// �ش� ���ڰ� ������ " ���α׷��� �����մϴ� " ��� ������ ����ϰ� ������Ѻ����� ~
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			System.out.println("���� �Է� > ");
			int num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("���α׷� ���� ~");
				break;
			}
			
		}
	}
	
	/*
	 * ������(+, -, *, /, %)�� ���� �ΰ��� �Է¹޾� �Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���.
	 * ��, �ش� ���α׷��� ������ �Է¿� "exit"�̶�� ���� ���ö����� ���� �ݺ��ϸ�
	 * "exit"�� ������ "���α׷��� �����մϴ�" ��� ����ϰ� �����մϴ�.
	 * 
	 * ����, �����ڰ� �������̸鼭 �� ��° ������ 0���� ������
	 * "0���δ� ���� �� �����ϴ�. �ٽ� �Է����ּ���"�� ����ϰ�,
	 * 
	 * ���� �����ڸ� �Է� �� "���� �������Դϴ�. �ٽ� �Է����ּ���."��� ����ϰ�
	 * �� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.
	 */
	public void method99() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("������(+, -, *, /, %) : "); // "exit"�Է��ϸ� ���α׷� ����
			String p = sc.next();
			
			if(p.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			
			
			System.out.println("���� 1 �Է� : ");
			int num1 = sc.nextInt();
			System.out.println("���� 2 �Է� : ");
			int num2 = sc.nextInt();
			
			int result = 0;
			boolean flag = true;
			
			switch(p) {
			case "+" : result = num1 + num2;
			break;
			case "-" : result = num1 - num2;
			break;
			case "*" : result = num1 * num2;
			break;
			case "/" : 
				if(num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ� �ٽ� ��");
					flag = false;
				} else {
					result = num1 / num2;
				}
				break;
			case "%" : result = num1 % num2;
			break;
			default : System.out.println("���� �������Դϴ� �ٽ� ��");
			flag = false;
			}
			
			if(flag) {
				System.out.printf("%d %s %d = %d \n", num1, p, num2, result);
			}
			
		}
		
		// if else else if for while do-while switch break
		// return print operator String primitiveVariable
		// method array Scanner 
		
		
	}
}
