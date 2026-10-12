package com.kh.exam1.controller;

import java.util.Scanner;
import com.kh.exam1.model.dto.MusicApp;

public class MusicController {
	
	private Scanner sc = new Scanner(System.in);
	private MusicApp app = new MusicApp();
	
	public void mainMenu() {
		boolean isRunning = true;
		
		System.out.println("===음악 어플 관리 시스템===");
		
		while(isRunning) {
			System.out.println("\n[메뉴] 1. 앱등록 | 2. 정보조회  | 3. 구독료정산 | 4. 프로그램 종료");
			System.out.print("번호를 선택하여 주세요 -> ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if (menu == 1) {
				System.out.print("어플명을 입력해주세요 -> ");
				String name = sc.nextLine();
				app.setAppName(name);
				
				System.out.print("가입 개월수를 입력하세요 -> ");
				int month = sc.nextInt();
				app.setJoinMonth(month);
				
				System.out.println("정보등록완료! " + "기본구독료: (" + app.getPrice() +")원");
				
			} else if (menu == 2) {
				if(app.getAppName() == null) {
					System.out.println("먼저 1번메뉴에서 정보등록을 선행해주세요.");
				} else {
					System.out.println("\n=== 조회결과 ===");
					System.out.println(app.getInfo());
				}
				
			} else if (menu == 3) {
				if(app.getAppName() == null) {
						System.out.println("1번메뉴에서 정보등록을 선행해주세요.");
				} else {	
					int months = app.getJoinMonth();
					int monthPrice = app.getPrice();
					int totalDefaultPrice = monthPrice * months;
					System.out.println("할인정산결과는?");
					
					if (months >= 6) {
						int finalPrice = (int)(totalDefaultPrice * 0.8);
						System.out.println("6개월 이상은 20프로 할인입니다.");
						System.out.println("최종결제금액:" + finalPrice + "원");
					} else if (months >= 3) {
						int finalPrice = (int)(totalDefaultPrice * 0.9);
						System.out.println("3개월 이상은 10프로 할인입니다.");
						System.out.println("최종결제금액: " + finalPrice + "원");
					} else {
						System.out.println("3개월미만은 할인적용이 불가합니다.");
						System.out.println("최종 결제 금액:" + totalDefaultPrice + "원");
					}
				} 
			} else if (menu == 4) {
				System.out.println("프로그램 종료!");
				isRunning = false;
			} else {
				System.out.println("1~3 사이의 올바른 메뉴를 선택해주세요.");
			}
		}
	}
}
