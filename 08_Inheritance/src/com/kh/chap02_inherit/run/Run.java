package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
		
		// 이름, 연비, 종류, 타이어크기
		Car c = new Car("붕붕이", 17.0, "경차", 15);
		Ship s = new Ship("새우잡이배", 3.0, "어선", 15);
		Airplane a = new Airplane("보잉787", 2.0, "여객기", 200, 20);
		
		Vehicle v = new Vehicle("탈것", 1, "뭔데이거");
		
		System.out.println(c/*.toString()*/);
		// toString() : 해당 객체의 풀클래스명 + @ + 해당 객체의 주소값(16진수의 형태) 형태로 반환
		// 앞으로 Object클래스의 toString이라는 메소드를 오버라이딩 해서 쓸것!!!!
		System.out.println(s);
		System.out.println(a);
		
		v.howToMove();
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		
	}

}
