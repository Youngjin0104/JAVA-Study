package ch05;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		// ���� �����
		Bus bus100 = new Bus(100);
		Subway subway = new Subway(1);
		Student student1 = new Student("ȫ�浿", 50_000);
		Student student2 = new Student("�߽���", 20_000);
		Student student3 = new Student("Ƽ��", 30_000);
		
		// �л��� ������ ź��.
		student1.takeBus(bus100);
		student2.takeBus(bus100);
		student3.takeBus(bus100);
		// ����â Ȯ��
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		bus100.showInfo();
		
		System.out.println("===============");
		student1.takeSubway(subway);
		student1.showInfo();
		subway.showInfo();
		
	} // end of main
} // end of class
