package com.kh.chap03.model.vo;

public class Person {
	
	// ����� ��������
	// �ֹι�ȣ, �̸�, ����, ����, �޴�����ȣ, �̸����ּ�
	
	// [�ʵ��]
	// �ʵ� == ������� == Ŭ�������� == �ν��Ͻ�����
	private String id;
	private String name;
	private int age;
	private char gender;
	private String phoneNumber;
	private String emailAddress;
	
	
	//-------------------------------------------------- [�����ں�]
	// [�޼ҵ��]
	// setter �޼ҵ�� : set�ʵ��
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	// getter �޼ҵ� : get�ʵ��()
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	// information()
	public String information() {
		return this.id + " " + this.name + " " + this.age + " " 
				+ this.gender + " " + this.phoneNumber + " " + this.emailAddress;
	}

}
