package ch05;

import java.util.Scanner;

public class WhileMainTest2 {
	
	public static void main(String[] args) {
		
		// ����� ��� ���� ��ĳ�ʸ� ����ؼ� �ڵ带 ������ �ּ���.
		System.out.print("���� ���� �Է����ּ��� : ");
		Scanner sc = new Scanner(System.in);
		
		final int LIMIT_VALUE = sc.nextInt();
		
		int num = 1;
		int sum = 0;
		
		while(num <= LIMIT_VALUE) {
			sum += num;
			num++;
		}
		
		System.out.println("����� : " + sum);
		
	}

}
