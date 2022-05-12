package ch08;

public abstract class Unit {
	
	protected int power;
	protected int hp;
	protected String name;
	
	public void showInfo() {
		System.out.println("========����â========");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("====================");
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Unit unit) {
		String targetName = unit.getName();
		System.out.println(name + "�� " + targetName + "�� �����մϴ�.");
		unit.beAttacked(this.power);
	}
	
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
			this.hp = 0;
		}
	}

}
