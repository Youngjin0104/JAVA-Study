package ch09;

public class EmployeeMainTest {
	
	// main
	public static void main(String[] args) {
		
		int temp = Employee.getSerialNum(); // static �޼���
		System.out.println(temp);
//		Employee test1 = new Employee();
//		test1.getEmployeeId(); // <-- �Ϲ� �޼���
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();
		
//		System.out.println(employee1.serialNum);
//		System.out.println(employee1.getEmployeeId());
//		System.out.println(employee5.getEmployeeId());
		
		// static ����, ��� ����, ���� ���� ---> �޸� ��ġ Ȯ��
		
		// employee1 ~ 5 : �ν��Ͻ� ������ �����ؼ� getEmploteeId() ����
		
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee3.getEmployeeId());
		System.out.println(employee4.getEmployeeId());
		System.out.println(employee5.getEmployeeId());
		// Ŭ���� �̸����� �����ؼ� getSerialNum() �޼��带 ���
		System.out.println(Employee.getSerialNum());
		
	} // end of main

} // end of class
