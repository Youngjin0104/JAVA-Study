package ch10;

public class Hatchery {
	
	public static int cnt = 0;
	private int id;
	private String name = "Hatchery";
	
	public Hatchery(int id) {
		this.id = id;
		System.out.println(name + "�����Ǿ����ϴ�.");
	}
	
	public Zergling create() {
		System.out.println("���۸��� �����մϴ�.");
		cnt++;
		return new Zergling("���۸�");
	}
}
