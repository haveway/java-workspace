package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {
	
	// �ʵ��
	ArrayList<Car> carList = new ArrayList<>();

	public void insertCar(Car car) {
		// ���� ��ȣ : ������ ���� ������ȣ + 1
		// ������ ���� ������ȣ�� �˷��� ������ �ε����� �˾ƾ� ��
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
		
		// ���� ó�� = > ������ �� result++;
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
		
		// �˻�ó��
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getOwner().equals(owner)) {
				searchedCar.add(carList.get(i));
			}
		}
		
		// �����ȯ
		return searchedCar;
	}

	public ArrayList<Car> selectList() {
		return carList;
	}

}
