package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {
	
	/*
	 * 캡슐화과정을 통해 완벽한 클래스 형태를 갖추게 하자!!
	 * 
	 * 캡슐화를 하지 않으면 : 외부로부터 직접접근이 가능하기 때문에
	 * 					함부로 값이 변질되거나 조회를 막지 못하는 문제가 발생
	 * 
	 * 정보보안의 3요소 : 기밀성, 무결성, 가용성
	 * 
	 * => 캡슐화 작업 : 정보은닉 기술 중 하나!!!!!
	 * 				데이터의 "접근제한"을 원칙으로하여 외부로부터 직접접근을 막자!!!!
	 * 				단, 대신에 간접적으로나마 처리(값 대입, 조회)를 할 수 있게끔 만들어주자!!
	 * 
	 * => 캡슐화 작업의 2단계
	 * 1. 값을 숨긴다 : public 대신 private으로 접근제한자를 바꿔준다.
	 * 2. 간접적으로 값을 처리할 수 있는 메소드를 만든다.
	 * 
	 */
	
	
	
	// 접근제한자 (예약어) 반환형 메소드이름(매개변수)
	public static void main(String[] args) {
		
		Student kim = new Student();
		/*
		kim.name = "김명래";
		kim.age = -20;
		kim.gender = "M";
		
		System.out.println(kim.name);
		System.out.println(kim.age);
		System.out.println(kim.gender);
		*/
		// 필드가 보이지 않아서 오류 발생!!! => private으로 설저했기 때문
		// 위와같이 직접 접근이 불가능함!!!!
		// 직접접근을 막았으니 간접적으로나마 접근할 수 있게끔 해주자!!!!! => getter / setter 메소드 만들기!!
		
		kim.setName("김명래");
		kim.setAge(15);
		kim.setGender('M');
		
		/*
		System.out.println(kim.name);
		System.out.println(kim.age);
		System.out.println(kim.gender);
		*/
		/*
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		System.out.println(kim.getGender());
		*/
		
		System.out.println(kim.information());
		
		
	}

}
