package com.kh.chap01_list.mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.mvc.model.vo.Music;

// Controller : ������� ��û�� �޾Ƽ� ó�����ִ� Ŭ���� ó������� View�� ��ȯ�Ѵ�.
public class MusicController {
	// ���� ����Ʈ ����
	private ArrayList<Music> list = new ArrayList<>();
	
	{// �ʱ�ȭ ��� : ��ü ���� �� ������ ����Ǵ� ���
		list.add(new Music("������","�̽�ö"));
		list.add(new Music("����ī����̵�","�ڿ츲"));
	}
	
	// ����ڰ� ���ο� �� �߰� ��û�� �Ҷ� ���� ����Ǵ� �޼ҵ�
	public void insertMusic(String title, String artist){
		list.add(new Music(title, artist));
	}
	
	// �� ��ü ��ȸ ��û �� ����Ǵ� �޼ҵ�
	public ArrayList<Music> selectMusic(){
		return list;
	}
	
	// Ư�� �� �˻� ��û�� ���� �� ���� ����Ǵ� �޼ҵ�
	public ArrayList<Music> searchMusic(String keyword) {
		
		// �˻��� ����� ��� ArrayList<Music> ��ü ����
		ArrayList<Music> searched = new ArrayList<>(); // [] �� list
		
		// ��ȸ => �´� keyword�� searched�� �߰�
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				// ���ڿ�.contains(���ԵǾ��ִ��� �ñ��� �ܾ�) 
				// �ش� ���ڿ��� ���ԵǾ������� true/ ������ false��ȯ
				searched.add(list.get(i));
			}
		}
		
		return searched;
	}
	
	// Ư�� �� ���� ��û �� ������ �޼ҵ�
	public int deleteMusic(String title) {
		
		// ����� ���� ���� ���� ����
		int result = 0;// ������ ����� Ƚ��
		
		// ó��
		
		// ��ü �� ��� �߿���(�ݺ���)
		for(int i = 0; i < list.size(); i++) {
			// �� ������ ����ڰ� �Է��� �� ���𰡿� �����ϴٸ�(���ǹ�)
			if(list.get(i).getTitle().equals(title)) {
				// �� ���� �����Ѵ�.(remove())
				list.remove(i);
				result++;
			}
		}
		
		return result; // result�� 0�̶�� ������ �̷������ �ʾҴ�.
	}
	
	// Ư�� �� ���� ��û �� ������ �޼ҵ�
	public int updateMusic(String title, String newTitle, String newArtist) {
		
		// ����� ���� ���� ���� ����
		int result = 0; // �� ����Ƚ��
		
		// ó��
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				// ��� 1.
				// list.set(i, new Music(newTitle, newArtist));
				// ��� 2.
				list.get(i).setTitle(newTitle);
				list.get(i).setArtist(newArtist);
				result++;
			}
		}
		
		return result; // 0�̶�� ������ �̷������ ����!
	}
	
	

}
