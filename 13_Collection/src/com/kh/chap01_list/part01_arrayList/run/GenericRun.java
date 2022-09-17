package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class GenericRun {
	
	
	public static void main(String[] args) {
		/*
		 * ���׸�(Generic) <E>
		 * �÷��� �ȿ��� �ٷ� Ÿ�Ե��� �̸� �������ִ� ���� => ��������� <Music>, <String> ......
		 * ��ü�� ����ȯ�� ����� �ʿ䰡 ����.
		 * => ���� ����ϰ� ���� Ÿ�Ը� ����� �� �ְ� ���ش�.
		 * 
		 * ���࿡ ���׸��� ���� <Music> (E == Music)
		 * 
		 * VS
		 * 
		 * ������ ���׸� ���� ���� �÷��� ��ü ���� �� (E == Object)
		 * �پ��� Ÿ���� ���� ��� �� ����
		 * 
		 * 
		 * ���׸��� ���� ����
		 * 1. ������ Ÿ���� ������ �α� ���ؼ�
		 * 2. �� �� ����ȯ�ϴ� ������ ���ֱ� ���ؼ�
		 * 
		 */
		
		// �÷��� ���� �� ���׸��� ����
		// [ ǥ���� ]
		// ArrayList<E> list = new ArrayList<>();
		
		ArrayList<Music> list = new ArrayList<>();
		
		System.out.println(list);
		
		// �� �߰� => Music�̿��� ���� ����???
		
		//list.add("��Ʈ���� ����?");
		list.add(new Music("1","2"));
		list.add(1, new Music("5","6"));
		list.set(1, new Music("3","4"));
		
		System.out.println(list);
		
		Music m = list.get(0);
		
		System.out.println(list.get(0).getTitle());
		
		for(Music m1 : list) {
			System.out.println(m1);
		}
		
	}
	

}
