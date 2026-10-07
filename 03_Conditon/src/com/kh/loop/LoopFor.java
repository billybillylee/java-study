package com.kh.loop;

import java.util.Scanner;

public class LoopFor { // 반복문
	
	public void method0() {
		for(int i = 100; i >= 1; i--) { //for(초기식(제어변수); 조건식; 증감식){ }
			System.out.println(i + "번 반복!");//for문의 제어변수명은 보편적으로 i, j, k 사용
		}
		
	}
	
	public void method1() {
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
		for(int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		for (int i = n -1; i >= 1; i--) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <=2 * i - 1; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 입력해주세요 -> ");
		int dan = sc.nextInt();
		System.out.println(dan + "단을 출력하겠습니다.");
		
		sc.nextLine();
		
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
		}
	
	
	
	
	
}
