package ch01;

class MyThreadEx2 extends Thread {
	
	String name;
	
	public MyThreadEx2(String name) {
		this.name = name;
	}
	
	// 약속
	@Override
	public void run() {
		int i;
		for(i = 0; i < 10; i++) {
			System.out.println(name + " : " + i + "\t");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // end of run
	
} // end of MyThreadEx2


public class ThreadTest2 {
	// 메인 쓰레등
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		System.out.println("메인 쓰레드 시작");
		
		MyThreadEx2 th1 = new MyThreadEx2("작업자1");
		th1.start();
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("test : " + i);
//			
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		MyThreadEx2 th2 = new MyThreadEx2("작업자2");
		th2.start();
		
		System.out.println("메인 쓰레드 종료");

	} // end of main

} // end of class
