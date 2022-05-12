package ch01;

import javax.swing.JFrame;

// Runable 인터페이스를 구현하여 만들면 된다.
class MyRunnable1 extends JFrame implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
		
	}
	
}

public class RunnableTest1 {
	
	// 메인 쓰레드
	public static void main(String[] args) {
		
		MyRunnable1 myRunnable1 = new MyRunnable1();
		
		// Runnable 구현한 객체는 Thread를 생성해서 매개 변수에 담고 쓰레드를 시작한다.
		// 작업자 1 쓰레드
		Thread th1 = new Thread(myRunnable1);
		th1.start();
		
		Thread th2 = new Thread(myRunnable1);
		th2.start();
		
	} // end of main

} // end of class
