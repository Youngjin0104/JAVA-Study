package ex1;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 프로그램 실행 흐름을 만들어 보세요.
		Warrior warrior1 = new Warrior();
		Wizard wizard1 = new Wizard();
		
		warrior1.setHp(100);
		warrior1.setName("전사");
		warrior1.setPower(10);
		
		wizard1.setHp(70);
		wizard1.setName("마법사");
		wizard1.setPower(15);
		
		warrior1.showInfo();
		wizard1.showInfo();
	}
}
