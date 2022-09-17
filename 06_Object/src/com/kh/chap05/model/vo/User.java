package com.kh.chap05.model.vo;

public class User {
	
	// User u = new User();
	
	// [ �ʵ�� ]
	// ȸ�����̵�, ��й�ȣ, �̸�, ����, ����
	private String userId;
	private String userPwd;
	private String name;
	private int age;
	private char gender;
	
	// [ �����ں� ]
	/*
	 * ������ : �޼ҵ��̸��� Ŭ�����̸��� �����ϰ� �����ڷ����� ���� �޼ҵ�(��ȯ���� ����)
	 * 
	 * [ ǥ���� ]
	 * public Ŭ�����̸�(�Ű�����(��������)){
	 * 			�ش� �����ڸ� ���ؼ� ��ü ���� �� �����ϰ����ϴ� �ڵ�.
	 * }
	 * 
	 * ���� ) �޼ҵ��� ǥ����
	 * ���������� ��ȯ�� �޼ҵ��̸�(�Ű�����(��������)){
	 * 		�����Ϸ����ϴ� �ڵ�
	 * }
	 * 
	 * �����ڸ� �ۼ��ϴ� ����
	 * 1. ��ü�� �������ֱ� ���� ����
	 * 2. ��ü�� ���� �Ӹ� �ƴ϶� �Ű������� ���޵� ������ �ٷ� �ʵ忡 �ʱ�ȭ�� ����
	 * 
	 * �������� ����
	 * 1. �Ű������� ���� ������ => �⺻������
	 * 2. �Ű������� �ִ� ������
	 * -> ������ : �ʵ忡 ���� �ʱ�ȭ �� �� �ֳ� ������ ����
	 * 
	 * 
	 * ������ �ۼ��� ���ǻ���
	 * 1. �ݵ��!!!!!!!!!!!!!!!!!!!!!!! �������� �̸��� Ŭ������ �̸��� �����ؾ���!!!!(��/�ҹ���!!!)
	 * 2. ��ȯ���� �������� �ʴ´�.(�޼ҵ�� �����ϰ� ���ܼ� �򰥸� �� ����)
	 * 3. �����ڰ� ������ ������ ���������� �Ű������� �ߺ��� �Ǹ� �ȵȴ�. -> �����ε�
	 * 4. �Ű����� �����ڸ� ��������� �ۼ��ϰԵǸ� �⺻�����ڸ� JVM�� �ȸ���� ��!
	 * 
	 * => �⺻�����ڸ� �ݵ�� ����� ������ ���̴°� ����!!!
	 * 
	 */
	
	/*
	public User() {
		// �⺻������(�Ű������� ����!)
		/*
		 * ���� ��ü�� ������ �������� ���!!! => �޸� ������ �Ҵ� �� ��, ������ Ȯ���� ��!
		 * �⺻�����ڴ� �����ص� ������ ���� ����!
		 * �����ڸ� �ϳ��� �ȸ���� JVM�� �⺻�����ڸ� �ڵ����� �������!
		 * => �⺻�����ڴ� "�׻�"�ۼ�����!!!
		 */
		//System.out.println("������ ȣ�� �� �ƴ� ~ ~ ?");
	//}
		
	public User() {} // �̰� ������ �� �����!!!!!!!!
	
	// �Ű����� �ִ� ������!!!!
	public User(String userId, String userPwd, String name) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
	}
	
	public User(String userId, String userPwd, String name, int age, char gender) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	// [ �޼ҵ�� ]
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return this.userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return this.gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return this.name + "���� ���̵�� " + this.userId + "��й�ȣ��" + this.userPwd 
				+ "���̴� " + this.age + "������ " + this.gender + "�Դϴ�.";
	}

}
