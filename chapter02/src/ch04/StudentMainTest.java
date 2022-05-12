package ch04;

public class StudentMainTest {
	
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"홍길동",3);
		s1.showInfo();
		System.out.println("====================");
		// 기본 생성자로 객체 생성해보기
		Student s2 = new Student();
		
		s2.number = 2;
		s2.name = "김유신";
		s2.grade = 1;
		
		s2.showInfo();
		
	} // end of main

} // end of class
