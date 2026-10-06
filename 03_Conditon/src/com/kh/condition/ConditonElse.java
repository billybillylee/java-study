package com.kh.condition;

import java.util.Scanner;

public class ConditonElse {
	/*
	 * if ~ else
	 * [ 표현법 ]
	 * 
	 * if(조건식) {
	 * 		조건식의 결과값이 true인 경우 실행할 코드 -a
	 * } else {
	 * 		조건식의 결과값이 false일 경우 실행할 코드 -b
	 * }
	 * -> 조건식의 결과가 true -> a실행
	 * -> 조건식의 결과가 false -> b실행
	 */
	public void method1() {
		//응모를 했다고 가정
		//핸드폰 번호를 입력받아서 당첨자 번호와 같으면 [당첨!!!!!] 출력
		//아니라면 [다음 기회에...] 출력
		// 010-5319-1831 -> 이게 당첨번호
		Scanner sc = new Scanner(System.in);
		System.out.println("휴대폰 번호를 입력해주세요 -> ");
		String phoneNumber = sc.nextLine();	
		//System.out.println(phoneNumber.equals("010-5319-1831")); //문자열(string)은 equals 메서드 사용
		
		if(phoneNumber.equals("010-5319-1831")) {
			System.out.println("5억 당첨!!!!");
		} else {
			System.out.println("낙첨...다음 기회에...");
		}
		
		
		
	}
}
