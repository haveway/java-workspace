package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	
	// ����(Variable) :
	// �޸𸮿� �����Ͱ��� �����ϱ� ���� ����
	
	// ���� : �ϳ��� ������ �ϳ��� ���� ���� �� ����
	// 1. ���������� ũ�Ⱑ �������ִ�.
	// 2. �ڷ����� �����Ǿ��ִ�.
	// 3. stack �޸� -> �⺻�ڷ���
	// 4. ���� �ٲ� �� �ִ�.
	// 5. ����ȯ�� �����ϴ�.
	// 6. �ĺ��ڸ� ���� �� �ִ�.
	// 7. ������ �����ϴ�.
	// 8. �ʱ�ȭ �� �� �ۿ� ���Ѵ�.
	// 9. �ڵ�� �ȿ��� ����ǰ� ���ȴ�.
	// 10. ������ �ϳ���. => ���� �ϳ��� �޴´�.
	// 11. �������� �ּҰ��� �����Ѵ�.
	
	// �迭(Array) : �ϳ��� ������ �������� ���� ���� �� ����
	// 				��, "���� �ڷ����� ����"�̾�� ��
	// 				=> �迭�� �� �ε����ڸ��� ���� ���� ��� �ε����� "0"���� �����Ѵ�.
	
	
	public void method1() {
		
		// �迭�� �� ����ұ�??
		// ������ �̿��ؼ� ���α׷����� �ϸ�...??
		// 0, 1, 2, 3, 4, 5 .. ���� �þ������ ������ ���� ��� �ϰ� ����!!
//		
//		int num1 = 1;
//		int num2 = 2;
//		int num3 = 4;
//		int num4 = 7;
//		int num5 = 11;
		
		//������ ���!!
//		
//		System.out.println(num1); // 1
//		System.out.println(num2); // 2
//		System.out.println(num3); // 4
//		System.out.println(num4); // 7
//		System.out.println(num5); // 11
//		
//		int sum = 0;
//		for(int i = 1; i <= 5; i++) {
//			//sum += numi; // �ݺ��� ���߶��� ���� �ֹ����?? �� ����������?? ��ü...
//		}
//		
//		sum = num1 + num2 + num3 + num4 + num5; // �ϳ��ϳ� �� ������
//		
		// ������ 100���� �Ǹ�..? num100 num2400���� �ִٸ�...??
		// �ذ� : �迭!
		
		
		// 1. �迭 ����
		
		/*
		 * ������ ��쿣?
		 * �ڷ��� �����ĺ���;
		 * 
		 * �迭 �����!
		 * 1) �ڷ��� �迭�ĺ���[];
		 * 2) �ڷ���[] �迭�ĺ���; => ������ �ַ� ����� ��.
		 * 
		 */
		
		/*
		int a; // ���� ����
		
		int arr1[]; // 1�� ������� int�� �迭�� ����!
		
		int[] arr2; // 2�� ������� int�� �迭�� ����!
		*/
		
		// 2. �迭 �Ҵ�
		
		/*
		 * �� �迭�� ��� ���� ���� �迭�� ũ�⸦ �����ִ� ����
		 * ������ ������ŭ ���� �� ������ �������
		 * 
		 * [ ǥ���� ]
		 * arr = new int[5];
		 * int[] arr = new int[5]; // ����� ���ÿ� �Ҵ�
		 * 
		 * �迭�� �������̴�!!!!!!!!!!!!!!!
		 * ������ : new
		 * 
		 */
		
		int[] arr1;
		arr1 = new int[15];
		
		int[] arr2 = new int[5];
		
		// 3. �迭�� �� �ε����� �� ����
		
		/*
		 * [ ǥ���� ]
		 * �迭�̸�[�ε���] = ��; // 0���ͽ���!!
		 * 
		 */
		
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		
		// ������ ���̰� ����??
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		
		System.out.println("\narr2 : ");
		
		// �迭�� ���� ū ���� : �ݺ����� ��밡��
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
	
	
	public void method2() {
		
		
		// String�� �迭
		// 1. �迭�� ����� �Ҵ� names [30]
		
		String[] names = new String[30];
		
		// 2. �迭�� �ε����� ���� ����
		
		names[0] = "����";
		names[1] = "�Ǽ���";
		names[2] = "�Ǽ���";
		names[3] = "���";
		names[4] = "��ξ�";
		names[5] = "��ƶ�";
		names[6] = "������";
		names[7] = "������";
		names[8] = "������";
		names[9] = "������";
		names[10] = "�ΰ���";
		names[11] = "������";
		names[12] = "�յ�ȯ";
		names[13] = "������";
		names[14] = "������";
		names[15] = "���ڿ�";
		names[16] = "������";
		names[17] = "������";
		names[18] = "������";
		names[19] = "������";
		names[20] = "������";
		names[21] = "������";
		names[22] = "���ѿ�";
		names[23] = "������";
		names[24] = "������";
		names[25] = "��   ��";
		names[26] = "�ֺ���";
		names[27] = "�ֽ���";
		names[28] = "�ѿ���";
		names[29] = "�����";
		
		// names[100] = "�̽�ö"; // ���������� �°� �� ��� ~ ������ Ʋ���� ����~
		// ArrayIndexOutOfBoundsException : 100 <- ����
		// �迭�� �ε��� ������ �����!
		// at com.kh.array.A_Array.method2(A_Array:174) <- ���⼭ �����! ��ġ!
		// A_Array��� Ŭ������ method2()���� 174�࿡�� ������ ����ž�!!
		
		System.out.println("names �迭�� ũ�� : " + names.length);
		
		System.out.println();
		
		for(int i = 0; i <= names.length-1; i++) {
			System.out.printf("�⼮��ȣ %d�� %s \n", i+1, names[i]); // ���������δ� �°� ���~!~!
		}
		
		// �ε����� ������� ~~~~?? **************������ 0������
	}
	
	
	
	public void method3() {
		
		// ������ �� 5�� 
		// int�� �迭�� �����ϰ� 
		// �ݺ����� �̿��Ͽ� �հ� ����ϱ�
		
		int[] arr = new int[5]; // 0, 1, 2, 3, 4
		
		arr[0] = 5;
		arr[1] = 15;
		arr[2] = 556234;
		arr[3] = 5424;
		arr[4] = 543543;
		
		//System.out.println(arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);
		
		int sum = 0;
		for(int i = 0; i <= arr.length-1; i++) {
			sum += arr[i];
		}
		System.out.println("�հ� : " + sum);
	}
	
	
	public void method4() {
		
		// 1. ����ڷκ��� �Է������� �迭�� ���� ��� �迭�� �ټ�ĭ¥����
		
		int[] nums = new int[5];
		
		Scanner sc = new Scanner(System.in);
		//System.out.println(nums.length);
		
		
		for(int i = 0; i <= nums.length-1; i++) {
			System.out.print("������ �Է����ּ��� >");
			nums[i] = sc.nextInt();
			//System.out.println("nums �迭�� " + i + "��° �ε����� ���� �� " + nums[i]);
		}
		
		//System.out.println(Arrays.toString(nums));
		
		// 2. �ش� �迭���� ���� ���� ��, �� �ּҰ��� ���ϴ� �޼ҵ带 ������! 
		
		// ���� �������� ���ϰ�ʹ�....
		// ��ŷ... ��??? 
		
		int min = nums[0];
		
		for(int i = 0; i <= nums.length-1; i++) {
			if(nums[i] < nums[0]) {
				min = nums[i];
			}
		}
		
		System.out.println("�ּҰ� : " + min);
	}
	
	public void method5() {
		
		// 1. �迭 ���� + �Ҵ�
		int[] iArr = new int[3]; // 0��, 1��, 2��
		double[] dArr = new double[5]; // 0��, 1��, 2��, 3��, 4��
		
		// �迭�̸�.length : �迭�� ����(ũ��) => ����
		System.out.println("iArr�� ũ�� : " + iArr.length); // 3
		System.out.println("dArr�� ũ�� : " + dArr.length); // 5
		
		//int i;
		//double d;
		//System.out.println(i);
		//System.out.println(d);
		
		System.out.println(iArr[0]); // 0
		System.out.println(dArr[0]); // 0.0
		// �ʱ�ȭ�� ���������� �ʾƵ� �ڵ����� �ʱⰪ�� �������
		
		
		/*
		 * �⺻ �ڷ��� : boolean, char, byte, short, int, long, float, double 
		 * => ���� ���� �ٷ� ���� �� �ִ� ���� : �Ϲ� ����
		 * 
		 * ���� �ڷ��� : int[], double[], short[].. String
		 * => �ּ� ���� ��� �ִ� ���� : ���� ���� (���ۺ��� ����)
		 * 
		 */
		
		System.out.println(iArr);
		System.out.println(dArr);
		
		
		/*
		String[] KH���������������� = new String[3];
		
		KH����������������[0] = "A������";
		KH����������������[1] = "V������";
		KH����������������[2] = "C������";
		
		System.out.println(KH����������������[2]);
		*/
		
		// �����ڷ��������� == �񱳽� �ּҰ��� ���ϱ� ������ �츮�� ���ϴ� ���� ���� �� ����!!!!
		// ���ڿ�.equals("���ҹ��ڿ�");
		
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		System.out.println("dArr�� �ؽ��ڵ� �� : " + dArr.hashCode());
		// �ؽ��ڵ� : �ּҰ��� �������� ���·� ��Ÿ�� ��
		
		int[] iArr2 = new int[3];
		
		System.out.println("iArr == iArr2 ? :" + (iArr == iArr2)); // false
		System.out.println("iArr2�� �ؽ��ڵ� �� : " + iArr2.hashCode());
		
		
		// �ݺ���
		// 0�� �ε������� ������ �ε������� 1�� �����ϸ鼭 ���������� ��� ����
		// ������ �ε��� == �迭�� ũ�� -1
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i] + " ");
		}
		
		for(int i = 0; i <= iArr.length-1; i++) {
			System.out.println(iArr[i] + " ");
		}
	}
	
	
	/*
	 * �迭�� �ƽ����� ? 
	 * 
	 * �� �� ������ �迭�� ũ��� ���� �Ұ�!!!!!!!!!!!!!!!
	 * => �迭�� ũ�⸦ �����ϰ��� �Ѵٸ�??
	 * ��¿ �� ���� �迭�� �ٽ� �������Ѵ�~
	 * 
	 */
	public void method7() {
		
		String[] sArr = new String[3];
		
		sArr[0] = "��";
		sArr[1] = "��";
		sArr[2] = "��";
		
		System.out.println("sArr�� �ؽ��ڵ� : " + sArr.hashCode());
		
		for(int i = 0; i <= sArr.length-1; i++) {
			System.out.println(sArr[i]);
		}
		
		sArr = new String[5];
		
		System.out.println("--- sArr�� �׾��� ��Ƴ���?? ---");
		System.out.println("�׾��� ��� sArr�� �ؽ��ڵ� : " + sArr.hashCode());
		
		/*
		 * ������ ������ ������ �迭��???
		 * Heap������ �յ� ���ٴϴٰ� �����ð��� ������
		 * �������÷���(GC)�� ���������ش� !! : �ڵ� �޸� ���� 
		 * 
		 * �迭�� �׻� ������ �ּҰ��� �ο� ��
		 * ���� �迭 �̸��� �Ҵ縸 �ٽ��ϸ�??
		 * => ������ �����ϰ� �ִ� ������ ����� ���ο� �迭�� �����
		 * => ���ο� ���� �����Ѵ�. // ��ѱ��� ����
		 * 
		 * �ּҰ��� �ٸ��� �ٸ� �迭�̴� == O
		 * 
		 */
		
		
		// ���� ������� ���� �ʹٸ�???
		
		sArr = null; // null : �ƹ��͵� �������� ������ �ǹ�
		
		//sArr[0] = "�����ϼ���";
		// NullPointerException
		// -> �ּҰ� ���µ� ��� �����ҷ�?? ��� �����ҷ�??
		
		//System.out.println(sArr[0]);
		
		/*
		 * �⺻ �ڷ��� �� ���� ���� ����
		 * 
		 * �����ڷ������� null�̶�� ������ �߰��� => �ּҰ��� �ֳ� ����???
		 * 
		 * �⺻ �ڷ��� �⺻����
		 * 
		 * int a = 0;
		 * double d = 0.0;
		 * char c = '';
		 * 
		 * �����ڷ����� �⺻���� ??????? => null(�ּҰ��� ����)
		 * 
		 * int[] iArr = null;
		 * double[] dArr = null;
		 * Scanner sc = null;
		 * 
		 */
		
		
		// OO�� �迭 ���� Scanner ���� 
		
		String st = new String();
		
		System.out.println(st); // ""
		
		// String�� �����ڷ��������� �ڵ����� null�� �ʱ�ȭ�� �����ʴ´�!
		String str = null;
		System.out.println(str);
	}
	
	
	public void minMax() {
		
		// 10���� ���� ������ �� �ִ� �������迭�� ���� �� �Ҵ��ϰ�
		
		// 1 ~ 10 ������ ����(random)�� �߻����� �迭�� �ʱ�ȭ(initialize)�� ��
		
		// �迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
		
		// ex)
		// 1 5 8 1 3 4 6 7 8 10
		// �ִ밪 : 10
		// �ּҰ� : 1
		
		int[] iArr = new int[10];
		
		for(int i = 0; i <= iArr.length-1; i++) {
			iArr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(iArr[i] + " ");
		}
		
		int min = iArr[0];
		int max = iArr[0];
		
		for(int i = 0; i <= iArr.length-1; i++) {
			if(min > iArr[i]) {
				min = iArr[i];
			}else if(max < iArr[i]) {
				max = iArr[i];
			}
		}
		System.out.println("\n�ּҰ� : " + min);
		System.out.println("�ִ밪 : " + max);
		
	}
	
	public void rotto() {
		
		// �ζ� ��ȣ �ڵ� ���� ���α׷��� �ۼ��ϴµ� �ߺ� �� ��������ϼ���.
		
		// ex.
		// 10 31 2 5 8 28
		
		int[] arr = new int[6];
		
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j]) {
						i--;
						break;
					}
				}
			}
		}
		
		
		
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	// �޼ҵ� == "�׻� Ư�� �ڷ������� ����� �� �ִ� ���"
	// �Լ�
	// println()
	// nextLine(), nextDouble()...
	// equals()
	// toString()
	// length()
	// charAt()
	
	public void method9() {
		
		// �迭 ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ(����)���� �ѹ��� ������ ���
		
		// ��� 1.
		
		/*
		 * arr[0] = 1;
		 * arr[1] = 3;
		 * arr[2] = 8;
		 * arr[3] = 5;
		 */
		
		int[] arr1 = new int[] {1, 3, 8, 5};
		
		// ��� 2.
		
		int[] arr2 = {1, 3, 8, 5};
		
		System.out.println("arr1 == arr2 ? " + (arr1 == arr2));
		
		String[] students = {"���ѿ�", "����", "�Ǽ���", "���"}; // �ϵ��ڵ�
		
	}
	
	
	
	
	
	
	
}
