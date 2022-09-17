package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {
	
	// 필드부
	ArrayList<Car> carList = new ArrayList<>();

	public void insertCar(Car car) {
		// 주차 번호 : 마지막 차의 주차번호 + 1
		// 마지막 차의 주차번호를 알려면 마지막 인덱스를 알아야 함
		// == size() - 1
		
		int lastNum = 0;
		
		if(carList.isEmpty()) {
			lastNum = 1;
		}else {
			lastNum = 
			carList.get(carList.size()-1).getParkingNum() + 1;
		}

		car.setParkingNum(lastNum);
		carList.add(car);
	}

	public int deleteCar(int carNum) {
		int result = 0;
		
		// 삭제 처리 = > 삭제할 때 result++;
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getCarNum() == carNum) {
				carList.remove(i);
				result++;
			}
		}
		
		return result;
	}

	public ArrayList<Car> searchCar(String owner) {
		
		ArrayList<Car> searchedCar = new ArrayList<>();
		
		// 검색처리
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getOwner().equals(owner)) {
				searchedCar.add(carList.get(i));
			}
		}
		
		// 결과반환
		return searchedCar;
	}

	public ArrayList<Car> selectList() {
		return carList;
	}

}
