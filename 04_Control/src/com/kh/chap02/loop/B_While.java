package com.kh.chap02.loop;

import java.util.Arrays;
import java.util.Scanner;

public class B_While {
	
	/*
	 * 
	 * while문
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식; // 필수는 아님
	 * 
	 * while(조건식) {
	 * 		
	 * 		반복적으로 실행할 코드; // a
	 * 		증감식; // 필수는 아님
	 * 
	 * }
	 * 
	 * 괄호안에 조건식이 true일 경우 해당 구문(a)를 반복적으로 실행
	 * while(true) 반복을 무조건 시킬거야 난!!!!!!!!!!!! => 무한반복 시킬거야
	 * 
	 */
	
	public void method1() {
		
		/*
		int i = 0;
		
		while(i < 5) {
			//++i;
			System.out.println(i + "번째 안녕하세요.");
			i++;
		}
		*/
		
		/*
		int b = 10;
		
		while(b >= 6) {
			System.out.println(b + "(으)로 줄어든다....");
			b--;
		}
		*/
		int c = 1;
		
		while(c < 10) {
			System.out.println("다섯번만 나올거야 ~ ");
			// 증감식
			//c = c + 2;
			c += 2;	
		}// 1 3 5 7 9
	}
	
	public void method3() {
		// 1 ~ 100까지의 짝수만 더하기
		
		int i = 1; // 초기식
		int sum = 0;
		
		while(i <= 100) {
			//짝수 일때만 더해주자
			if(i % 2 == 0) {
				sum += i;
			}
			i ++;
		}
		System.out.println(sum);
	}
	
	public void method4() {
		// 1 ~ 100까지의 홀수
		
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			// 홀 수 일때만!!!!
			if(i % 2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
	
	
	public void method5() {
		
		// 1부터 랜덤한 수(1 ~ 10)까지 모두 더하는 총 합계
		// random : 무작위
		// Math 라는 클래스의 random() 를 활용!
		// random() 결과 값 : 0.0 ~ 0.9999999..........
		
		// [ 표현법 ] 
		// Math.random();
		// Math m = new Math();
		// m.random(); // Math클래스는 따로 작성할 필요가 없다!
		
		// 1단계. random()가 잘 작동되나??? 호출해보기
		double random = Math.random();
		System.out.println("random : " + random);
		
		// 2_1단계. 결과값에 10을 곱하면
		//			0.0 ~ 9.9999999..
		// 2_2단계. int형으로 강제형변환을 하면?
		//			0 ~ 9
		// 2_3단계. 범위를 맞추기 위해 +1을 해주면 ~ ?
		//			1 ~ 10
		//  (int)(Math.random * 몇개의랜덤값) + 시작 수;
		
		int random2 = (int)(Math.random() * 10) + 1;
		System.out.println("random2 : " + random2);
		
		// 3단계. 누적합 구하기
		// 1부터 랜덤한 수(1~10)까지 모두 더하는 총 합계
		// 1부터 시작을해서 랜덤한 수(5)
		// 1 + 2 + 3 + 4 + 5
		// 랜덤한 수 까지의 더한 결과를 출력 : 15
		
		int i = 1;
		int sum = 0;
		
		while(/* 1부터 10 까지 중에 무작위 까지 */i <= random2) {
			sum += i;
			i++;
		}
		
		
		
		System.out.println();
		System.out.println("1 ~ random2까지 더한 결과 : " + sum);
		
	}
	
	public void method6() {
		
		// 로또규칙 Ver_1
		// 번호 범위 : 1 ~ 45
		// 6개 선택
		
		int[] rotto = new int[6];
		
		// (int)(Math.random() * 몇개의 랜덤값) + 시작 수
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
		// Arrays.toSring(배열이름);
		System.out.println(Arrays.toString(rotto));
		
	}
	

}
