package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {
	
	// �ʵ��
	Scanner sc = new Scanner(System.in);
	ParkingTowerController ptc = new ParkingTowerController();
	
	// �޼ҵ��
	public void mainMenu() {
		while(true) {
			System.out.println("----�������� ���α׷�----");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ��ü ���");
			System.out.println("0. ����");
			System.out.println("-------------------");
			System.out.print("�޴� ���� > ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertCar(); break;
			case 2 : deleteCar(); break;
			case 3 : searchCar(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("�����մϴ� ~"); return;
			default : System.out.println("�߸��� ��ȣ�Դϴ�.");
			}
		}
	}
	
	public void insertCar() {
		// ���� : ������ȣ, ��������, ����
		System.out.print("���� ��ȣ > ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��������(1. ���� / 2. ���� / " 
						+ "3. SUV / 4. Ʈ��) > ");	
		int carType = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� > ");
		String owner = sc.nextLine();
		
		Car car = new Car(carNum, carType, owner);
		
		ptc.insertCar(car);
	}
	
	public void deleteCar() {
		// ���� : ������ȣ
		System.out.print("���� ��ȣ > ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
		int result = ptc.deleteCar(carNum);
			
		if(result > 0) {
			System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
		}else {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
	}
	
	public void searchCar() {
		
		// ���ְ˻�
		System.out.print("���� ���� ���� �˻� > ");
		String owner = sc.nextLine();
		sc.nextLine();
		
		ArrayList<Car> searchedCar = ptc.searchCar(owner);
		
		// ���ȭ��
		if(searchedCar.isEmpty()) {
			System.out.println("��ȸ�� ������ �����ϴ�.");
		}else {
			System.out.println(searchedCar.size()
					+ "���� ������ ��ȸ�Ǿ����ϴ�.");
			for(int i = 0; i < searchedCar.size(); i++) {
				System.out.println(searchedCar.get(i));
			}
		}
	}
	
	public void selectList() {
		ArrayList<Car> allCar = ptc.selectList();
		
		if(allCar.isEmpty()) {
			System.out.println("������ �����ϴ�.");
		}else {
			System.out.println(allCar.size()
					+ "���� ������ ��ȸ�Ǿ����ϴ�.");
			for(int i = 0; i < allCar.size(); i++) {
				System.out.println(allCar.get(i));
			}
		}	
	}

}
