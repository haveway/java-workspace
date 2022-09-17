package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {
	
	// 필드부
	Scanner sc = new Scanner(System.in);
	ParkingTowerController ptc = new ParkingTowerController();
	
	// 메소드부
	public void mainMenu() {
		while(true) {
			System.out.println("----주차관리 프로그램----");
			System.out.println("1. 차량 주차");
			System.out.println("2. 차량 출차");
			System.out.println("3. 차량 검색");
			System.out.println("4. 전체 출력");
			System.out.println("0. 종료");
			System.out.println("-------------------");
			System.out.print("메뉴 선택 > ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertCar(); break;
			case 2 : deleteCar(); break;
			case 3 : searchCar(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("종료합니다 ~"); return;
			default : System.out.println("잘못된 번호입니다.");
			}
		}
	}
	
	public void insertCar() {
		// 주차 : 차량번호, 차량종류, 차주
		System.out.print("차량 번호 > ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("차량종류(1. 경차 / 2. 세단 / " 
						+ "3. SUV / 4. 트럭) > ");	
		int carType = sc.nextInt();
		sc.nextLine();
		
		System.out.print("차주 > ");
		String owner = sc.nextLine();
		
		Car car = new Car(carNum, carType, owner);
		
		ptc.insertCar(car);
	}
	
	public void deleteCar() {
		// 출차 : 차량번호
		System.out.print("차량 번호 > ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
		int result = ptc.deleteCar(carNum);
			
		if(result > 0) {
			System.out.println("출차가 완료 되었습니다.");
		}else {
			System.out.println("해당 차량은 존재하지 않습니다.");
		}
	}
	
	public void searchCar() {
		
		// 차주검색
		System.out.print("주차 차량 차주 검색 > ");
		String owner = sc.nextLine();
		sc.nextLine();
		
		ArrayList<Car> searchedCar = ptc.searchCar(owner);
		
		// 결과화면
		if(searchedCar.isEmpty()) {
			System.out.println("조회된 차량이 없습니다.");
		}else {
			System.out.println(searchedCar.size()
					+ "개의 차량이 조회되었습니다.");
			for(int i = 0; i < searchedCar.size(); i++) {
				System.out.println(searchedCar.get(i));
			}
		}
	}
	
	public void selectList() {
		ArrayList<Car> allCar = ptc.selectList();
		
		if(allCar.isEmpty()) {
			System.out.println("차량이 없습니다.");
		}else {
			System.out.println(allCar.size()
					+ "개의 차량이 조회되었습니다.");
			for(int i = 0; i < allCar.size(); i++) {
				System.out.println(allCar.get(i));
			}
		}	
	}

}
