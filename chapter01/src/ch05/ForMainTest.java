package ch05;

public class ForMainTest {
	
	// Main
	public static void main(String[] args) {
		
		/**
		 * 	for(초기화식; 조건식; 증감식) {
		 * 		수행문;
		 * 	}
		 */
		
		
	// for 문을 이용해서 1부터 10까지 덧셈 연산
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		} // end of for
		System.out.println(sum);

	} // end of main

} // end of class
