package com.kh.chap06.controller;

public class MethodTest2 {
	// static �޼ҵ�� �����
	
	//1 
	public static void method1() {
		System.out.println("�Ű������� ��ȯ���� �� �� ���� �޼ҵ��Դϴ�.");
	}
	
	//2
	public static String method2() {
		return "�Ű������� ������ ��ȯ���� �ִ� �޼ҵ��Դϴ�";
	}
	
	//3 
	public static void method3(String name, int age) {
		System.out.println("�Ű������� �ְ� ��ȯ���� ���� �޼ҵ��Դϴ�.");
		System.out.println("��±��� : " + name + "�� " + age +"��");
	}
	//4
	public static String method4(String name, int age) {
		System.out.println("�Ű������� ��ȯ�� �� �� �ִ� �޼ҵ��Դϴ�.");
		return name + "�� �ȳ��ϼ��� " + age + "���̽ó׿�";
	}

}
