package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * 증감연산자 : 단항연산자로서 한번에 1씩 증가(더하거나)하거나 감소(빼거나) 하는 연산을 한다.
	 * => 먼저 증감을 할건지, 나중에 증감을 할건지 연산자의 위치에 따라 달라진다.
	 * 
	 * [ 표현법 ]
	 * ++ : 값을 1씩만 증가시키는 연산자
	 * -- : 값을 1씩만 감소시키는 연산자
	 * 
	 * 연산자의 위치
	 * 전위연산 : ++값, --값 => 먼저 값을 증감하고 그 값을 처리
	 * 후위연산 : 값++, 값-- => 값을 먼저 처리하고 나서 증가하거나 감소하겠다. 
	 * 
	 */
	
	//후위연산
	public void method1() {
		int num = 10;
		System.out.println("num : " + num); // 10
		
		num++; // num 이라는 이름을 가진 변수의 값에다가 1을 증가시키겠다.
			   // num + 1
		
		System.out.println("☆처리☆ num : " + num); // 11
		
		num--;
		System.out.println("num : " + num); // 10
		
		System.out.println("num : " + num++); // 10 
		System.out.println("num : " + num); // 11
	}
	
	public void method2() {
		int a = 10;
		int b = a++;
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 10
		// b라는 변수에 a값을 먼저 대입하고 (선 처리 부분)
		// a라는 값을 증가 시킨다 (후 연산)
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : " + c); // 19
		System.out.println("d : " + d); // 20
	}
	// 전위 연산
	public void method3() {
		int a = 10;
		int b = ++a; // b에는 11(선연산)이 들어감(후처리)
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 11
		
		System.out.println("a : " + --a); // 10
	}
	public void method4() {
		// 후위연산자
		int num1 = 20;
		int result = num1++*3;
		
		System.out.println("num1 : " + num1);     // 20 21 23 61 63
		System.out.println("result : " + result); // 63 60 20 60 20
		
		// 전위연산자
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + result2);
	}
}

