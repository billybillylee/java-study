package com.kh.operator.controller;

import java.util.Scanner;

public class OperatorController {
	
	public void artismethic() {
		// 산술연산자(이항연산자)
		// +, -, *, / -> 우선순위가 수학익힘책이랑 똑같음
		// % -> 모듈러(Modular) -> 나눗셈에서의 나머지를 구하는 연산
		int num = 10;
		int num2 = 3;
		System.out.println("first: " + num);
		System.out.println("second: " + num2);
		
		System.out.println("first + second : " + (num + num2));
		
		int sum = num + num2;
		System.out.println("first + second : " + sum);
		
		System.out.print("first + second : ");
		System.out.println(num + num2);
		
		System.out.printf("first + second : %d", num + num2);
		System.out.println();
		//
		
		System.out.println("first - second : " + (num - num2));
		
		System.out.println("first x second : " + num * num2);
		
		System.out.println("first / second : " + (num / num2));
		
		System.out.println("first mod second : " + (num % num2)); //모듈러연산
		
	}
	
	public void presentToStudent( ) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("고려은단 비타민씨를 받을 학생의 수 : ");
		int studentCount = sc.nextInt();
		System.out.println("학생의 수 : " + studentCount + "명");
		
		System.out.println("나눠줄 비타민 개수를 입력하세요.");
		int vitaminCount = sc.nextInt();
		System.out.println("비타민 수 : " + vitaminCount + "개");
		
		System.out.println("한 사람당 받을 수 있는 비타민 갯수 : " + (vitaminCount / studentCount));
		System.out.println("남은 비타민의 개수 : " + (vitaminCount % studentCount));
		
		System.out.println();
		
		if(vitaminCount < studentCount) {
			System.out.println("비타민이 부족하여 못줍니다ㅜㅜ");
			System.out.println("한사람당 받을 수 있는 비타민 갯수 : 0개");
			System.out.println("남은 비타민 개수 : " + vitaminCount +"개");
			
		} else { 
			System.out.println("한사람당 받을 수 있는 비타민 갯수 : " + (vitaminCount /studentCount) + "개");
			System.out.println("남은 비타민의 개수 : " + (vitaminCount % studentCount) + "개"); 
		}
		
	}
		
		public void increase() {
			
			int num = 10;
			System.out.println(num);
			num++;
			System.out.println(num);
			num--;
			System.out.println(num);
			System.out.println(num++);
			System.out.println(num);
		}
		
		public void compound() {
			//=대입연산자
			
			long veryBigNumberCount = 1000L;
			veryBigNumberCount = veryBigNumberCount + 1658;
			//복합대입연산자
			//자기 자신과 해당 산술연산을 수행한 후 그 결과를 자기자신에게 다시 대입하는 용도
			veryBigNumberCount += 2;
			System.out.println(veryBigNumberCount);
		}
		
		public void logicalNagation() {
			//논리부정연산자 : 논리값(true & false)을 반대로 바꿔주는 연산자
			System.out.println(!true);			
		}
		
		public void comparison() {
			//관계연산자(비교연산자)
			//비교연산을 한 결과 -> true or false
			//특정조건을 제시할 수 잇는 조건문에서 조건식으로 사용할 것.
			//1. 동등비교 -> 같냐 같지 않냐 ==
			System.out.println(1 != 2 );
			
			int firstNum = 10;
			int secondNum = 23;
			
			System.out.println(firstNum < secondNum);
			System.out.println(firstNum == secondNum);
			
			System.out.println("firstNum이 짝수입니까?");
			
			System.out.println((firstNum % 2) == 0); //연산우선순위표기하기!
		}
		public void logical() {
			//논리연산자 : 두 개의 논리값을 연산하는 연산자.
			//AND 연산 && 좌항 우황 둘 다 트루여야 트루
			//OR 연산 || 좌황 우황 둘 중 하나만 트루여도 트루
			//NOT 연산 !
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("정수값을 입력해주세요 -> ");
			int num = sc2.nextInt();
			System.out.println(num);
			
			System.out.println(num > 0 && (num % 2) == 0);
		}
		
		public void andOper() {
			Scanner sc3 = new Scanner(System.in);
			System.out.println("정수값을 입력해라 -> ");
			int num = sc3.nextInt();
			System.out.println("입력한 정수값은 " + num + " 입니다.");
			
			System.out.println();
			
			//사용자가 입력한 정수가 1~5 사이의 값인지 확인해서 출력하기↓
			System.out.println("입력값이 1부터 5사이의 값인가요? " + ((num >= 1) && (num <= 5)));
		}
		public void orOper() {
			Scanner sc4 = new Scanner(System.in);
			System.out.println("좋아하는 알파벳 한글자 입력! -> ");
			char letter = sc4.nextLine().charAt(0); //문자열에서 한글자만 뽑아내는 메서드를 쓸거임.
			System.out.println(letter);
			
			System.out.println();
			
			System.out.println("입력값은 에이인가요ㅁ? -> " + ((letter == 'a') || (letter == 'A')));
		}
		public void tip() {
			int num = 10;
			
			boolean result = false && (num > 0);
			boolean result2 = num < 0 && num == 10;
		}
		
		//삼항연산자 : 피 연산자가 3개 -> 조건문의 형식으로 활용됨
		//조건문 : 값에 따라 연산을 처리하는 방식
		//프로그램이란? 내가 컴퓨터에게 시키고싶은 명령어의 나열.(bytecode)
		//결과값이 true일 경우 첫문장을 처리~~ false일 경우 다음문장을 처리~~
		
		public void triple() {
			//조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
			//영화루
			
			System.out.println("영화루에 오신것을 환영합니다!");
			System.out.println("-----메뉴-----");
			System.out.println("1. 고추간짜장");
			System.out.println("2. 고추짬뽕");
			System.out.print("번호를 입력해주세요 -> ");
			//사용자가 메뉴 번호 1번을 입력하면 고추간짜장, 2번을 입력하면 고추짬뽕을 출력해보기.
			
			Scanner sc5 = new Scanner(System.in);
			int menuNo = sc5.nextInt();
			
			String selected = menuNo == 1 ? "고추 간짜장을 주문하셨습니다."
							: menuNo == 2 ? "고추 짬뽕을 주문하셨습니다."
							: "없는 메뉴입니다.";
			
			System.out.println(selected);
			
		}
	}
	



