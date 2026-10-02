package com.kh.variable;

import java.util.Scanner;

public class KeyboardInput {//남산돈까스메뉴받기//키보드를 이용해 사용자에게 직접 값을 입력받아 보기.
	public void inputInfo() {
		//System.out.println("부르기 성공!");
		Scanner sc = new Scanner(System.in);//표준 입력도구에서 입력받은 값을 받겠다.(바이트)
		//sc.next();
		
		System.out.println("25년 전통의 오리지널 메뉴");
		System.out.println("맛도 두 배, 크기도 두 배");
		System.out.println("------메뉴판--------");
		System.out.println("매운 페퍼로니 치돈");
		System.out.println("남산왕돈까스");
		System.out.println("고치돈");
		System.out.println("철판 함박 스테이크");
		System.out.println("==================");
		System.out.print("주문하실 메뉴를 입력해주세요 → ");
		
		//next()
		String menu = sc.nextLine();
				
		//사용자가 입력한 메뉴를 출력해보자! ex. 고치돈 주문!
		System.out.println(menu + " 주문 야르!");

		System.out.println("몇 개 먹을건데??(숫자로입력해라) → ");
		
		int count = sc.nextInt(); // 쓸수있는 자료형이 다 다름.
		System.out.println(menu + " " + count + "개 먹을거임!");
		
		sc.nextLine(); //여기서 입력버퍼에 남아있는 개행문자를 날려버림.
		
		//배달 어플이라 생각하고 주소 받기
		System.out.print("주소지 입력해라 → ");	
		String address = sc.nextLine();
		
		System.out.println(menu + " " + count + "개를 " + address + "(으)로 배달간다");
		
		}
}
		