package com.kh.chap02.encapsulation.model.dto;


//필드부, 생성자부, 메서드부
public class CellPhone { //스마트폰의 정보를 저장하는 클래스
	//필드 == 멤버변수
	//객체들이 가져야할 공통적인 속성을 기술해 놓는 역역
	//스마트폰 == 제품명, 제조사, 사이즈, 색상
	private String productName;
	private String networkProvider;
	private double size; //단순히 inch로 생각하기로 하자~
	private String color;
	
	//생성자부
	//객체의 속성 값을 기ㅗㄱ 및 수정하는 기능의 메소드 : setter()
	//일반적으로 VO package 는 setter가 들어가지 않는게 원칙임.
	// DTO - data transfer object
	// setter는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public 을 사용
	// set필드명으로 식별자를 지정, 낙타봉표기법 지키자!(ex.camelCase)	
	public void setSize(double size/*매개변수(값을 받아넣을수있는 공간)*/) {
									// 매개변수 메서드 호출시 초기화가 강제됨.
		//System.out.println(size);
		//System.out.println("setSize : " + this);
		//객체 내부에서 this 라는 키워드는 해당 객체 자기자신의 주소값을 가리킴
		this.size = size;
		//Scope(중괄호) 안에서는 하당 영역안에 있는 지역변수가 식별자 우선권을 가짐!
		
	}
	// 데이터를 반환해주는 기능의 메소드 : getter() -> 꼭 있어야함!
	public double getSize() { // 반환형 -> 기본은 void지만 getter 쓸 땐 바꿔줘야됨
		return size;
	}
	
	
	public String getProductName() {
		return productName; //productName의 필드값을 들고 돌아갈래~
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	
	public void setNetworkProvider(String networkProvider) {
		this.networkProvider = networkProvider;
	}
	public String getNetworkProvider() {
		return networkProvider;
	}
	
	public String getInfo() {
		String info = "폰 = [제품명 : " + productName + ", 색상: " + color
					+ ", 사이즈: " + size + ", 통신사: " + networkProvider + "]"; 
		return info;
	}
	
	}
