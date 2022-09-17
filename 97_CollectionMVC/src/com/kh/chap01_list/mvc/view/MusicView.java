package com.kh.chap01_list.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.mvc.controller.MusicController;
import com.kh.chap01_list.mvc.model.vo.Music;

// View : 시각적인 요소, 입/출력
public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// 메인화면
	public void mainMenu(){
		while(true) { // ArrayList
			System.out.println("*** 음악은 역시 소리바다 ***");
			System.out.println("1. 새로운 곡 추가"); // add()
			System.out.println("2. 전체 곡 조회"); // 반복문 or toString()
			System.out.println("3. 특정 곡 검색"); // 반복문 + get()
			System.out.println("4. 특정 곡 삭제"); // remove()
			System.out.println("5. 특정 곡 수정"); // set()
			System.out.println("0. 프로그램 종료");
			
			System.out.println("뭐 고를래 ? > ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertMusic(); break;
			case 2 : selectMusic(); break;
			case 3 : searchMusic(); break;
			case 4 : deleteMusic(); break;
			case 5 : updateMusic(); break;
			case 0 : System.out.println("잘가고~~고생했다~~"); return;
			default : System.out.println("이상한거누르지마 ~ ~ ~ ");
			}
		}
	}
	
	// 1. 새로운 곡을 추가시킬 수 있는 화면
	public void insertMusic(){
		System.out.println("---- 곡 추가 -----");
		System.out.println("곡명 입력 > ");
		String title = sc.nextLine();
		System.out.println("가수명 입력 > ");
		String artist = sc.nextLine();
		
		// 요청 => Controller에 메소드 호출
		mc.insertMusic(title, artist);
		
		System.out.println("추가 성공");
		System.out.println();
	}
	
	
	// 2. 전체 곡 조회를 할 수 있는 화면
	public void selectMusic() {
		System.out.println("---- 전체 곡 조회 ----");
		
		// 요청
		ArrayList<Music> list = mc.selectMusic();
		
		if(list.isEmpty()) {
			System.out.println("응 노래없어 ~ ~ ~ ");
		} else {
			for(Music m : list) {
				System.out.println(m);
			}
		}
	}
	
	// 3. 특정 곡을 검색할 수 있는 화면
	public void searchMusic() {
		
		System.out.println("---- 특정 곡 검색 ----");
		System.out.println("입력할 곡명 검색 > ");
		String keyword = sc.nextLine();
		
		// 요청
		ArrayList<Music> list = mc.searchMusic(keyword);
		
		System.out.println("검색 결과");
		
		if(list.isEmpty()) {
			System.out.println("조회된 결과가 없습니다.");
		}else {
			for(Music m : list) {
				System.out.println(m);
			}
		}
	}
	
	// 4. 특정 곡을 삭제할 수 있는 화면
	public void deleteMusic() {
		
		System.out.println("---- 곡 삭제 ----");
		System.out.println("삭제할 곡명 > ");
		String title = sc.nextLine();
		
		// 요청
		int result = mc.deleteMusic(title);
		
		// 1..2..3.. 삭제 성공!
		if(result > 0) {
			System.out.println("성공적으로 삭제");
		} else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
	}
	
	// 기존 곡명을 입력받아서
	// 수정할 곡명, 수정할 가수명으로 수정하기
	
	//5. 특정 곡을 수정할 수 있는 화면
	public void updateMusic() {
		
		System.out.println("---- 곡 수정 ----");
		
		// 기존곡명(검색용도), 수정할 곡명, 가수명(수정할 용도)
		System.out.println("기존 곡명 > ");
		String title = sc.nextLine();
		
		System.out.println("수정할 곡명 > ");
		String newTitle = sc.nextLine();
		System.out.println("수정할 가수명 > ");
		String newArtist = sc.nextLine();
		
		// 요청
		int result = mc.updateMusic(title, newTitle, newArtist);
		
		if(result > 0) { // 1.. 2.. 3.. 수정성공!!!
			System.out.println("성공적으로 수정");
		} else { // 수정할 곡이 없다.
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
	}
	
}
