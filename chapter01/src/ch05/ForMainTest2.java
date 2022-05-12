package ch05;

public class ForMainTest2 {
	
	public static void main(String[] args) {
		
		// 구구단 2단을 먼저 출력해 주세요.
		int dan = 2;
		
		System.out.println(dan + " X 1 = " + (dan * 1));
		System.out.println(dan + " X 2 = " + (dan * 2));
		System.out.println(dan + " X 3 = " + (dan * 3));
		System.out.println(dan + " X 4 = " + (dan * 4));
		System.out.println(dan + " X 5 = " + (dan * 5));
		System.out.println(dan + " X 6 = " + (dan * 6));
		System.out.println(dan + " X 7 = " + (dan * 7));
		System.out.println(dan + " X 8 = " + (dan * 8));
		System.out.println(dan + " X 9 = " + (dan * 9));
		System.out.println("===========================");
		
		// 구구단 3단을 출력해 주세요.
		dan = 3;
		
		System.out.println(dan + " X 1 = " + (dan * 1));
		System.out.println(dan + " X 2 = " + (dan * 2));
		System.out.println(dan + " X 3 = " + (dan * 3));
		System.out.println(dan + " X 4 = " + (dan * 4));
		System.out.println(dan + " X 5 = " + (dan * 5));
		System.out.println(dan + " X 6 = " + (dan * 6));
		System.out.println(dan + " X 7 = " + (dan * 7));
		System.out.println(dan + " X 8 = " + (dan * 8));
		System.out.println(dan + " X 9 = " + (dan * 9));
		
		for (dan = 4; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " X " + i + "= " + (dan * i));
			}System.out.println("=====================");
		}
	} // end of main
} // end of class
