package com.kh.game;

public class CarGame {
	public String carName;
	public int carSpeed;
	public String carColor;
	
	public CarGame(String carName, int carSpeed, String carColor) {
		this.carName = carName;
		this.carSpeed = carSpeed;
		this.carColor = carColor;				
	}
	public void carStatus() {
		System.out.println("=====자동차 정보 창=====");
		System.out.println("차랑명: " + carName);
		System.out.println("차량속도: " + carSpeed + "km/h");
		System.out.println("차량색깔: " + carColor);
		System.out.println("====출발준비 완료!!!====");
		
	}

}
