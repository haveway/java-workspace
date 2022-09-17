package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * if-else
	 * 
	 * => �� �ƴϸ� ��
	 * 
	 * [ǥ����]
	 * if(���ǽ�) {
	 * 		���ǽ��� true�� �� ������ �ڵ� - 1
	 * } else {
	 * 		���ǽ��� false�� �� ������ �ڵ� - 2
	 * }
	 * 
	 * => ���ǽ��� ����� true�� ��� 1�� ����
	 * => ���ǽ��� ����� false�� ��� 2�� ����
	 */
	
	
	public void method1() {
		
		// �����ڹ���
		// ���� �Է¹ް� ��� / 0 / ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		if(num > 0) { // ����� ��� ����
			System.out.println("�����");
			
			
			// ���ǽ��� ����� true�� ��� = > else ���� �ǳ� ��
			// ���ʿ��� ������ �پ�� => ó���ӵ��� ���
			
		} else { // ����� �ƴ� ��� ����
			
			if(num == 0) { // 0�� ���
				System.out.println("0�̴�");
			} else { // 0�� �ƴ� ���
				System.out.println("������");
			}
			
		}
	} // �޼ҵ� 1 ���� ��
	
	public void method2() {
		// �ֹι�ȣ �Է� �� ���� �Ǻ�
		// 1. ����ڷκ��� �ֹι�ȣ �Է¹ޱ� (String personId => XXXXXX-OXXXXXX
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է�(-����) : ");
		String personId = sc.nextLine();
		
		// 2. �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� ���ڸ� ���� charAt(index) => 7�� �ε���
		char gender = personId.charAt(7);
		
//		if(gender == '1' || gender == '2' || gender == '3' || gender == '4') {
		if('1' <= gender && gender <= '4') {
			// ��ȿ�� �ֹε�� ��ȣ
			if(gender == '1' || gender == '3') {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
		} else {
			// ��ȿ���� ���� �ֹε�� ��ȣ
			System.out.println("��ȿ���� ���� �ֹι�ȣ�Դϴ�.");
		}
	}
	
	/*
	 * 
	 * if-else if ��
	 * 
	 * [ ǥ���� ]
	 * 
	 * if(���ǽ�1) {
	 * 		���ǽ�1�� true�� ��� ������ �ڵ�1
	 * } else if(���ǽ�2) {
	 * 		���ǽ�2�� true�� ��� ������ �ڵ�2
	 * } else if(���ǽ�3) {
	 * 		���ǽ�3�� true�� ��� ������ �ڵ�3
	 * } else if(���ǽ�4) {
	 * 		���ǽ�4�� true�� ��� ������ �ڵ�4
	 * } else {
	 * 		�տ��� ����ߴ� ���ǵ��� ��� false�� ��� ������ �ڵ�
	 * }
	 * 
	 */
	
	public void method3() {
		
		// ���� �Է¹޾Ƽ� ��� / 0 / ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("����� ~ ");
		} else if(num < 0) {
			System.out.println("������ ~ ");
		} else {
			System.out.println("0�̴� ~");
		}
			
	}
	
	// ���̸� �Է¹ް� ��� û�ҳ� ���� �Ǵ�
	public void method4() {
		// 0 ~ 13 : ���
		// 14 ~ 19 : û�ҳ�
		// 20 ~ : ����
		// - : �������̾ƴմϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է����ּ��� > ");
		int age = sc.nextInt();
		
		if(age < 0) {
			System.out.println("�������� �ƴմϴ�.");
		} else if(age >= 20) {
			System.out.println("�����Դϴ�.");
		} else if(age >= 14) {
			System.out.println("û�ҳ��Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
	}
	
	public void method5() {
		String season;
		int temperature = 40;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����ü �� ���ΰ���????? > ");
		int month = sc.nextInt();
		
		if(month == 1 || month == 2 || month == 12) {
			season = "�ܿ�";
			
			if(temperature <= -15) {
				season += " ���� �溸";
			} else if(temperature <= -12) {
				season += " ���� ���Ǻ�";
			}
			
		} else if(3 <= month && month <= 5) {
			season = "��";
		} else if(6 <= month && month <= 9) {
			season = "����";
			
			if(temperature >= 35) {
				season += " �����溸";
			}else if(temperature >= 30) {
				season += " �������Ǻ�";
			}
			
		} else if(10 <= month && month <= 11) {
			season = "����";
		} else {
			season = "�ش��ϴ� ������ �����ϴ�.";
		}
		System.out.println("���� : " + season);
	}
}
