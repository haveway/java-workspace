package com.kh.controller;

import java.util.Scanner;

public class B_StringMethodTest {
	
	// 문자열과 관련된 메소드들
	
	public void method1() {
		
		String str1 = "Hell World!";
		
		// 메소드명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char
		char ch = str1.charAt(4);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		// => 문자열과 전달받은 또 다른 문자열을 하나로 합쳐서 반환
		// => 문자열 + str
		String str2 = str1.concat("!!!!!");
		System.out.println("str2 : " + str2);
		
		// 3. 문자열.length() : int
		// => 문자열 길이를 반환(공백도 포함)
		System.out.println("str1의 길이 : " + str1.length());
		
		// 4. 문자열.substring(int beginindex) : String
		// => 문자열의 beginindex위치에서 문자열 끝까지의 문자열을 추출해서 리턴
		// 문자열.substring(int beginindex, int endindex)
		// => 문자열의 beginindex위치에서 endindex까지의 문자열을 추출해서 리턴
		//0 1 2 3 4 5 6 7 8 9 10 
		// H e l l   W o r l d !
		System.out.println(str1.substring(6)); // orld!
		System.out.println(str1.substring(0, 6)); // Hell W
		
		// 5. 문자열.replace(char old, char new) : 반환형 String
		// 문자열에서 old문자를 new 문자로 변환한 문자열을 리턴
		String str3 = str1.replace('l', 'x');
		System.out.println("str3 : " + str3);
		
		// 6. 문자열.trim() : String
		// => 문자열의 앞 뒤 공백을 제거한 문자열을 리턴
		String str4 = "     J    A    V    A        ";
		System.out.println("trim : " + str4.trim());
		
		// 7. 문자열.toUpperCase() : String
		// 모든 문자를 대문자로 변경 후 문자열 리턴
		// 문자열.toLowerCase() : String
		// 모든 문자를 소문자로 변경 후 문자열 리턴
		
		System.out.println("toUpperCase : " + str1.toUpperCase());
		System.out.println("toLowerCase : " + str1.toLowerCase());
		
		// 8. 문자열.toCharArray() : char[]
		// => 문자열의 각 문자들을 char[]배열에 옮겨담은 후 해당 배열을 리턴
		char[] chArr = str1.toCharArray();
		for(int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i] + "");
		}
		System.out.println();
		
		// char[] -> String
		char[] arr = {'a', 'p', 'p', 'l', 'e'};
		System.out.println(String.valueOf(arr));
	}

	
	public void method2() {
		
		// 종료하시겠습니까?(Y/N) : Y 아니면 N 입력받기
		// 경우의 수
		// 1. Y / N
		// 2. y / n
		// 3. 와이 / 엔 등등...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("종료하시겠습니까?(Y/N) : ");
		
		char a = sc.nextLine().toUpperCase().charAt(0);
		// 1. 문자열 입력
		// 2. 문자열의 모든 알파벳을 대문자로 바꿈
		// 3. 0번째 인덱스의 문자만 추출
		// 메소드를 연이어서 호출 : 메소드체이닝
		
		if(a == 'Y') {
			System.out.println("종료합니다.");
			return;
		}else if(a == 'N') {
			System.out.println("종료안합니다.");
		}else {
			System.out.println("뭔데이건");
		}
	}
}
