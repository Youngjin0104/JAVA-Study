package ch08;

public abstract class Unit {
	
	protected int power;
	protected int hp;
	protected String name;
	
	public void showInfo() {
		System.out.println("========정보창========");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("====================");
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Unit unit) {
		String targetName = unit.getName();
		System.out.println(name + "이 " + targetName + "을 공격합니다.");
		unit.beAttacked(this.power);
	}
	
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "이 사망하였습니다.");
			this.hp = 0;
		}
	}

}
