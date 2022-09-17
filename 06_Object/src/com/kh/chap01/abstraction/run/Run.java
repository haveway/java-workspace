package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Lizard;

public class Run {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍 : 현실세계에서 독립적인 존재들(객체)간의 상호작용(행위)을
		 * 					프로그래밍 언어를 통해 코드로 구현하는 것.
		 * 
		 * 
		 * 구현하고자하는 프로그램 상의 객체(변수)를 만들기 위해서는(생성하기 위해서)
		 * 								=> 클래스라는 틀을 먼저 만들어야한다.
		 * 								클래스란? 각 객체들의 속성(정보, 행위)들을 담아내는 그릇 또는 틀 같은 존재!!
		 * 								클래스는 어떻게 만드는가?
		 * 
		 * 
		 * 클래스 : 객체들의 정보를 담아내는 그릇(틀)과도 같은 존재 => VO(Vaule Object)
		 * 
		 * 
		 */
		
		
		// 원석씨네 도마뱀 이름은 ? 용감 => String name;
		// 배가하얗다. => String bellyColor;
		// 발은노랗다. => String footColor;
		// 몸도노랗다. => String bodyColor;
		// 눈은빨갛다. => String eyesColor;
		
		Lizard L1 = new Lizard(); // 객체를 생성 => new 키워드 사용!!!! 메모리의 heap영역에 공간에 할당됨!!!!!
		Lizard L2 = new Lizard();
		
		L1.name = "용감이";
		L1.bellyColor = "하얗다";
		L1.footColor = "노랗다";
		L1.bodyColor = "노랗다";
		L1.eyesColor = "빨갛다";
		
		System.out.println(L1.name + "의 눈 색깔은 " + L1.eyesColor
							+ " 몸 색깔은 " + L1.bellyColor + " 발 색깔은 " + L1.footColor);
		
		L2.name = "왕도마뱀";
		L2.bellyColor = "검다";
		L2.footColor = "검다";
		L2.bodyColor = "검다";
		L2.eyesColor = "하얗다";
		
		System.out.println(L2.name + "의 눈 색깔은 " + L2.eyesColor
				+ " 몸 색깔은 " + L2.bellyColor + " 발 색깔은 " + L2.footColor);
		
		L1.weight = 0.15;
		L2.weight = 3;
		System.out.println(L1.name + "의 몸무게는 " + L1.weight + "kg 입니다.");
		System.out.println(L2.name + "의 몸무게는 " + L2.weight + "kg 입니다.");
		
		L1.eat(2);
		L2.eat(5);
		System.out.println(L1.name + "의 몸무게는 " + L1.weight + "kg 입니다.");
		System.out.println(L2.name + "의 몸무게는 " + L2.weight + "kg 입니다.");
		
		L1.jump();
		L1.jump();
		L1.jump();
		L1.jump();
		L1.jump();
		L1.jump();
		L1.jump();
		L1.jump();
		System.out.println(L1.name + "의 몸무게는 " + L1.weight + "kg 입니다.");
		
		// 직접적으로 접근해서 값 대입
		// 직접적으로 접근해서 값 조회
		
		// 직접 접근해서 값을 대입하고 조회할 경우 => 보안의 문제가 생길 수 있음
		// 객체 지향의 설계 원칙 중 하나가 정보은닉 => 정보은닉을 하기 위한 기술 중 하나 캡슐화(encapsultion)

	}

}
