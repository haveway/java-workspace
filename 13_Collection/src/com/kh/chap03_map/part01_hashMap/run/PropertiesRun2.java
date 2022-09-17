package com.kh.chap03_map.part01_hashMap.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {
	
	public static void main(String[] args) {
		
		// .xml
		// 다양한 프로그래밍 언어간에 호환성이 좋다.
		
		Properties prop = new Properties();
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		System.out.println(prop);
		System.out.println(prop.get("List"));
		
		try {
			prop.storeToXML(new FileOutputStream("test.xml"), "메롱");
			// storeToXML(OutputStream os, String comments)
			// Properties의 키 + 밸류 세트를 XML파일로 저장 
			
			// 불러오기 : loadFromXML(InputStream is)
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
