package ch05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// ����� continue
		// �����ϰ� �����ϴ� continue
		System.out.print("��°� �Է� : ");
		final int MAX = sc.nextInt();
		System.out.print("��� �� : ");
		final int MULTIPLE = sc.nextInt();
		
		int num;
		int count = 0;
		
		for(num = 1; num <= MAX; num++) {
			// 3�� ����̸� ������� ���ÿ�.
			if (num % MULTIPLE == 0) {
				count++;
				continue;
			} // end of if
			System.out.println("��°� : " + num);
		} // end of for
		System.out.println(MULTIPLE + "�� ����� ���� : " + count);
		
		
	} // end of main
} // end of class
