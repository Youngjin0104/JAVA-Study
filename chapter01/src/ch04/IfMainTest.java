package ch04;

public class IfMainTest {
	
	// Main
	public static void main(String[] args) {
		
		// ��� if
		// �־��� ���ǿ� ���� ������ �̷�� ������ �����Ѵ�.
		// ���� ... �̶��
		
		boolean flag = false;
		
		// if �� �ܵ� �����
		
		if(flag) {
			System.out.println("���ǽ� ����� true�̸� ���� �ȴ�.");						
		} // end of if
		
		// if else ��
		if(flag) {
			System.out.println("true �̸� ����");
		} else {
			System.out.println("false �̸� ����");
		}
		
		// if else if else ��
		int point = 70;
		
		if(point >= 90) {
			System.out.println("A���� �Դϴ�.");
		}else if(point >= 80) {
			System.out.println("B���� �Դϴ�.");
		}else if(point >= 70) {
			System.out.println("C���� �Դϴ�.");
		}else if(point >= 60) {
			System.out.println("D���� �Դϴ�.");
		}else {
			System.out.println("F���� �Դϴ�.");
		}
		
		
		
	} // end of main

} // end of class