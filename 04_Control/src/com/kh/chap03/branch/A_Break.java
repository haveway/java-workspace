package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break; : break문을 만나는 순간 "가장 가까운 반복문"을 빠져나간다.
	 * 			해당 break문이 속해있는 반복문 "한겹"만 빠져나감!!!!!!!!!!!!!!!!!!!!!!!!
	 * 
	 * * 주의할 점 : switch문 안에 break;와 다른개념
	 * 				switch문 내부에 존재하는 break는 해당 switch문을 빠져나가는 용도일 뿐이다!!!!!
	 * 
	 */
	
	public void method1() {
		
		// 매 번 반복적으로 새롭게 발생되는 랜덤값 출력(1~100) => 무한하게
		// 그 랜덤값이 홀 수 일 경우 반복문을 빠져나가게 할 것!
		
		// 1. for(;;)
		// 2. while(true)
		
		for(;;) {// for문 시작
			int random = (int)(Math.random() * 100) + 1;
			
			if(random % 2 == 1) {
				System.out.println("반복문 탈출!");
				break;
			} else {
				System.out.println(random);
			}
			
		} // for문 끝
	}
	
	
	public void method2() {
		
		// 매 번 사용자에게 문자열을 입력 받은 후
		// 해당 문자열의 길이를 출력하자!!!!!!!!!!
		// 단, 사용자가 "exit"을 입력할 경우 반복문을 빠져나가게 해주자
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("문자열을 입력해 주세요 > ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			System.out.println(str.length());
		}
		
	}
	
	/*
	1. 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다.
	1 미만의 숫자가 입력됐다면
	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
	ex.
	1이상의 숫자를 입력하세요 : 4 		1 이상의 숫자를 입력하세요 : 0
	4 3 2 1 					1 이상의 숫자를 입력해주세요.
								1 이상의 숫자를 입력하세요 : 5
								5 4 3 2 1
	*/
	
	public void hw1() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("\n 1이상의 숫자 : ");
			num = sc.nextInt();
		}while(num < 1);
		
		for(; num > 0; num--) {
			System.out.println(num + " ");
		}
		
	}
	
	/*
	2. 사용자로부터 시작 숫자와 공차를 입력 받아
	일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
	단, 출력되는 숫자는 총 10개입니다.
	* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
	ex) 2, 7, 12, 17, 22 …
	5 5 5 5 => 여기서 공차는 5
	ex.
	시작 숫자 : 4
	공차 : 3
	4 7 10 13 16 19 22 25 28 31
	*/
	
	public void hw2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자 : ");
		int num = sc.nextInt(); // ex) 3
		System.out.println("공차 : ");
		int gongcha = sc.nextInt(); // ex) 3
		
		/*
		for(int i = 0; i < 10; i ++) {
			System.out.printf("%d ", num + (gongcha * i));
		}
		*/
		
		/*
		int sum = num;
		String str = "";
		
		for(int a = 1; a<= 9; a++) {
			sum += gongcha;
			str += sum + " ";
		}
		
		System.out.println(num + " " + str);
		*/
	}
	
	public void method3() {
		// 매 번 사용자로부터 숫자 입력받고
		// 해당 숫자가 음수면 " 프로그램을 종료합니다 " 라는 문구를 출력하고 종료시켜보세요 ~
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			System.out.println("숫자 입력 > ");
			int num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("프로그램 종료 ~");
				break;
			}
			
		}
	}
	
	/*
	 * 연산자(+, -, *, /, %)와 정수 두개를 입력받아 입력된 연산자에 따라 알맞은 결과를 출력하세요.
	 * 단, 해당 프로그램은 연산자 입력에 "exit"이라는 값이 들어올때까지 무한 반복하며
	 * "exit"이 들어오면 "프로그램을 종료합니다" 라고 출력하고 종료합니다.
	 * 
	 * 또한, 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
	 * "0으로는 나눌 수 없습니다. 다시 입력해주세요"를 출력하고,
	 * 
	 * 없는 연산자를 입력 시 "없는 연산자입니다. 다시 입력해주세요."라고 출력하고
	 * 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
	 */
	public void method99() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("연산자(+, -, *, /, %) : "); // "exit"입력하면 프로그램 종료
			String p = sc.next();
			
			if(p.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			
			System.out.println("정수 1 입력 : ");
			int num1 = sc.nextInt();
			System.out.println("정수 2 입력 : ");
			int num2 = sc.nextInt();
			
			int result = 0;
			boolean flag = true;
			
			switch(p) {
			case "+" : result = num1 + num2;
			break;
			case "-" : result = num1 - num2;
			break;
			case "*" : result = num1 * num2;
			break;
			case "/" : 
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다 다시 ㄱ");
					flag = false;
				} else {
					result = num1 / num2;
				}
				break;
			case "%" : result = num1 % num2;
			break;
			default : System.out.println("없는 연산자입니다 다시 ㄱ");
			flag = false;
			}
			
			if(flag) {
				System.out.printf("%d %s %d = %d \n", num1, p, num2, result);
			}
			
		}
		
		// if else else if for while do-while switch break
		// return print operator String primitiveVariable
		// method array Scanner 
		
		
	}
}
