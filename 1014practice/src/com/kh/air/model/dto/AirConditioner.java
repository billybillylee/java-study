package com.kh.air.model.dto;

public class AirConditioner {
	private int temperature;
	private boolean power;
	private String winDirection;
	
	public AirConditioner(int temperature, boolean power, String winDirection) {
		this.temperature = temperature;
		this.power  = power;
		this.winDirection = winDirection;
	}
	public boolean isPower() {
		return this.power = power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void printAirStatus() {
		String powerStr = this.power ? "켜짐" : "꺼짐";
		System.out.println("[에어컨상태] 전원: " + powerStr
							+ " | 초기 설정 온도: " + this.temperature +"도"
							+ " | 초기 설정 풍향: " + this.winDirection);
	}
}
