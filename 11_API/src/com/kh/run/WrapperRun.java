package com.kh.run;

public class WrapperRun {
	
	public static void main(String[] args) {
		
		
		
		/*
		 * Wrapper Class
		 * => 기본자료형을 객체로 포장해주는 클래스들을 래퍼 클래스라고 함
		 * 
		 * 기본자료형	<--------->	Wrapper클래스
		 * boolean				Boolean
		 * char					Character
		 * byte					Byte
		 * short				Short
		 * int					Integer
		 * long					Long
		 * float				Float
		 * double				Double
		 * 
		 */
		
		// 기본자료형을 객체로 취급해야 하는 경우
		// 메소드의 매개변수로 기본자료형이 아닌 객체타입만 요구 될 때
		// 메소드 호출 시
		// 다형성을 적용시키고 싶을 때
		
		int num1 = 10;
		int num2 = 15;
		
		// 만약에 num1과 2를 동등비교 하고 싶다면??
		System.out.println(num1 == num2); // 동등비교 연산자 사용
		//System.out.println(num1.equals(//num2));
		
		// equals => Object 클래스꺼
		// equals() => 주소값을 비교해서 같으면 true/ 다르면 false return
		// 세상천지 모든 클래스가 내가 만든거든 아니든 전부 Object를 상속받고 있음
		
		//Integer i1 = new Integer(num1);
		
		// => Wrapper클래스로 변환하여 사용
		// 기본자료형 => Wrapper클래스 자료형 (Auto Boxing)
		Integer i1 = num1;
		Integer i2 = num2;
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// a.comperTo(b);
		// a가 b보다 크면 1 반환
		// a가 b보다 작으면 -1 반환
		// 같으면 0 반환
		
		
		// 문자열을 Integer타입으로
		//Integer i3 = "123";
		Integer i4 = new Integer("123");
		
		//int num5 = i4.intValue();
		
		// Wrapper 클래스자료형 => 기본자료형(Unboxing)
		
		int num3 = i1;
		int num4 = i2;
		System.out.println("num3 + num4 : " + (num3 + num4));
		
		// 기본자료형 <--> String
		String str1 = "10"; // int형으로
		String str2 = "15.0"; // double형으로
		
		System.out.println(str1 + str2);
		
		//1. String을 기본자료형으로 parsing한다.
		// [ 표현법 ]
		// 해당Wrapper클래스이름.parseXXX(변환할문자열);
		
		int i = Integer.parseInt(str1);// "10" -> 10
		double d = Double.parseDouble(str2);// "15.0" -> 15.0
		
		System.out.println(i + d);
		
		// 2. 기본자료형을 String형으로
		// => String.valueOf(변환할자료형값) : String
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		System.out.println(strI + strD);
		
	}

}
