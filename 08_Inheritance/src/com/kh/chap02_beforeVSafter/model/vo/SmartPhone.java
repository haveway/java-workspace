package com.kh.chap02_beforeVSafter.model.vo;

public class SmartPhone extends Product{
	
	// [ �ʵ�� ]
	private String mobileAgency;
	// + brand, pCode, pName, price <= ProductŬ�������� ����� �޴´�.
	
	// [ �����ں� ]
	// �����ڴ� ����� ���� �� ����.
	public SmartPhone() {
		super();
		System.out.println("�ڽ� ��ü ����~");
	}
	
	// �ʱ�ȭ�� ��� ������ ������
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		// super : �ش� �θ��� �ּҸ� ����ִ�. (��, super. �θ� ���ٰ���)
		// super.brand = brand; => ���������ڰ� private�̱� ������ ������ ����
		// ��, �����ϰ����ϴ� �� � ���� private�� ��� �ܺο����� ������ �Ұ����ϴ�(�ƹ��� �ڽ��̿���!!!)
		// �ذ� ����� 3����
		//super();
		// �ذ���1. �θ�Ŭ������ �ʵ带 �ڽı����� ���ٰ����ϵ��� ����
		// super.brand = brand;
		// ĸ��ȭ��Ģ X ������ ����� �ƴ�
		
		// �ذ���2. �θ�Ŭ������ �ִ� public ������������ setter�޼ҵ带 ȣ���Ѵ�.
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// �ذ���3. �θ������ ȣ���ϱ�!
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}

	// [ �޼ҵ�� ]

	public String getMobileAgency() {
		return mobileAgency;
	}
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
}
