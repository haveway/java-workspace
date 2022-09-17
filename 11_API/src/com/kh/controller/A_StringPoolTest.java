package com.kh.controller;

public class A_StringPoolTest {
	
	// String Ŭ���� => �Ҹ�Ŭ����(������ �ʴ� Ŭ����)
	// �����ϴ� ���� ������ ���� ������ִ� �������� �������� ����
	
	/*
	 * String Ŭ���� ������ ��ü ���� ���
	 * 
	 * 1. new Ű����� ������ ȣ��
	 * 2. ���Կ����ڸ� ���ؼ� ���� ���� �־ ���� 
	 * 
	 */
	
	// 1. �����ڸ� ���ؼ� ���ڿ� ���
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		// toString()
		System.out.println(str1.toString());
		System.out.println(str2);
		// 1. StringŬ������ toString() �� ���
		// ���� ����ִ� ���ڿ��� ��ȯ�ϰԲ� �������̵��� �Ǿ�����
		
		// equals()
		System.out.println(str1.equals(str2));
		// true => ���ڿ��� ���ߴµ� �����ϴ�.
		// 2. StringŬ������ equals()�� ���
		// �ּҰ� �񱳰� �ƴ� ���ڿ� �񱳸� �ϵ��� �������̵�
		
		// hashCode()
		// 16������ �ּҰ� => 10������ ����
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// 3. StringŬ������ hashCode()
		// �ּҰ��� ��ȯ���ִ� ���� �ƴ� ���� ��� ���ڿ��� �������
		// �ؽ��ڵ尪�� ���� ��ȯ
		
		// ��¥ �ּҰ��� �˰�ʹٸ�??
		// System.identityHashCode(������������));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// ���� �ּҰ��� �ؽ��ڵ带 ���
		// str1�� str2�� �ּҰ��� �ٸ���!
		
		// == 
		System.out.println(str1 == str2); // false
	}
	
	// 2. ���ڿ��� ���ͷ��� ����
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
		
		// toString()
		System.out.println(str1);
		System.out.println(str2);
		
		// equals()
		System.out.println(str1.equals(str2));
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		/////??????? �ΰ��� �� �ּҰ��� �Ȱ���????????
		
		System.out.println(str1 == str2); // true
		
	}
	
	// String Ŭ������ StringPool
	
	public void method3() {
		
		String str = "hello";
		// ���ͷ� ���� �� String pool ������ �ö�
		// String Pool�� Ư¡ : ������ ������ ���ڿ��� ���� �Ұ��ϴ�!
		
		
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		// ������ ���� ���ڿ����� �������ݷ��Ͱ� �˾Ƽ� ��������
		// �Һ��̶���ؼ� �ƿ� ������ �ȵǴ°��� �ƴ϶�
		// �� �� ���ο� �ּҰ��� �����Ѵٶ�� ��
		
		str += "abc";
		System.out.println(System.identityHashCode(str));
		str += "abc";
		System.out.println(System.identityHashCode(str));
		
		
		String a = "a";
		String b = "a";
		
		System.out.println("��� : " + (a == b)); // �����? 
	}
	
	public void method4() {
		// StringBuffer
		// ���ڿ��� �ȿ� ������ ����ɶ����� ���ο� ������ �Ҵ��ϰ� ���� ����ִ´�.
		// �̸� �������� �ӽð���(buffer)�� �ϳ� �غ��Ͽ�
		// �ӽð����� �������� ��Ƶξ��ٰ� �ѹ��� ó�����ִ� Ŭ������
		// StringBuffer / StringBuilder �̴�.
		
		StringBuffer sb = new StringBuffer(); 
		
		sb.append("Hello");
		System.out.println("Hello".hashCode());
		System.out.println(sb.hashCode());
		
		sb.append(" World!");
		System.out.println("Hello World!".hashCode());
		System.out.println(sb.hashCode());
		
		System.out.println("��� : " + sb);
		
		// StringBuffer�� �������� ���(Thread Safe)����� ������.
		// ������ ���α׷� �����̳�, ������� �ٸ� ���α׷��� �����ϴ� ���
		// ����.. ���۱���?? ������� ������ �ʿ�� ����.
		// �̱�ɸ� �� �� Ŭ������ �ʿ��ߴµ� �װ� StringBuilder��!!
		
	}
	
	public void method5() {
		//StringBuilder
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello");
		System.out.println("Hello".hashCode());
		System.out.println(sb.hashCode());
		
		sb.append(" World!");
		System.out.println("Hello World!".hashCode());
		System.out.println(sb.hashCode());
		
		System.out.println("��� : " + sb);
	}

}
