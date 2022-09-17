package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {
	
	/*
	 * ĸ��ȭ������ ���� �Ϻ��� Ŭ���� ���¸� ���߰� ����!!
	 * 
	 * ĸ��ȭ�� ���� ������ : �ܺηκ��� ���������� �����ϱ� ������
	 * 					�Ժη� ���� �����ǰų� ��ȸ�� ���� ���ϴ� ������ �߻�
	 * 
	 * ���������� 3��� : ��м�, ���Ἲ, ���뼺
	 * 
	 * => ĸ��ȭ �۾� : �������� ��� �� �ϳ�!!!!!
	 * 				�������� "��������"�� ��Ģ�����Ͽ� �ܺηκ��� ���������� ����!!!!
	 * 				��, ��ſ� ���������γ��� ó��(�� ����, ��ȸ)�� �� �� �ְԲ� ���������!!
	 * 
	 * => ĸ��ȭ �۾��� 2�ܰ�
	 * 1. ���� ����� : public ��� private���� ���������ڸ� �ٲ��ش�.
	 * 2. ���������� ���� ó���� �� �ִ� �޼ҵ带 �����.
	 * 
	 */
	
	
	
	// ���������� (�����) ��ȯ�� �޼ҵ��̸�(�Ű�����)
	public static void main(String[] args) {
		
		Student kim = new Student();
		/*
		kim.name = "���";
		kim.age = -20;
		kim.gender = "M";
		
		System.out.println(kim.name);
		System.out.println(kim.age);
		System.out.println(kim.gender);
		*/
		// �ʵ尡 ������ �ʾƼ� ���� �߻�!!! => private���� �����߱� ����
		// ���Ͱ��� ���� ������ �Ұ�����!!!!
		// ���������� �������� ���������γ��� ������ �� �ְԲ� ������!!!!! => getter / setter �޼ҵ� �����!!
		
		kim.setName("���");
		kim.setAge(15);
		kim.setGender('M');
		
		/*
		System.out.println(kim.name);
		System.out.println(kim.age);
		System.out.println(kim.gender);
		*/
		/*
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		System.out.println(kim.getGender());
		*/
		
		System.out.println(kim.information());
		
		
	}

}
