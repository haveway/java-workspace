package com.kh.chap02.loop;

public class C_DoWhile {
	
	/*
	 * do-while��
	 * ������ ���ǰ˻� ���� ������ 1ȸ�� ����!
	 * ������ ���� �ʴ��� �ѹ��� ����
	 * while(false)
	 * 
	 * [ ǥ���� ]
	 * �ʱ��; // �ʼ��� �ƴ�
	 * do {
	 * 		System.out.println("�ѹ��� �غ� ~ ");
	 * 		������; // �ʼ��� �ƴ�
	 * } while(���ǽ�);
	 * 
	 * while���� ó�� ������ ���� ���ǽ� �˻� �� true���� ����
	 * do-while�� ù ������ ������ ���ǰ˻� ���� ������ �� �� ����!!
	 */
	
	public void method1() {
		
		// ���ʿ� ������ ���� �ʾƵ� �ѹ��� ����!!!
		int num = 1; // �ʱ��
		
		do {
			System.out.println("������ �� ���� �غ�~~");
		}while(num == 0);
		
	}
	
	public void method2() {
		
		int i = 1;
		
		do {
			System.out.println(i++ + " ");
		}while(i <= 5);
		
	}

}
