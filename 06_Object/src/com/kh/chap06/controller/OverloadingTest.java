package com.kh.chap06.controller;

public class OverloadingTest {
	
	/*
	 * �޼ҵ� �����ε�
	 * 
	 * - �� Ŭ���� �ȿ� ���� �޼ҵ������ ���� �޼ҵ���� ������ �� �ִ� ���!!
	 * - �Ű������� �ڷ����� ����, ����, ������ �� �ٸ��� �ۼ��Ǿ���Ѵ�.
	 * - ��, �Ű�������, ����������, ��ȯ���� �޼ҵ� �����ε��� ������ ���� �ʴ´�.
	 * 
	 */
	
	// �޼ҵ��̸��� test�� ����
	public void test() {
		System.out.println("�ȳ��ϼ���~~~~");
		System.out.println("���� ���� 12�� ���ҽ��ϴ�~~~");
	}
	public void test(int a) {
		System.out.println("�̰� ��Ʈ a �ϳ��� �޾Ҿ�� ~");
	}
	public void test(int a, String s) {
		System.out.println("�̰� ��Ʈ a ���� ��Ʈ�� s �� ��°�� �޾Ҿ�� ~");
	}
	public void test(String s, int a) {
		System.out.println("�̰� ��Ʈ�� s ���� ��Ʈ a �� ��°�� �޾Ҿ�� ~");
	}
	public void test(int a, int b) {
		System.out.println("�̰� ��Ʈ a ��Ʈ b �޾Ҿ��  ~");
	}
	
	/*
	 * ������ �ΰ��� �޴� test�� �ϳ� �� ����ٸ�??
	 * �Ű������� �̸��̶��� ������� �ڷ����� ���� ������ ���� ������ ������ �߻���!!!!
	 * - ��! �Ű����� �ڷ����� ������ ������ �׻� �ٸ��� �ۼ��Ǿ�߸� �Ѵ�.
	public void test(int c, int d) {
		
	}
	*/
	public void test(int a, int b, String s) {
		System.out.println("int a int b String s");
	}
	
	// ��ȯ���� �ٸ��ٰ� �����ε��� ������� �ʴ´�.
	// �޼ҵ带 ȣ���ϴ� �������� �Ű������� �����ϸ� ������ ������ �߻�
	// ��ȯ���� ������� �Ű������� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ���Ѵ�.
	/*
	public int test(int a, int b, String s) {
		
	}
	*/
	
	/*
	 * ���������ڰ� �ٸ��ٰ� �����ε��� ������� ����.
	 * ���������ڿʹ� ������� �Ű������� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ���Ѵ�.
	private void test(int a, int b, String s) {
		
	}
	*/
	

}
