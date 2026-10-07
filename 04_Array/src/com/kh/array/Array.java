package com.kh.array;

public class Array { //변수 나열해놓은걸 배열이라고 함.
	
	//*변수(Variable)
	//메모리(RAM)에 Data(VALUE)값을 저장하는 공간
	//특징 : 값을 초기화(Initialize)해야만 사용 가능, 선언된 Scope에서만 쓸 수 있음.
	//하나의 변수에는 하나의 값만 대입할 수 있음, 자료형은 크기가 정해져 있음.
	//*배열
	//하나의 배열에 여러개의 값(data)를 담을 수 있다. (단, 같은 자료형의 값들만 가능)동종모음
	//배열의 각 공간에 접근할 때 사용하는 개념 index / index는 0부터 시작.\
	
	public void method0() {
		int num1 = 15;
		int num2 = 19;
		int num3 = 31;
		int num4 = 47;
		System.out.println(num1 + num2 + num3 + num4);
	}
	
	public void method1() {
		// 배열 (변수를 쓰고싶은데 변수 하나로는 부족하다 싶을때 사용)
		// 1.배열선언
		// 배열선언 -> 1) 자료형 배열식별자[]; 2)자료형[] 배열식별자;
		// ex) int[] nums;
		// 2.배열할당 -> 배열에 몇 개의 값을 넣을건지 크기지정!
		// nums = new int[3]; --> 할당(3은 임의로 넣은거임)
		// int[] arr = new int[3];
		// 배열친구들은 [참조자료형]이라고 부른다~
		// 배열은 논리적인 구조와 물리적인 구조가 같다
		int[] nums = new int[3]; 
		// 여기서 new라는 연산자는 아~ 램에서 heap라는 jvm이 관리하는 영역에 새로 주우욱 나열되어있다.(주소임. 실제 값이 아니고)
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += nums[1];
		}
		System.out.println(sum);
	}
}


