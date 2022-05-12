package ch10;

public class Marine {
	
	private int power;
	private int hp;
	private String name;
	
	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}
	public void showInfo() {
		System.out.println("========정보창========");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("====================");
	}
	
	// 공격 당합니다.
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
	
	public void attackZergling(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(name + "이 " + targetName + "을 공격합니다.");
		zergling.beAttacked(this.power);
	}
	
	// getName
	
	public String getName() {
		return name;
	}
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name + "이 " + targetName + "을 공격합니다.");
		zealot.beAttacked(this.power);
	}
	
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(name + "이 " + targetName + "을 공격합니다.");
		zergling.beAttacked(this.power);
	}


}
