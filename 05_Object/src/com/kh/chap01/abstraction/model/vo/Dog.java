package com.kh.chap01.abstraction.model.vo;

public class Dog {
	//[ 필드부 ]
	// 이름, 종, 나이, 성별, 중성화여부
	public String name; //[필드] 개의이름을 저장해야겠는디?
	public String species; //종을 저장해야겠는디?
	public int age; // 나이를 저장해야겠는디?
	public char sex; // 성별을 저장해야겠는디?
	public boolean neuter; // 중성화 저장했는지?
	
	//[ 생성자부 ] 
	
	// [ 메서드부 ] => Dog가 수행할 수 있는 기능을 넣자!
	public void walk() {
		System.out.println("걸어요!");
	}
}
