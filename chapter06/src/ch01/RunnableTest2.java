package ch01;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame {
	
	int grade = 10;
	
	public MyRunnable2() {
//		runnable.run();
		
	}
	
	// 자바 문법
	// 구현 객체
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print("--");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // end of for
			
		} // end of run
	};
}

public class RunnableTest2 {
	
	public static void main(String[] args) {
		
		MyRunnable2 myRunnable2 = new MyRunnable2();
		
		myRunnable2.runnable.run();
		
	} // end of main

} // end of class
