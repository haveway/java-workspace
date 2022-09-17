package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		// HashSet
		// 값만 저장, index 개념 없음, 중복 X, 순서보장 X
		// [ 표현법 ]
		// HashSet 객체이름 = new HashSet(); // 빈 HashSet
		
		// 문자열
		HashSet<String> hs = new HashSet<>();
		
		// 값 추가
		// add(추가할 값)
		hs.add("안녕하세요~");
		hs.add(new String("반갑습니다~~"));
		hs.add("여러분");
		hs.add("자바끝났어요~~~");
		hs.add("여러분");
		hs.add("내일평가~~!!!");
		hs.add("반갑습니다~~");
		
		//hs.add(new Student());
		
		System.out.println(hs); // 저장 순서 유지 X, 중복 저장 X
		
		
		// 크기 구하기
		// size()
		System.out.println("hs의 크기 : " + hs.size());
		
		// 값삭제
		// remove(삭제할 값)
		hs.remove("내일평가~~!!!");
		
		System.out.println(hs);
		
		// 모든 값 삭제
		// clear()
		hs.clear();
		
		System.out.println(hs);
		
		// Student 객체
		HashSet<Student> stds = new HashSet<>();
		
		
		stds.add(new Student("김명래", 40, 100));
		stds.add(new Student("김정길", 40, 80));
		stds.add(new Student("서영재", 40, 60));
		stds.add(new Student("이승철", 38, 40));
		stds.add(new Student("김명래", 40, 100));
		
		System.out.println(stds);
		
		// 저장순서유지 X, 중복 저장 O
		// 왜??? => 동일 객체로 판단이 되지 않았기 때문!
		// HashSet특징 : 값이 추가 될때마다 equals()와 hashCode()로 비교 후 둘다 결과가 true일경우 동일 객체로 판단
		
		// equals() : 현재 객체의 주소값을 비교해서 결과 반환 (같으면 true) : boolean
		// hashCode() : 현재 객체의 주소값을 해싱해서 10진수로 반환
		
		/*
		 * 총 정리!
		 * HashSet에 객체를 담을 때 내부적으로 equals메소드랑
		 * hashCode메소드를 기준으로 값이 일치하는지를 비교하고 담는다.
		 * => equals의 결과가 true이면서(그리고) hashCode의 값도 일치한다면
		 * 동일 객체로 판단!!!!(중복저장 X)
		 * 
		 * Object 클래스
		 * equals() : 두 객체의 주소값을 비교해서 일치하면 true
		 * hashCode() : 객체의 주소값을 해싱해서 10진수 형태로 반환
		 * => 반환한 결과들끼리 비교! => 두 결과가 모두 일치해야만 동일 객체!
		 * 
		 * => 내용물은 같은데 주소값이 달라서 동일객체가 아닌걸로 판단이 되면서 중복 저장이 되어버린다. => 방지하고 싶다면?
		 * equals메소드랑 hashCode메소드를 오버라이딩해서 사용해야한다.
		 * 
		 * Student 클래스
		 * 
		 * hashCode() : 세 필드값을 하나의 문자열로 만들고 해시코드값을 만들어서 반환
		 * equals() : 세 필드의 값이 모두 일치하면 true
		 * 
		 */
		
		
		// HashSet에 들어있는 모든 값들을 출력하는 방법!
		
		System.out.println("--------------------------------");
		
		// 1. 반복문 => 인덱스 개념 X
		for(Student s : stds) {
			System.out.println(s);
		}
		
		System.out.println("--------------------------------");
		
		// 2. HashSet의 내용물을 ArrayList에 담아서
		// 인덱스를 이용해서 출력
		
		// 1단계 ) Arraylist 생성
		ArrayList list = new ArrayList();
		// 2단계 ) addAll() => 통채로 추가
		list.addAll(stds);
		
		// 1 + 2 단계 ) 생성과 동시에 초기화
		ArrayList<Student> students = new ArrayList<>(stds);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------------------");
		
		// 3. Iterator(반복자) => HashSet클래스에서 제공
		// String의 StringTokenizer와 비슷한 원리
		
		Iterator it = stds.iterator();
		
		
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		//NoSuchElement : 더꺼낼거없어!!!
		*/
		
		while(it.hasNext()) { // it에 next로 더 빼올값이 남아있나?? 있으면 true // 없으면 false
			
			System.out.println(it.next());
			
		}
		
		// iterator() : List계열과 Set계열에서만 호출이 가능
		// => Map계열에서는 바로 호출이 불가능!!
		
		System.out.println("--------------------------------");
	}
}