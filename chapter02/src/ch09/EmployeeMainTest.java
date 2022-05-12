package ch09;

public class EmployeeMainTest {
	
	// main
	public static void main(String[] args) {
		
		int temp = Employee.getSerialNum(); // static 메서드
		System.out.println(temp);
//		Employee test1 = new Employee();
//		test1.getEmployeeId(); // <-- 일반 메서드
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();
		
//		System.out.println(employee1.serialNum);
//		System.out.println(employee1.getEmployeeId());
//		System.out.println(employee5.getEmployeeId());
		
		// static 변수, 멤버 변수, 지역 변수 ---> 메모리 위치 확인
		
		// employee1 ~ 5 : 인스턴스 변수로 접근해서 getEmploteeId() 실행
		
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee3.getEmployeeId());
		System.out.println(employee4.getEmployeeId());
		System.out.println(employee5.getEmployeeId());
		// 클래스 이름으로 접근해서 getSerialNum() 메서드를 사용
		System.out.println(Employee.getSerialNum());
		
	} // end of main

} // end of class
