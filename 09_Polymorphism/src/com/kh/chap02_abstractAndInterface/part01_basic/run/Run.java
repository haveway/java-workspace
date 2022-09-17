package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
		
		
		// 추상클래스로 객체 생성 불가!!
		// 클래스가 미완성 되었기 때문
		//Sports s = new Sports();
		
		//Sports s; // 객체 생성 X 참조형 변수로 사용 O
		//s = new Sports();
		
		//Sports s = new Soccer();
		// 다형성을 이용하여 자식객체를 받아주는 용도로 사용 가능.
		
		// 객체 배열
		Sports[] arr = new Sports[2];
		arr[0] = new Soccer();
		arr[1] = new Snowboard();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].rule();
		}
		
		// 추상메소드를 사용했을 경우
		// 메소드 사용의 통일성을 확보할 수 있다.
		// 표준화된 틀을 제공 => 상속을 받는 자식클래스의 경우 반드시 미완성 메소드를 완성 시켜야 함.
		
	}
}
