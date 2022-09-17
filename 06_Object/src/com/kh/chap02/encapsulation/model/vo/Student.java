package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메소드부

public class Student {
	
	// 필드부
	/*
	 * 정보를 담는 부분
	 * 
	 * 필드 == 멤버변수 == 클래스변수
	 * 
	 * 접근제한자 자료형 필드이름;
	 */
	private String name;
	private int age;
	private char gender;
	
	
	// 생성자부
	
	// 메소드부
	/*
	 * 기능을 구현하는 부분
	 * 
	 * 접근제한자 반환형 메소드식별자(매개변수) {
	 * 		메소드 호출 시 실행할 코드;
	 * }
	 * 
	 * 접근제한자 : 호출할 수 있는 범위를 제한해준다.
	 * 반환형 : 메소드의 결과값의 자료형을 지정해준다. || void -> 돌려줄값이 없다.
	 * 매개변수 : 메소드 호출 시 입력값으로 넣어주는 변수. 해당 메소드 실행중에만 사용 가능한 변수. 생략가능
	 */
	
	// 데이터를 기록 및 수정하는 기능의 메소드 : setter 메소드
	
	/*
	 * 규칙
	 * 
	 * 1. setter메소드는 접근 가능하도록 만들어야 하기 때문에 public 접근 제한자를 이용
	 * 2. set필드명으로 이름짓되 낙타봉표기법(camelCase)을 지키도록 한다.
	 * 						ex) setName, setAge, setGender
	 * 3. 모든 필드에 대해서 전부 다 작성을 해줘야한다 반드시!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 */
	
	// 이름을 기록 및 수정할 수 있는 메소드
	public void setName(String name) {
		this.name = name;
		
		// 특정 영역 안에서는 해당 영역 안에 있는 지역변수 우선권이 있음!!
		// this.를 붙이지 않으면 매개변수 name = 매개변수 name 이렇게 인식이 됨!!
	}
	
	// 나이를 기록 및 수정할 수 있는 메소드
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// 데이터를 반환해주는 기능의 메소드 : getter 메소드
	
	/*
	 * 1. getter메소드는 접근제한자 public을 사용한다.
	 * 2. get필드명으로 짓되, 낙타봉 표기법(camelCase)를 사용한다.
	 * 						ex) getName, getAge, getGender
	 * 3. 모든 필드에 대해서 다 작성해줘야한다!!! 반드시!!!!!!!!!!!!!!!
	 */
	
	// 이름을 반환해주는 메소드
	public String getName() {
		return this.name;
		// return 결과값 => 결과값을 돌려주겠다!
		// 메소드의 반환형하고 결과값 반환형이 동일한지 확인해야한다!!
	}
	
	// 나이를 반환해주는 메소드
	public int getAge() {
		return this.age;
	}
	
	// 성별을 반환해주는 메소드
	public char getGender() {
		return this.gender;
	}
	
	// setter와 getter 메소드 다 만들어줬으면 캡슐화 끝!
	
	// 예쁘게 메소드!
	
	public String information() {
		
		// return this.name, this.age, this.gender;
		// 결과값은 return당 한개여야한다!!!
		//String info = this.name + "님의 나이는" + age + "살이고 성별은 " + gender + "입니다.";
		//return info;
		return this.name + "님의 나이는 " + age + "살이고 성별은 " + gender + "입니다.";
	}

}
