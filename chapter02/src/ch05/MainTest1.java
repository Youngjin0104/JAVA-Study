package ch05;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		// 버스 만들기
		Bus bus100 = new Bus(100);
		Subway subway = new Subway(1);
		Student student1 = new Student("홍길동", 50_000);
		Student student2 = new Student("야스오", 20_000);
		Student student3 = new Student("티모", 30_000);
		
		// 학생이 버스를 탄다.
		student1.takeBus(bus100);
		student2.takeBus(bus100);
		student3.takeBus(bus100);
		// 상태창 확인
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
