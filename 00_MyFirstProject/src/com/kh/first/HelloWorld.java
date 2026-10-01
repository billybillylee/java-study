package com.kh.first; //패키지 선언부 : 현재 클래스의 위치. 

	/*
	 * 주석(Comments)
	 * 
	 * 주석은 프로그램을 실행하는데 아무 영향을 끼치지 않음.
	 * 코드를 작성한 후 작성한 코드를 쉽게 이해하거나 누군가게에 알려주기위해 쓴다.
	 * 학습용도로 사용예정.
	 * 
	 * 각각의 Class를 용도에 맞게 Package에 정리, 보관해야됨.
	 */

 public class HelloWorld {
	 
	public static void main(String[] args) {
		myFirstMethod();
		System.out.println("Hello World!"); // Method : 하나의 기능단위.
		myFirstMethod();
	}
	
	//main method : 프로그램의 시작점(Entry Point), 프로그램당 1개
	
	public static void myFirstMethod() {
		System.out.println("안녕하세요. 제 이름은 떙땡입니다. 반갑습니다.");
		
	}
						
}
