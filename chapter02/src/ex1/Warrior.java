package ex1;

public class Warrior {

	// ��� ����
	// hp, power, name
	private int hp;
	private int power;
	private String name;
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("ü�� : " + hp);
		System.out.println("�Ŀ� : " + power);
		System.out.println("==================");
	}
}
