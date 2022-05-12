package ch10;

public class MainTest1 {
	
	// main
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		Hatchery hatchery = new Hatchery(1);
		
		// 문제 저글링, 질럿, 마린 체력이 0 또는 이하라면 사망했습니다.
		zealot1.attack(zergling1);
		zealot1.attack(zergling1);
		
		zergling1.showInfo();
		
		Zergling zergling3 = hatchery.create();
		Zergling zergling4 = hatchery.create();
		Zergling zergling5 = hatchery.create();
		Zergling zergling6 = hatchery.create();
		
		
		zergling1.showInfo();
		System.out.println("현재 생성된 저글링 수 : " + Hatchery.cnt);
		
		
		
		
	} // end of main

} // end of class
