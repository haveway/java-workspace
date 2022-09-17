package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

// �߻�Ŭ����
// [ ǥ���� ]
// ���������� abstract class Ŭ�����̸� {
// abstract : ����� -> �߻�Ŭ����, �߻�޼ҵ� ������ �� ����

/*
 * �߻�޼ҵ尡 �����ϴ� ���� �߻�Ŭ������ ���ǵ�
 * abstract��� ���� ����ؼ� �����ؾ���
 * ��ü ������ �Ұ����ϴ�. �θ�Ŭ���� ������ ����(�������� ���� ����)
 * 
 * 
 * �߻�Ŭ���� == �Ϲ��ʵ� + �Ϲݸ޼ҵ� + �߻�޼ҵ�(��������)
 * => �߻�޼ҵ尡 ��� �߻�Ŭ������ ���ǰ���
 * ����?? �������� ����
 * 
 * => ��������� �����ڰ� �Ǵ����� �� �� Ŭ������ ��ü ������ �Ұ����ؾ��Ѵ� ��� ������ ��� �߻�Ŭ������ ����
 * => ���������� �����ڰ� �Ǵ������� �ش� Ŭ������ ���� ��ü������ �� ������ �����ΰ� ����.
 */

public abstract class Sports {
	
	private int people;

	public Sports() {
	}

	public Sports(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}
	
	// �߻�޼ҵ�
	// [ ǥ���� ]
	// ���������� abstract ��ȯ�� �޼ҵ��̸�(){
	
	public abstract void rule();
	
	/*
	 * method body�� ���������ʴ� �̿ϼ��޼ҵ�
	 * abstract ���� �Ἥ �����ؾ� ��
	 * 
	 * �̿ϼ� �޼ҵ尡 �ϳ��� ���ԵǴ� ���� �ش� Ŭ������ �̿ϼ�Ŭ����(�߻�Ŭ����)�� ��
	 * �ش� Ŭ���� �տ��� abstract��� ���� ����Ѵ�.
	 */
	

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}

}
