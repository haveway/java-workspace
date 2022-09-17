package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {
	
	public static void main(String[] args) {
		// Desktop ��ü�� ����
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("LG", "lg-01", "�ݼ�PC", 3000000, true);
		
		// SmartPhone ��ü�� ����
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("LG", "b-01", "����", 1700000, "LG");
		
		// TV ��ü�� ����
		// brand, pCode, pName, price, inch
		Tv t = new Tv("LG", "n-tv", "���뼿TV", 8000000, 100);
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		/*
		 * �� Ŭ�������� �ߺ��� �ڵ���� �ϳ��ϳ� ����ϰ� �Ǹ�
		 * ������ ���� ���������� �� ��� �� �� �ϳ��ϳ� �� ã�Ƽ� �����ؾ��ϴ� ���ŷο��� ����!!!!
		 * 
		 * ����̶�� ������ ������Ѽ�
		 * �� Ŭ�������� �ߺ��� �ʵ�, �޼ҵ�
		 * �� �ϳ��� Ŭ����(�θ�Ŭ����)�� ��������, ���Ǹ� �صΰ�
		 * �� �ش� Ŭ������ �Ӽ�, ������ ������ ���� �������� ������ ��!!!!!!!!!!!!!!
		 * 
		 */
		
		
		
	}

}
