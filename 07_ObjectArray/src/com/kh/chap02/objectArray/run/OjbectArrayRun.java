package com.kh.chap02.objectArray.run;

import java.util.ArrayList;

import com.kh.chap02.objectArray.model.vo.Phone;

public class OjbectArrayRun {

	public static void main(String[] args) {
		// int[] arr = new int[3];
		// 객체배열 선언 및 할당!
		Phone[] arr = new Phone[3];
		
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0]); // == Phone arr[0];
		
		arr[0] = new Phone();
		System.out.println(arr[0]);
		arr[0].setName("아이폰");
		arr[0].setSeries("13");
		arr[0].setBrand("Apple");
		arr[0].setPrice(1090000);
		System.out.println(arr[0]); // -> 주소
		System.out.println(arr[0].information());
		
		arr[1] = new Phone("갤럭시", "S22", "삼성", 2200000);
		arr[2] = new Phone("애니콜", "ANC", "삼성", 3000000);
		
		// 총가격, 평균가 출력
		
		int sum = 0;
				//arr[0].getPrice() + arr[1].getPrice() + arr[2].getPrice();
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].getPrice();
		}
		
		System.out.println("총합계 : " + sum + "원");
		System.out.println("평균가 : " + (sum / arr.length) + "원");
		
		
		
		
		
		// ArrayList 버전
		ArrayList<Phone> list = new ArrayList<>(3); // Phone 객체만 담을 수 있는 ArrayList(3칸짜리)를 생성
		
		list.add(new Phone("아이폰", "13", "Apple", 1090000));
		list.add(new Phone("갤럭시", "S22", "삼성", 2200000));
		list.add(new Phone("애니콜", "ANC", "삼성", 3000000));
		list.add(0, new Phone("아이폰", "14", "Apple", 50000)); // 자동으로 사이즈 up, 0번 인덱스에 삽입
		
		int sum2 = 0;
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).information());
			sum2 += list.get(i).getPrice();
		}
		System.out.println("\n총합계 : " + sum2 + "원");
		System.out.println("평균가 : " + (sum2 / list.size()) + "원");
		
	}
}
