package ch03;

public class StudentMainTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "��õ";
		
		studentLee.showStudentInfo();
		studentLee.takeTest();
		studentLee.cleanUp();
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		studentKim.showStudentInfo();
		
		// �޼��� ���
		// 1. takeTest ����
		// 2. cleanUp ����
		studentKim.takeTest();
		studentKim.cleanUp();
		
		System.out.println("-----------------");
		String name1 = studentKim.studentName;
		System.out.println("name : " + name1);
		
		
	}

}
