package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class GenericRun {
	
	
	public static void main(String[] args) {
		/*
		 * 제네릭(Generic) <E>
		 * 컬렉션 안에서 다룰 타입들을 미리 지정해주는 역할 => 명시적으로 <Music>, <String> ......
		 * 객체의 형변환을 사용할 필요가 없다.
		 * => 내가 사용하고 싶은 타입만 사용할 수 있게 해준다.
		 * 
		 * 만약에 제네릭을 제시 <Music> (E == Music)
		 * 
		 * VS
		 * 
		 * 별도의 제네릭 제시 없이 컬렉션 객체 생성 시 (E == Object)
		 * 다양한 타입의 값이 담길 수 있음
		 * 
		 * 
		 * 제네릭을 쓰는 이유
		 * 1. 저장할 타입의 제한을 두기 위해서
		 * 2. 매 번 형변환하는 절차를 없애기 위해서
		 * 
		 */
		
		// 컬렉션 생성 시 제네릭을 설정
		// [ 표현법 ]
		// ArrayList<E> list = new ArrayList<>();
		
		ArrayList<Music> list = new ArrayList<>();
		
		System.out.println(list);
		
		// 값 추가 => Music이외의 값이 들어갈까???
		
		//list.add("스트링이 들어갈까?");
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
