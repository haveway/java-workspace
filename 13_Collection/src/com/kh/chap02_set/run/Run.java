package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		// HashSet
		// ���� ����, index ���� ����, �ߺ� X, �������� X
		// [ ǥ���� ]
		// HashSet ��ü�̸� = new HashSet(); // �� HashSet
		
		// ���ڿ�
		HashSet<String> hs = new HashSet<>();
		
		// �� �߰�
		// add(�߰��� ��)
		hs.add("�ȳ��ϼ���~");
		hs.add(new String("�ݰ����ϴ�~~"));
		hs.add("������");
		hs.add("�ڹٳ������~~~");
		hs.add("������");
		hs.add("������~~!!!");
		hs.add("�ݰ����ϴ�~~");
		
		//hs.add(new Student());
		
		System.out.println(hs); // ���� ���� ���� X, �ߺ� ���� X
		
		
		// ũ�� ���ϱ�
		// size()
		System.out.println("hs�� ũ�� : " + hs.size());
		
		// ������
		// remove(������ ��)
		hs.remove("������~~!!!");
		
		System.out.println(hs);
		
		// ��� �� ����
		// clear()
		hs.clear();
		
		System.out.println(hs);
		
		// Student ��ü
		HashSet<Student> stds = new HashSet<>();
		
		
		stds.add(new Student("���", 40, 100));
		stds.add(new Student("������", 40, 80));
		stds.add(new Student("������", 40, 60));
		stds.add(new Student("�̽�ö", 38, 40));
		stds.add(new Student("���", 40, 100));
		
		System.out.println(stds);
		
		// ����������� X, �ߺ� ���� O
		// ��??? => ���� ��ü�� �Ǵ��� ���� �ʾұ� ����!
		// HashSetƯ¡ : ���� �߰� �ɶ����� equals()�� hashCode()�� �� �� �Ѵ� ����� true�ϰ�� ���� ��ü�� �Ǵ�
		
		// equals() : ���� ��ü�� �ּҰ��� ���ؼ� ��� ��ȯ (������ true) : boolean
		// hashCode() : ���� ��ü�� �ּҰ��� �ؽ��ؼ� 10������ ��ȯ
		
		/*
		 * �� ����!
		 * HashSet�� ��ü�� ���� �� ���������� equals�޼ҵ��
		 * hashCode�޼ҵ带 �������� ���� ��ġ�ϴ����� ���ϰ� ��´�.
		 * => equals�� ����� true�̸鼭(�׸���) hashCode�� ���� ��ġ�Ѵٸ�
		 * ���� ��ü�� �Ǵ�!!!!(�ߺ����� X)
		 * 
		 * Object Ŭ����
		 * equals() : �� ��ü�� �ּҰ��� ���ؼ� ��ġ�ϸ� true
		 * hashCode() : ��ü�� �ּҰ��� �ؽ��ؼ� 10���� ���·� ��ȯ
		 * => ��ȯ�� ����鳢�� ��! => �� ����� ��� ��ġ�ؾ߸� ���� ��ü!
		 * 
		 * => ���빰�� ������ �ּҰ��� �޶� ���ϰ�ü�� �ƴѰɷ� �Ǵ��� �Ǹ鼭 �ߺ� ������ �Ǿ������. => �����ϰ� �ʹٸ�?
		 * equals�޼ҵ�� hashCode�޼ҵ带 �������̵��ؼ� ����ؾ��Ѵ�.
		 * 
		 * Student Ŭ����
		 * 
		 * hashCode() : �� �ʵ尪�� �ϳ��� ���ڿ��� ����� �ؽ��ڵ尪�� ���� ��ȯ
		 * equals() : �� �ʵ��� ���� ��� ��ġ�ϸ� true
		 * 
		 */
		
		
		// HashSet�� ����ִ� ��� ������ ����ϴ� ���!
		
		System.out.println("--------------------------------");
		
		// 1. �ݺ��� => �ε��� ���� X
		for(Student s : stds) {
			System.out.println(s);
		}
		
		System.out.println("--------------------------------");
		
		// 2. HashSet�� ���빰�� ArrayList�� ��Ƽ�
		// �ε����� �̿��ؼ� ���
		
		// 1�ܰ� ) Arraylist ����
		ArrayList list = new ArrayList();
		// 2�ܰ� ) addAll() => ��ä�� �߰�
		list.addAll(stds);
		
		// 1 + 2 �ܰ� ) ������ ���ÿ� �ʱ�ȭ
		ArrayList<Student> students = new ArrayList<>(stds);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------------------");
		
		// 3. Iterator(�ݺ���) => HashSetŬ�������� ����
		// String�� StringTokenizer�� ����� ����
		
		Iterator it = stds.iterator();
		
		
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		//NoSuchElement : �������ž���!!!
		*/
		
		while(it.hasNext()) { // it�� next�� �� ���ð��� �����ֳ�?? ������ true // ������ false
			
			System.out.println(it.next());
			
		}
		
		// iterator() : List�迭�� Set�迭������ ȣ���� ����
		// => Map�迭������ �ٷ� ȣ���� �Ұ���!!
		
		System.out.println("--------------------------------");
	}
}