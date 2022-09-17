package com.kh.variable.casting;

public class Casting {
	
	/*
	 * 형 변환(Type Casting) : 값의 종류, 자료형을 바꾸는 개념 
	 * 
	 * 컴퓨터 안에서 값을 처리하는 규칙
	 * 
	 * 1. =(대입연산자)를 기준으로 왼쪽, 오른쪽이 같은 자료형이여야 한다.
	 * => 같은 자료형에 해당되는 리터럴 값만 대입이 가능
	 * => 자료형이 다를 경우 ?    == 값을 바꿔서 대입해야함
	 * 
	 * 2. 같은 자료형들끼리만 연산이 가능함
	 * => 다른 자료형들끼리 연산을 하고 싶다? 둘 중에 하나를 "형변환"을 해서 나머지 하나와 동일하게 만들어줘야 함 
	 * 
	 * 3. 연산의 결과물도 같은 자료형이야 한다.
	 * ex ) 1 + 1 = 2(정수), 1.1 + 1.1 = 2.2(실수)
	 * 
	 * 
	 * [표현법] (바꿀자료형)값
	 * 형변환 연산자, cast 연산자
	 * 
	 * 형변환의 종류
	 * 
	 * 1. 자동형변환(promotion) : 자동으로 형변환이 진행
	 * 							작은 크기의 자료형 -> 큰 크기의 자료형
	 * 							내가 형변환을 할 필요가 없음
	 * 
	 * 2. 강제형변환(Type Casting) : 자동 형변환이 되지 않은 경우에 진행
	 * 								직적 내가 형변환을 해야할 때 => ()통해서 진행!!!
	 * 								큰 크기의 자료형 -> 작은 크기의 자료형
	 * 								=> 값의 손실이 발생할 수 있음, 신중하게 해야함
	 */
	
	// 자동 형변환 : 작은바이트 -> 큰바이트
	public void autoCasting() {
		
		// 1. int(4byte, 정수) -> double(8byte, 실수)
		
		int i1 = 10;
//		System.out.println(i1);
		
		double d1 = /*(double)*/i1;
//		System.out.println(d1);
		
		// 자동형변환 완료!
		// int는 정수 double은 실수, d1 = 10 -> 10.0
		
		// 2. int(4byte, 정수) -> long(8byte, 정수)
		
		int i2 = 120000;
		long l3 = i2;
		
//		System.out.println(l3);
		
		
		// 특이케이스 3. long(8byte, 정수) -> float(4byte, 실수)
		// 정수가 실수로 담길 떄 큰 사이즈의 정수가 작은 사이즈의 실수에 대입이 가능!!!!
		// 왜?? 4byte의 float형이 long형보다 담을 수 있는 값의 범위가 더 크기 때문이다.
		
		// 정수 -> 1 2 3
		// 실수 -> 1 1.000001 1.000002 1.000003 ~~~~ 1.555554 1.555555 1.555556 ~~~ 1.777777 2 ... 3
		
		long l4 = 1000000L;
		float f5 = l4;
		
//		System.out.println(f5);
		
		// 특이케이스 4. char(2byte) <-> int(4byte) : char랑 int는 양방향 형변환이 가능
		// 아스키코드표
		
		char ch = 98;
		char ch2 = 'b';
//		System.out.println(ch + " 는 " + ch2 + " ?");
		
		int num = ch;
//		System.out.println(num);
		
		// ctrl + art + 화살표 ↑↓ => 행 복사
		// ctrl + d => 행 삭제
		// ctrl + / => 행 주석
		
//		System.out.println("\n\n");
//		System.out.println('b');
//		System.out.println((int)'b');
//		System.out.println('b'+2);
//		System.out.println('b'+(char)2);
		
//		System.out.println((char)2 + (char)'2'); // 52
		// 얘네 둘이 같을까요 다를까요??
//		System.out.println((char)2 + (char)2); // 4
		
		int a = 2; // 정수2
		
//		System.out.println(a);
//		System.out.println((char)a);
		
		char c = '2'; // 단일 문자 '2'
//		System.out.println(c);
		
		// 비교 연산자    좌항과 우항의 값을 비교해서 결과값을 반환
		// 논리값 true, false
		// ==
		
//		System.out.println(2 == '2'); // false
//		System.out.println(2 == a); // true
//		System.out.println('2' == c); // true
//		System.out.println(a == c); // false
		
//		System.out.println(2 == (int)'2'); // 2와 50이 같아? false
//		System.out.println((char)2 == '2'); // 와 '2'이 같아? false
//		System.out.println((int)a == int(c)); // 2와 50이 같아? false
		
		// 특이케이스 5. byte, short간의 연산
		
		byte b1 = 126;
		byte b2 = 2;
		
		System.out.println(b1 + b2);
		// 결과값이 int형 => CPU가 값을 처리하는 기본 크기 int형의 크기(4byte)
		
		byte b3 = (byte)128; // -128 ~ +127
		System.out.println(b3);
	}
	
	// 강제형변환 : 큰 바이트 -> 작은 바이트
	
	public void forceCasting() {
		
		// 명시적 형변환이라고도 함
		// (바꿀자료형) 값
		
		// 1.double(8byte) -> float(4byte)
		float f1 = 4.0f;
		double d2 = 8.0;
		
		float f2 = (float)d2;
		
		// 2. double(8byte) -> int(4byte)
		double d3 = 10.89;
		int i3 = (int)d3;
		
		System.out.println(i3);
		//0.89 소수점 뒷 부분이 절삭 되었다. => 데이터가 손실
		
		int iNum = 10;
		double dNum = 8.99;
		
		System.out.println(iNum + dNum); // 18.99
		// BigDecimal
		
		int result = iNum + (int)dNum;
		System.out.println(result);
		
		result = (int)(iNum + dNum);
		System.out.println(result);
	}
}
