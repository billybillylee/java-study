package com.kh.loop;

import java.util.Scanner;

public class LoopWhile {
	
	public void method0() {
	int i = 0; // while 문은 초기식과 증감식을 괄호 밖에다 쓴다.
	while(i <= 3) {
		System.out.println(i + "번 반복해줘!");
		i++;
		} //for문과 다르게 증감식의 위치에 따라서 제어변수의 값이 가변적으로 바뀜.
	
	}
	public void method1() {
		while(true)	{
			System.out.println("요런 느낌으로 쓰겠다"); //무한반복할 때 while문을 주로 사용한다
		}	
	}
	
	public void method2() {
		
		int i = 1;
		int sum = 0;
		
		while(i <= 500) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
	
	public void lottoMaker() {
		double number = Math.random();
		System.out.println(number * 10);
		System.out.println((int)(number * 45) + 1);
			
		int num1 =(int)(Math.random() * 45) +1;
		int num2 =(int)(Math.random() * 45) +1;
		int num3 =(int)(Math.random() * 45) +1;
		int num4 =(int)(Math.random() * 45) +1;
		int num5 =(int)(Math.random() * 45) +1;
		int num6 =(int)(Math.random() * 45) +1;
		
		System.out.printf("오늘의 번호는 ~ %d, %d, %d, %d, %d, %d",
							num1, num2, num3, num4, num5, num6);
	}
	
	/*
	 *탈출문 
	 * 
	 * switch문 내부에 작성하는 break;문과 구별해야함
	 * 
	 * 지금 배우는 break는 가장 가까운 반복문을 빠져나가는 break
	 * 
	 * 
	 */
	
	public void method4() {
		//무한 반복 돌리면서 매 번 사용자에게 문자열을 입력받을것임
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("글자수 체크(그만하고 싶으면 exit를 입력해라) -> ");
			String keyword = sc.nextLine();
			System.out.println((keyword) + "은(는)" + keyword.length() + "글자입니다.");
			
		if(keyword.equals("exit")) { // 조건이면 무지성 if 쓴다음 값을 생각하기
			System.out.println("시스템을 종료합니다!");
			//break;
			return;
			}
		}		
	}
	/*
	 * continue
	 * 
	 * 
	 * 
	 */
	public void checkId() {
		System.out.println("회원가입 서비스");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력해주세요(10글자미만) -> ");
			String userId = sc.nextLine();
			
			if(10 < userId.length()) {
				System.out.println("아이디는 10글자 미만으로 사용 가능합니다.");
				continue;
			} else {
				System.out.println("사용 가능한 아이디입니다.");
			}
			System.out.println("비밀번호를 입력해주세요 -> ");
			
		}
	}
	
}
	

	
