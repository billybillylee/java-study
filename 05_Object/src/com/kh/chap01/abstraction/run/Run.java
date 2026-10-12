package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Dog;
import com.kh.manager.GymManager;
import com.kh.manager.CarGameManager;
import com.kh.manager.CharacterManager;


public class Run {

	public static void main(String[] args) {
		//현실세계의 개 => 자바세상에서 구현해보자!
		// 종: 도베르만, 이름: 나폴레옹, 나이: 6살, 성별: 수컷, 중성화여부: x
		
		/*Dog dog = new Dog(); //객체생성
		
		dog.name ="재명이";
		dog.age = 64;
		dog.species = "범죄자";
		dog.sex = 'M';
		dog.neuter = true;
		//dog.walk(); // .(point) 참조연산자 -> dog를 가리키겠다!
		System.out.println(dog.name + "은(는) " + dog.age + "살이고 " + "중성화여부는 " + dog.neuter +" 입니다.");
		*/
		
		/*GymManager gm = new GymManager();
		gm.registerMembers(); */
		
		/* CharacterManager cm = new CharacterManager();
		cm.customHero(); */
		
		CarGameManager cg = new CarGameManager();
		cg.startMenu();
		
	}

}
