package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {
	/*
	 * �١١١١١١١١١١١١١١١١� Ÿ�� �١١١١١١١١١١١١١١١١�
	 * �޼ҵ�, �ʵ�
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		// = �� Ư¡
		// ������ ���� ���׿� �����Ѵ�.
		// �ڡڡڡڡڡڡڡڡڡڡ� �纯�� �ڷ����� ���ƾ��Ѵ�. �ڡڡڡڡڡڡڡڡڡڡ�
		
		
		
		// �θ𲨴� ���� ������ ����
		
		// 1. �θ�Ÿ�� �ڷ������� �θ� ��ü�� �ٷ�� ���
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild1(); // �ڽĲ��� ������ �ƴ�!!!!
		// p1���δ� Parent���� ���ٰ���
		
		// 2. �ڽ�Ÿ�� �ڷ������� �ڽ� ��ü�� �ٷ�� ���
		Child1 c1 = new Child1();
		c1.printChild1(); // ������ ���� ~
		c1.printParent(); // �θ�Բ��� ���� ~
		// c1���δ� Parent, Child1�� �Ѵ� ���� ����
		
		// 3. �θ�Ÿ�� �ڷ������� �ڽ� ��ü�� �ٷ�� ��� => �������� ����� ����
		Parent p2 = /*(Parent)*/new Child1();
		p2.printParent();
		// p2.printChild1(); // �ڽĲ� ������ �ȵ�
		// p2�δ� Parent�� ������ ����
		
		// ������ �ڷ����� �ٸ����� ������ ��������
		// ��? Parent������ �ڵ�����ȯ�� �Ǿ����ϱ�
		// ��ӱ��������� Ŭ���� ����ȯ�� �����ϴ�.
		((Child1)p2).printChild1();
		
		
		/*
		 * Ŭ���� ���� ����ȯ
		 * 
		 * - "��ӱ���"�� ��쿡�� Ŭ�������� ����ȯ�� �����ϴ�!!!
		 * 
		 * 1. UpCasting
		 * 
		 * �ڽ�Ÿ�� => �θ�Ÿ��
		 * ������ �����ϴ�.
		 * ex ) �ڽ�.�θ�޼ҵ�();
		 * 
		 * 2. DownCasting
		 * 
		 * �θ�Ÿ�� => �ڽ�Ÿ��
		 * ������ �Ұ����ϴ�.
		 * ex ) ((�ڽ�)�θ�).�ڽĸ޼ҵ�();
		 * 
		 */
		
		// �������� ����ϴ� ������???
		// �迭�� �Ẹ��
		// �迭�� Ư¡ == �������� �ڷ����� ������ ��� ������ ����
		
		// �������� ������......
		// Child1 ��ü 2���� Child2 ��ü 2���� �����ؾߵ�
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,3);
		arr1[1] = new Child1(4,5,6);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(1,2,3);
		arr2[1] = new Child2(4,5,6);
		
		System.out.println("�������� ������ �迭");
		
		// �θ�Ÿ���� ��ü �迭�� ���� ������
		// �ڽĵ��� �θ� �迭�� �����
		
		Parent[] arr = new Parent[4];
		arr[0] = /* (Parent) */new Child1(1,2,3);
		arr[1] = /* (Parent) */new Child2(4,5,6);
		arr[2] = /* (Parent) */new Child2(7,8,9);
		arr[3] = /* (Parent) */new Child1(10,11,12);
		
		// printParent �޼ҵ� ȣ��
		for(int i = 0; i< arr.length; i++) {
			arr[i].printParent();
		}
		
		// printChild1, 2 �޼ҵ� ȣ���� �ϰ�ʹ�!!!!
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		// Child1�̾��� �༮�� Child2�� ��������ȯ�� �Ѵٸ�??
		//((String)arr[0]).printChild2();
		// ClassCastException�� �߻�
		// Ŭ�������� ����ȯ�� �߸��Ǿ��� ��� �߻���
		// ���� Child1�ξָ� Child2�� �ٲٷ��ϱ� ������ ����.
		
		System.out.println("�ݺ��� + �������̵�");
		
		for(int i = 0; i < arr.length; i++) {
			
			/*
			 * instanceof ������ => true / false
			 * 
			 * ���� ���۷����� ���������� � Ŭ����Ÿ���� �����ϴ��� Ȯ���� �� ���
			 */
			/*
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
			*/
			// �� �迭�� �ε����� �������� ����
			arr[i].print();
			// "�� �θ��~ �� " 4�������� �Ǵµ�????
			// ���۰���� �������̵� �� print�� ���� ȣ���� ��
			
			/*
			 * �������ε� : ���α׷� ���� �Ǳ� ������ ������ �Ǹ鼭 �������ε�(�ڷ����� �޼ҵ带 ����Ŵ)
			 * 			 ��, ���������� �����ϴ� �ڽ�Ŭ������ �ش� �޼ҵ尡 �������̵��� �Ǿ��ִٸ�
			 * 			���α׷� ���� �� �������� �� �ڽ�Ŭ������ �������̵� �� �޼ҵ带 ã�Ƽ� ����
			 */
			
			// => �������̵� Ư¡ : �������̵� ������ ����� �޼ҵ带 ȣ�� ��
			//					�����޼ҵ庸�� ���Ӱ� ���ǵ� �޼ҵ尡 �켱������ ���� ������ ���� ȣ���� ��
			
			// �츮�� ������ ��ü �迭�� �� �� �������̵��� �̿��ϸ� ���� ���� ����ȯ�� ���ص� �ȴ�!
			
		}

	}
}
