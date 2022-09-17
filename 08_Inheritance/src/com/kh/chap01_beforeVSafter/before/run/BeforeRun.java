package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {
	
	public static void main(String[] args) {
		// Desktop 객체를 생성
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("LG", "lg-01", "금성PC", 3000000, true);
		
		// SmartPhone 객체를 생성
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("LG", "b-01", "베가", 1700000, "LG");
		
		// TV 객체를 생성
		// brand, pCode, pName, price, inch
		Tv t = new Tv("LG", "n-tv", "나노셀TV", 8000000, 100);
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		/*
		 * 매 클래스마다 중복된 코드들을 하나하나 기술하게 되면
		 * 수정과 같이 유지보수를 할 경우 매 번 하나하나 다 찾아서 수정해야하는 번거로움이 생김!!!!
		 * 
		 * 상속이라는 개념을 적용시켜서
		 * 매 클래스마다 중복된 필드, 메소드
		 * 단 하나의 클래스(부모클래스)로 만들어놓고, 정의를 해두고
		 * 그 해당 클래스의 속성, 행위를 가져다 쓰는 형식으로 진행할 것!!!!!!!!!!!!!!
		 * 
		 */
		
		
		
	}

}
