package ch08;

import java.util.Scanner;

public class MainTest1 {

	// main
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		boolean gameOver = false;
		while (!gameOver) {

			Scanner sc = new Scanner(System.in);
			System.out.println("1. 질럿이 마린을 공격한다.");
			System.out.println("2. 마린이 저글링을 공격한다");
			System.out.println("3. 저글링이 질럿을 공격한다.");
			System.out.println("4. 유닛 상태 보기");
			System.out.println("0. 입력종료");
			System.out.print("입력 : ");
			int input = sc.nextInt();

			if (input == 1) {
				zealot1.attack(marine1);
			} else if (input == 2) {
				marine1.attack(zergling1);
			} else if (input == 3) {
				zergling1.attack(zealot1);
			} else if (input == 0) {
				gameOver = true;
				System.out.println("입력이 종료 됩니다.");
			} else if (input == 4) {
				marine1.showInfo();
				
				zergling1.showInfo();
				zealot1.showInfo();
			}
		}

	} // end of main

} // end of class
