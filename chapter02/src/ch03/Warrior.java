package ch03;

public class Warrior {
	
	// 멤버 변수
	public String name;
	public double height;
	public double weight;
	public int power;
	public int hp;
	public int damage;
	
	// 멤버 함수
	public void showWarrorInfo() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("힘 : " + power);
		System.out.println("체력 : " + hp);
	}
	public int damageActionTest(int damage) {
		System.out.println("공격을 하였습니다.");
		System.out.println(damage + "데미지를 주었습니다.");
		return damage;
	}

}
