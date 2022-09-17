package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	// ���α׷� --> �ܺθ�ü(����)
	// ���
	public void fileSave() {
		// FileWriter : ���Ϸ� �����͸� 2Byte������ ����ϴ� ��Ʈ��
		FileWriter fw = null;
		
		
		try {
			
			// 1. ��ü ���� => ���ϰ� ����� ��θ� ����ڴ�.
			fw = new FileWriter("b_char.txt");
			
			// 2. ���Ͽ� ���� => write()
			fw.write("��... IO�ű��ϴ�..������");
			fw.write("B");
			char[] arr = {'a', 'b', 'c', 'd'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. �ڿ� �ݳ� => close() ��θ� �ݾ��ְڴ�.
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ���α׷� <-- �ܺθ�ü(����)
	// �Է�
	public void fileRead() {
		// FileReader : ���Ϸ� �����͸� 2Byte������ �Է��ϴ� ��Ʈ��
		// 0. ��ü ����
		FileReader fr = null;
		
		try {
			
			// 1. ��ü ����
			fr = new FileReader("b_char.txt");
			
			// 2. �о���̱� => read()
			/*
			System.out.println(fr.read()); // 50752 => ��
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
			
			// �ݺ��� ����!!!!
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
