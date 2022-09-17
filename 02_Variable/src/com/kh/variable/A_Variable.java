package com.kh.variable;

public class A_Variable {
	// 변수의 필요성
	// 주급 계산을 해볼까요???
	
	public void calPay() {
		System.out.println("--------변수를 사용하기 전--------");
		
		System.out.println("시급 : 9160원");
		System.out.println("근무 시간 : 8시간");
		System.out.println("근무 일자 : 5일");
		
		// 주급 = 시급 X 근무시간 X 근무일자
		// 출력형식 『 XXX : ○○○○○원 형식으로 출력!』
		// 문자열은 쌍따옴표로 묶어서 처리한다.
		// 자바에서 + 기호는 값과 값을 붙일 때 사용
		// 자바에서 * 기호는 곱하기를 할 때 사용
		
		System.out.println("서영재 : " + (21143 * 8 * 5) + "원");
		System.out.println("김명래 : " + (21143 * 8 * 5) + "원");
		System.out.println("고성수 : " + (21143 * 8 * 5) + "원");
		System.out.println("김정길 : " + (21143 * 8 * 5) + "원");
		System.out.println("이승철 : " + (21143 * 8 * 5) + "원");
		
		
		System.out.println("--------- 변수 사용 후 ---------");
		
		// 각각의 시급, 근무시간, 근무일수라는 값을 담을 공간 즉 변수를 만들고 값을 담는다.
		int pay = 21334; // 시급
		int time = 8; // 근무 시간
		int day = 5; // 근무 일수
		
		
		System.out.println("시급 : " + pay + "원");
		System.out.println("근무 시간 : " + time + "시간");
		System.out.println("근무 일수 : " + day + "일");
		
		
		System.out.println("한원석 : " + pay * time * day + "원");
		System.out.println("최벼리 : " + pay * time * day + "원");
		System.out.println("한장민 : " + pay * time * day + "원");
		System.out.println("권수영 : " + pay * time * day + "원");
		
		/*
		 * 
		 * 변수를 사용하는 이유
		 * 
		 * 1. 변수는 값에 의미를 부여하기 위해 사용 => 가독성 높여줌
		 * 2. 단 한번의 값을 기록함으로써 필요할때마다 재사용이 가능 => 재사용성 높아줌
		 * 가독성과 재사용성이 높아짐으로써 유지보수 용이해짐
		 * 
		 */
	} // calPay() 영역 끝
	
	// 변수의 선언
	public void declareVariable() {
		
		/*
		 * 변수 선언 방법
		 * 	int pay;
		 * 
		 * 변수타입(자료형) 변수이름;
		 * 같은 타입의 변수를 선언할 때는 한꺼번에 선언할 수 있음 ex) int pay, day, time;
		 * 변수를 선언하고 난 뒤에 처음 값을 저장하는것을 초기화(initialization)라고 함
		 * 초기화를 진행하여 넣어준 값을 초기값이라고 함
		 */
		
		//System.out.println(pay); 변수는 {} 중괄호 안에서 선언되고 사용 됨
		
		/*
		 * 식별자(Identifier)
		 * 
		 * 클래스명, 메소드명, 변수명 등 사용자가 만들어서 이용하는 고유의 이름
		 * 
		 * 
		 * - 식별자를 생성할 떄 꼭 지켜야하는 규칙(안지키면 안만들어짐)
		 * 
		 * 1. 대, 소문자를 구분하고 길이제한은 없음
		 * 2. 문자, 숫자, (_), $를 식별자 포함할 수 있음
		 * 3. 문자, (_), $로 시작할 수 있음
		 * 4. 공백은 포함할 수 없음
		 * 5. 키워드(예약어)는 식별자로 사용할 수 없음
		 * 
		 * 
		 * - 식별자 이름 규칙(개발자들의 약속)
		 * 
		 * 1. 클래스/인터페이스 이름 규칙
		 * 
		 * - 명사, 형용사를 서술적으로 연결해서 사용
		 * - 첫 글자를 대문자로 표기
		 * - 연결된 단어들의 첫글자도 대문자로 표기
		 * 
		 * ex ) HelloWorld
		 * 
		 * 2. 변수 이름 규칙
		 * 
		 * - 명사적 의미를 갖게 만듬
		 * - 첫글자를 소문자로 표기, 연결된단어들은 대문자로 표기
		 * 
		 * ex ) phoneNumber
		 * 
		 * 3. 메소드 이름 규칙
		 * 
		 * - 동사적 의미를 갖게 만듬
		 * - 첫 글자는 소문자로 표기, 연결된 단어들은 대문자로 표기
		 * - 메소드명을 짓고나서 제일뒤엔 한쌍의 괄호"()"가 붙음
		 * - 메소드명은 일반적으로(_) 사용하지 않음
		 * 
		 * ex ) calPay(), join()
		 * 
		 * 4. 상수 이름 규칙
		 * 
		 * - 모든 문자를 대문자로 표기
		 * - 단어와 단어사이는 (_)을 사용해서 구분한다.
		 * 
		 * ex ) LOGIN_OK
		 */
		
		// 변수의 자료형
		
		/*
		 * 1. 논리형 자료형 ( 논리값 : true, false )
		 * 논리형 자료형에는 true, false가 존재함
		 */
		
		boolean isTrue; // 1byte
		isTrue = true;
		boolean isFalse = false;
		
		/*
		 * 2. 숫자형 자료형
		 * 
		 * 정수형에는 4가지 유형이 있음
		 * 정수형 예약어는 byte, short, int, long형이 있고 int형을 주로 사용하면 된다.
		 * 정수형의 기본형은 int이고 long형을 사용할때는 할당할 숫자 뒤에 "L"을 붙여야 함
		 *  
		 * 
		 * 실수형 2가지 유형이 있음
		 * 실수형 예약어는 float, double이라는 키워드를 사용하고 double을 사용함
		 * float형을 사용하려면 할당할 숫자 뒤에 "F"를 붙여함
		 * 
		 */
		
		// 2_1. 정수형
		
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 3; // 4byte
		long lNum = 4L; // 8byte
		
		// 2_2. 실수형
		
		float fNum = 2.22f; // 4byte
		double dNum = 3.3333; // 8byte
		
		// 3. 문자형
		
		char ch;
		ch = 'a'; // 단일문자에는 반드시 홑따옴표를 붙여준다.
		
		// 4. 문자열형 : 참조자료형 => 주소를 담는다!
		String str;
		
		str = "abc";
		
		// 1. 9개의 자료형을 선언함
		// 2. 9개의 값의 초기화를 진행함
		// 3. 9개의 값이 제대로 들어갔는지 확인해보기!!!!!!!
		// 변수이름 : XX
		
		System.out.print("isTrue : " + isTrue);
		System.out.print("isFalse : " + isFalse);
		System.out.print("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		
		
		// 출력문의 종류!
		// 1. System.out.println(); => 줄바꿈해줌
		// 2. System.out.print(); => 줄바꿈을 하지 않는다
		// 3. System.out.printf("출력하고자 하는 데이터 형식"); => f는 format, 줄바꿈은 해주지 않음
		// => 구멍의 갯수와 매꿀 변수의 개수와 순서, 종류가 명확해야한다.
		
		System.out.printf("isTure의 값은 %b입니다. \n", isTrue);
		System.out.printf("isFalse의 값은 %b입니다. \n", isFalse);
		// %b : true, false 논리형 변수를 담을 수 있게 뚫어주는 구멍
		
		System.out.printf("sNum의 값은 %d입니다.\niNum의 값은 %d입니다.\n", sNum, iNum);
		// %d : byte, short, int, long 정수형 변수를 담을 수 있게 뚫어주는 구멍
		
		System.out.printf("fNum : %f\ndNum : %f\n", fNum, dNum);
		// %f : float, double 실수형 변수를 담을 수 있게 뚫어주는 구멍
		// 소수점 아래 7번째에서 반올림되서 6번째까지만 출력이 되는 형식
		// %.1f : 소수점 아래에서 2번째에서 반올림되어 1번째까지만 출력이 되는 형식		
		
		// %c, %C, %s, %S
		
		System.out.println("개행은 \\n을 사용합니다.");
	}
	
	// 상수 : 변경하지 않을 변수
	public void constant() {
		int khNum;
		khNum = 1;
		System.out.println(khNum);
		khNum = 2;
		System.out.println(khNum);
		
		// 상수 : 1760년부터 올해의 년도까지를 계산하는 메소드
		// [표현법] final 자료형 상수이름;
		
		final int START_YEAR = 1760;
		
		double PI = 3.14;
	}

} // 클래스 영역 끝
