package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
		
		// �̸�, ����, ����, Ÿ�̾�ũ��
		Car c = new Car("�غ���", 17.0, "����", 15);
		Ship s = new Ship("�������̹�", 3.0, "�", 15);
		Airplane a = new Airplane("����787", 2.0, "������", 200, 20);
		
		Vehicle v = new Vehicle("Ż��", 1, "�����̰�");
		
		System.out.println(c/*.toString()*/);
		// toString() : �ش� ��ü�� ǮŬ������ + @ + �ش� ��ü�� �ּҰ�(16������ ����) ���·� ��ȯ
		// ������ ObjectŬ������ toString�̶�� �޼ҵ带 �������̵� �ؼ� ����!!!!
		System.out.println(s);
		System.out.println(a);
		
		v.howToMove();
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		
	}

}
