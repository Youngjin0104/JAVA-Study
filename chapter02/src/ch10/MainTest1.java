package ch10;

public class MainTest1 {
	
	// main
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("����1");
		Zealot zealot2 = new Zealot("����2");
		Marine marine1 = new Marine("����1");
		Marine marine2 = new Marine("����2");
		Zergling zergling1 = new Zergling("���۸�1");
		Zergling zergling2 = new Zergling("���۸�2");
		Hatchery hatchery = new Hatchery(1);
		
		// ���� ���۸�, ����, ���� ü���� 0 �Ǵ� ���϶�� ����߽��ϴ�.
		zealot1.attack(zergling1);
		zealot1.attack(zergling1);
		
		zergling1.showInfo();
		
		Zergling zergling3 = hatchery.create();
		Zergling zergling4 = hatchery.create();
		Zergling zergling5 = hatchery.create();
		Zergling zergling6 = hatchery.create();
		
		
		zergling1.showInfo();
		System.out.println("���� ������ ���۸� �� : " + Hatchery.cnt);
		
		
		
		
	} // end of main

} // end of class
