package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {
	public static void main(String[] args) {
		/*
		 * �÷���(Collection)
		 * 
		 * �ڷᱸ���� ����Ǿ��ִ� Ŭ����
		 * �ڹٿ��� �����ϴ� "�ڷᱸ��"�� ����ϴ� "�����ӿ�ũ"�̴�.
		 * 
		 * - �ڷᱸ�� : �����͵��� ȿ�������� �ٷ� ��
		 * 			 (��ȸ, ����, �߰�, ����, ����)�ʿ��� ����
		 * - �����ӿ�ũ : ȿ������ ��ɵ��� �̹� ���ǵǾ��ִ� ��
		 * 
		 * 
		 * �����غ���!!!
		 * �����͵��� ���Ӱ� �߰��ǰų�, �����ǰų�, ���� �Ǵ� ���(�˰���) ����
		 * �̹� ���ǵǾ��ִ� Ʋ == �÷���
		 * => �ٷ��� �����͵��� �����ϰ��� �� ��?? 
		 * �迭�� ������ ����� Ȱ���� �����ϱ��ߴ�. �迭�� ������.
		 * 
		 * �迭�� �÷����� ������
		 * - �迭�� ����
		 * 1. �� Ÿ���� �����͵鸸 ���� ����
		 * 2. �迭�� ������ �� �� ���� ũ�⸦ �����ؾ���
		 * => �� �� ������ ũ��� ������ �Ұ���
		 * ���ο� ���� �߰��ϰ��� �� �� ũ�Ⱑ ���ĳ� ��� ���ο� ũ���� �迭�� �����,
		 * ������ ������� �����ϴ� �ڵ带 ���� ¥����
		 * 3. �迭 �߰� ��ġ�� ���ο� �����͸� �߰��ϰų� �����ϴ� ���
		 * ������ ������ �����ְų�, �о��ִ� �ڵ带 ���� ¥�� ��
		 * 
		 * 
		 * - �÷����� ����
		 * 1. �⺻������ ���� Ÿ���� �����͵��� ���� ����
		 * => ���� Ÿ���� �����͵鸸 ����� ���� ����
		 * (���׸� ������ ���� �� Ÿ���� �����͵鸸 ���� �� �ְԲ��� ����)
		 * 2. ũ�⿡ ������ ����.
		 * => ���� ũ�� ������ ���� �ʾƵ� �ȴ�.
		 * => ���� ���� ũ�������� �߰�, ũ�⸦ �Ѿ�� ���� �� �߰��ϰ��� �� ��
		 *    �˾Ƽ� ũ�Ⱑ �þ��.
		 * 3. �߰��� ���� �߰��ϰų� �����ϴ� ��� ���� �����ְų� �о��ִ� �ڵ尡
		 * �̹� �޼ҵ�� ���ǵǾ� ����
		 * => �׶��׶� �ʿ��� �޼ҵ���� ȣ���ؼ� ���� �ȴ�!
		 * 
		 * 
		 * ����� �����͵��� ��Ƹ� �ΰ� "��ȸ"�� �� ���� => �迭
		 * ����� �����͵��� �߰�, ����, ���� �� ��� => �÷���
		 * 
		 * 3���� ������ �÷���
		 * 
		 * - List �迭 : ������ϴ� ��(Value)�� ���� / ���� �� ���� ����(index)
		 * 							�ߺ��� ���
		 * 						�� ) ArrayList, LinkedList, Vector
		 * 						ArrayList�� ���� ���̾��δ�.
		 * 
		 * - Set �迭 : ������ϴ� ��(Value)�� ���� / ���� �� ���� ���� X
		 * 							�ߺ��� ��� X
		 * 						�� ) HashSet, TreeSet => HashSet�� ���ؼ� ��� ��.
		 * 
		 * - Map �迭 : Ű(key) + ��(Value) ��Ʈ�� ���� / ���� �� ���� ���� X
		 * 								�ߺ� Ű ��� X / �ߺ� ��(Value) ��� 
		 * 						�� ) HashMap, HashTable, TreeMap, Properties
		 * 						=> HashMap, Properties�� ���ؼ� ����
		 */
		
		
		// ArrayList�� ���� ���
		// [ ǥ���� ]
		// AraayList ��ü�̸� = new ArrayList();
		// 1. ũ�⸦ ���� ���� ���ϴ� ���
		// ArrayList ��ü�̸� = new ArrayList(ũ��);
		// 2. ũ�⸸ŭ ����ڴ�. ũ���� ������ ��� ��� �ڵ����� ũ�Ⱑ �þ
		
		ArrayList list = new ArrayList(3);
		// ���������� ũ�Ⱑ 3¥�� ArrayList�� ����ڴ�!
		
		System.out.println(list);
		
		// 1. ����ִ� list�� �߰�����!!!!! => Music ��ü�� ���� �߰��غ���!!!
		// add(E e) : �ش� ����Ʈ�� ���� ���ڷ� ���޵� ��Ҹ� �߰������ִ� �޼ҵ�
		// E --> element : ���׸�
		list.add(new Music("�Ϸ���","���̺�"));
		list.add(new Music("�ڿ���","������"));
		list.add(new Music("One Love","MC the Max"));
		list.add("��"); // ũ�Ⱑ �þ��. ���� ������ ���� ���� �� �ִ�.
		// ������ �����Ǹ鼭 ����ȴ�.(index��������)
				
		System.out.println(list);
		
		// add �޼ҵ� ��� �� �����ε��� ���¸� ����غ���!
		// add(int index, E e) : ����Ʈ�� index�ڸ��� ���޵� e�� �߰������ִ� �޼ҵ�
		list.add(0, "1");
		list.add(3, new Music("�����ϴ�","�̽�ö"));
		// �߰��� �� �߰� �� �˾Ƽ� ������ ������ �ڷ� �� ĭ�� �о��ִ� �۾��� ���������� �����
		
		System.out.println(list);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// 2. ���� �߰��غ����ϱ� �����غ���!!!!
		// set(int index, E e) : ����Ʈ�� index�ڸ��� ���� ���޵� e�� �������ִ� �޼ҵ�
		list.set(0, "����");
		list.set(3, new Music("������", "����Ŭ�轼"));
		System.out.println(list);
		
		// 3. ���� �����غ���!!
		// remove(int index) : ����Ʈ�� index�ڸ��� ��䰪�� �������ִ� �޼ҵ�
		list.remove(0); // ���� �� ���ο� 0��° �ε����� ��
		Music tIndex = (Music)list.remove(1); // IndexOutOfBoundsException : Index 5, �߻�!!!	
										// �ε����� ���� �� ����ؼ� �����ؾ���!!
		System.out.println("������ �ε����� ��ü : " + tIndex);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 4. ����Ʈ�� ũ�⸦ ��ȯ�غ���
		// size() : ����Ʈ�� ũ�⸦ ��ȯ���ִ� �޼ҵ� == ����ִ� ����� ����
		System.out.println("����Ʈ�� ��� ����� ���� : " + list.size());
		System.out.println("����Ʈ�� ������ �ε��� ��ȣ : " + (list.size() - 1));
		
		list.remove(list.size() - 1);
		
		System.out.println(list);
		
		
		
		// 5. ����Ʈ�� �ش� �ε����� ��� ��Ҹ� ��ȯ���ִ� �޼ҵ�
		// get(int index) : E
		Music m = (Music)list.get(0); // ������ -> ��������ȯ
		System.out.println(m);
		System.out.println(list.get(0));
		// 1�� �ε����� �� ������ �˰� �ʹ�.
		System.out.println("1�� �ε��� �� ���� : " + ((Music)list.get(1)).getTitle());
		
		// index ���� + get �޼ҵ� => �ݺ���
		// ��Ҹ� �̾ƺ���
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "��° �� : " + ((Music)list.get(i)).getTitle());
		}
		
		// ���� for�� => ���� ��ȸ�ϴ� �������� ����� ����
		// for(���� �޾��� ���� : ���������� ������ �迭 �Ǵ� �÷���)
		for(Object o : list) {
			System.out.println(o);
		}
		
		
		// 6. ����Ʈ�� �κи� ����
		// subList(int index1, int index2) : List
		// index1���� index2������ �����Ͱ����� �����ؼ� ���ο� ����Ʈ�� ��ȯ�����ش�.
		
		List sub = list.subList(1, 2);
		
		System.out.println(sub);
		
		// 7. ����Ʈ + ����Ʈ
		// addAll(Collection c) : �ش� ����Ʈ�� �ٸ� �÷��ǿ� �ִ� �����͵��� ��°�� �߰����ִ� �޼ҵ�
		list.addAll(sub);
		System.out.println(list); // ������(Value)�� �ߺ� ���� ����
		
		// 8. ����Ʈ�� ����ִ��� Ȯ���ϴ� �޼ҵ�
		// isEmpty() : ��������� true / ä���������� false ��ȯ
		System.out.println(list.isEmpty());
		
		// 9. �ش� ����Ʈ�� ��°�� ����ִ� �޼ҵ�
		// clear()
		list.clear();
		
		System.out.println(sub instanceof List);
		//sub.clear();
		//System.out.println(sub.size());
		System.out.println(list.isEmpty());
		
	}
	
}