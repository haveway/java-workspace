package com.kh.chap01_poly.part02_electronic.controller; // ���

import com.kh.chap01_poly.part02_electronic.model.vo.*;

// ��� ���ڻ󰡿� ���� ���� ���� : ������ ���� ��
public class ElectronicController1 {
	
	// �ʵ��
	private NintendoSwitch ns;
	private SmartPhone sp;
	private Tv tv;
	
	// �����ں� ����
	// JVM�� �⺻�����ڸ� �ڵ����� ��������
	
	// �޼ҵ��
	// ��� �߰����ִ� ���!!
	// ���� �޼ҵ�� => �����ε�
	// �Ű������� �ڷ����̳� ������ ������ �޶���Ѵ�.
	public void insert(NintendoSwitch ns) {
		this.ns = ns;
	}
	public void insert(SmartPhone sp) {
		this.sp = sp;
	}
	public void insert(Tv tv) {
		this.tv = tv;
	}
	
	// ���� �����ִ� ��ǰ ���ֳ�  ~ ?
	// �����ε�?? �Ұ���!!!! => �Ű������� ����!
	public NintendoSwitch selectNintendoSwitch() {
		return this.ns;
	}
	public SmartPhone selectSmartPhone() {
		return this.sp;
	}
	public Tv selectTv() {
		return this.tv;
	}

}
