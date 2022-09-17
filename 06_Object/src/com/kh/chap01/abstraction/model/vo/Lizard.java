package com.kh.chap01.abstraction.model.vo;

/*
 * Ŭ������ ����
 * 
 * public class Ŭ�����̸� {
 * 
 * 					// �ʵ��
 * 
 * 
 * 					// �����ں�
 * 
 * 
 * 					// �޼ҵ��
 * 
 * 
 * }
 */

// ��������� �߻�ȭ�ؼ� ���� Ŭ����
public class Lizard {
	
	// [�ʵ��]
	// ���������� �ڷ��� �ʵ��̸�;
	
	// ���������� : �� �ʵ忡 ������ �� �ִ� ������ ������ �� ����
	//				public > protected > default > private
	//			Ŭ���� �ȿ��� �ʵ带 ������ �� �ݵ�� ���� �����ڸ� ���ٰ���

	public String name;
	public String bellyColor;
	public String footColor;
	public String bodyColor;
	public String eyesColor;
	public double weight;

	// [�����ں�]
	
	// [�޼ҵ��]
	public void eat(int weight) {
		this.weight += weight;
	}
	
	public void jump() {
		
		if(0.15 <= weight && weight < 1) {
			System.out.println("�� ��Ȼ� ~ �ʳ��� ~");
		} else {
			weight -= 0.5;
		}
	}

	

}
