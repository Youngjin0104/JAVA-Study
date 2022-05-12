package ch10;

public class Zergling {
	
	private String name;
	private int hp;
	private int power;
	
	public Zergling(String name) {
		this.name = name;
		this.hp = 50;
		this.power = 5;
	}
	
	public void showInfo() {
		System.out.println("========정보창========");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("====================");
	}
	
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "이 사망하였습니다.");
			this.hp = 0;
		}
	}
	
	public void attackZealot(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name + "이 " + targetName + "을 공격합니다.");
		zealot.beAttacked(this.power);
	}
	
	public void attackMarine(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "이 " + targetName + "을 공격합니다.");
		marine.beAttacked(this.power);
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name + "이 " + targetName + "을 공격합니다.");
		zealot.beAttacked(this.power);
	}
	
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "이 " + targetName + "을 공격합니다.");
		marine.beAttacked(this.power);
	}
}
