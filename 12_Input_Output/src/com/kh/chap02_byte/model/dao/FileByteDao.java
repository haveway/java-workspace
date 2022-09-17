package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object) : 데이터가 보관되어있는 공간에 직접 접근해서
//							 데이터를 입출력하는 메소드들을 모아둔 클래스(model.dao 패키지에 모아둠)

public class FileByteDao {
	
	public void fileSave() {
		// 바이트 스트림 실습
		
		// 입력, 출력
		// 프로그램 --> 외부매체(파일)
		// 출력 : 프로그램 내의 데이터를 파일로 내보내기(파일에 기록하겠다.)
		// FileOutputStream : "파일"로 데이터를 출력하되, 1Byte단위로 출력하겠다.
		FileOutputStream fout = null;
		
		try {
			// 1. FileOutputStream 객체 생성
			// => 해당 파일과 직접 연결되는 통로를 만들겠다.
			// 해당파일이 존재하지 않는 경우 : 해당 파일이 생성되면서 통로도 연결됨
			// 해당파일이 존재하는 경우 : 그냥 통로만 연결됨 => 옵션 지정 가능
			// true 작성 시 => 해당 파일에 내용이 있을경우 이어서 작성
			// true를 안씀 => 덮어쓰기
			
			fout = new FileOutputStream("a_byte.txt"/*, true*/);
			
			// 2. 연결통로로 데이터 출력 : write() 호출
			// 1Byte의 범위 : -128 ~ 127 까지의 숫자가 출력 가능함
			// 0 ~ 127까지의 숫자만 사용가능 => 아스키코드표 참조(음수는 절대불가!!!!!!)
			// 데이터출력
			
			fout.write(97); // a
			fout.write(98); // b
			fout.write(99); // c
			fout.write(100); // d
			
			byte[] arr = {101, 102, 103};
			fout.write(arr); // 메소드 오버로딩
			// efg
			
			fout.write(arr, 1, 2);
			// arr배열로부터 1번인덱스에서 시작해서 2개만 쓰고싶다.
			// fg
			
			// abcdefgfg
			fout.write('A');
			fout.write('B');
			fout.write('C');
			
			fout.write('이');
			fout.write('승');
			fout.write('철');
			// 한글은 2Byte기 때문에 깨져서 저장됨
			// 바이트 스트림으로는 불가능하다!!!
			// 문자 스트림을 쓰면 해결가능!
			
			// 3. 스트림을 다 사용했다면 꼭!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!반드시!!! 해줘야하는 작업이 있다.
			// 다 썻으면 반드시!!!!! 무조건!!!! 자원 반납을 해주어야 한다. -- 약속
			
			//fout.close(); // 무조건!!!! 강조!!!!
			// 위에서 예외가 발생했을 경우 패싱되어서 실행이 안될 가능성이 있음
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 어떤 예외가 발생했든 반드시 실행할 구문을 finally블럭안에 작성해준다.
			try {
				// 자원 반납!
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	// 프로그램 <-- 외부매체(파일)
	// 입력 : 파일로부터 데이터를 가지고 오겠다.
	public void fileRead() {
		
		// FileInputStream
		// 파일로부터 데이터를 가져와서 입력하는데, 1Byte단위로 입력 받겠다.
		
		FileInputStream fis = null;
		
		// 1. 객체 생성 : 스트림을 열겠다.
		try {
			
			fis = new FileInputStream("a_byte.txt");
			
			// 2. 통로로 데이터 입력받기
			// read() 이용
			// 1Byte단위로 하나씩 읽어옴
			/*
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			
			// 파일의 끝을 만나는 순간 fis.read()를 호출하면?
			// => -1을 반환한다.
			System.out.println(fis.read());
			*/
			
			// 하나하나 찍으면 잘나온다 => 문자가 100개면?? 1000개면??
			// 반복문을 써보자!
			// 퐁당퐁당???
			
			/*
			while(fis.read() != -1){
				System.out.println(fis.read());
			}
			*/
			
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.println(value);
			}
			
			// 3. 마지막으로 해야 할 일??
			// close() 호출
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}
