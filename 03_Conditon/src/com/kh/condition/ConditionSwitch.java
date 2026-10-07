package com.kh.condition;

import java.util.Scanner;

public class ConditionSwitch {
	
	public void method0() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층 가시나요?(B1 / B2 / B3) -> ");
		String floor = sc.nextLine();
		
		switch(floor) { //switch(case문에 기술할 동등비교 대상) case 정수, 실수 , 문자 문자열 [:] 실행할 코드
		
			case "B1":
				System.out.println("지하1층입니다");
				break;
			case "B2":
				System.out.println("지하2층입니다");
				break;
			case "B3":
				System.out.println("지하3층입니다");
				break;
			default:
				System.out.println("백룸입니다. 위험합니다.");
		}
		
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 선택해 주세요~! -> ");
		int menuNo = sc.nextInt();
		
		//모던 스위치구문
		int price = switch(menuNo) {
		case 1, 4 -> 1000;
		case 2 -> 500;
		case 3 -> 4000;
		default -> 0;			
		};
		System.out.println(menuNo + "번 메뉴의 값은 " + price + "원입니다.");
			
	}
	
	
	
}
