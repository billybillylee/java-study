package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.dto.CellPhone;

public class Run {

	public static void main(String[] args) {
		// 한 개의 스마트폰 정보를 저장을 해보자~
		CellPhone cp = new CellPhone(); 
		// 자료형   식별자
		/*cp.productName = "갤럭시25";
		cp.networkProvider = "SKT";
		cp.size = 105;
		cp.color = "Red";
		
		cp.size = 8.0;
		System.out.println(cp.size); 
		//캡슐화(밖에서 변수를 건들수 없게) // 공개노출 메서드를 어떻게 만들것인가가 제일 중요함.
		//필드가 외부에서는 보이지 않기 때문에 오류발생!
		// 접근제한자를 private로 바꿨기 때문!
		// 직접접근이 불가능함
		// 캡슐화란?
		// 데이터(속성)와 해당 데이터를 조작하는 메서드(행동)를 하나의 단위로 묶는것. 
		// 클래스 내부 숨기기 => 정보은닉(information hiding) 
		
		cp.setSize(4.0);
				// argument, 인자값, 인수
		System.out.println(); */
	
		cp.setSize(4.0);
		cp.setProductName("아이폰18 pro");
		cp.setNetworkProvider("SKT");
		cp.setColor("Red");
		
		double size = cp.getSize();
		String name = cp.getProductName();
		String color = cp.getColor();
		String networkProvider = cp.getNetworkProvider();
		
		cp.getInfo();
		System.out.println(cp.getInfo());
		
		/*
		 * public => 어디서든 접근가능
		 * 
		 * protected => 같은 패키지 접근가능
		 * 				다른 패키지라면 상속구조인 클래스만 접근가능
		 * 				상속은 아직 안배움
		 * 
		 *default(package friendly) => 나랑 같은 패키지에서만 접근 가능 
		 *
		 * private => 같은 클래스 내부에서만 접근가능. 외부에서는 접근 불가!
		 * 
		 * 
		 */
		
		
		
		
	}

}
