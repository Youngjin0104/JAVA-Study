package ch04;

public class Student {

	// ������ - constructor
	// ��ü�� ������ �� ������ ���� ������� ������� �����ϴ� �� (������ �ο���)
	
	int number;
	String name;
	int grade;
	
	// �⺻ ������
	// ����� ���� ������ ���� ��쿡�� �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� ����� �ش�.
	
	// ������ ����� (�����ڰ� ���� ���� - ����� ���� ������)
	// grade �ְ� �ڵ� ���� �����ϰ� �������ּ���.
	public Student(int num, String name, int grade) {
		number = num;
		// �Ű����� �̸��� ������� �̸��� ���ٸ� this. Ű���带 ����ؼ� ������ �־���Ѵ�.
		this.grade = grade;
		this.name = name;
	}
	
	public Student() {
		
	}

	// �޼��� ����
	public void showInfo() {
		System.out.println(name + " �л��� �й��� " + number + "�Դϴ�.");
		System.out.println(grade + " �г� �Դϴ�.");
	}
	
}
