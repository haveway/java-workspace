package com.kh.chap03.branch;

import java.util.Arrays;
import java.util.Scanner;

public class B_Continue {
	
	/*
	 * continue : �ݺ��� �ȿ��� ���̴� ����!
	 * 
	 * continue�� ������ �� �ڿ� � ������ �ֵ簣�� ���������ʰ� pass
	 * ���� ����� �ݺ������� �ö󰡶�°��� �ǹ�
	 * 
	 */
	
	public void method1() {
		
		// 1���� 10���� Ȧ���� ���
		// 1 3 5 7 9
		
		// ��� 1. �ݺ����� 1�� ������Ű�鼭 �����µ�, Ȧ���ϰ�츸 ����ϵ��� ���ǹ��� ����Ѵ�.
		// if(i % 2 == 1) System.out.println(i);
		
		// ���2. �������� �� �� 2�� �����ϸ� ��
		// for(int i = 0; i <= 10; i += 2)
		
		// ���3. continue; ���
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i + " ");
		}
		
	}
	
	
	public void method2() {
		// 1���� 100������ �� �հ�
		// ��, 7�� ������� ���� ���غ���
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) { // 7 14 21 28 35 42 49 56 63 70 77 84 91 98 105 112 .. 
				continue;
			}
			sum += i;
		}
		
		System.out.println("�հ� : " + sum);
	}

	public void method3() { 
		
		// 5ĭ¥�� ���� �迭�� ����� ���� �Է¹ޱ�
		// int[] arr = new int[5];
		// 1~100������ ���ڸ� �Է¹ޱ�
		// ���࿡ ������ �Ѿ ���ڸ� �Է¹޴´ٸ� "�ٽ� �Է��ϼ���!!" ��� ����� �� �ٽ� �Է¹���
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("�����Է�(1~100)");
			int temp = sc.nextInt();
			
			if(0 >= temp || temp > 100) {
				System.out.println("������ �̻��ѰŰ��ƿ� ~ �ٽ� �Է����ּ���~");
				i--;
				continue;
			}
			
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
}
