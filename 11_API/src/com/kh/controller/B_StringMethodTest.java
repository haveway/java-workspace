package com.kh.controller;

import java.util.Scanner;

public class B_StringMethodTest {
	
	// ���ڿ��� ���õ� �޼ҵ��
	
	public void method1() {
		
		String str1 = "Hell World!";
		
		// �޼ҵ��(�Ű�����) : ��ȯ��
		
		// 1. ���ڿ�.charAt(int index) : char
		char ch = str1.charAt(4);
		System.out.println("ch : " + ch);
		
		// 2. ���ڿ�.concat(String str) : String
		// => ���ڿ��� ���޹��� �� �ٸ� ���ڿ��� �ϳ��� ���ļ� ��ȯ
		// => ���ڿ� + str
		String str2 = str1.concat("!!!!!");
		System.out.println("str2 : " + str2);
		
		// 3. ���ڿ�.length() : int
		// => ���ڿ� ���̸� ��ȯ(���鵵 ����)
		System.out.println("str1�� ���� : " + str1.length());
		
		// 4. ���ڿ�.substring(int beginindex) : String
		// => ���ڿ��� beginindex��ġ���� ���ڿ� �������� ���ڿ��� �����ؼ� ����
		// ���ڿ�.substring(int beginindex, int endindex)
		// => ���ڿ��� beginindex��ġ���� endindex������ ���ڿ��� �����ؼ� ����
		//0 1 2 3 4 5 6 7 8 9 10 
		// H e l l   W o r l d !
		System.out.println(str1.substring(6)); // orld!
		System.out.println(str1.substring(0, 6)); // Hell W
		
		// 5. ���ڿ�.replace(char old, char new) : ��ȯ�� String
		// ���ڿ����� old���ڸ� new ���ڷ� ��ȯ�� ���ڿ��� ����
		String str3 = str1.replace('l', 'x');
		System.out.println("str3 : " + str3);
		
		// 6. ���ڿ�.trim() : String
		// => ���ڿ��� �� �� ������ ������ ���ڿ��� ����
		String str4 = "     J    A    V    A        ";
		System.out.println("trim : " + str4.trim());
		
		// 7. ���ڿ�.toUpperCase() : String
		// ��� ���ڸ� �빮�ڷ� ���� �� ���ڿ� ����
		// ���ڿ�.toLowerCase() : String
		// ��� ���ڸ� �ҹ��ڷ� ���� �� ���ڿ� ����
		
		System.out.println("toUpperCase : " + str1.toUpperCase());
		System.out.println("toLowerCase : " + str1.toLowerCase());
		
		// 8. ���ڿ�.toCharArray() : char[]
		// => ���ڿ��� �� ���ڵ��� char[]�迭�� �Űܴ��� �� �ش� �迭�� ����
		char[] chArr = str1.toCharArray();
		for(int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i] + "");
		}
		System.out.println();
		
		// char[] -> String
		char[] arr = {'a', 'p', 'p', 'l', 'e'};
		System.out.println(String.valueOf(arr));
	}

	
	public void method2() {
		
		// �����Ͻðڽ��ϱ�?(Y/N) : Y �ƴϸ� N �Է¹ޱ�
		// ����� ��
		// 1. Y / N
		// 2. y / n
		// 3. ���� / �� ���...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻðڽ��ϱ�?(Y/N) : ");
		
		char a = sc.nextLine().toUpperCase().charAt(0);
		// 1. ���ڿ� �Է�
		// 2. ���ڿ��� ��� ���ĺ��� �빮�ڷ� �ٲ�
		// 3. 0��° �ε����� ���ڸ� ����
		// �޼ҵ带 ���̾ ȣ�� : �޼ҵ�ü�̴�
		
		if(a == 'Y') {
			System.out.println("�����մϴ�.");
			return;
		}else if(a == 'N') {
			System.out.println("������մϴ�.");
		}else {
			System.out.println("�����̰�");
		}
	}
}
