package ex1;

public class Warrior {

	// 멤버 변수
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
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + hp);
		System.out.println("파워 : " + power);
		System.out.println("==================");
	}
}
