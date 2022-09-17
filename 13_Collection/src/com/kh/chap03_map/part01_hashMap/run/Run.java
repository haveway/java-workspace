package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Burger;

public class Run {

	public static void main(String[] args) {
		
		// HashMap
		// [ ǥ���� ]
		// HashMap �̸� = new HashMap();
		
		// key + value ��Ʈ�� �߰�!!!!!!
		
		// Ű == �ĺ��� => ���� �̸�
		// ��� == ��   => ��, ����
		
		HashMap<String, Burger> hm = new HashMap<>();
		
		// ����ִ� �ؽøʿ� �߰��غ���!!!!!!!!
		// ArrayList, HashSet => add()
		// (List�迭 Set�迭 Collection�� ������ Ŭ����)
		
		// HashMap => put() - Map�迭
		// => key + value ��Ʈ�� �߰�
		
		// 1. put(K key, V value) : �� ������ key + value��Ʈ �߰�
		
		hm.put("�Ұ�����", new Burger("�Ұ���", 138));
		hm.put("��������", new Burger("����¸�", 500));
		hm.put("���", new Burger("����¸�",800));
		hm.put("��������Ų����", new Burger("����ġŲ��",593));
		hm.put("��Ī��¡�Ź���", new Burger("����ġŲ��",593));
		hm.put("������������", new Burger("¬���Ѹ�", 1000));
		
		System.out.println(hm);
		// �� ���� ���� ���� X
		// Value���� �ߺ� ���� ��� => Key���� �ߺ��ȵ�
		
		hm.put("��Ī��¡�Ź���", new Burger("�𸣰ھ��",0));
		
		System.out.println(hm);
		// ���� Key������ �ٸ� Value�� �߰��Ѵٸ� �������!!!
		// Key�� �ĺ��ڰ��� !!! => key�� value�� ã�ư���
		
		// 2. get(Object key) : Object
		// => ���׸� �����������Ƿ� �Ű������� String, ��ȯ�� Burger
		// �ش� key���� �ش��ϴ� value�� ��ȯ���ִ� �޼ҵ� 
		
		System.out.println(hm.get("��Ī��¡�Ź���"));
		
		Burger b = /*(Burger)*/hm.get("���");
		// ���׸� ������ ���س��ٸ� �Ź� �ٿ�ĳ������ �ؾ���
		
		// 3. size() : �÷��ǿ� ��� �ִ� ����
		System.out.println(hm.size());
		
		// 4. replace(K key, V value) : �ش� Ű ���� ã�Ƽ� ����� ���������
		
		hm.replace("���", new Burger("�̳�¥��", 5000));
		// ������ �������� �ʴ� Ű���� �������� ��???
		// -> �߰��� ������ �ʴ´�.
		hm.replace("���¹���", new Burger("�̳�������", 50000));
		
		System.out.println(hm);
		
		
		// 5. remove(Object key) => �ش� Ű���� ã�Ƽ�
		// Ű + ��� ��Ʈ�� �����ִ� �޼ҵ�
		
		hm.remove("���");
		
		System.out.println(hm);
		
		System.out.println("-----------------------------------------------------");
		
		// �ؽøʿ� ����ִ� ��� ��ҵ鿡 ���������� �����ڰ��� �� �� ???
		// for �� X, ���� for �� X
		// List�� addAll �ϴ¹��..??
		// Iterator�� ���� ��� => �ٷ�ȣ���� �ȵ�
		
		// Map�迭�� Set�迭�� �ٲ㼭 => Iterator�� ����Ұ�!
		// 2���� ���!
		
		// 1. keySet() �̿��ϴ� ���
		// => HashMap���� �����ϴ� �޼ҵ�, Set�� key�鸸 ����ش�.
		// => ��ȯ���� Set
		
		// 1�ܰ� ) ket�鸸 Set�� ��´�.
		Set<String> keySet = hm.keySet();
		
		// 2�ܰ� ) 1�ܰ迡�� ������� Set ���빰���� Iterator�� ���
		Iterator<String> itKey = keySet.iterator();
		
		// 3�ܰ� ) Iterator�κ��� �ݺ��� �̿��ؼ� ���������� key - value �̱�
		while(itKey.hasNext()) {
			// �ȿ� ���� �����е��� ?
			// ��¹� ��� : ��ҵ��� �������پ� ������ k-v
			String key = itKey.next();
			System.out.println(key + "-" + hm.get(key));
		}
		
		System.out.println("-----------------------------------");
		
		// 2. entrySet() �̿��ϴ� ���
		
		// 1) Map�� �ִ� key + value��Ʈ��
		// Entry�������� Set�� ���
		Set<Entry<String, Burger>> entrySet = hm.entrySet();
		
		for(Entry<String, Burger> e : entrySet) {
			System.out.println(
								"key : "
								+e.getKey()
								+", value : "
								+e.getValue()
					);
		}

	}
	
	/*
	 * Map �迭 Ư���� ��ҵ鿡 ���������� ������ �������� ����� ����!!!!!
	 * 
	 * 
	 * => Map�迭�� Set�迭�� �ٲ㼭 => �ݺ���, ArrayList�� �ٲ㼭 �ݺ���
	 * 
	 * Iterator�� ���¹��
	 * 
	 * => Map�迭�� Set�迭�� �ٲٴ� 2���� ��� : keySet(), entrySet()
	 * 
	 * 
	 */

}
