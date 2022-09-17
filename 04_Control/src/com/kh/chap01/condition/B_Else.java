package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * if-else
	 * 
	 * => 모 아니면 도
	 * 
	 * [표현법]
	 * if(조건식) {
	 * 		조건식이 true일 때 실행할 코드 - 1
	 * } else {
	 * 		조건식이 false일 때 실행할 코드 - 2
	 * }
	 * 
	 * => 조건식의 결과가 true일 경우 1을 실행
	 * => 조건식을 결과가 false일 경우 2를 실행
	 */
	
	
	public void method1() {
		
		// 연산자문제
		// 정수 입력받고 양수 / 0 / 음수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 양수일 경우 실행
			System.out.println("양수다");
			
			
			// 조건식의 결과가 true일 경우 = > else 블럭을 건너 뜀
			// 불필요한 연산이 줄어듬 => 처리속도가 향상
			
		} else { // 양수가 아닐 경우 실행
			
			if(num == 0) { // 0일 경우
				System.out.println("0이다");
			} else { // 0이 아닐 경우
				System.out.println("음수다");
			}
			
		}
	} // 메소드 1 영역 끝
	
	public void method2() {
		// 주민번호 입력 후 성별 판별
		// 1. 사용자로부터 주민번호 입력받기 (String personId => XXXXXX-OXXXXXX
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력(-포함) : ");
		String personId = sc.nextLine();
		
		// 2. 입력받은 주민번호로부터 성별에 해당하는 문자를 추출 charAt(index) => 7번 인덱스
		char gender = personId.charAt(7);
		
//		if(gender == '1' || gender == '2' || gender == '3' || gender == '4') {
		if('1' <= gender && gender <= '4') {
			// 유효한 주민등록 번호
			if(gender == '1' || gender == '3') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}
		} else {
			// 유효하지 않은 주민등록 번호
			System.out.println("유효하지 않은 주민번호입니다.");
		}
	}
	
	/*
	 * 
	 * if-else if 문
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식1) {
	 * 		조건식1이 true일 경우 실행할 코드1
	 * } else if(조건식2) {
	 * 		조건식2가 true일 경우 실행할 코드2
	 * } else if(조건식3) {
	 * 		조건식3이 true일 경우 실행할 코드3
	 * } else if(조건식4) {
	 * 		조건식4가 true일 경우 실행할 코드4
	 * } else {
	 * 		앞에서 기술했던 조건들이 모두 false일 경우 실행할 코드
	 * }
	 * 
	 */
	
	public void method3() {
		
		// 정수 입력받아서 양수 / 0 / 음수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수야 ~ ");
		} else if(num < 0) {
			System.out.println("음수야 ~ ");
		} else {
			System.out.println("0이다 ~");
		}
			
	}
	
	// 나이를 입력받고 어린이 청소년 성인 판단
	public void method4() {
		// 0 ~ 13 : 어린이
		// 14 ~ 19 : 청소년
		// 20 ~ : 성인
		// - : 지구인이아닙니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 > ");
		int age = sc.nextInt();
		
		if(age < 0) {
			System.out.println("지구인이 아닙니다.");
		} else if(age >= 20) {
			System.out.println("성인입니다.");
		} else if(age >= 14) {
			System.out.println("청소년입니다.");
		} else {
			System.out.println("어린이입니다.");
		}
	}
	
	public void method5() {
		String season;
		int temperature = 40;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("지금 도대체 몇 월인가요????? > ");
		int month = sc.nextInt();
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			if(temperature <= -15) {
				season += " 한파 경보";
			} else if(temperature <= -12) {
				season += " 한파 주의보";
			}
			
		} else if(3 <= month && month <= 5) {
			season = "봄";
		} else if(6 <= month && month <= 9) {
			season = "여름";
			
			if(temperature >= 35) {
				season += " 폭염경보";
			}else if(temperature >= 30) {
				season += " 폭염주의보";
			}
			
		} else if(10 <= month && month <= 11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		System.out.println("계절 : " + season);
	}
}
