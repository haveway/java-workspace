package com.kh.chap05.run;

import com.kh.chap05.model.vo.User;

public class Run {
	public static void main(String[] args) {
		
		//1. 기본생성자를 사용해서 객체를 생성 후 setter를 이용해서 필드값 초기화
		User user01 = new User();
		user01.setUserId("user01");
		user01.setUserPwd("pass01");
		user01.setName("유저1");
		
		System.out.println(user01.information());
		
		// 2. 객체 생성과 동시에 필드값을 초기화
		// 아이디, 비번, 이름
		User user02 = new User("user02", "pass02", "유저2");
		
		System.out.println(user02.information());
		
		// 3. 생성자로 모든 필드값 초기화!
		User user03 = new User("user03", "pass03", "유저3", 22, 'M'); 
		System.out.println(user03.information());
		
		// 굳이 setter 왜 필요할까?
		// 중간에 비밀번호 바꿔야되면? 개명했으면??
		
	}
}
