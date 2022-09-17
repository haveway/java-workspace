package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	// 프로그램 --> 외부매체(파일)
	// 출력
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2Byte단위로 출력하는 스트림
		FileWriter fw = null;
		
		
		try {
			
			// 1. 객체 생성 => 파일과 연결된 통로를 만들겠다.
			fw = new FileWriter("b_char.txt");
			
			// 2. 파일에 쓰기 => write()
			fw.write("와... IO신기하당..ㅎㅎㅎ");
			fw.write("B");
			char[] arr = {'a', 'b', 'c', 'd'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 자원 반납 => close() 통로를 닫아주겠다.
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 프로그램 <-- 외부매체(파일)
	// 입력
	public void fileRead() {
		// FileReader : 파일로 데이터를 2Byte단위로 입력하는 스트림
		// 0. 객체 선언
		FileReader fr = null;
		
		try {
			
			// 1. 객체 생성
			fr = new FileReader("b_char.txt");
			
			// 2. 읽어들이기 => read()
			/*
			System.out.println(fr.read()); // 50752 => 와
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			System.out.println(fr.read()); // 46
			
			
			System.out.println(fr.read()); // -1
			*/
			
			// 반복문 쓰자!!!!
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
