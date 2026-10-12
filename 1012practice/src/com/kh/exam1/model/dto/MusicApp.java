package com.kh.exam1.model.dto;

public class MusicApp {
	private String appName;
	private int joinMonth;
	private int price = 7000;
	
	public void setAppName(String appName) {
		this.appName = appName;		
	}
	public String getAppName() {
		return appName;
	}
	
	public void setJoinMonth(int joinMonth) {
		this.joinMonth = joinMonth;
	}
	public int getJoinMonth() {
		return joinMonth;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public String getInfo() {
		String info = "어플명: " + appName + " 가입개월: " + joinMonth + "개월 " + "가격: " + price +"원";
		return info;
	}
	
	
}
