package ch04;

public class StudentMainTest {
	
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"ȫ�浿",3);
		s1.showInfo();
		System.out.println("====================");
		// �⺻ �����ڷ� ��ü �����غ���
		Student s2 = new Student();
		
		s2.number = 2;
		s2.name = "������";
		s2.grade = 1;
		
		s2.showInfo();
		
	} // end of main

} // end of class
