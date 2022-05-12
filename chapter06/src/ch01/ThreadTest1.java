package ch01;

public class ThreadTest1 {
	
	// main <-- Main Thread
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.print("-");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of for
		
	} // end of main

} // end of class
