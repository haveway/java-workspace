package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// ��� ���ڻ󰡿� ������������(��������) : ������ ����
public class ElectronicController2 {
	// �ʵ�� 
	private Electronic[] elec = new Electronic[3];
	
	// �޼ҵ��
						/* ��üŸ��,  �ε�����ȣ */
	public void insert(Electronic any, int i) {
		this.elec[i] = any;
	}
	
	// ����ϳ��� ��ȸ���ִ� �޼ҵ�
	public Electronic select(int i) {
		return elec[i];
	}
	
	// ��� ��ü�� ��ȸ���ִ� �޼ҵ�
	// ��� ��ü�� ��� ����??
	public Electronic[] selectAll(){
		return elec;
	}
	

}
