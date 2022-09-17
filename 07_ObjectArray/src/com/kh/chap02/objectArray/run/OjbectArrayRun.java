package com.kh.chap02.objectArray.run;

import java.util.ArrayList;

import com.kh.chap02.objectArray.model.vo.Phone;

public class OjbectArrayRun {

	public static void main(String[] args) {
		// int[] arr = new int[3];
		// ��ü�迭 ���� �� �Ҵ�!
		Phone[] arr = new Phone[3];
		
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0]); // == Phone arr[0];
		
		arr[0] = new Phone();
		System.out.println(arr[0]);
		arr[0].setName("������");
		arr[0].setSeries("13");
		arr[0].setBrand("Apple");
		arr[0].setPrice(1090000);
		System.out.println(arr[0]); // -> �ּ�
		System.out.println(arr[0].information());
		
		arr[1] = new Phone("������", "S22", "�Ｚ", 2200000);
		arr[2] = new Phone("�ִ���", "ANC", "�Ｚ", 3000000);
		
		// �Ѱ���, ��հ� ���
		
		int sum = 0;
				//arr[0].getPrice() + arr[1].getPrice() + arr[2].getPrice();
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].getPrice();
		}
		
		System.out.println("���հ� : " + sum + "��");
		System.out.println("��հ� : " + (sum / arr.length) + "��");
		
		
		
		
		
		// ArrayList ����
		ArrayList<Phone> list = new ArrayList<>(3); // Phone ��ü�� ���� �� �ִ� ArrayList(3ĭ¥��)�� ����
		
		list.add(new Phone("������", "13", "Apple", 1090000));
		list.add(new Phone("������", "S22", "�Ｚ", 2200000));
		list.add(new Phone("�ִ���", "ANC", "�Ｚ", 3000000));
		list.add(0, new Phone("������", "14", "Apple", 50000)); // �ڵ����� ������ up, 0�� �ε����� ����
		
		int sum2 = 0;
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).information());
			sum2 += list.get(i).getPrice();
		}
		System.out.println("\n���հ� : " + sum2 + "��");
		System.out.println("��հ� : " + (sum2 / list.size()) + "��");
		
	}
}
