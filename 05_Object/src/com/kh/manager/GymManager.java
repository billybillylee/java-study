package com.kh.manager;

import java.util.Scanner;
import com.kh.fitness.GymMember;

public class GymManager {
	public void registerMembers() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===  신규/재등록 회원 등록을 시작합니다 ===");
		
		System.out.print("회원 이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("등록할 개월수를 입력하세요: ");
		int months = sc.nextInt();
		
		System.out.print("재등록 회원이신가요?");
		String answer = sc.next();
		boolean isReResisterd = answer.equals("네") ? true : false;
		
		GymMember newMember = new GymMember(name, months, isReResisterd);
		
		newMember.pirntMembershipReceipt();
		
		sc.close();	
	}

}
