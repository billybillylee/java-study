package com.kh.manager;

import com.kh.game.CarGame;
import java.util.Scanner;

public class CarGameManager {
	public void startMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("차량등록을 시작합니다.");

		System.out.print("차량이름을 입력해주세요: ");
		String carName = sc.nextLine();
		System.out.print("차량 속도를 입력해주세요: ");
		int carSpeed = sc.nextInt();
		sc.nextLine();
		System.out.print("차량 색깔을 입력해주세요: ");
		String carColor = sc.nextLine();

		CarGame myCar = new CarGame(carName, carSpeed, carColor);

		while (true) {
			System.out.println();
			System.out.println("===" + carName + "의 정보입니다" + "===");
			System.out.println("차량 속도: " + carSpeed + "km/h");
			System.out.println("차략 색깔: " + carColor);

			System.out.println("옵션을 선택해 주세요 > ");
			System.out.println("1.차량정보 / 2. 가속 / 3. 감속 / 4. 프로그램종료 > ");
			int optionNo = sc.nextInt();

			switch (optionNo) {
			case 1:
				myCar.carStatus();
				break;
			case 2:
				myCar.carSpeed += 20;
				System.out.println(myCar.carName + "이(가) 가속합니다!" + "현재속도: " + myCar.carSpeed + "km/h");
				break;
			case 3:
				myCar.carSpeed -= 20;
				System.out.println(myCar.carName + "이(가) 감속합니다!" + "현재속도: " + myCar.carSpeed + "km/h");
				break;
			case 4:
				System.out.println("시동을 끕니다.");
				return;
			}
		}

	}
}
