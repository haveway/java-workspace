package com.kh.chap01.run;

import java.util.Scanner;

public class homework {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		/*
		
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 조회");
		System.out.println("4. 수정");
		System.out.println("5. 종료");
		
		System.out.println("몇번을 누르시겠어요????");
		int num = sc.nextInt();
		
		String result = "";
		
		switch(num) {
		case 1 : result = "입력";
		break;
		case 2 : result = "출력";
		break;
		case 3 : result = "조회";
		break;
		case 4 : result = "수정";
		break;
		case 5 : result = "종료";
		break;
		default : result ="없는";
		}
		System.out.println(result + "메뉴 입니다.");
		
		
		*/
		
		/*
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		System.out.println("영어 점수 : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		int avg = total / 3;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor + "수학 : " + math + "영어 : " + eng + "합계 : " + total + "평균 : " + avg + "축하합니다, 합격입니다.");
		} else {
			System.out.println("재평가입니다.");
		}
		*/
		
		/*
		System.out.println("권한을 입력하세요(관리자, 회원, 비회원) > )");
		String pl = sc.nextLine();
		
		if(pl.equals("관리자")) {
			System.out.println("회원관리, 게시글관리, 댓글달기, 게시글작성");
		}else if(pl.equals("회원")) {
			System.out.println("게시글작성, 게시글조회");
		}else if(pl.equals("비회원")){
			System.out.println("게시글 조회");
		}else {
			System.out.println("그런건 없어요 ~");
		}
		*/
		
		
		System.out.println("피연산자 1 입력 : ");
		double n1 = sc.nextDouble();
		
		System.out.println("피연산자 2 입력 : ");
		double n2 = sc.nextDouble();
		
		System.out.println("연산자 입력(+, -, *, /, %)");

		String o = sc.next();
		
		double result = 0;
		
		if((n1 > 0 && n2 > 0) && (o.equals("+") || o.equals("-") || o.equals("*") || o.equals("/") || o.equals("%"))) {
			
			switch(o) {
			case "+" : result = n1 + n2;
			break;
			case "-" : result = n1 - n2;
			break;
			case "*" : result = n1 * n2;
			break;
			case "/" : result = n1 / n2;
			break;
			case "%" : result = n1 % n2;
			break;
			}
			
			System.out.println(n1 + o + n2 + "=" + result);
			
		}else {
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		
		
	}

}
