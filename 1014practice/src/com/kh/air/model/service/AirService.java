package com.kh.air.model.service;

import com.kh.air.model.dto.AirConditioner;

public class AirService {
	
	private AirConditioner air;
	
	public void connectAir(AirConditioner connectedAir) {
		this.air = connectedAir;
	}
	public AirConditioner getAirConditioner() {
		return this.air;
	}
	public void togglePower() {
		air.setPower(!air.isPower());
		
		String msg = air.isPower() ? "-> 에어컨 전원을 켭니다." : "-> 에어컨 전원을 끕니다.";
		System.out.println(msg);
	} 
}
