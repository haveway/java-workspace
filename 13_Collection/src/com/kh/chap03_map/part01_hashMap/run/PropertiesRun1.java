package com.kh.chap03_map.part01_hashMap.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun1 {
	
	public static void main(String[] args) {
		
		// Properties : Map계열 => key + value 세트로 저장됨
		//				단, 특징이라고 한다면  Key와 Value모두 String형을 다룬다.
		
		// [표현법]
		// Properties 이름 = new Properties();
		
		Properties prop = new Properties();
		
		
		/*
		prop.put("빅맥", new Burger("맛있음", 2500));
		System.out.println(prop);
		System.out.println(prop.get("빅맥"));
		*/
		
		/*
		 * Map 계열이기 때문에
		 * key + value세트로 저장이 되었고
		 * 굳이 String 아니어도 put메소드를 통해 잘 저장됨
		 */
		
		
		/*
		 * 
		 * Properties의 용도 => 파일 입출력하기 위함
		 * key + value세트로 파일로 기록한다던가,
		 * 파일로부터 읽어오는 용도로 많이 사용됨
		 * => .properties 파일 확장자
		 * 
		 * 자주 변경되지 않는 설정파일이나
		 * 해당 프로그램이 기본적으로 가져야할 정보들을 담는 파일
		 * 
		 */
		
		// String, String형으로 담아보자
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		
		Properties inputProp = new Properties();
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			// store(OutputStream os, String Comments)
			// 파일 기록할 때 쓰는 메소드
			// key = value 형태로 파일이 출력됨
			
			// 입력
			System.out.println("\n여기서부터는 입력 ");
			inputProp.load(new FileInputStream("test.properties"));
			// load(InputStream is) : 파일로부터 읽어올 때 쓰이는 메소드
			
			System.out.println(inputProp);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
