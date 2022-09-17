package com.kh.chap05.model.vo;

public class User {
	
	// User u = new User();
	
	// [ 필드부 ]
	// 회원아이디, 비밀번호, 이름, 나이, 성별
	private String userId;
	private String userPwd;
	private String name;
	private int age;
	private char gender;
	
	// [ 생성자부 ]
	/*
	 * 생성자 : 메소드이름이 클래스이름과 동일하고 리턴자료형이 없는 메소드(반환형이 없다)
	 * 
	 * [ 표현법 ]
	 * public 클래스이름(매개변수(생략가능)){
	 * 			해당 생성자를 통해서 객체 생성 시 실행하고자하는 코드.
	 * }
	 * 
	 * 참고 ) 메소드의 표현법
	 * 접근제한자 반환형 메소드이름(매개변수(생략가능)){
	 * 		실행하려고하는 코드
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적
	 * 2. 객체를 생성 뿐만 아니라 매개변수로 전달된 값들을 바로 필드에 초기화할 목적
	 * 
	 * 생성자의 종류
	 * 1. 매개변수가 없는 생성자 => 기본생성자
	 * 2. 매개변수가 있는 생성자
	 * -> 차이점 : 필드에 값을 초기화 할 수 있냐 없냐의 차이
	 * 
	 * 
	 * 생성자 작성시 주의사항
	 * 1. 반드시!!!!!!!!!!!!!!!!!!!!!!! 생성자의 이름은 클래스의 이름과 동일해야함!!!!(대/소문자!!!)
	 * 2. 반환형이 존재하지 않는다.(메소드랑 유사하게 생겨서 헷갈릴 수 있음)
	 * 3. 생성자가 여러개 생성이 가능하지만 매개변수가 중복이 되면 안된다. -> 오버로딩
	 * 4. 매개변수 생성자를 명시적으로 작성하게되면 기본생성자를 JVM이 안만들어 줌!
	 * 
	 * => 기본생성자를 반드시 만드는 습관을 들이는게 좋음!!!
	 * 
	 */
	
	/*
	public User() {
		// 기본생성자(매개변수가 없다!)
		/*
		 * 단지 객체를 생성할 목적으로 사용!!! => 메모리 공간이 할당 될 때, 공간을 확보할 때!
		 * 기본생성자는 생략해도 오류가 나지 않음!
		 * 생성자를 하나도 안만들면 JVM이 기본생성자를 자동으로 만들어줌!
		 * => 기본생성자는 "항상"작성하자!!!
		 */
		//System.out.println("생성자 호출 잘 됐니 ~ ~ ?");
	//}
		
	public User() {} // 이거 무조건 꼭 만들기!!!!!!!!
	
	// 매개변수 있는 생성자!!!!
	public User(String userId, String userPwd, String name) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
	}
	
	public User(String userId, String userPwd, String name, int age, char gender) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	// [ 메소드부 ]
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return this.userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return this.gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return this.name + "씨의 아이디는 " + this.userId + "비밀번호는" + this.userPwd 
				+ "나이는 " + this.age + "성별은 " + this.gender + "입니다.";
	}

}
