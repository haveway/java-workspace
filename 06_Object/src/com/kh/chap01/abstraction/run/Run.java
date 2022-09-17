package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Lizard;

public class Run {

	public static void main(String[] args) {
		/*
		 * ��ü���� ���α׷��� : ���Ǽ��迡�� �������� �����(��ü)���� ��ȣ�ۿ�(����)��
		 * 					���α׷��� �� ���� �ڵ�� �����ϴ� ��.
		 * 
		 * 
		 * �����ϰ����ϴ� ���α׷� ���� ��ü(����)�� ����� ���ؼ���(�����ϱ� ���ؼ�)
		 * 								=> Ŭ������� Ʋ�� ���� �������Ѵ�.
		 * 								Ŭ������? �� ��ü���� �Ӽ�(����, ����)���� ��Ƴ��� �׸� �Ǵ� Ʋ ���� ����!!
		 * 								Ŭ������ ��� ����°�?
		 * 
		 * 
		 * Ŭ���� : ��ü���� ������ ��Ƴ��� �׸�(Ʋ)���� ���� ���� => VO(Vaule Object)
		 * 
		 * 
		 */
		
		
		// �������� ������ �̸��� ? �밨 => String name;
		// �谡�Ͼ��. => String bellyColor;
		// ���������. => String footColor;
		// ���������. => String bodyColor;
		// ����������. => String eyesColor;
		
		Lizard L1 = new Lizard(); // ��ü�� ���� => new Ű���� ���!!!! �޸��� heap������ ������ �Ҵ��!!!!!
		Lizard L2 = new Lizard();
		
		L1.name = "�밨��";
		L1.bellyColor = "�Ͼ��";
		L1.footColor = "�����";
		L1.bodyColor = "�����";
		L1.eyesColor = "������";
		
		System.out.println(L1.name + "�� �� ������ " + L1.eyesColor
							+ " �� ������ " + L1.bellyColor + " �� ������ " + L1.footColor);
		
		L2.name = "�յ�����";
		L2.bellyColor = "�˴�";
		L2.footColor = "�˴�";
		L2.bodyColor = "�˴�";
		L2.eyesColor = "�Ͼ��";
		
		System.out.println(L2.name + "�� �� ������ " + L2.eyesColor
				+ " �� ������ " + L2.bellyColor + " �� ������ " + L2.footColor);
		
		L1.weight = 0.15;
		L2.weight = 3;
		System.out.println(L1.name + "�� �����Դ� " + L1.weight + "kg �Դϴ�.");
		System.out.println(L2.name + "�� �����Դ� " + L2.weight + "kg �Դϴ�.");
		
		L1.eat(2);
		L2.eat(5);
		System.out.println(L1.name + "�� �����Դ� " + L1.weight + "kg �Դϴ�.");
		System.out.println(L2.name + "�� �����Դ� " + L2.weight + "kg �Դϴ�.");
		
		L1.jump();
		L1.jump();
		L1.jump();
		L1.jump();
		L1.jump();
		L1.jump();
		L1.jump();
		L1.jump();
		System.out.println(L1.name + "�� �����Դ� " + L1.weight + "kg �Դϴ�.");
		
		// ���������� �����ؼ� �� ����
		// ���������� �����ؼ� �� ��ȸ
		
		// ���� �����ؼ� ���� �����ϰ� ��ȸ�� ��� => ������ ������ ���� �� ����
		// ��ü ������ ���� ��Ģ �� �ϳ��� �������� => ���������� �ϱ� ���� ��� �� �ϳ� ĸ��ȭ(encapsultion)

	}

}
