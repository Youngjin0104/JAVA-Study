package ch05;

import java.util.Scanner;

public class MainTest2 {
	
	public static void main(String[] args) {
	
		final int BANANA = 1;
		final int PEACH = 2;
		
		// 스캐너
		// 사용자가 입력한 1, 2 받으면 해당하는 객체에 정보를 화면에 출력해주세요.
		
		System.out.println("바나나  : 1, 복숭아 : 2");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		Fruit fruit = null;
		
		// 만약 1번이라면 바나나 객체를 생성하고
		// showInfo 메서드를 호출해 주세요.
		if (userInput == BANANA) {
			fruit = new Banana(); // 업 캐스팅
		}
		else if (userInput == PEACH) {
			fruit = new Peach();
		}
		fruit.showInfo();
		
		
	} // end of main

} // end of class
