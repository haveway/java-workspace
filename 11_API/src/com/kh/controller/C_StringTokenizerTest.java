package com.kh.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	// ���ڿ��� �и���Ű�� ���
	
	// 1. �����ڸ� �����ؼ� �ش� ���ڿ��� �и���Ű�� ��� => �迭�̿� 
	// 2. �и��� ������ ���ڿ��� ��ū���� ����ϴ� ��� => ��ū�̿�
	
	String str = "���ϸ�, �Ƿ��Ƿ�, ���𷹽���, Java";
	
	
	// ��� 1.
	public void method1() {
		// ���ڿ�.split(String ������) : String[]
		String[] arr = str.split(",");
		
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		
		// ���� for�� : �ʱ��, ���ǽ�, �������� �ʿ����!!!!!
		// [ ǥ���� ] for(���� �޾��� ���� ���� : ���������� ������ �迭){  }
		for(String s : arr) {
			System.out.println(s);
		}
		// ��¸� ���� 
		// �迭�� ���� ������ ���� ����.
	}
	
	
	// ��� 2.
	
	public void method2() {
		
		// ������ ���ڿ��� ��ū���� ó��
		// java.util.StringTokenizer Ŭ������ �̿��ϴ� ���
		//[ ǥ���� ]
		// StringTokenizer stn = new StringTokenizer(���ڿ�, ������);
		// ��ü ����
		
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("�и��� ���ڿ��� ���� : " + stn.countTokens());
		
		// countTokens() �и��� ���ڿ��� ������ ��ȯ���ִ� �޼ҵ�
		
		// �׷��� ������ �и��� ���빰�� ����ʹٸ�???
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		// �׷��� ���� �����ִ� ��ū�� �����ٵ�???
		// �� nextToken()�� ȣ���ϸ�???
		System.out.println(stn.nextToken());
		*/
		// NoSuchElementException
		// ���̻� ������ ��ū(���)�� ��� �߻��ϴ� ����
		
		// �ݺ���
		
		while(stn.hasMoreTokens()) {
			// hasMoreTokens() :
			// stn �����ִ� ��ū�� �ִٸ� true
			// ��ū�� �� ���������� false
			
			System.out.println(stn.nextToken());
		}
	}
	

}
