package ch03;

public class StudentMainTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "인천";
		
		studentLee.showStudentInfo();
		studentLee.takeTest();
		studentLee.cleanUp();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		studentKim.showStudentInfo();
		
		// 메서드 사용
		// 1. takeTest 실행
		// 2. cleanUp 실행
		studentKim.takeTest();
		studentKim.cleanUp();
		
		System.out.println("-----------------");
		String name1 = studentKim.studentName;
		System.out.println("name : " + name1);
		
		
	}

}
