package ch04;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("����1", 100);
		Wizard wizard1 = new Wizard("������1", 80);
		Archer archer1 = new Archer("�ü�1", 90);
		
		warrior1.showInfo();
		wizard1.showInfo();
		archer1.showInfo();
		
		warrior1.comboAttack();
		
		
		
	}

}
