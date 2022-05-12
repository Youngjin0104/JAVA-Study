package ch07;

public abstract class Car {

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public abstract void drive();
	
	public abstract void wiper();
	
	public abstract void stop();
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	// ��ũ(hook) �޼���
	public void washCar() {
		
	}
	
	// �ٽ�!!
	// ���� Ŭ�������� ������ �� �� ���� �ؾ��Ѵ�. --> final
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
