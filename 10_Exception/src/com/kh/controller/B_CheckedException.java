package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/*
	 * 
	 * CheckedException
	 * 
	 * ���������� �ݵ�� ����ó���� ������ϴ� ���ܵ�!!!
	 * (��, ���� �Ұ��� ������ �߻��ϱ� ������ �̸� ����ó�� ������ �ۼ��ؾ���!!!!)
	 * => �ַ� �ܺθ�ü�� � ����� �� �߻�!! 
	 * 
	 */
	
	public void method1() {
		
		try {
			method2();
		} catch(IOException e) {
			System.out.println("���ܰ� �߻��߾��!!");
		}
		
	}
	
	
	
	public void method2() throws IOException {
		
		System.out.println(" �ƹ� ���ڿ��̳� �Է����ּ��� ~ > ");
		
		/*
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		*/
		
		// Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü(��, ���ڿ��θ� ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		/*
		// ��� 1. try ~ catch : ���� �ذ��ϰڴ�!!
		try {
			String str = br.readLine(); // �� �޼ҵ带 ȣ�� �� IOException�� �߻��Ҽ��� ����
										// �̸� �˷��� �������ٷ�
			System.out.println("���ڿ��� ���� : " + str.length());
		} catch(IOException e) {
			System.out.println("IO�ͼ��� �߻�!!");
		}
		*/
		
		// ��� 2. throws : ���� ���⼭(method2)���� ���� ���� �� �޼ҵ带 ȣ���Ѱ�(method1)���� ���ܸ� ���Ѱܼ�(�����ؼ�) ó���ϰԲ� �ϰڴ�.
		String str = br.readLine();
		System.out.println("���ڿ��� ���� : " + str.length());
	}
	
	

}
