package com.kh.chap01_list.mvc.run;

import com.kh.chap01_list.mvc.view.MusicView;

public class MusicRun {
	
	public static void main(String[] args) {
		
		// MVC ������ ������ ���ǰ��� ���α׷�
		// M : Model, �����͸� ����ϴ� ���� (model.vo : ���� ��´�, model.dao : ���� ó���Ѵ�)
		// V : View, ����ڰ� ���� ȭ���� ó�� (�Է�, ���)
		// => View�� �ƴѰ����� ��/��¹� ����� ����!!!!!
		// C : Controller, ����ڰ� ȭ���� ���ؼ� ��û�Ѱ��� �޾Ƽ� ó���ϰ� ����� �����ִ� ����
		
		
		
		// ����ȭ�� ����
		new MusicView().mainMenu();
		
	}

}
