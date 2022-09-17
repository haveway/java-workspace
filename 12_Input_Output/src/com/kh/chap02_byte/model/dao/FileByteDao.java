package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object) : �����Ͱ� �����Ǿ��ִ� ������ ���� �����ؼ�
//							 �����͸� ������ϴ� �޼ҵ���� ��Ƶ� Ŭ����(model.dao ��Ű���� ��Ƶ�)

public class FileByteDao {
	
	public void fileSave() {
		// ����Ʈ ��Ʈ�� �ǽ�
		
		// �Է�, ���
		// ���α׷� --> �ܺθ�ü(����)
		// ��� : ���α׷� ���� �����͸� ���Ϸ� ��������(���Ͽ� ����ϰڴ�.)
		// FileOutputStream : "����"�� �����͸� ����ϵ�, 1Byte������ ����ϰڴ�.
		FileOutputStream fout = null;
		
		try {
			// 1. FileOutputStream ��ü ����
			// => �ش� ���ϰ� ���� ����Ǵ� ��θ� ����ڴ�.
			// �ش������� �������� �ʴ� ��� : �ش� ������ �����Ǹ鼭 ��ε� �����
			// �ش������� �����ϴ� ��� : �׳� ��θ� ����� => �ɼ� ���� ����
			// true �ۼ� �� => �ش� ���Ͽ� ������ ������� �̾ �ۼ�
			// true�� �Ⱦ� => �����
			
			fout = new FileOutputStream("a_byte.txt"/*, true*/);
			
			// 2. ������η� ������ ��� : write() ȣ��
			// 1Byte�� ���� : -128 ~ 127 ������ ���ڰ� ��� ������
			// 0 ~ 127������ ���ڸ� ��밡�� => �ƽ�Ű�ڵ�ǥ ����(������ ����Ұ�!!!!!!)
			// ���������
			
			fout.write(97); // a
			fout.write(98); // b
			fout.write(99); // c
			fout.write(100); // d
			
			byte[] arr = {101, 102, 103};
			fout.write(arr); // �޼ҵ� �����ε�
			// efg
			
			fout.write(arr, 1, 2);
			// arr�迭�κ��� 1���ε������� �����ؼ� 2���� ����ʹ�.
			// fg
			
			// abcdefgfg
			fout.write('A');
			fout.write('B');
			fout.write('C');
			
			fout.write('��');
			fout.write('��');
			fout.write('ö');
			// �ѱ��� 2Byte�� ������ ������ �����
			// ����Ʈ ��Ʈ�����δ� �Ұ����ϴ�!!!
			// ���� ��Ʈ���� ���� �ذᰡ��!
			
			// 3. ��Ʈ���� �� ����ߴٸ� ��!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!�ݵ��!!! ������ϴ� �۾��� �ִ�.
			// �� ������ �ݵ��!!!!! ������!!!! �ڿ� �ݳ��� ���־�� �Ѵ�. -- ���
			
			//fout.close(); // ������!!!! ����!!!!
			// ������ ���ܰ� �߻����� ��� �н̵Ǿ ������ �ȵ� ���ɼ��� ����
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // � ���ܰ� �߻��ߵ� �ݵ�� ������ ������ finally���ȿ� �ۼ����ش�.
			try {
				// �ڿ� �ݳ�!
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	// ���α׷� <-- �ܺθ�ü(����)
	// �Է� : ���Ϸκ��� �����͸� ������ ���ڴ�.
	public void fileRead() {
		
		// FileInputStream
		// ���Ϸκ��� �����͸� �����ͼ� �Է��ϴµ�, 1Byte������ �Է� �ްڴ�.
		
		FileInputStream fis = null;
		
		// 1. ��ü ���� : ��Ʈ���� ���ڴ�.
		try {
			
			fis = new FileInputStream("a_byte.txt");
			
			// 2. ��η� ������ �Է¹ޱ�
			// read() �̿�
			// 1Byte������ �ϳ��� �о��
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
			
			// ������ ���� ������ ���� fis.read()�� ȣ���ϸ�?
			// => -1�� ��ȯ�Ѵ�.
			System.out.println(fis.read());
			*/
			
			// �ϳ��ϳ� ������ �߳��´� => ���ڰ� 100����?? 1000����??
			// �ݺ����� �Ẹ��!
			// ��������???
			
			/*
			while(fis.read() != -1){
				System.out.println(fis.read());
			}
			*/
			
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.println(value);
			}
			
			// 3. ���������� �ؾ� �� ��??
			// close() ȣ��
			
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
