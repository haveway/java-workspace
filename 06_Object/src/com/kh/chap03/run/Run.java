package com.kh.chap03.run;

import com.kh.chap03.model.vo.Person;
import com.kh.chap03.model.vo.Product;

public class Run {
	
	public static void main(String[] args) {

		// == ���� ���� ������ �ڷ���(1. �����ڷ���, 2. �ּҰ��� ����, 3. �������� �ڷ����� ������ ���� ���� + ���)
		// == ����� ���� �ڷ���
		// Person�̶�� Ŭ������ ���� ��ü ����
		
		
		Person person = new Person(); // �ν��Ͻ�ȭ
		
		person.setName("���");
		System.out.println(person.information());
		// �⺻���� ������� => �⺻���� 0, 0.0, ���� // �������� null
		
		// �� ���� => setter
		person.setId("774343-2323232");
		person.setGender('M');
		System.out.println(person.information());
		
		person.setAge(65);
		person.setPhoneNumber("010-2323-3434");
		person.setEmailAddress("kim@kim.com");
		System.out.println(person.information());
		System.out.println(person);
		
		Product pd = new Product();
		
		pd.setProducName("������13");
		pd.setPrice(1380000);
		
		System.out.println(pd.information());
		
		pd.setBrand("�Ｚ");
		System.out.println(pd.information());
		
		
	}
}
