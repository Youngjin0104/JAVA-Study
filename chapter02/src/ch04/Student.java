package ch04;

public class Student {

	// 생성자 - constructor
	// 객체를 생성할 때 다음과 같은 모양으로 만들어라고 지시하는 것 (강제성 부여됨)
	
	int number;
	String name;
	int grade;
	
	// 기본 생성자
	// 사용자 정의 생성자 없는 경우에는 컴파일러가 알아서 기본 생성자를 만들어 준다.
	
	// 생성자 만들기 (개발자가 직접 정의 - 사용자 정의 생성자)
	// grade 넣고 코드 정상 동작하게 수정해주세요.
	public Student(int num, String name, int grade) {
		number = num;
		// 매개변수 이름과 멤버변수 이름이 같다면 this. 키워드를 사용해서 구분해 주어야한다.
		this.grade = grade;
		this.name = name;
	}
	
	public Student() {
		
	}

	// 메서드 정의
	public void showInfo() {
		System.out.println(name + " 학생의 학번은 " + number + "입니다.");
		System.out.println(grade + " 학년 입니다.");
	}
	
}
