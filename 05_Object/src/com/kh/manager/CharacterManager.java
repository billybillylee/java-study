package com.kh.manager;

import java.util.Scanner;
import com.kh.character.Character;

public class CharacterManager {
	public void customHero() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====캐릭터 커스터마이징====");
		System.out.print("캐릭터 이름을 정해주세요: "); String name = sc.next();
		System.out.print("직업을 선택해 주세요: "); String job = sc.next();
		System.out.print("시작 레벨을 선택해주세요: "); int level = sc.nextInt();
		System.out.print("헤어스타일을 선택해주세요: "); String hair = sc.next();

		Character myHero = new Character(name, job, level, hair);
		
		while(true) {
			System.out.println("\n--- [ 게임 메인 메뉴 ] ---");
			System.out.println("1. 캐릭터 상태창 보기");
			System.out.println("2. 사냥하기 (레벨업)");
			System.out.println("3. 마을 미용실 방문 (헤어 변경)");
			System.out.println("4. 게임 종료");
			System.out.print("원하는 메뉴 번호를 입력하세요: ");
			int menu = sc.nextInt();
		switch(menu) {
			case 1:
				myHero.showStatus();
				break;
			case 2:
				myHero.level +=1;
				System.out.println(myHero.level + "이(가) 증가하였습니다.");
				break;
			case 3:
				System.out.print("변경할 헤어스타일을 선택해주세요: ");
				String newHair = sc.next();
				myHero.hairStyle = newHair;
				System.out.println("미용실 완료! 지금 머리는" + myHero.hairStyle + "!!!");
			case 4:
				System.out.println("게임 종료!");
				sc.close();
				
				return;
			}
		}

	}
} 
