package com.kh.chap01_list.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.mvc.controller.MusicController;
import com.kh.chap01_list.mvc.model.vo.Music;

// View : �ð����� ���, ��/���
public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// ����ȭ��
	public void mainMenu(){
		while(true) { // ArrayList
			System.out.println("*** ������ ���� �Ҹ��ٴ� ***");
			System.out.println("1. ���ο� �� �߰�"); // add()
			System.out.println("2. ��ü �� ��ȸ"); // �ݺ��� or toString()
			System.out.println("3. Ư�� �� �˻�"); // �ݺ��� + get()
			System.out.println("4. Ư�� �� ����"); // remove()
			System.out.println("5. Ư�� �� ����"); // set()
			System.out.println("0. ���α׷� ����");
			
			System.out.println("�� ���� ? > ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertMusic(); break;
			case 2 : selectMusic(); break;
			case 3 : searchMusic(); break;
			case 4 : deleteMusic(); break;
			case 5 : updateMusic(); break;
			case 0 : System.out.println("�߰���~~����ߴ�~~"); return;
			default : System.out.println("�̻��ѰŴ������� ~ ~ ~ ");
			}
		}
	}
	
	// 1. ���ο� ���� �߰���ų �� �ִ� ȭ��
	public void insertMusic(){
		System.out.println("---- �� �߰� -----");
		System.out.println("��� �Է� > ");
		String title = sc.nextLine();
		System.out.println("������ �Է� > ");
		String artist = sc.nextLine();
		
		// ��û => Controller�� �޼ҵ� ȣ��
		mc.insertMusic(title, artist);
		
		System.out.println("�߰� ����");
		System.out.println();
	}
	
	
	// 2. ��ü �� ��ȸ�� �� �� �ִ� ȭ��
	public void selectMusic() {
		System.out.println("---- ��ü �� ��ȸ ----");
		
		// ��û
		ArrayList<Music> list = mc.selectMusic();
		
		if(list.isEmpty()) {
			System.out.println("�� �뷡���� ~ ~ ~ ");
		} else {
			for(Music m : list) {
				System.out.println(m);
			}
		}
	}
	
	// 3. Ư�� ���� �˻��� �� �ִ� ȭ��
	public void searchMusic() {
		
		System.out.println("---- Ư�� �� �˻� ----");
		System.out.println("�Է��� ��� �˻� > ");
		String keyword = sc.nextLine();
		
		// ��û
		ArrayList<Music> list = mc.searchMusic(keyword);
		
		System.out.println("�˻� ���");
		
		if(list.isEmpty()) {
			System.out.println("��ȸ�� ����� �����ϴ�.");
		}else {
			for(Music m : list) {
				System.out.println(m);
			}
		}
	}
	
	// 4. Ư�� ���� ������ �� �ִ� ȭ��
	public void deleteMusic() {
		
		System.out.println("---- �� ���� ----");
		System.out.println("������ ��� > ");
		String title = sc.nextLine();
		
		// ��û
		int result = mc.deleteMusic(title);
		
		// 1..2..3.. ���� ����!
		if(result > 0) {
			System.out.println("���������� ����");
		} else {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
	}
	
	// ���� ����� �Է¹޾Ƽ�
	// ������ ���, ������ ���������� �����ϱ�
	
	//5. Ư�� ���� ������ �� �ִ� ȭ��
	public void updateMusic() {
		
		System.out.println("---- �� ���� ----");
		
		// �������(�˻��뵵), ������ ���, ������(������ �뵵)
		System.out.println("���� ��� > ");
		String title = sc.nextLine();
		
		System.out.println("������ ��� > ");
		String newTitle = sc.nextLine();
		System.out.println("������ ������ > ");
		String newArtist = sc.nextLine();
		
		// ��û
		int result = mc.updateMusic(title, newTitle, newArtist);
		
		if(result > 0) { // 1.. 2.. 3.. ��������!!!
			System.out.println("���������� ����");
		} else { // ������ ���� ����.
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
	}
	
}
