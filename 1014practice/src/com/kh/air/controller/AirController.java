package com.kh.air.controller;

import com.kh.air.model.dto.AirConditioner;
import com.kh.air.model.service.AirService;

public class AirController {
	private AirService as = new AirService();
	
	public void requestConnect(AirConditioner air) {
		as.connectAir(air);
	}
	public void togglePower() {
		as.togglePower();
	}
	public AirConditioner getAirInfo() {
		return as.getAirConditioner();
	}
}
