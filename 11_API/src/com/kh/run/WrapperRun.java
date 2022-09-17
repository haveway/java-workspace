package com.kh.run;

public class WrapperRun {
	
	public static void main(String[] args) {
		
		
		
		/*
		 * Wrapper Class
		 * => �⺻�ڷ����� ��ü�� �������ִ� Ŭ�������� ���� Ŭ������� ��
		 * 
		 * �⺻�ڷ���	<--------->	WrapperŬ����
		 * boolean				Boolean
		 * char					Character
		 * byte					Byte
		 * short				Short
		 * int					Integer
		 * long					Long
		 * float				Float
		 * double				Double
		 * 
		 */
		
		// �⺻�ڷ����� ��ü�� ����ؾ� �ϴ� ���
		// �޼ҵ��� �Ű������� �⺻�ڷ����� �ƴ� ��üŸ�Ը� �䱸 �� ��
		// �޼ҵ� ȣ�� ��
		// �������� �����Ű�� ���� ��
		
		int num1 = 10;
		int num2 = 15;
		
		// ���࿡ num1�� 2�� ����� �ϰ� �ʹٸ�??
		System.out.println(num1 == num2); // ����� ������ ���
		//System.out.println(num1.equals(//num2));
		
		// equals => Object Ŭ������
		// equals() => �ּҰ��� ���ؼ� ������ true/ �ٸ��� false return
		// ����õ�� ��� Ŭ������ ���� ����ŵ� �ƴϵ� ���� Object�� ��ӹް� ����
		
		//Integer i1 = new Integer(num1);
		
		// => WrapperŬ������ ��ȯ�Ͽ� ���
		// �⺻�ڷ��� => WrapperŬ���� �ڷ��� (Auto Boxing)
		Integer i1 = num1;
		Integer i2 = num2;
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// a.comperTo(b);
		// a�� b���� ũ�� 1 ��ȯ
		// a�� b���� ������ -1 ��ȯ
		// ������ 0 ��ȯ
		
		
		// ���ڿ��� IntegerŸ������
		//Integer i3 = "123";
		Integer i4 = new Integer("123");
		
		//int num5 = i4.intValue();
		
		// Wrapper Ŭ�����ڷ��� => �⺻�ڷ���(Unboxing)
		
		int num3 = i1;
		int num4 = i2;
		System.out.println("num3 + num4 : " + (num3 + num4));
		
		// �⺻�ڷ��� <--> String
		String str1 = "10"; // int������
		String str2 = "15.0"; // double������
		
		System.out.println(str1 + str2);
		
		//1. String�� �⺻�ڷ������� parsing�Ѵ�.
		// [ ǥ���� ]
		// �ش�WrapperŬ�����̸�.parseXXX(��ȯ�ҹ��ڿ�);
		
		int i = Integer.parseInt(str1);// "10" -> 10
		double d = Double.parseDouble(str2);// "15.0" -> 15.0
		
		System.out.println(i + d);
		
		// 2. �⺻�ڷ����� String������
		// => String.valueOf(��ȯ���ڷ�����) : String
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		System.out.println(strI + strD);
		
	}

}
