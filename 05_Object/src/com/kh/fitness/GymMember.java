package com.kh.fitness;

public class GymMember {
	
	public String memberName;
	public int months;
	public boolean isReResisterd;
	
	public GymMember(String memberName, int months, boolean isReResisterd) {
		this.memberName = memberName;
		this.months = months;
		this.isReResisterd = isReResisterd;
	}
		
	public void pirntMembershipReceipt() {
		
		int basePrice = months * 50000;
		
		int discount = isReResisterd ? (int)(basePrice * 0.1) : 0;
		
		int totalPrice = basePrice - discount;

		String memberType = isReResisterd ? "재등록 회원 (10 %) 할인" : "신규 회원"	;
		
		System.out.println("===== 헬스장 회원권 등록 영수증 ===== ");
		System.out.println("회원이름: " + this.memberName);
		System.out.println("회원 구분: " + memberType);
		System.out.println("등록 기간:" + this.months +"개월 (기본 금액: " + basePrice + "원)");
		System.out.println("할인 금액: -" + discount + "원");
		System.out.println("최종 결제 금액: " + totalPrice +"원");
	}

}
