package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException{
	
	/*
	 * RuntimeException
	 * ���α׷� ����� �߻��Ǵ� ���ܵ�
	 * 
	 * RuntimeException�� �ڽ� Ŭ������
	 * - ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
	 * - NegativeArraySizeException : �迭�� ũ�⸦ ������ ������ ��� �߻��ϴ� ����
	 * - ClassCastException : ����� �� ���� ����ȯ�� ����� ��� �߻��ϴ� ����
	 * - NullPointerException : �ּҰ� ��ü�� �����ߴ��� null�� ������� ��� �߻��ϴ� ����
	 * - ArithmeticException : ������ ������ 0���� ������ �߻��ϴ� ����
	 * .......
	 * 
	 * �̷��� RuntimeException�� ���õ� ���ܵ��� �������� �ִ�!!!!
	 * �����ڰ� ������ ������ => ���ǹ����� �ذ� ������.
	 * ���� ����ó���� �� �ʿ䰡 ����
	 * 
	 */
	
	// ArithmeticException
	public void method1() {
		
		
		// ����ڿ��� �� ���� �������� �Է¹޾Ƽ� ������ ��� ���
		Scanner sc = new Scanner(System.in);
				
		System.out.println("ù��° ���� > ");
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���� > ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		/*
		// ���1. ���ǹ����� ó��(���ܹ߻��� ����)
		//	if������ ���ǰ˻� �Ŀ� ��� ���� => ���ܳ�������!!!
		if(num2 != 0) {
			System.out.println("������ ��� : " + (num1 / num2));
		} else {
			System.out.println("�� 0�� �־��� ���� ~ ~  ?");
		}
		System.out.println("�����մϴ� ~ ");
		*/
		
		// ��� 2. ����ó�� �������� �ذ� ~~
		//		���ܰ� �߻����� ��� ������ ������ �����صδ°� ~ !
		
		/*
		 * try ~ catch ��
		 * 
		 * [ ǥ���� ]
		 * 
		 * try {
		 * 
		 * 			// ���ܰ� �߻��ɹ��� ����
		 * 			(num1 / num2)
		 * 
		 * 
		 * 		  (ArithmeticException e)
		 * } catch(�߻��ҿ���Ŭ�����̸� ������ => ������ �Ű�����){
		 * 
		 * 	// �ش� ���ܰ� �߻����� �� ������ ����
		 * 
		 * 
		 * }
		 * 
		 */
		
		try {
			
			System.out.println("������ ��� : " + (num1 / num2));
			
			System.out.println("�����߻����߾�~");
			
		} catch(ArithmeticException e) {
			
			System.out.println("0�� �ƴϾ� ~~ ���ų־� ~~");
			//e.printStackTrace(); // ������ ������ �� �ִ� �޼ҵ�
			// ���� ������ �߻��� ������ �� �� �ְ�, ��� ������ ������ �������ش�.
			// ���ߴܰ��ϰ� �׽�Ʈ�ܰ迡���� ����Ѵ�!! �ݵ��!!!
			// ���������� ����ڰ� ���� �ȵȴ�!!!!!!!!!!!!!!!
		}
		
		System.out.println("���α׷� ������ ~");
	}
	
	
	// ���� catch���
	public void method2() {
		
		
		/*
		 * ���� catch���
		 * catch�� ���ܰ� �������� ��� �ַ� ���
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�(0����) > ");
		
	
		try {
			
			int num = sc.nextInt(); // �����Է��ߴ��� �̻��Ѱ� �Է���
			System.out.println("������ ��� > " + (100/num)); // 0���� �����µ� 0����
			
		} catch(InputMismatchException e) {// 1. �켱������ �Է¹����� �������� �Ǵ�
			
			System.out.println("�����������!!!");
			
		} catch(ArithmeticException e) {// 2. ������� 0���� �ƴ��� �Ǵ�
			
			System.out.println("0���������!!!");
			
		}
		
		System.out.println("���α׷� ����");
		
	}
	
	
	public void method3() {
		
		// �迭 Ȱ��
		// ArrayIndexOutofBoundsException : �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
		// NegativeArraySizeException : �迭�� ũ�⸦ ������ ������ ��� �߻��ϴ� ����
		
		// ����ڷκ��� �迭�� ũ�⸦ �Է¹޾Ƽ� �迭 �����
		// 100��° �ε����� ���� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭�� ũ�� : ");
		
		
		try {
			int size = sc.nextInt();      // 1. InputMismatchException
			int[] arr = new int[size];    // 2. NegativeArraySizeException
			System.out.println(arr[100]); // 3. ArrayIndexOfBoundsException
			// ���� catch�� �ۼ��� ������ ���� �ڽ�Ÿ���� ����Ŭ�������� ���� ����ؾ���!!
		} catch(InputMismatchException e) {
			
			System.out.println("�����������!");
			
		} catch(NegativeArraySizeException e) {
			
			System.out.println("����������!!");
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("100ĭ �ȵȴٰ�!!");
			
		} catch(RuntimeException e) {
			
			System.out.println("�迭�� �̻���~");
			
			// ���ױ׷��� �������� ���� ó���� �����ϴ� ==> ����
			// System.out.println("��..�� �׷��ϱ� �ϴ� ���ܰ� �߻��ϱ� �ߴµ�
			// �迭�� ũ�Ⱑ �߸���ų�.. �������� �ε����� ���԰ų�.. �ϰ� ������ �ƴѰ� �־���..
			// �ٵ� �� ���� �߸𸣁پ�..����??")
			
			
			// ����???
			/*
			if(e instanceof InputMismatchException) {
				System.out.println("���� �������!!!");
			}else if(e instanceof NegativeArraySizeException) {
				System.out.println("��� �������!!");
			}else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("100ĭ �ȵȴٰ�!!");
			}
			*/
			
		}
		
	}
	

}
