package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic {
	
	// �ʵ��
	// ����
	
	// �����ں�
	// �⺻, �Ű�����
	public Baby() {}
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// �޼ҵ��
	// toString
	@Override
	public String toString() {
		return "Baby [" + super.toString() + "]";
	}
	
	@Override
	public void eat() { // �ֱⰡ ����� ����?
		// ������ 5����
		// �����԰� 5�����ؾ���
		// weight == �θ��� �ʵ� + 5
		// ������ ������ == ������ ������ + 5
		super.setWeight(super.getWeight() + 5);
		// �ǰ��� 5����
		super.setHelath(super.getHelath() + 5);
	}
	
	@Override
	public void sleep() {
		// �ǰ��� 10 ����
		super.setHelath(super.getHelath() + 10);
	}

}
