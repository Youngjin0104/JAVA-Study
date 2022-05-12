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
		System.out.println("========����â========");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("====================");
	}
	
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
			this.hp = 0;
		}
	}
	
	public void attackZealot(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name + "�� " + targetName + "�� �����մϴ�.");
		zealot.beAttacked(this.power);
	}
	
	public void attackMarine(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "�� " + targetName + "�� �����մϴ�.");
		marine.beAttacked(this.power);
	}
	
	public String getName() {
		return name;
	}
	
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name + "�� " + targetName + "�� �����մϴ�.");
		zealot.beAttacked(this.power);
	}
	
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "�� " + targetName + "�� �����մϴ�.");
		marine.beAttacked(this.power);
	}
}