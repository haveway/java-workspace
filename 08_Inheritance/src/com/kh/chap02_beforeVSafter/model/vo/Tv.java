package com.kh.chap02_beforeVSafter.model.vo;

public class Tv extends Product {
	
	// [ �ʵ�� ]
	private int inch;
	
	// [ �����ں� ]
	public Tv() {}
	
	// ��� �ʵ忡 ���� �Ű������� �ִ� ������
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		
		
		// �θ� �ִ� �ʵ峪 �޼ҵ忡 �����ϰ��� �Ҷ���??? super.
		// super.brand = �ش� �ʵ�� private�̹Ƿ� ���� �Ұ�!!!
		
		// �ذ��� 1. �θ��� private�� protected�� �ٲ۴�.
		// �ذ��� 2. �θ��� setter �޼ҵ带 ȣ���ؼ� �ʱ�ȭ �Ѵ�. super.set�ʵ��̸�();
		// �ذ��� 3. �θ��� ��� �Ű������� �ִ� �����ڸ� ȣ���ؼ� �ʱ�ȭ�Ѵ�. super(�Ű�������);
		
		// 2�� ��� �̿�
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		this.inch = inch;
	}

	// [ �޼ҵ�� ]
	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	/*
	 * ��������� �ʼ� �ۼ���ҵ� ��� �ۼ��� ����!!!
	 * 
	 * information�̶�� �޼ҵ�� �̹� �θ�κ��� ��� ����!!!! => ����⸦ �� �� ����!!
	 * �������̵�
	 * 
	 */
	
	public String information() {
		return super.information() + "inch : " + this.inch;
	}

}
