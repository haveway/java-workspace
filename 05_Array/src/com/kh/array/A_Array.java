package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	
	// 변수(Variable) :
	// 메모리에 데이터값을 저장하기 위한 공간
	
	// 변수 : 하나의 공간에 하나의 값만 담을 수 있음
	// 1. 변수마다의 크기가 정해져있다.
	// 2. 자료형이 지정되어있다.
	// 3. stack 메모리 -> 기본자료형
	// 4. 값이 바뀔 수 있다.
	// 5. 형변환이 가능하다.
	// 6. 식별자를 붙일 수 있다.
	// 7. 연산이 가능하다.
	// 8. 초기화 한 번 밖에 못한다.
	// 9. 코드블럭 안에서 선언되고 사용된다.
	// 10. 공간이 하나다. => 값을 하나만 받는다.
	// 11. 참조형은 주소값을 저장한다.
	
	// 배열(Array) : 하나의 공간에 여러개의 값을 담을 수 있음
	// 				단, "같은 자료형의 값들"이어야 함
	// 				=> 배열의 각 인덱스자리에 실제 값이 담김 인덱스는 "0"부터 시작한다.
	
	
	public void method1() {
		
		// 배열은 왜 써야할까??
		// 변수만 이용해서 프로그래밍을 하면...??
		// 0, 1, 2, 3, 4, 5 .. 값이 늘어날때마다 변수를 만들어서 기록 하고 싶음!!
//		
//		int num1 = 1;
//		int num2 = 2;
//		int num3 = 4;
//		int num4 = 7;
//		int num5 = 11;
		
		//변수값 출력!!
//		
//		System.out.println(num1); // 1
//		System.out.println(num2); // 2
//		System.out.println(num3); // 4
//		System.out.println(num4); // 7
//		System.out.println(num5); // 11
//		
//		int sum = 0;
//		for(int i = 1; i <= 5; i++) {
//			//sum += numi; // 반복문 쓰잘때기 없음 왜배웠지?? 난 무엇을위해?? 대체...
//		}
//		
//		sum = num1 + num2 + num3 + num4 + num5; // 하나하나 다 더해줌
//		
		// 변수가 100개가 되면..? num100 num2400까지 있다면...??
		// 해결 : 배열!
		
		
		// 1. 배열 선언
		
		/*
		 * 변수의 경우엔?
		 * 자료형 변수식별자;
		 * 
		 * 배열 선언법!
		 * 1) 자료형 배열식별자[];
		 * 2) 자료형[] 배열식별자; => 요방법을 주로 사용할 것.
		 * 
		 */
		
		/*
		int a; // 변수 선언
		
		int arr1[]; // 1번 방법으로 int형 배열을 선언!
		
		int[] arr2; // 2번 방법으로 int형 배열을 선언!
		*/
		
		// 2. 배열 할당
		
		/*
		 * 이 배열에 몇개의 값이 들어갈지 배열의 크기를 정해주는 과정
		 * 지정한 갯수만큼 값이 들어갈 공간이 만들어짐
		 * 
		 * [ 표현법 ]
		 * arr = new int[5];
		 * int[] arr = new int[5]; // 선언과 동시에 할당
		 * 
		 * 배열은 참조형이다!!!!!!!!!!!!!!!
		 * 참조형 : new
		 * 
		 */
		
		int[] arr1;
		arr1 = new int[15];
		
		int[] arr2 = new int[5];
		
		// 3. 배열의 각 인덱스에 값 대입
		
		/*
		 * [ 표현법 ]
		 * 배열이름[인덱스] = 값; // 0부터시작!!
		 * 
		 */
		
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		
		// 변수랑 차이가 없네??
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		
		System.out.println("\narr2 : ");
		
		// 배열의 가장 큰 장점 : 반복문을 사용가능
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
	
	
	public void method2() {
		
		
		// String형 배열
		// 1. 배열의 선언과 할당 names [30]
		
		String[] names = new String[30];
		
		// 2. 배열의 인덱스의 값을 대입
		
		names[0] = "고성수";
		names[1] = "권성준";
		names[2] = "권수영";
		names[3] = "김명래";
		names[4] = "김민아";
		names[5] = "김아람";
		names[6] = "김유미";
		names[7] = "김유진";
		names[8] = "김정길";
		names[9] = "문용준";
		names[10] = "민경태";
		names[11] = "서영재";
		names[12] = "손동환";
		names[13] = "오장훈";
		names[14] = "유형두";
		names[15] = "윤자원";
		names[16] = "이지안";
		names[17] = "이태훈";
		names[18] = "이혜인";
		names[19] = "임유리";
		names[20] = "정유진";
		names[21] = "조성준";
		names[22] = "조한울";
		names[23] = "지승현";
		names[24] = "진유선";
		names[25] = "차   현";
		names[26] = "최벼리";
		names[27] = "최승희";
		names[28] = "한원석";
		names[29] = "한장민";
		
		// names[100] = "이승철"; // 문법적으론 맞게 잘 썼다 ~ 문법은 틀린거 없다~
		// ArrayIndexOutOfBoundsException : 100 <- 이유
		// 배열의 인덱스 범위를 벗어났다!
		// at com.kh.array.A_Array.method2(A_Array:174) <- 여기서 벗어났어! 위치!
		// A_Array라는 클래스의 method2()에서 174행에서 문제가 생긴거야!!
		
		System.out.println("names 배열의 크기 : " + names.length);
		
		System.out.println();
		
		for(int i = 0; i <= names.length-1; i++) {
			System.out.printf("출석번호 %d번 %s \n", i+1, names[i]); // 문법적으로는 맞게 썼다~!~!
		}
		
		// 인덱스는 몇번부터 ~~~~?? **************무조건 0번부터
	}
	
	
	
	public void method3() {
		
		// 정수형 값 5개 
		// int형 배열에 대입하고 
		// 반복문을 이용하여 합계 출력하기
		
		int[] arr = new int[5]; // 0, 1, 2, 3, 4
		
		arr[0] = 5;
		arr[1] = 15;
		arr[2] = 556234;
		arr[3] = 5424;
		arr[4] = 543543;
		
		//System.out.println(arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);
		
		int sum = 0;
		for(int i = 0; i <= arr.length-1; i++) {
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
	}
	
	
	public void method4() {
		
		// 1. 사용자로부터 입력을통해 배열에 값을 담기 배열은 다섯칸짜리로
		
		int[] nums = new int[5];
		
		Scanner sc = new Scanner(System.in);
		//System.out.println(nums.length);
		
		
		for(int i = 0; i <= nums.length-1; i++) {
			System.out.print("정수를 입력해주세요 >");
			nums[i] = sc.nextInt();
			//System.out.println("nums 배열의 " + i + "번째 인덱스에 들어가는 값 " + nums[i]);
		}
		
		//System.out.println(Arrays.toString(nums));
		
		// 2. 해당 배열에서 가장 작은 값, 즉 최소값을 구하는 메소드를 만들어보자! 
		
		// 가장 작은값을 구하고싶다....
		// 띵킹... 음??? 
		
		int min = nums[0];
		
		for(int i = 0; i <= nums.length-1; i++) {
			if(nums[i] < nums[0]) {
				min = nums[i];
			}
		}
		
		System.out.println("최소값 : " + min);
	}
	
	public void method5() {
		
		// 1. 배열 선언 + 할당
		int[] iArr = new int[3]; // 0번, 1번, 2번
		double[] dArr = new double[5]; // 0번, 1번, 2번, 3번, 4번
		
		// 배열이름.length : 배열의 길이(크기) => 정수
		System.out.println("iArr의 크기 : " + iArr.length); // 3
		System.out.println("dArr의 크기 : " + dArr.length); // 5
		
		//int i;
		//double d;
		//System.out.println(i);
		//System.out.println(d);
		
		System.out.println(iArr[0]); // 0
		System.out.println(dArr[0]); // 0.0
		// 초기화를 진행해주지 않아도 자동으로 초기값이 담겨있음
		
		
		/*
		 * 기본 자료형 : boolean, char, byte, short, int, long, float, double 
		 * => 실제 값을 바로 담을 수 있는 변수 : 일반 변수
		 * 
		 * 참조 자료형 : int[], double[], short[].. String
		 * => 주소 값은 담고 있는 변수 : 참조 변수 (레퍼변스 변수)
		 * 
		 */
		
		System.out.println(iArr);
		System.out.println(dArr);
		
		
		/*
		String[] KH정보교육원종로점 = new String[3];
		
		KH정보교육원종로점[0] = "A강의장";
		KH정보교육원종로점[1] = "V강의장";
		KH정보교육원종로점[2] = "C강의장";
		
		System.out.println(KH정보교육원종로점[2]);
		*/
		
		// 참조자료형에서는 == 비교시 주소값을 비교하기 떄문에 우리가 원하는 값을 얻을 수 없음!!!!
		// 문자열.equals("비교할문자열");
		
		System.out.println("iArr의 해시코드 값 : " + iArr.hashCode());
		System.out.println("dArr의 해시코드 값 : " + dArr.hashCode());
		// 해시코드 : 주소값을 십진수의 형태로 나타낸 것
		
		int[] iArr2 = new int[3];
		
		System.out.println("iArr == iArr2 ? :" + (iArr == iArr2)); // false
		System.out.println("iArr2의 해시코드 값 : " + iArr2.hashCode());
		
		
		// 반복문
		// 0번 인덱스부터 마지막 인덱스까지 1씩 증가하면서 순차적으로 출력 가능
		// 마지막 인덱스 == 배열의 크기 -1
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i] + " ");
		}
		
		for(int i = 0; i <= iArr.length-1; i++) {
			System.out.println(iArr[i] + " ");
		}
	}
	
	
	/*
	 * 배열의 아쉬운점 ? 
	 * 
	 * 한 번 지정한 배열의 크기는 변경 불가!!!!!!!!!!!!!!!
	 * => 배열의 크기를 변경하고자 한다면??
	 * 어쩔 수 없이 배열을 다시 만들어야한다~
	 * 
	 */
	public void method7() {
		
		String[] sArr = new String[3];
		
		sArr[0] = "김";
		sArr[1] = "정";
		sArr[2] = "길";
		
		System.out.println("sArr의 해시코드 : " + sArr.hashCode());
		
		for(int i = 0; i <= sArr.length-1; i++) {
			System.out.println(sArr[i]);
		}
		
		sArr = new String[5];
		
		System.out.println("--- sArr이 죽었다 살아났나?? ---");
		System.out.println("죽었다 깨어난 sArr의 해시코드 : " + sArr.hashCode());
		
		/*
		 * 연결이 끊어진 기존의 배열은???
		 * Heap영역에 둥둥 떠다니다가 일정시간이 지나면
		 * 가비지컬렉터(GC)가 삭제시켜준다 !! : 자동 메모리 관리 
		 * 
		 * 배열은 항상 고유한 주소값이 부여 됨
		 * 기존 배열 이름에 할당만 다시하면??
		 * => 기존에 참조하고 있던 연결이 끊기고 새로운 배열과 연결됨
		 * => 새로운 곳을 참조한다. // 비둘기집 원리
		 * 
		 * 주소값이 다르면 다른 배열이다 == O
		 * 
		 */
		
		
		// 현재 연결고리를 끊고만 싶다면???
		
		sArr = null; // null : 아무것도 존재하지 않음을 의미
		
		//sArr[0] = "집중하세요";
		// NullPointerException
		// -> 주소가 없는데 어떻게 접근할래?? 어떻게 대입할래??
		
		//System.out.println(sArr[0]);
		
		/*
		 * 기본 자료형 할 때는 없던 개념
		 * 
		 * 참조자료형에는 null이라는 개념이 추가됨 => 주소값이 있냐 없냐???
		 * 
		 * 기본 자료형 기본값이
		 * 
		 * int a = 0;
		 * double d = 0.0;
		 * char c = '';
		 * 
		 * 참조자료형의 기본값은 ??????? => null(주소값이 없다)
		 * 
		 * int[] iArr = null;
		 * double[] dArr = null;
		 * Scanner sc = null;
		 * 
		 */
		
		
		// OO형 배열 빼고 Scanner 빼고 
		
		String st = new String();
		
		System.out.println(st); // ""
		
		// String은 참조자료형이지만 자동으로 null로 초기화가 되지않는다!
		String str = null;
		System.out.println(str);
	}
	
	
	public void minMax() {
		
		// 10개의 값을 저장할 수 있는 정수형배열을 선언 및 할당하고
		
		// 1 ~ 10 사이의 난수(random)를 발생시켜 배열에 초기화(initialize)한 후
		
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		
		// ex)
		// 1 5 8 1 3 4 6 7 8 10
		// 최대값 : 10
		// 최소값 : 1
		
		int[] iArr = new int[10];
		
		for(int i = 0; i <= iArr.length-1; i++) {
			iArr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(iArr[i] + " ");
		}
		
		int min = iArr[0];
		int max = iArr[0];
		
		for(int i = 0; i <= iArr.length-1; i++) {
			if(min > iArr[i]) {
				min = iArr[i];
			}else if(max < iArr[i]) {
				max = iArr[i];
			}
		}
		System.out.println("\n최소값 : " + min);
		System.out.println("최대값 : " + max);
		
	}
	
	public void rotto() {
		
		// 로또 번호 자동 생성 프로그램을 작성하는데 중복 값 없이출력하세요.
		
		// ex.
		// 10 31 2 5 8 28
		
		int[] arr = new int[6];
		
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
			
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j]) {
						i--;
						break;
					}
				}
			}
		}
		
		
		
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	// 메소드 == "항상 특정 자료형에만 사용할 수 있는 기능"
	// 함수
	// println()
	// nextLine(), nextDouble()...
	// equals()
	// toString()
	// length()
	// charAt()
	
	public void method9() {
		
		// 배열 선언 및 할당과 동시에 초기화(대입)까지 한번에 끝내는 방법
		
		// 방법 1.
		
		/*
		 * arr[0] = 1;
		 * arr[1] = 3;
		 * arr[2] = 8;
		 * arr[3] = 5;
		 */
		
		int[] arr1 = new int[] {1, 3, 8, 5};
		
		// 방법 2.
		
		int[] arr2 = {1, 3, 8, 5};
		
		System.out.println("arr1 == arr2 ? " + (arr1 == arr2));
		
		String[] students = {"조한울", "고성수", "권성준", "김명래"}; // 하드코딩
		
	}
	
	
	
	
	
	
	
}
