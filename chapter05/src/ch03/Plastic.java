package ch03;

public class Plastic extends Material{
	
	@Override
	public String toString() {
		return "재료는 plastic";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다.");
	}

}
