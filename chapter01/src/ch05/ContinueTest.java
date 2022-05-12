package ch05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 예약어 continue
		// 무시하고 진행하는 continue
		System.out.print("출력값 입력 : ");
		final int MAX = sc.nextInt();
		System.out.print("배수 값 : ");
		final int MULTIPLE = sc.nextInt();
		
		int num;
		int count = 0;
		
		for(num = 1; num <= MAX; num++) {
			// 3의 배수이면 출력하지 마시오.
			if (num % MULTIPLE == 0) {
				count++;
				continue;
			} // end of if
			System.out.println("출력값 : " + num);
		} // end of for
		System.out.println(MULTIPLE + "의 배수의 개수 : " + count);
		
		
	} // end of main
} // end of class
