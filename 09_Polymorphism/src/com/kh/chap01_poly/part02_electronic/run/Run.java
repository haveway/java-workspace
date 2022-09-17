package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NintendoSwitch;
import com.kh.chap01_poly.part02_electronic.model.vo.SmartPhone;
import com.kh.chap01_poly.part02_electronic.model.vo.Tv;

public class Run {
	public static void main(String[] args) {
		
		// 1. �������� ���� ������ ���(Electronic Controller1)
		// ��ü�� ���� : ��� ���� �ʵ���� �޸𸮿����� �ö�
		/*
		ElectronicController1 ec1 = new ElectronicController1();
		
		// ����߰�
		ec1.insert(new SmartPhone("LG", "����", 800000, "010-1111-2222"));
		ec1.insert(new NintendoSwitch("Nintendo", "Switch", 310000, true));
		ec1.insert(new Tv("LG", "¯¯����Ƽ��", 3000000, 100));
		
		// ���Կ� �ִ� ��ǰ���� ��ȸ�� �ð�
		NintendoSwitch ns = ec1.selectNintendoSwitch();
		SmartPhone sp = ec1.selectSmartPhone();
		Tv tv = ec1.selectTv();
		
		System.out.println(ns.toString());
		System.out.println(sp);
		System.out.println(tv);
		
		*/
		
		// 2. �������� �������� ��� (Electronic Controller2)
		
		// ��ü ����
		ElectronicController2 ec2 = new ElectronicController2();
		
		// ����߰�
		ec2.insert(new SmartPhone("LG", "����", 800000, "010-1111-2222"), 0);
		ec2.insert(new NintendoSwitch("Nintendo", "Switch", 310000, true), 1);
		ec2.insert(new Tv("LG", "¯¯����Ƽ��", 3000000, 100), 2);
		
		
		// ����Ʈ�� ����
		// �θ�Բ� ������? ����
		// ����? ����
		
		// �Ϸ�Ʈ�δ� ����
		// ����? ����
		// �ڽĲ�? �ڽĲ�
		
		SmartPhone sp = (SmartPhone)ec2.select(0);
		Tv tv = (Tv)ec2.select(2);
		NintendoSwitch ns = (NintendoSwitch)ec2.select(1);
		// �����ȸ
		System.out.println(sp);
		System.out.println(tv);
		System.out.println(ns);
		
		// ��� �α׸� ���� ���ڴ�.
		Electronic[] elec = ec2.selectAll();
		// ��������, ��������
		
		System.out.println("-----------------------");
		for(int i = 0; i < elec.length; i++) {
			System.out.println(elec[i]);
		}
		
		
		/*
		 * �������� ����ϴ� ����
		 * 
		 * �θ�Ÿ���� �ڷ������� �پ��� �ڽİ�ü���� ��� �ٷ� �� ����
		 * 
		 * 
		 * �޼ҵ��� ������ �پ��
		 * �ڵ尡 ��
		 * �θ�Ÿ���� ��ü�迭�� �ڽİ�ü�� ��밡��(�ݺ�����밡��)
		 * �ҽ��ڵ尡 �پ��ϱ� ȿ������ ��������
		 * 
		 */
		

	}
}
