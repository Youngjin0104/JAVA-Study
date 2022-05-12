package ch08;

import java.util.Scanner;

public class MainTest1 {

	// main
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("����1");
		Zealot zealot2 = new Zealot("����2");
		Marine marine1 = new Marine("����1");
		Marine marine2 = new Marine("����2");
		Zergling zergling1 = new Zergling("���۸�1");
		Zergling zergling2 = new Zergling("���۸�2");
		boolean gameOver = false;
		while (!gameOver) {

			Scanner sc = new Scanner(System.in);
			System.out.println("1. ������ ������ �����Ѵ�.");
			System.out.println("2. ������ ���۸��� �����Ѵ�");
			System.out.println("3. ���۸��� ������ �����Ѵ�.");
			System.out.println("4. ���� ���� ����");
			System.out.println("0. �Է�����");
			System.out.print("�Է� : ");
			int input = sc.nextInt();

			if (input == 1) {
				zealot1.attack(marine1);
			} else if (input == 2) {
				marine1.attack(zergling1);
			} else if (input == 3) {
				zergling1.attack(zealot1);
			} else if (input == 0) {
				gameOver = true;
				System.out.println("�Է��� ���� �˴ϴ�.");
			} else if (input == 4) {
				marine1.showInfo();
				
				zergling1.showInfo();
				zealot1.showInfo();
			}
		}

	} // end of main

} // end of class
