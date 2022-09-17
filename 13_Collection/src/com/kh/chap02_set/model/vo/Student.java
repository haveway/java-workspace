package com.kh.chap02_set.model.vo;

public class Student {
	
	// 이름, 나이, 점수
	private String name;
	private int age;
	private int score;
	
	public Student() {
	}
	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// 현재 객체(this)와 obj를 비교
		if (this == obj) // 현재 객체와 비교객체의 주소값이 일치하는가?
			return true; // == 같은곳을 가리키고 있음 == 모든 필드값이 일치
		if (obj == null) // 비교대상이 null 일경우?
			return false; // 비교할 가치도 없다 false
		if (getClass() != obj.getClass()) // 메소드로 타입비교
			return false;
		
		// 위에 세가지 조건을 만족하지 않았을 경우
		// 각 내용물을 다 비교
		Student other = (Student) obj;
		if (age != other.age) // 현재 객체랑 들어온 객체랑 나이가 다를 경우
			return false;
		if (name == null) { // 현재 객체 이름값이 null일 경우
			if (other.name != null) // 비교 객체 이름값이 null이 아닐경우
				return false;
		} else if (!name.equals(other.name)) // 현재 객체 이름과 비교객체 이름이 다를 경우
			return false;
		if (score != other.score) // 점수가 달라도!
			return false;
		
		// 모든 경우를 빗겨나갔을 경우에는 true
		return true;
	}
	
	
	
	
	
	
	
	
	/*
	// hashCode()
	@Override
	public int hashCode() {
		return (name + age + score).hashCode();
		// 객체들의 주소 16진수 어쩌고저쩌고 뭐시기뭐시기 10진수로 반환
		// (이름 + 나이 + 점수).해싱
	}
	
	// equals()
	@Override
	public boolean equals(Object obj) {
		Student other = (Student)obj;
		
		// 이름, 나이, 점수
		if(!this.name.equals(other.name) || this.age != other.age || this.score != other.score) {
			return false;
		}
		return true;
	}
	*/
	
	
	
	
	

}
