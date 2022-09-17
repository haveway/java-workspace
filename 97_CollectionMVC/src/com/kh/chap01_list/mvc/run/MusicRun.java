package com.kh.chap01_list.mvc.run;

import com.kh.chap01_list.mvc.view.MusicView;

public class MusicRun {
	
	public static void main(String[] args) {
		
		// MVC 패턴을 적용한 음악관리 프로그램
		// M : Model, 데이터를 담당하는 역할 (model.vo : 값을 담는다, model.dao : 값을 처리한다)
		// V : View, 사용자가 보는 화면을 처리 (입력, 출력)
		// => View가 아닌곳에서 입/출력문 사용을 자제!!!!!
		// C : Controller, 사용자가 화면을 통해서 요청한것을 받아서 처리하고 결과를 돌려주는 역할
		
		
		
		// 메인화면 띄우기
		new MusicView().mainMenu();
		
	}

}
