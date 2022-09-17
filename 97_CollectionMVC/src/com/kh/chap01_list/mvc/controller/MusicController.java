package com.kh.chap01_list.mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.mvc.model.vo.Music;

// Controller : 사용자의 요청을 받아서 처리해주는 클래스 처리결과를 View로 반환한다.
public class MusicController {
	// 음악 리스트 생성
	private ArrayList<Music> list = new ArrayList<>();
	
	{// 초기화 블록 : 객체 생성 시 무조건 수행되는 블록
		list.add(new Music("말리꽃","이승철"));
		list.add(new Music("매직카펫라이드","자우림"));
	}
	
	// 사용자가 새로운 곡 추가 요청을 할때 마다 실행되는 메소드
	public void insertMusic(String title, String artist){
		list.add(new Music(title, artist));
	}
	
	// 곡 전체 조회 요청 시 실행되는 메소드
	public ArrayList<Music> selectMusic(){
		return list;
	}
	
	// 특정 곡 검색 요청이 있을 때 마다 실행되는 메소드
	public ArrayList<Music> searchMusic(String keyword) {
		
		// 검색된 결과가 담길 ArrayList<Music> 객체 생성
		ArrayList<Music> searched = new ArrayList<>(); // [] 빈 list
		
		// 조회 => 맞는 keyword만 searched에 추가
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				// 문자열.contains(포함되어있는지 궁금한 단어) 
				// 해당 문자열이 포함되어있으면 true/ 없으면 false반환
				searched.add(list.get(i));
			}
		}
		
		return searched;
	}
	
	// 특정 곡 삭제 요청 시 실행할 메소드
	public int deleteMusic(String title) {
		
		// 결과를 담을 변수 먼저 생성
		int result = 0;// 삭제가 진행될 횟수
		
		// 처리
		
		// 전체 곡 목록 중에서(반복문)
		for(int i = 0; i < list.size(); i++) {
			// 곡 제목이 사용자가 입력한 그 무언가와 동일하다면(조건문)
			if(list.get(i).getTitle().equals(title)) {
				// 그 곡을 제거한다.(remove())
				list.remove(i);
				result++;
			}
		}
		
		return result; // result가 0이라면 삭제가 이루어지지 않았다.
	}
	
	// 특정 곡 수정 요청 시 실행할 메소드
	public int updateMusic(String title, String newTitle, String newArtist) {
		
		// 결과를 담을 변수 먼저 생성
		int result = 0; // 곡 수정횟수
		
		// 처리
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				// 방법 1.
				// list.set(i, new Music(newTitle, newArtist));
				// 방법 2.
				list.get(i).setTitle(newTitle);
				list.get(i).setArtist(newArtist);
				result++;
			}
		}
		
		return result; // 0이라면 수정이 이루어지지 않음!
	}
	
	

}
