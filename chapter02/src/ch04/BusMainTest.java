package ch04;

public class BusMainTest {
	
	public static void main(String[] args) {
		
		// ���� 101, 102 ������ ����� �ּ���.
		Bus bus101 = new Bus(101);
		Bus bus102 = new Bus(102);
		
		bus101.showInfo();
		System.out.println("-------------");
		bus102.showInfo();
		
		System.out.println("--------------");
		bus101.take(1200);
		bus101.showInfo();
		
		System.out.println("--------------");
		bus102.take(1500);
		bus102.showInfo();
		
	}

}