package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 * 배열 복사
	 * 1. 얕은복사 : 배열의 주소값만을 복사
	 * 2. 깊은복사 : 동일한 새로운 배열을 하나 생성해서 실제 내부값까지 복사
	 */
	public void method1() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("-- 원본 배열 출력 --");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		
		int[] copy = origin;
		
		
		System.out.println("\n-- 복사본 배열 출력 --");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		origin[2] = 99;
		
		System.out.println("\n-- 원본 배열 출력 --");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n-- 복사본 배열 출력 --");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// 분명히 원본 배열만 수정을 했는데
		// 복사한 배열도 수정이??????
		// => 두개 똑같나??
		
		System.out.println("\n원본 배열의 해시코드 " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드 " + copy.hashCode());
		// 해시코드가 동일하다고해서 두개가 완전히 같다고 100% 장담은 할 수 없지만 해시코드가 다르면 두개는 완전히 다른거
		// 얕은복사 => 배열의 주소값이 복사되어 원본과 복사본이 같다.
	}
	
	// 2. 깊은복사
	public void method2() {
		
		int[] origin = {1, 2, 3, 4, 5};
		// 1단계 : 기존과 동일한 크기의 새 배열 생성 및 할당
		int[] copy = new int[origin.length];
		// 2단계 :
		//
		// copy[0] = origin[0]
		// copy[1] = origin[1]
		// copy[2] = origin[2]
		// copy[내가 넣고자하는 인덱스] = origin[내가 복사하고자하는 인덱스]
		//
		
		for(int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
		}
		
		origin[2] = 99;
		
		System.out.println("\n-- 원본 배열 출력 --");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n-- 복사본 배열 출력 --");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n원본 배열의 해시코드 " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드 " + copy.hashCode());
		// 실제 우리가 원하는 배열 내부 값들이 복사된것을 확인 가능!!
		// 주소값 복사 XX
	}
	
	// 깊은복사2. arraycopy() 메소드 이용
	public void method3() {
		
		// 새로운 배열을 생성한 후
		// System 클래스에서의 arraycopy() 호출
		// 몇 번 인덱스부터 몇 개를 어느 위치부터 넣을건지 직접 지정 가능!!! ()안에 작성할거다!!!!!!!!!!!!!!!!!!!!
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10];
		/*
		 * [표현법]
		 * System.arraycopy(원본배열이름, 원본배열에서 복사를 시작할 인덱스,
		 * 					복사본배열이름, 복사본배열에서 복사가 시작될 인덱스, 복사할 갯수)
		 * 
		 */
		System.arraycopy(origin, 0, copy, 0, 5);
		System.arraycopy(origin, 0, copy, 3, 5);
		//System.arraycopy(origin, 2, copy, 9, 2); // ArrayIndexOutOfBounds 방없어!!
		
		
		System.out.println("--- 복사 출력 ---");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n원본 배열의 해시코드 " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드 " + copy.hashCode());
	}
	
	// 깊은복사 3. copyOf() 사용
	public void method4() {
		
		// Arrays클래스에서 제공하는 copyOf()
		int[] origin = {1, 2, 3, 4, 5};
		
		// [표현법] 복사본 배열 = Arrays.copyOf(원본배열이름, 복사할갯수);
		int[] copy = Arrays.copyOf(origin, 10);
		
		// 원본 배열보다 큰 값을 제시하면 복사본 배열에 공간생성
		
		System.out.println("--- 복사 출력 ---");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		/*
		 * System.arraycopy()
		 * 몇 번 인덱스부터 몇 개를 어느 위치의 인덱스에 복사할 것인지 모두 지정 가능
		 * 
		 * Arrays.copyOf()
		 * 무조건 원본배열의 0번 인덱스부터 복사가 진행(내가 지정한 갯수만큼)
		 */
	}
	
	// 깊은 복사 4. clone()
	public void method5() {
		// [표현법] 복사본배열이름 = 원본배열이름.clone();
		
		int[] origin = {1, 2, 3, 4, 5};
		// 얕은 복사
		//int[] copy = origin;
		
		// 깊은 복사
		int[] copy = origin.clone();
		// 인덱스를 직접 지정X, 복사할 갯수 지정X => 원본배열과 완전히 똑같다.
		
		// toString => 이쁘게 좀 보자~~
		// Arrays.toString(내용을 출력하고 싶은 배열의 식별자를 입력);
		// 배열의 요소를 출력해줌
		// ex) [1, 2, 3, 4, 5]
		
		System.out.println(Arrays.toString(copy));
		
		
	}
	

}
