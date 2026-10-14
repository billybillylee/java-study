package com.kh.air.view;

import java.util.Scanner;

import com.kh.air.controller.AirController;
import com.kh.air.model.dto.AirConditioner;

public class AirView {
	
	private Scanner sc = new Scanner(System.in);
	private AirController ac = new AirController();
	
	public void inputFirstAirConfig() {
		System.out.println("===에어컨 초기장치 연결===");
		
		System.out.print("최초 온도 입력 -> ");
		int temp = sc.nextInt();
		
		System.out.print("초기 전원 선택(1: 켜짐, 0: 꺼짐) ->");
		int powerInput = sc.nextInt();
		boolean isPowerOn = (powerInput == 1);
		sc.nextLine();
		
		System.out.print("초기 풍향 입력 -> ");
		String wind = sc.nextLine();
		
		AirConditioner freshAir = new AirConditioner(temp, isPowerOn, wind);
		
		ac.requestConnect(freshAir);
		System.out.println("에어컨이 라인에 연결되었습니다.");
	}
	
	public void airMainMenu() {
		while(true) {
			System.out.println("스마트 에어컨 제어 시스템(전원전용)");
		

		AirConditioner air = ac.getAirInfo();
		if(air != null) {
			air.printAirStatus();
		}
		System.out.println("1.전원 on/off 스위치");
		System.out.println("5.시스템 종료");
		System.out.print("번호입력 -> ");
		
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch (menuNo) {
		case 1: ac.togglePower(); break;
		case 5: System.out.println("에어컨 제어 종료");
		default: System.out.println("아직 전원 제어 기능만 있음");
			}
		}
	}
}
