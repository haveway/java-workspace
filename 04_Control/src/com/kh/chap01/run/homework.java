package com.kh.chap01.run;

import java.util.Scanner;

public class homework {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		/*
		
		System.out.println("1. �Է�");
		System.out.println("2. ���");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("5. ����");
		
		System.out.println("����� �����ðھ��????");
		int num = sc.nextInt();
		
		String result = "";
		
		switch(num) {
		case 1 : result = "�Է�";
		break;
		case 2 : result = "���";
		break;
		case 3 : result = "��ȸ";
		break;
		case 4 : result = "����";
		break;
		case 5 : result = "����";
		break;
		default : result ="����";
		}
		System.out.println(result + "�޴� �Դϴ�.");
		
		
		*/
		
		/*
		System.out.println("���� ���� : ");
		int kor = sc.nextInt();
		System.out.println("���� ���� : ");
		int math = sc.nextInt();
		System.out.println("���� ���� : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		int avg = total / 3;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("���� : " + kor + "���� : " + math + "���� : " + eng + "�հ� : " + total + "��� : " + avg + "�����մϴ�, �հ��Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		*/
		
		/*
		System.out.println("������ �Է��ϼ���(������, ȸ��, ��ȸ��) > )");
		String pl = sc.nextLine();
		
		if(pl.equals("������")) {
			System.out.println("ȸ������, �Խñ۰���, ��۴ޱ�, �Խñ��ۼ�");
		}else if(pl.equals("ȸ��")) {
			System.out.println("�Խñ��ۼ�, �Խñ���ȸ");
		}else if(pl.equals("��ȸ��")){
			System.out.println("�Խñ� ��ȸ");
		}else {
			System.out.println("�׷��� ����� ~");
		}
		*/
		
		
		System.out.println("�ǿ����� 1 �Է� : ");
		double n1 = sc.nextDouble();
		
		System.out.println("�ǿ����� 2 �Է� : ");
		double n2 = sc.nextDouble();
		
		System.out.println("������ �Է�(+, -, *, /, %)");

		String o = sc.next();
		
		double result = 0;
		
		if((n1 > 0 && n2 > 0) && (o.equals("+") || o.equals("-") || o.equals("*") || o.equals("/") || o.equals("%"))) {
			
			switch(o) {
			case "+" : result = n1 + n2;
			break;
			case "-" : result = n1 - n2;
			break;
			case "*" : result = n1 * n2;
			break;
			case "/" : result = n1 / n2;
			break;
			case "%" : result = n1 % n2;
			break;
			}
			
			System.out.println(n1 + o + n2 + "=" + result);
			
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
		
		
	}

}
