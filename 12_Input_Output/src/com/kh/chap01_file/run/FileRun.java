package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {
	
	public static void main(String[] args) {
		
		// �����ϰ� ������ ����� ����
		// File Ŭ������ ������ �۾�
		// java.io ��Ű���� ����
		
		// ���� Ŭ���� ��ü ����
		// 1. ������ ��������� ���� �ʰ�
		// ���ϸ� �����ؼ� ���� =>
		// ���� �� ������Ʈ ���� ���� ������ ������
		File file1 = new File("test.txt"); // File��ü ����
		try {
			
			file1.createNewFile();
			//createNewFile() : ������ �������ִ� �޼ҵ�
			
			// 2. ��������� �� ���ϸ��� �����ؼ� �����ʹ�!!!
			// => ���� �����ϴ� ��θ� �����ؾ���
			// C:\aaa ����� ��������!
			File file2 = new File("C:\\aaa\\test.txt");
			// file2 ��ü ����
			file2.createNewFile();// ��ο� ���� ����
			
			
			// 3. ���� �����ϰ� �ȿ� ���ϵ� ����
			File forder = new File("bbb");
			forder.mkdir();
			// mkdir() : ������ �������ִ� �޼ҵ�
			
			File file3 = new File("bbb\\test.txt");
			file3.createNewFile();
			
			// 4. ��� ���� �� ���� ���� �� ���� ����
			// C:\ddd\test.txt => �̽�ö�� ���!!
			
			File dddforder = new File("C:\\ddd");
			dddforder.mkdir();
			
			File file4 = new File("C:\\ddd\\test.txt");
			file4.createNewFile();
			
			
			//File ���� �����ϴ� �޼ҵ��
			
			System.out.println("�����̼��� ~ ? " + file4.isFile());
			// �����̸� true / ������ false�� ��ȯ
			System.out.println("�����̼��� ~ ? " + dddforder.isFile());
			// ddd�� �����ϱ� false
			
			System.out.println("�����̸� : " + file4.getName()); // ���ϸ� ����
			
			System.out.println("�������� : " + file4.getParent()); // ���������� ����
			
			System.out.println("���Ͽ뷮 : " + file4.length()); // ���� ũ��
			
			System.out.println("������ : " + file4.getAbsolutePath()); // ������
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	/*
	 * ���α׷� ���� �����͸� �ܺθ�ü(�����, ����Ŀ, "����")�� ����ϰų�
	 * �Է���ġ(Ű����, ���콺, ����ũ, "����")�� �Է¹޴� ����
	 * 
	 * => IO(Input & Output, �����)
	 * 
	 * �׷���! IO�� �Ǵ� ������ �����ϱ�???
	 * IO�� �����ϰ� �ʹٸ�
	 * �켱������ "�ݵ��" ���α׷��� �ܺθ�ü���� "���"�� �������Ѵ�.
	 * => "��Ʈ��"(Stream)
	 * 
	 * 
	 * ��Ʈ���� Ư¡ 
	 * - �ܹ��� : �Է��̸� �Է�, ����̸� ���
	 * 			�Է¿� ��Ʈ�� ����, ��¿� ��Ʈ���� ���� ����
	 * 			���ÿ� ������� �ϰ��� �Ѵٸ�??
	 * 			-> �ϳ��� ��Ʈ�����δ� �Ұ���!!!
	 * 			-> �Է�, ��� ��Ʈ�����δ� �Ұ���!!!
	 * - ���Լ���(FIFO) : ���� ������ ���� ���� ������ �� => ť(Queue)
	 * 					(������� ���� ���´�.)
	 * 
	 * �ð����� ������ �߻��� �� �ִ�.
	 * 
	 * ��Ʈ���� ����
	 * - ����� ������
	 * 
	 * ����Ʈ ��Ʈ�� : 1Byte¥���� �̵��� �� �ִ� ���� ��� 
	 * 								=> �Է�(XXXInputStream) / ���(XXXOutputStream)
	 * ���� ��Ʈ�� : 2Byte¥���� �̵��� �� �ִ� ���� ���
	 * 								=> �Է�(XXXReader) / ��� (XXXWriter)
	 * 
	 * - �ܺθ�ü���� �������� ���� ����
	 * ��� ��Ʈ�� : �ܺθ�ü�Ͽ� ���������� ����Ǵ� ���
	 * ���� ��Ʈ�� : ��� ��Ʈ�������� ������ ������ �������ִ� �䵵�� ��Ʈ��
	 * 			=> �ܵ� ��� �Ұ�(��ݽ�Ʈ���� ����� �߰����ִ� �뵵)
	 * 			=> �ӵ����, �ڷ����� ���缭 ��ȯ, ��ü������ ������ϰ� ����...
	 */
	
}
