package ch10;

public class Hatchery {
	
	public static int cnt = 0;
	private int id;
	private String name = "Hatchery";
	
	public Hatchery(int id) {
		this.id = id;
		System.out.println(name + "생성되었습니다.");
	}
	
	public Zergling create() {
		System.out.println("저글링을 생성합니다.");
		cnt++;
		return new Zergling("저글링");
	}
}
