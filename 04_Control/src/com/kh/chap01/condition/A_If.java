package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If { // 클래스영역 시작
	/*
	 * 단독 if문
	 * [ 표현법 ]
	 * if(조건식) {
	 * 			조건식이 true일 경우 실행할 코드
	 * }
	 * 
	 * 
	 * => 조건식의 결과가 true일 경우 : {}(중괄호) 안의 코드들이 실행 됨
	 * => 조건식의 결과가 false일 경우 : {}(중괄호) 안의 코드들을 건너 뜀
	 */
	
	// 삼항연산 실습문제
	public void method1() { // 메소드 1 영역 시작
		// 정수를 입력받고 양수 / 0 / 음수 출력
		
		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		// 1. sout => ctrl + space, 2. syso => ctrl + space, 3 sysout => ctrl + space
		System.out.println("정수를 입력해 주세요 > ");
		int num = sc.nextInt();
		
		// 만약에 사용자가 입력한 값이 0보다 크면 == 양수이면 ? true
		if(num > 0) { // 이프문 1 영역 시작
			System.out.println("양수입니다.");
		} // 이프문 2 영역 끝
				
		// 만약에 사용자가 입력한 값이 0이면
		if(num == 0) {System.out.println("0이다.");}
		
		// 만약에 사용자가 입력한 값이 0보다 작으면
		if(num < 0) System.out.println("음수입니다.");
	} // 메소드 1영역 끝
	
	
	
	
	public void method2() { // 메소드 2영역 시작
		
		// if문을 사용해서 홀수 짝수 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		
		
		// 양수일 경우만 조건문을 실행하시오
		// &&
		
		
		// 만약에		사용자가 입력한 값이 		2로 나눴을 때 나머지가 			  0
		// if		    num					% 2						== 0
		// 이면서
		// &&
		// 사용자가 입력한 값이 		0보다 크다면
		//		num					> 0
		//if((num % 2 == 0) && (num > 0)) {System.out.println("짝수라고  ? ");}
		
		// 만약에		사용자가 입력한 값이 		2로 나눴을 때 나머지가 			1
		// if		    num					% 2						== 1
		// 이면서
		// &&
		// 사용자의 입력한 값이 		0보다 크다면
		//		num					> 0
		//if(num % 2 == 1 && num > 0) {System.out.println("홀수라고  ? ");}
		
		// 중첩 if문
		// 결과는 동일
		if(num > 0) { // 외부 if문 영역 시작
			if(num % 2 == 0) {System.out.println("짝수라고  ? ");}
			if(num % 2 == 1) {System.out.println("홀수라고  ? ");}
		} // 외부 if문 영역 끝
		
		System.out.println("하하하하하하");
	} // 메소드 2 영역 끝
	
	
	// 주민번호 체크
	// 주민번호를 입력받아서 남자(1,3) / 여자(2,4)
	public void method3() {
		
		// 사용자로부터 주민번호 입력받기 XXXXXX-1(2)XXXXXX
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력해주세요 (-포함) : ");
		String personId = sc.nextLine();
		
		// "순서가 있는 문자들의 나열"
		// "a b c d e f g " => 문자열
		// 0 1 2 3 4 5 6
		// 순서를 index라고 함 *index는 0번부터 시작
		
		//	1 2 3 4 5 6 - 8 9 3 4 5 6 7
		// 0 1 2 3 4 5 6 7 8 9 ..
		
		// 입력받은 주민번호로부터 성별에 해당하는 '문자'를 추출
		// charAt(7) => 주민번호상 8번째에 있는 7번 인덱스를 추출하겠다.
		char gender = personId.charAt(7);
		
		// 1 == '1' ??
		// 3 == '3' ??
		
		// 만약에 사용자가 입력한 주민등록번호에서 8번째 문자가 			1 또는 3이면
		//	if							gender			== 1	||	== 3
		if(gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		}
		
		// 만약에 사용자가 입력한 주민등록번호에서 8번째 문자가			2또는 4이면
		//  if							gender			== 2	||	== 4
		if(gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		}
		
		// 만약에 사용자가 입력한 문자가 1도 아니고 2도 아니고 3도 아니고 4도 아니면
		// if		gender		!= '1'     != '2'    != '3'      != '4'
		if(gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.println("잘못된 주민번호를 입력하셨습니다.");
		}
		
		if(gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.println("잘못된 주민번호를 입력하셨습니다.");
			// 얘를 바깥으로 어떻게 뺴야하지????
			
			
			if(gender == '1' || gender == '3') {
				System.out.println("남자입니다.");
			}
			if(gender == '2' || gender == '4') {
				System.out.println("여자입니다.");
			}
			
		}
		
		
		
		
	} // 메소드영역 끝
	
	
	
} // 클래스 영역 끝
