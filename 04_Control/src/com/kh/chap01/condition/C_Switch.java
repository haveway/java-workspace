package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	/*
	 * switch��
	 * 
	 * [ǥ����]
	 * 
	 * switch(�Ʒ��� ����� ����� ����񱳸� �� �����) {
	 * 		case ����, ����, ���ڿ� : �������ڵ�1;
	 * }
	 * 
	 * switch(����, ����, ���ڿ�){
	 * 		case ��1 : ������ �ڵ�1; // ����� == ��1�� true�� ��� ������ �ڵ�
	 * 				   break;	// switch ������ ����������.
	 * 		case ��2 : ������ �ڵ�2; // ����� == ��2�� true�� ��� ������ �ڵ�
	 * 					break;
	 * 		case ��n : �������ڵ� n; // ����� == ��n�� true�� ��� ������ �ڵ�
	 * 
	 * 		default : �������ڵ�; // == else
	 * 							// break�� �����ʴ´�.
	 * }
	 */
	
	public void method1() {
		// ��������� �� �Է¹޾Ƽ� Ȧ�� ¦�� �Ǻ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ��� > ");
		int num = sc.nextInt();
		
		int oddEven = num % 2; // 0 : ¦��, 1 : Ȧ��
		
		switch(oddEven) {
			case 0 : System.out.println("�̰Ŵ� ¦����??");
				break;
			case 1 : System.out.println("�̰Ŵ� Ȧ����??");
		}
	}
	
	public void method2() {
		
		// 1. ����ڷκ��� �ֹι�ȣ �Է¹ޱ� (String personId) => 000000 - 1234567
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��� �ּ���(-����) : ");
		String personId = sc.nextLine();
		
		// 2. �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� ���ڸ� ����
		char gender = personId.charAt(7);
		
		// 3. ����ġ���� ����ؼ� ���ǹ� �ۼ�
		switch(gender) {
		case '1' : // gender == '1'
		case '3' : System.out.println("�����Դϴ�.");
		break;
		case '2' : // gender == '2'
		case '4' : System.out.println("�����Դϴ�.");
		break;
		default : System.out.println("�ܰ����Դϴ�.");
		// �ڿ� ���̻� ������ ���ǵ��� ���� ������ break�� ���� �ʴ´�.
		}
	}
	
	
	// switch => ���ϰ���
	public void fruitMarket() { // �޼ҵ念�� ����
		
		// ����ڿ��� ������ ������ �̸��� �Է¹޾�
		// �� ���ϸ����� ������ ������� ��
		
		// ���,     ����,      ����,     �޷�,      ������,       ��纣��
		// 1000,   10000    15000    20000      150000        12000
		
		// �츮���� ���� ~ ������ ~ ���Ⱦ� ~
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------ �̷����̸���~~ ------");
		System.out.println("������ ������ �Է����ּ��� (���, ����, ����, �޷�, ������, ��纣��)");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) { // ����ġ ���� ����
		case "���" : price = 1000;
		break;
		case "����" : price = 10000;
		break;
		case "����" : price = 15000;
		break;
		case "�޷�" : price = 20000;
		break;
		case "������" : price = 150000;
		break;
		case "��纣��" : price = 12000;
		break;
		default : System.out.println("�츮���� ���� ~ ������ ~ ���Ⱦ� ~");
		return; // ���� ����ǰ��ִ� �޼ҵ� ������ �ƿ� ����������.
		// �޼ҵ� ȣ�� �κ����� ���ư���~
		} // ����ġ ����
		System.out.printf("%s�� ������ %d�� �Դϴ�.", fruit, price);
		
	} // �޼ҵ念�� ��
	
	
	public void method4() {
		
		// �α��� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� : ");
		String userId = sc.nextLine();
		
		System.out.println("��й�ȣ : ");
		String userPwd = sc.nextLine();
		
		String id = "user01";
		String pwd = "pass01";
		
		if(userId.equals(id) && userPwd.equals(pwd)) { // �α��� �������� ���
			System.out.println("�α��� ���� ~ ����� ~ �߿԰� ~");
		}else if(!userId.equals(id)) {// �α��� �������� ���
			// 1. id�� ��ġ���� �ʾ��� ���
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		}else {
			// 2. pwd�� ��ġ���� �ʾ��� ���
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		
		// �⺻�ڷ��� : byte, short, int, long, float, double, char, boolean
		// => �⺻�ڷ��� ���� ��쿡�� �����(==, !=) �񱳰� �� ��
		
		// �����ڷ��� : String
		// => �����(==, !=)�� �Ұ�����
		// ��? �����ڷ����� ��� ������ ������ ���� ���� '�ּҰ�'�̱� ����.
		// ���ڿ��� ���� �� : equals() �� ����Ѵ�. ����� => true, false
		// [ǥ����] ���ڿ�.equals("���� ���ڿ�");
	}
}
