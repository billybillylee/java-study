package com.kh.condition;

import java.util.Scanner;

public class ConditonIf {
	/*
	 * (단일)if문
	 * if(조건식) {
	 * 		조건식이 참일 경우 실행하고자 하는 코드;
	 * }
	 *  -> 조건식의 결과값이 false일 경우 : if문 Scope{}를 건너뜀
	 *  -> 조건식의 결과값이 true일 경우 : if문 Scope{} 안의 코드가 수행
	 */
	public void method0() {
		//System.out.println("메소드를 불러보세요~ 시작!");
		
		/* if(false) {
			System.out.println("나는 if문 이다.");
		}	
		
		if(true) {
			System.out.println("세상만사 문제없음");
		}
		if(false) {
			System.out.println("세상만사 문제있음ㅠㅠ");
		}
		*/
		/*double temperature = 0.0;
			if(temperature < 30.0) {
				System.out.println("난방기 메소드 호출!");
			} */
	}
	public void quiz() {
		
		int count = 0; //정답 변수
		int wrongCount = 0; //오답 변수
		
		System.out.println("개꿀잼ox퀴즈");
		//문제를 출력한 뒤 o 또는 x를 입력받아서 정답입니다 또는 오답입니다 출력하는 프로그램 만들기
		
		System.out.println("-------------------");
		System.out.println("[문제1] : 토마토는 과일일까요?");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 o 또는 x로 입력하세요! -> ");
		char answer = sc.nextLine().charAt(0);
		
		if((answer == 'x') || (answer == 'X')) {
			System.out.println("정답입니당~");
			count++;
		}
		if((answer == 'o') || (answer == 'O')) {
			System.out.println("오답입니다ㅠㅠ");
			wrongCount++;
		}
		if((answer != 'x') && (answer != 'X') && (answer != 'o') && (answer !='O')) {
			System.out.println("정답을 O / X 로 입력하세용~"); 
			wrongCount++;
		}	
		/*switch(answer) {
			case 'x', 'X', 'o', 'O' -> {}
			default -> System.out.println("그게아니에요!");*/	
		
		System.out.println("[문제2] : 기린은 서서 잠을 잔다.");
		System.out.println("정답을 o 또는 x로 입력하세요! -> ");
		answer = sc.nextLine().charAt(0);
		
		if(answer == 'o' || answer == 'O') {
			System.out.println("정답입니당~");
			count++;
		}
		if(answer == 'x' || answer == 'X') {
			System.out.println("오답이에용ㅜㅜ");
			wrongCount++;
		}
		if(!(answer == 'o' || answer == 'O' || answer == 'x' || answer == 'X')) {
			System.out.println("정답을 O / X 로 입력하세용~");
			wrongCount++;
		}
		
		System.out.println("[문제3] : 물은 0칼로리이다");
		System.out.println("정답을 o 또는 x로 입력하세요! -> ");
		answer = sc.nextLine().charAt(0);
		
		if(answer == 'o' || answer == 'O') {
			System.out.println("정답입니당~");
			count++;
		}
		if(answer == 'x' || answer == 'X' ) {
			System.out.println("오답이에용ㅜㅜ");
			wrongCount++;
		}
		if(!(answer == 'o' || answer == 'O' || answer == 'x' || answer == 'X')) {
			System.out.println("정답을 O / X 로 입력하세용~");
			wrongCount++;
		}
		
		System.out.println("퀴즈 끝~~~ 오늘의 결과는?! ");
		System.out.println("정답 : " + count + " 개");
		System.out.println("오답 : " + wrongCount + " 개");
		
	}
			
}


	
