package ch03;

public class WarriorMainTest {
	
	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior();
		warrior1.name = "ø¿≈©";
		warrior1.hp = 100;
		warrior1.power = 10;
		warrior1.height = 210.5;
		warrior1.weight = 120.5;
		warrior1.damage = warrior1.power * 2;
		warrior1.showWarrorInfo();
		warrior1.damageActionTest(warrior1.damage);
		
		
		
	}

}
