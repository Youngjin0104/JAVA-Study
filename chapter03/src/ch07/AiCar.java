package ch07;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행합니다.");
		System.out.println("자동차가 스스로 방향을 바굽니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");	
	}
	
	@Override
	public void wiper() {
		System.out.println("수분을 인식하여 자동으로 와이퍼를 작동합니다.");
	}
	
	@Override
	public void washCar() {
		System.out.println("스스로 세차를 합니다.");
	}

}
