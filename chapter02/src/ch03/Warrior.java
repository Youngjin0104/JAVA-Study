package ch03;

public class Warrior {
	
	// ��� ����
	public String name;
	public double height;
	public double weight;
	public int power;
	public int hp;
	public int damage;
	
	// ��� �Լ�
	public void showWarrorInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("Ű : " + height);
		System.out.println("������ : " + weight);
		System.out.println("�� : " + power);
		System.out.println("ü�� : " + hp);
	}
	public int damageActionTest(int damage) {
		System.out.println("������ �Ͽ����ϴ�.");
		System.out.println(damage + "�������� �־����ϴ�.");
		return damage;
	}

}
