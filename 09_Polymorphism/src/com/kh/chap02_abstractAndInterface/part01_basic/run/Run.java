package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
		
		
		// �߻�Ŭ������ ��ü ���� �Ұ�!!
		// Ŭ������ �̿ϼ� �Ǿ��� ����
		//Sports s = new Sports();
		
		//Sports s; // ��ü ���� X ������ ������ ��� O
		//s = new Sports();
		
		//Sports s = new Soccer();
		// �������� �̿��Ͽ� �ڽİ�ü�� �޾��ִ� �뵵�� ��� ����.
		
		// ��ü �迭
		Sports[] arr = new Sports[2];
		arr[0] = new Soccer();
		arr[1] = new Snowboard();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].rule();
		}
		
		// �߻�޼ҵ带 ������� ���
		// �޼ҵ� ����� ���ϼ��� Ȯ���� �� �ִ�.
		// ǥ��ȭ�� Ʋ�� ���� => ����� �޴� �ڽ�Ŭ������ ��� �ݵ�� �̿ϼ� �޼ҵ带 �ϼ� ���Ѿ� ��.
		
	}
}
