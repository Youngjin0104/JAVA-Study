package ch05;

public class WhileMainTest {

	public static void main(String[] args) {
		
		// 1 ~ 10 까지 덧셈 연산
		int num = 1;
		int sum = 0;
		while(num <= 10) {
			System.out.println("현재 값 : " + num);
			sum += num;
			num++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		} // end of while
		System.out.println("연산의 결과 값 : " + sum);
	} // end of main
} // end of class
