package com.kh.chap02.loop;

import java.util.Arrays;
import java.util.Scanner;

public class B_While {
	
	/*
	 * 
	 * while��
	 * 
	 * [ ǥ���� ]
	 * 
	 * �ʱ��; // �ʼ��� �ƴ�
	 * 
	 * while(���ǽ�) {
	 * 		
	 * 		�ݺ������� ������ �ڵ�; // a
	 * 		������; // �ʼ��� �ƴ�
	 * 
	 * }
	 * 
	 * ��ȣ�ȿ� ���ǽ��� true�� ��� �ش� ����(a)�� �ݺ������� ����
	 * while(true) �ݺ��� ������ ��ų�ž� ��!!!!!!!!!!!! => ���ѹݺ� ��ų�ž�
	 * 
	 */
	
	public void method1() {
		
		/*
		int i = 0;
		
		while(i < 5) {
			//++i;
			System.out.println(i + "��° �ȳ��ϼ���.");
			i++;
		}
		*/
		
		/*
		int b = 10;
		
		while(b >= 6) {
			System.out.println(b + "(��)�� �پ���....");
			b--;
		}
		*/
		int c = 1;
		
		while(c < 10) {
			System.out.println("�ټ����� ���ðž� ~ ");
			// ������
			//c = c + 2;
			c += 2;	
		}// 1 3 5 7 9
	}
	
	public void method3() {
		// 1 ~ 100������ ¦���� ���ϱ�
		
		int i = 1; // �ʱ��
		int sum = 0;
		
		while(i <= 100) {
			//¦�� �϶��� ��������
			if(i % 2 == 0) {
				sum += i;
			}
			i ++;
		}
		System.out.println(sum);
	}
	
	public void method4() {
		// 1 ~ 100������ Ȧ��
		
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			// Ȧ �� �϶���!!!!
			if(i % 2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
	
	
	public void method5() {
		
		// 1���� ������ ��(1 ~ 10)���� ��� ���ϴ� �� �հ�
		// random : ������
		// Math ��� Ŭ������ random() �� Ȱ��!
		// random() ��� �� : 0.0 ~ 0.9999999..........
		
		// [ ǥ���� ] 
		// Math.random();
		// Math m = new Math();
		// m.random(); // MathŬ������ ���� �ۼ��� �ʿ䰡 ����!
		
		// 1�ܰ�. random()�� �� �۵��ǳ�??? ȣ���غ���
		double random = Math.random();
		System.out.println("random : " + random);
		
		// 2_1�ܰ�. ������� 10�� ���ϸ�
		//			0.0 ~ 9.9999999..
		// 2_2�ܰ�. int������ ��������ȯ�� �ϸ�?
		//			0 ~ 9
		// 2_3�ܰ�. ������ ���߱� ���� +1�� ���ָ� ~ ?
		//			1 ~ 10
		//  (int)(Math.random * ��Ƿ�����) + ���� ��;
		
		int random2 = (int)(Math.random() * 10) + 1;
		System.out.println("random2 : " + random2);
		
		// 3�ܰ�. ������ ���ϱ�
		// 1���� ������ ��(1~10)���� ��� ���ϴ� �� �հ�
		// 1���� �������ؼ� ������ ��(5)
		// 1 + 2 + 3 + 4 + 5
		// ������ �� ������ ���� ����� ��� : 15
		
		int i = 1;
		int sum = 0;
		
		while(/* 1���� 10 ���� �߿� ������ ���� */i <= random2) {
			sum += i;
			i++;
		}
		
		
		
		System.out.println();
		System.out.println("1 ~ random2���� ���� ��� : " + sum);
		
	}
	
	public void method6() {
		
		// �ζǱ�Ģ Ver_1
		// ��ȣ ���� : 1 ~ 45
		// 6�� ����
		
		int[] rotto = new int[6];
		
		// (int)(Math.random() * ��� ������) + ���� ��
		// random 1 ~ 45
		//
		// rotto[0] = (int)(Math.random() * 45) + 1
		// rotto[1] = (int)(Math.random() * 45) + 1
		// rotto[2] = (int)(Math.random() * 45) + 1
		// rotto[3] = (int)(Math.random() * 45) + 1
		//
		// rotto[5] ..
		
		int i = 0;
		while(i < 6) {
			rotto[i] = (int)(Math.random() * 45) + 1;
			i++;
		}
		// Arrays.toSring(�迭�̸�);
		System.out.println(Arrays.toString(rotto));
		
	}
	

}
