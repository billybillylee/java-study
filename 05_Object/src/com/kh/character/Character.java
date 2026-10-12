package com.kh.character;

public class Character {
	public String nickName;
	public String job;
	public int level;
	public String hairStyle;
	
	public Character(String nickName, String job, int level, String hairStyle) {
		this.nickName = nickName;
		this.job = job;
		this.level = level;
		this.hairStyle = hairStyle;
	}

	public void showStatus() {
		System.out.println("\n=====캐릭터 정보 창=====");
		System.out.println("닉네임: " + this.nickName);
		System.out.println("직업: " + this.job);
		System.out.println("레벨: " + this.level);
		System.out.println("헤어스타일: " + this.hairStyle);
		System.out.println("======================");
	}
}
