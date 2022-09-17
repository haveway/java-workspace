package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// ���α׷� --> �ܺθ�ü(����)
	// ���
	
	// ObjectOutputStream : 
	// => ��ü������ ���Ͽ� ����ϰ��� �� �� �ʿ��� ������Ʈ��
	public void fileSave(String fileName) { // ���� �̸��� �Է¹޾Ƽ� ���� �����ϱ�
		
		Phone ph = new Phone("������", "13pro", "aplle", 5000000);
		
		// 1�ܰ�. ��ݽ�Ʈ�� => FileOutputStream
		// 2�ܰ�. ������Ʈ�� => ObjectOutputStream
		// 4�ܰ�. �ڿ��ݳ� => close()
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			// 3�ܰ�. ��ü �����͸� ���Ͽ� ��� => writeObject()
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ��ü�� ���Ϸ� ����ߴ��� �̻��Ѱ� �� ������ Exception��¼����!!
	// ������ ���!! ���� ��������� �����Ͱ� ����
	// �� ��峪 Ȯ���غ�����??? �ٽ� �Է¹޾Ƽ� �ֿܼ� ���� ������ ������???
	
	// ���α׷� <-- �ܺθ�ü
	// �Է�
	public void fileRead(String fileName) {
		
		// FileInputStream : ��ݽ�Ʈ��
		// ObjectInputStream : ��ü ������ ���Ϸκ��� �о�� �� ����ϴ� ������Ʈ��
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		
		// 1. ��ݽ�Ʈ�� ����
		// 2. ������Ʈ�� ����
		// 3. �о���� => readObject()
		// 4. �ڿ��ݳ�
		
		try { // ���� ���� �������ڵ� ��� ���� ���ܰ� �߻��� �����ְ� �ȹ߻��Ҽ��� ����
			// 1. ��ݽ�Ʈ�� ����
			fin = new FileInputStream(fileName);
			// 2. ������Ʈ�� ����
			ois = new ObjectInputStream(fin);
			
			// 3. �о���� readObject()
			// ������ȭ�� readObject()�� �˾Ƽ� ����
			
			Phone ph = (Phone)ois.readObject(); // ������
			// ObjectŬ������ PhoneŬ������ �θ�Ŭ����
			System.out.println(ph);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// 4. �ڿ��ݳ�
				ois.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
	

}
