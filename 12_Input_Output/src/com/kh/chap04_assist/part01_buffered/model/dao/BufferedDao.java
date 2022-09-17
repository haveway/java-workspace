package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// BufferedReader / BufferedWriter
	// => 버퍼공간을 제공해서 한번에 모아뒀다가 한꺼번에 입출력 진행
	// => 속도 향상 목적의 보조스트림 (BufferedXXX)
	
	// [ 표현법 ]
	// 보조스트림클래스이름 객체이름 = new 보조스트림클래스이름(기반스트림객체);
	// => 보조스트림은 단독으로 존재할 수 가 없음!!!!!!!!!!!!!
	
	// 프로그램 --> 외부매체(파일)
	// 출력
	public void fileSave() {
		
		// BufferedWriter : 버퍼공간을 제공해서 한꺼번에 출력을 진행하겠다.
		
		// 기반스트림이 Input/Output 계열일 경우
		// 보조스트림도 Input/Output 계열을 사용
		// 기반스트림이 Reader/Writer 계열일 경우
		// 보조스트림도 Reader/Writer 계열을 사용
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			// 1. 기반스트림 객체 생성 => 연결통로를 만들겠다.
			fw = new FileWriter("c_buffer.txt");
			
			// 2. 보조스트림 객체 생성
			bw = new BufferedWriter(fw);
			//bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// 3. 파일에 쓰기 => write()
			bw.write("안녕하세요");
			bw.write("\n반갑습니다");
			bw.newLine();
			bw.write("잘가세요~");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. 자원반납 => close()
			// 자원 반납시에는 반드시 생성된 자원순서의 역순으로 반납한다.
			
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// 프로그램 <-------- 파일
	// 입력
	
	public void fileRead() {
		// FileReader 기반으로 BufferedReader를 추가해서 쓰겠다.
		
		/*
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// 1. 기반 스트림 객체 생성
			fr = new FileReader("c_buffer.txt");
			// 2. 보조 스트림 객체 생성
			br = new BufferedReader(fr);
			
			// 3. 읽어오기 -> read()
			
			//System.out.println(br.read());
			

			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());

			String str = null;
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. 자원반납 = > close()
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		*/
		// 실수로 자원반납을 까먹는다면???
		// 누가 대신 close좀 해주면 안되나??
		
		/*
		 * try ~ with ~ resource 구문
		 * - JDK7 버전 이상부터 가능
		 * 
		 * [ 표현법 ] 
		 * try(스트림객체생성;){
		 * 
		 * 		예외가 발생할법한 구문
		 * 	
		 * } catch(예외클래스이름 e){
		 * 
		 *		해당 예외가 발생했을 때 실행할 구문 
		 * 
		 * }
		 * 
		 * - 스트림객체를 try(여기!!!!!!)에 넣어버리면
		 * 	스트림 객체를 생성 후 해당 블록의 구문이 실행완료되었을때
		 *  알아서 자원반납이 된다.
		 * 
		 */
		
		try(FileReader fr = new FileReader("c_buffer.txt"); BufferedReader br = new BufferedReader(fr)){
			
			String value = "";
			while((value=br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
