package com.kh.chap02_beforeVSafter.run;

import com.kh.chap02_beforeVSafter.model.vo.*;

public class AfterRun {
	
	public static void main(String[] args) {
		
		
		//Product p = new Product();
		
		SmartPhone sp = new SmartPhone();
		
		SmartPhone s = new SmartPhone("LG", "����", "v-01", 1000000, "LG");
		
		System.out.println(s.information());
		// ���� ȣ���ϰ����ϴ� �޼ҵ尡 �ش� Ŭ������ �������� �ʴ´ٸ�
		// �ڵ����� �ش� Ŭ������ �θ�Ŭ������ �ִ� �޼ҵ�� ȣ�� ��!
		
		Desktop d = new Desktop("Apple", "d01", "¯¯����ũž", 5000000, true);
		System.out.println(d.information());
		
		Tv t = new Tv("����", "tv01", "Ƽ��� ���� ������", 800000, 100);
		System.out.println(t.information());
		
		// �ڽ�Ŭ������ �������̵�(�θ�Ŭ������ �޼ҵ带 ������)�� ���� ���
		// �ڽ�Ŭ������ �������̵� �� �޼ҵ尡 �켱���� ������ ȣ���!!!!
		
		/*
		 * ����� ���� 
		 * - �ߺ��� �ڵ带 ���������� ���� 
		 *    => ���ο� �ڵ带 �ۼ��ϰų� ������ �� �����ϴ�.
		 * 	  => ���� �������� �ڵ�� ���ο� Ŭ������ ���� �� �ִ�.
		 * 
		 * - ���α׷��� ���꼺�� �������� ���������� ũ�� �⿩!
		 * 
		 * 
		 * 
		 * 
		 * ����� Ư¡
		 * 
		 * - Ŭ�������� ���߻���� �Ұ����ϴ�.(���� ��Ӹ� ����)
		 * 
		 * - ��õǾ� ������ ������ ��� Ŭ������ ObjectŬ������ �ļ��̴�
		 * (��� Ŭ���� : ��������Ŭ����, �ڹٿ��� �̹� �����ϴ� Ŭ����)
		 * => ObjectŬ������ �ִ� �޼ҵ带 ȣ���ؼ� �� �� ����
		 * => ObjectŬ������ �ִ� �޼ҵ尡 ������ �ȵ��? �������̵��� ���� ������ ����!
		 * 
		 * 
		 */
		
		
	}
}
