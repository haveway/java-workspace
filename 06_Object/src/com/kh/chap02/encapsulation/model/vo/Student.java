package com.kh.chap02.encapsulation.model.vo;

// �ʵ��, �����ں�, �޼ҵ��

public class Student {
	
	// �ʵ��
	/*
	 * ������ ��� �κ�
	 * 
	 * �ʵ� == ������� == Ŭ��������
	 * 
	 * ���������� �ڷ��� �ʵ��̸�;
	 */
	private String name;
	private int age;
	private char gender;
	
	
	// �����ں�
	
	// �޼ҵ��
	/*
	 * ����� �����ϴ� �κ�
	 * 
	 * ���������� ��ȯ�� �޼ҵ�ĺ���(�Ű�����) {
	 * 		�޼ҵ� ȣ�� �� ������ �ڵ�;
	 * }
	 * 
	 * ���������� : ȣ���� �� �ִ� ������ �������ش�.
	 * ��ȯ�� : �޼ҵ��� ������� �ڷ����� �������ش�. || void -> �����ٰ��� ����.
	 * �Ű����� : �޼ҵ� ȣ�� �� �Է°����� �־��ִ� ����. �ش� �޼ҵ� �����߿��� ��� ������ ����. ��������
	 */
	
	// �����͸� ��� �� �����ϴ� ����� �޼ҵ� : setter �޼ҵ�
	
	/*
	 * ��Ģ
	 * 
	 * 1. setter�޼ҵ�� ���� �����ϵ��� ������ �ϱ� ������ public ���� �����ڸ� �̿�
	 * 2. set�ʵ������ �̸����� ��Ÿ��ǥ���(camelCase)�� ��Ű���� �Ѵ�.
	 * 						ex) setName, setAge, setGender
	 * 3. ��� �ʵ忡 ���ؼ� ���� �� �ۼ��� ������Ѵ� �ݵ��!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 */
	
	// �̸��� ��� �� ������ �� �ִ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
		
		// Ư�� ���� �ȿ����� �ش� ���� �ȿ� �ִ� �������� �켱���� ����!!
		// this.�� ������ ������ �Ű����� name = �Ű����� name �̷��� �ν��� ��!!
	}
	
	// ���̸� ��� �� ������ �� �ִ� �޼ҵ�
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// �����͸� ��ȯ���ִ� ����� �޼ҵ� : getter �޼ҵ�
	
	/*
	 * 1. getter�޼ҵ�� ���������� public�� ����Ѵ�.
	 * 2. get�ʵ������ ����, ��Ÿ�� ǥ���(camelCase)�� ����Ѵ�.
	 * 						ex) getName, getAge, getGender
	 * 3. ��� �ʵ忡 ���ؼ� �� �ۼ�������Ѵ�!!! �ݵ��!!!!!!!!!!!!!!!
	 */
	
	// �̸��� ��ȯ���ִ� �޼ҵ�
	public String getName() {
		return this.name;
		// return ����� => ������� �����ְڴ�!
		// �޼ҵ��� ��ȯ���ϰ� ����� ��ȯ���� �������� Ȯ���ؾ��Ѵ�!!
	}
	
	// ���̸� ��ȯ���ִ� �޼ҵ�
	public int getAge() {
		return this.age;
	}
	
	// ������ ��ȯ���ִ� �޼ҵ�
	public char getGender() {
		return this.gender;
	}
	
	// setter�� getter �޼ҵ� �� ����������� ĸ��ȭ ��!
	
	// ���ڰ� �޼ҵ�!
	
	public String information() {
		
		// return this.name, this.age, this.gender;
		// ������� return�� �Ѱ������Ѵ�!!!
		//String info = this.name + "���� ���̴�" + age + "���̰� ������ " + gender + "�Դϴ�.";
		//return info;
		return this.name + "���� ���̴� " + age + "���̰� ������ " + gender + "�Դϴ�.";
	}

}
