package com.kh.chap05.run;

import com.kh.chap05.model.vo.User;

public class Run {
	public static void main(String[] args) {
		
		//1. �⺻�����ڸ� ����ؼ� ��ü�� ���� �� setter�� �̿��ؼ� �ʵ尪 �ʱ�ȭ
		User user01 = new User();
		user01.setUserId("user01");
		user01.setUserPwd("pass01");
		user01.setName("����1");
		
		System.out.println(user01.information());
		
		// 2. ��ü ������ ���ÿ� �ʵ尪�� �ʱ�ȭ
		// ���̵�, ���, �̸�
		User user02 = new User("user02", "pass02", "����2");
		
		System.out.println(user02.information());
		
		// 3. �����ڷ� ��� �ʵ尪 �ʱ�ȭ!
		User user03 = new User("user03", "pass03", "����3", 22, 'M'); 
		System.out.println(user03.information());
		
		// ���� setter �� �ʿ��ұ�?
		// �߰��� ��й�ȣ �ٲ�ߵǸ�? ����������??
		
	}
}
