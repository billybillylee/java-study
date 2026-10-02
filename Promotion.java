package com.kh.variable;

public class Promotion {
	/* Type Casting(자료형변환) : 자료형을 바꾸는 개념
	 * 
	 * 1.[ = ]를 기준으로 왼쪽 / 오른쪽 같은 자료형이어야함. 
	 * 		-> 같은 자료형에 해당하는 리터럴값만 대입할 수 있음
	 * 		-> 자료형이 다를경우? 바꿔야됨
	 * 
	 * 2. 같은 자료형들끼리만 연산이 가능함.
	 * 		-> 자료형이 다른데 연산을 하고싶다? 둘 중 하나를 나머지 하나와 동일하게 맞춰야함.
	 * 
	 * 3. 연산의 결과물도 동일한 자료형이어야 함.
	 * 		-> 1 + 1 = 정수(정수) 1.1 + 1.1 = 2.2(실수)
	 */
	
	//Promotion 자동형변환
	public void autoCasting() {
		int intNum = 10; // 변수선언하고 intNum을 참조 그리고 10이라는 숫자를 intNum에 초기화
		System.out.println(intNum);
		double doubleNum = intNum; //오른쪽의 값만 가져옴 (자동형변환)
		System.out.println(doubleNum);
		System.out.println(intNum);
		
		intNum = (int) doubleNum; //강제형변환
		
		int bigInt = 120;
		long smallLong = bigInt;
		System.out.println(smallLong);
		
		long longNumber = 1000L;
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		
		char ch = 'a';
		System.out.println(ch);
		int i = ch;
		System.out.println(i);
		char character = 97;
		System.out.println(character);
		
		
		
		
	}
}
