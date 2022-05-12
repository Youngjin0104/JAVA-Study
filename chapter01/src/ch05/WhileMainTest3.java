package ch05;

public class WhileMainTest3 {

	public static void main(String[] args) {
		
		// do ~ while
		int input = 10;
		int sum = 0;
		
		do {
			System.out.println("ÇöÀç °ª : " + input);
			sum += input;
			input--;
			
			
		} while(input != 0); {
			System.out.println(sum);
		}
		
		
	} // end of main
} // end of class
