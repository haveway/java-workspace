package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Burger;

public class Run {

	public static void main(String[] args) {
		
		// HashMap
		// [ 표현법 ]
		// HashMap 이름 = new HashMap();
		
		// key + value 세트로 추가!!!!!!
		
		// 키 == 식별자 => 버거 이름
		// 밸류 == 값   => 맛, 열량
		
		HashMap<String, Burger> hm = new HashMap<>();
		
		// 비어있는 해시맵에 추가해보자!!!!!!!!
		// ArrayList, HashSet => add()
		// (List계열 Set계열 Collection을 구현한 클래스)
		
		// HashMap => put() - Map계열
		// => key + value 세트로 추가
		
		// 1. put(K key, V value) : 맵 공간에 key + value세트 추가
		
		hm.put("불고기버거", new Burger("불고기맛", 138));
		hm.put("통새우와퍼", new Burger("살살녹는맛", 500));
		hm.put("빅맥", new Burger("살찌는맛",800));
		hm.put("상하이취킨버거", new Burger("매콤치킨맛",593));
		hm.put("핫칭즈징거버거", new Burger("매콤치킨맛",593));
		hm.put("언빌리버블버거", new Burger("짭잘한맛", 1000));
		
		System.out.println(hm);
		// 값 저장 순서 유지 X
		// Value값의 중복 저장 허용 => Key값은 중복안됨
		
		hm.put("핫칭즈징거버거", new Burger("모르겠어요",0));
		
		System.out.println(hm);
		// 기존 Key값으로 다른 Value를 추가한다면 덮어씌워짐!!!
		// Key는 식별자개념 !!! => key로 value를 찾아간다
		
		// 2. get(Object key) : Object
		// => 제네릭 설정해줬으므로 매개변수가 String, 반환형 Burger
		// 해당 key값에 해당하는 value를 반환해주는 메소드 
		
		System.out.println(hm.get("핫칭즈징거버거"));
		
		Burger b = /*(Burger)*/hm.get("빅맥");
		// 제네릭 설정을 안해놨다면 매번 다운캐스팅을 해야함
		
		// 3. size() : 컬렉션에 담겨 있는 갯수
		System.out.println(hm.size());
		
		// 4. replace(K key, V value) : 해당 키 값을 찾아서 밸류를 변경시켜줌
		
		hm.replace("빅맥", new Burger("겁나짜다", 5000));
		// 기존에 존재하지 않는 키값을 제시했을 땐???
		// -> 추가가 되지는 않는다.
		hm.replace("없는버거", new Burger("겁나맛있음", 50000));
		
		System.out.println(hm);
		
		
		// 5. remove(Object key) => 해당 키값을 찾아서
		// 키 + 밸류 세트를 지워주는 메소드
		
		hm.remove("빅맥");
		
		System.out.println(hm);
		
		System.out.println("-----------------------------------------------------");
		
		// 해시맵에 들어있는 모든 요소들에 순차적으로 접근자고자 할 때 ???
		// for 문 X, 향상된 for 문 X
		// List에 addAll 하는방법..??
		// Iterator를 쓰는 방법 => 바로호출은 안됨
		
		// Map계열을 Set계열로 바꿔서 => Iterator를 사용할것!
		// 2가지 방법!
		
		// 1. keySet() 이용하는 방법
		// => HashMap에서 제공하는 메소드, Set에 key들만 담아준다.
		// => 반환형은 Set
		
		// 1단계 ) ket들만 Set에 담는다.
		Set<String> keySet = hm.keySet();
		
		// 2단계 ) 1단계에서 만들어진 Set 내용물들을 Iterator에 담기
		Iterator<String> itKey = keySet.iterator();
		
		// 3단계 ) Iterator로부터 반복문 이용해서 순차적으로 key - value 뽑기
		while(itKey.hasNext()) {
			// 안에 로직 여러분들이 ?
			// 출력문 결과 : 요소들이 한줄한줄씩 나오게 k-v
			String key = itKey.next();
			System.out.println(key + "-" + hm.get(key));
		}
		
		System.out.println("-----------------------------------");
		
		// 2. entrySet() 이용하는 방법
		
		// 1) Map에 있는 key + value세트를
		// Entry형식으로 Set에 담기
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
	 * Map 계열 특성상 요소들에 순차적으로 접근할 직접적인 방법은 없음!!!!!
	 * 
	 * 
	 * => Map계열을 Set계열로 바꿔서 => 반복문, ArrayList로 바꿔서 반복문
	 * 
	 * Iterator를 쓰는방법
	 * 
	 * => Map계열을 Set계열로 바꾸는 2가지 방법 : keySet(), entrySet()
	 * 
	 * 
	 */

}
