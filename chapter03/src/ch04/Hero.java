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
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + hp);
		System.out.println("-------------------");
	}

}
