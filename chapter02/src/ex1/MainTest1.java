package ex1;

public class MainTest1 {

	public static void main(String[] args) {
		
		// ���α׷� ���� �帧�� ����� ������.
		Warrior warrior1 = new Warrior();
		Wizard wizard1 = new Wizard();
		
		warrior1.setHp(100);
		warrior1.setName("����");
		warrior1.setPower(10);
		
		wizard1.setHp(70);
		wizard1.setName("������");
		wizard1.setPower(15);
		
		warrior1.showInfo();
		wizard1.showInfo();
	}
}
