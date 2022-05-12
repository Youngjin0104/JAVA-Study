package ch07;

public class MainTest2 {
	
	public static void main(String[] args) {
		
		Car aiCar = new AiCar();
		Car manualCar = new ManualCar();
		
		aiCar.run();
		System.out.println("---------------");
		manualCar.run();
		
	}

}
