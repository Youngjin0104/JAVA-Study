package ch05;

import java.util.Scanner;

public class WhileMainTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		do {
			System.out.println("값을 입력 : ");
			num = sc.nextInt();
			sum += num;
		}while(num != 0);
		System.out.println("결과값 : " + sum);
		
		
	}
}
