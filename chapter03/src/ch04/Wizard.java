package ch04;

public class Wizard extends Hero {
	
	public Wizard(String name, int hp) {
		super(name, hp);
	}

	public void fireArrow() {
		System.out.println("파이어 애로우!");
	}

}
