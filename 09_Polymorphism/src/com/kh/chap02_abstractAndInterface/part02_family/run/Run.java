package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;

public class Run {

	public static void main(String[] args) {
		
		// Person p = new Person();
		// Person�� �߻�Ŭ�����Ƿ� ��ü ���� �Ұ�!!
		
		// ������ ���� �������̽� ���� ��
		/*
		Person mom = new Mother("����", 50, 90, "���");
		Person baby = new Baby("����", 2.3, 90);
		
		System.out.println(mom);
		System.out.println(baby);
		
		// ��԰�, ���ڱ�
		mom.eat(); // ���� : ������ + 10
		baby.eat(); // �ֱ� : ������ + 5, �ǰ��� + 5
		mom.sleep(); // ���� : �ǰ��� + 10
		baby.sleep(); // �ֱ� : �ǰ��� + 10
		
		System.out.println("\n---- ������ ----");
		System.out.println(mom);
		System.out.println(baby);
		*/
		
		
		// 2. �������̽� ���� ��
		
//		Basic b = new Basic(); // ��ü ���� �Ұ���
		
		Basic mom = new Mother("����", 50, 80, "���");
		Basic baby = new Baby("����", 2.3, 80);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat(); // ���� : ������ + 10
		baby.eat(); // �ֱ� : ������ + 5, �ǰ��� + 5
		mom.sleep(); // ���� : �ǰ��� + 10
		baby.sleep(); // �ֱ� : �ǰ��� + 10
		
		System.out.println("\n---- ������ ----");
		System.out.println(mom);
		System.out.println(baby);

	}
}
