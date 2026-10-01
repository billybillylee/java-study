package com.kh.second;

public class Run { // 내부 / 외부
	
	public static void main(String[] args) { // 출력이 안되더라도 JVM이 읽을수있는 형태로 컴파일.(이 프로세스를 항상 생각)
		
		PrintController pc = new PrintController();
		
		
		pc.printMyName();
		//. -> 참조연산자 or 직접접근연산자(다른 클래스에 있는 메소드를 가져다쓸 때 사용)
	}
}
