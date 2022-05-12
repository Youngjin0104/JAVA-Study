package ch04;

public class SubwayMainTest {
	
	public static void main(String[] args) {
		
		Subway s1 = new Subway(101);
		Subway s2 = new Subway(102);
		Subway s3 = new Subway(103);
		
		s1.take(1200);
		s2.take(1800);
		s3.take(1500);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
	}

}
