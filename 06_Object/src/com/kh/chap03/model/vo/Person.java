package com.kh.chap03.model.vo;

public class Person {
	
	// 사람의 인적정보
	// 주민번호, 이름, 나이, 성별, 휴대폰번호, 이메일주소
	
	// [필드부]
	// 필드 == 멤버변수 == 클래스변수 == 인스턴스변수
	private String id;
	private String name;
	private int age;
	private char gender;
	private String phoneNumber;
	private String emailAddress;
	
	
	//-------------------------------------------------- [생성자부]
	// [메소드부]
	// setter 메소드들 : set필드명
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	// getter 메소드 : get필드명()
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	// information()
	public String information() {
		return this.id + " " + this.name + " " + this.age + " " 
				+ this.gender + " " + this.phoneNumber + " " + this.emailAddress;
	}

}
