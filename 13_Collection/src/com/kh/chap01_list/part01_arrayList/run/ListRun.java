package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {
	public static void main(String[] args) {
		/*
		 * 컬렉션(Collection)
		 * 
		 * 자료구조가 내장되어있는 클래스
		 * 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다.
		 * 
		 * - 자료구조 : 데이터들을 효율적으로 다룰 때
		 * 			 (조회, 정렬, 추가, 수정, 삭제)필요한 개념
		 * - 프레임워크 : 효율적인 기능들이 이미 정의되어있는 툴
		 * 
		 * 
		 * 정리해보자!!!
		 * 데이터들이 새롭게 추가되거나, 삭제되거나, 수정 되는 기능(알고리즘) 들이
		 * 이미 정의되어있는 틀 == 컬렉션
		 * => 다량의 데이터들을 관리하고자 할 때?? 
		 * 배열을 가지고도 충분히 활용이 가능하긴했다. 배열은 구리다.
		 * 
		 * 배열과 컬렉션의 차이점
		 * - 배열의 단점
		 * 1. 한 타입의 데이터들만 저장 가능
		 * 2. 배열을 쓰고자 할 때 먼저 크기를 지정해야함
		 * => 한 번 지정된 크기는 변경이 불가능
		 * 새로운 값을 추가하고자 할 때 크기가 넘쳐날 경우 새로운 크기의 배열을 만들고,
		 * 기존의 내용들을 복사하는 코드를 직접 짜야함
		 * 3. 배열 중간 위치에 새로운 데이터를 추가하거나 삭제하는 경우
		 * 기존의 값들을 땡겨주거나, 밀어주는 코드를 직접 짜야 함
		 * 
		 * 
		 * - 컬렉션의 장점
		 * 1. 기본적으로 여러 타입의 데이터들을 저장 가능
		 * => 같은 타입의 데이터들만 묶어서도 저장 가능
		 * (제네릭 설정을 통해 한 타입의 데이터들만 묶을 수 있게끔도 가능)
		 * 2. 크기에 제약이 없다.
		 * => 굳이 크기 지정을 하지 않아도 된다.
		 * => 만약 내가 크기지정을 했고, 크기를 넘어서는 값을 더 추가하고자 할 때
		 *    알아서 크기가 늘어난다.
		 * 3. 중간에 값을 추가하거나 삭제하는 경우 값을 땡겨주거나 밀어주는 코드가
		 * 이미 메소드로 정의되어 있음
		 * => 그때그때 필요한 메소드들을 호출해서 쓰면 된다!
		 * 
		 * 
		 * 방대한 데이터들을 담아만 두고 "조회"만 할 목적 => 배열
		 * 방대한 데이터들을 추가, 수정, 삭제 할 경우 => 컬렉션
		 * 
		 * 3가지 종류의 컬렉션
		 * 
		 * - List 계열 : 담고자하는 값(Value)만 저장 / 저장 시 순서 유지(index)
		 * 							중복값 허용
		 * 						예 ) ArrayList, LinkedList, Vector
		 * 						ArrayList가 가장 많이쓰인다.
		 * 
		 * - Set 계열 : 담고자하는 값(Value)만 저장 / 저장 시 순서 유지 X
		 * 							중복값 허용 X
		 * 						예 ) HashSet, TreeSet => HashSet에 대해서 배울 것.
		 * 
		 * - Map 계열 : 키(key) + 값(Value) 세트로 저장 / 저장 시 순서 유지 X
		 * 								중복 키 허용 X / 중복 값(Value) 허용 
		 * 						예 ) HashMap, HashTable, TreeMap, Properties
		 * 						=> HashMap, Properties에 대해서 배울것
		 */
		
		
		// ArrayList의 선언 방법
		// [ 표현법 ]
		// AraayList 객체이름 = new ArrayList();
		// 1. 크기를 따로 지정 안하는 방법
		// ArrayList 객체이름 = new ArrayList(크기);
		// 2. 크기만큼 만들겠다. 크기의 범위를 벗어날 경우 자동으로 크기가 늘어남
		
		ArrayList list = new ArrayList(3);
		// 내부적으로 크기가 3짜리 ArrayList를 만들겠다!
		
		System.out.println(list);
		
		// 1. 비어있는 list에 추가하자!!!!! => Music 객체를 만들어서 추가해보자!!!
		// add(E e) : 해당 리스트에 끝에 인자로 전달된 요소를 추가시켜주는 메소드
		// E --> element : 제네릭
		list.add(new Music("일레븐","아이브"));
		list.add(new Music("자옥아","태진아"));
		list.add(new Music("One Love","MC the Max"));
		list.add("끝"); // 크기가 늘어난다. 여러 종류의 값을 담을 수 있다.
		// 순서가 유지되면서 저장된다.(index개념있음)
				
		System.out.println(list);
		
		// add 메소드 사용 시 오버로딩된 형태를 사용해보자!
		// add(int index, E e) : 리스트의 index자리에 전달된 e를 추가시켜주는 메소드
		list.add(0, "1");
		list.add(3, new Music("서쪽하늘","이승철"));
		// 중간에 값 추가 시 알아서 기존의 값들을 뒤로 한 칸씩 밀어주는 작업이 내부적으로 진행됨
		
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

		// 2. 값을 추가해봤으니까 수정해보자!!!!
		// set(int index, E e) : 리스트의 index자리에 값을 전달된 e로 변경해주는 메소드
		list.set(0, "시작");
		list.set(3, new Music("빌리진", "마이클잭슨"));
		System.out.println(list);
		
		// 3. 값을 삭제해보자!!
		// remove(int index) : 리스트의 index자리에 담긴값을 삭제해주는 메소드
		list.remove(0); // 실행 후 새로운 0번째 인덱스의 값
		Music tIndex = (Music)list.remove(1); // IndexOutOfBoundsException : Index 5, 발생!!!	
										// 인덱스의 값을 잘 고려해서 삭제해야함!!
		System.out.println("삭제된 인덱스의 객체 : " + tIndex);
		
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
		
		// 4. 리스트의 크기를 반환해보자
		// size() : 리스트의 크기를 반환해주는 메소드 == 담겨있는 요소의 갯수
		System.out.println("리스트에 담긴 요소의 갯수 : " + list.size());
		System.out.println("리스트의 마지막 인덱스 번호 : " + (list.size() - 1));
		
		list.remove(list.size() - 1);
		
		System.out.println(list);
		
		
		
		// 5. 리스트의 해당 인덱스의 담긴 요소를 반환해주는 메소드
		// get(int index) : E
		Music m = (Music)list.get(0); // 다형성 -> 강제형변환
		System.out.println(m);
		System.out.println(list.get(0));
		// 1번 인덱스의 곡 제목을 알고 싶다.
		System.out.println("1번 인덱스 곡 제목 : " + ((Music)list.get(1)).getTitle());
		
		// index 개념 + get 메소드 => 반복문
		// 요소를 뽑아보자
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 곡 : " + ((Music)list.get(i)).getTitle());
		}
		
		// 향상된 for문 => 값을 조회하는 목적으로 사용이 가능
		// for(값을 받아줄 변수 : 순차적으로 접근할 배열 또는 컬렉션)
		for(Object o : list) {
			System.out.println(o);
		}
		
		
		// 6. 리스트의 부분만 추출
		// subList(int index1, int index2) : List
		// index1부터 index2까지의 데이터값들을 추출해서 새로운 리스트로 반환시켜준다.
		
		List sub = list.subList(1, 2);
		
		System.out.println(sub);
		
		// 7. 리스트 + 리스트
		// addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 데이터들을 통째로 추가해주는 메소드
		list.addAll(sub);
		System.out.println(list); // 데이터(Value)의 중복 저장 가능
		
		// 8. 리스트가 비어있는지 확인하는 메소드
		// isEmpty() : 비어있으면 true / 채워져있으면 false 반환
		System.out.println(list.isEmpty());
		
		// 9. 해당 리스트를 통째로 비워주는 메소드
		// clear()
		list.clear();
		
		System.out.println(sub instanceof List);
		//sub.clear();
		//System.out.println(sub.size());
		System.out.println(list.isEmpty());
		
	}
	
}