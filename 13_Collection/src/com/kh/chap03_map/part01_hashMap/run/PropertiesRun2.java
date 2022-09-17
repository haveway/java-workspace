package com.kh.chap03_map.part01_hashMap.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {
	
	public static void main(String[] args) {
		
		// .xml
		// �پ��� ���α׷��� ���� ȣȯ���� ����.
		
		Properties prop = new Properties();
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		System.out.println(prop);
		System.out.println(prop.get("List"));
		
		try {
			prop.storeToXML(new FileOutputStream("test.xml"), "�޷�");
			// storeToXML(OutputStream os, String comments)
			// Properties�� Ű + ��� ��Ʈ�� XML���Ϸ� ���� 
			
			// �ҷ����� : loadFromXML(InputStream is)
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
