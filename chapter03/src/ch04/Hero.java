package ch04;

public class Hero {
	
	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void attack() {
		
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("ü�� : " + hp);
		System.out.println("-------------------");
	}

}
