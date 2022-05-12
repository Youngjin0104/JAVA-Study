package ch01;

class A {
	String name;
//	double name; // 변수 명을 다르게 설계하거나
}

class B {
	double name;
}
public class MainTest1 {

	public static void main(String[] args) {
		
		// 무엇이든 담을 수 있는 제네릭(Generic) 프로그래밍
		// Generic - 일반화 (jdk 5.0 ~ )
		
		// 제네릭 프로그래밍을 사용하는 이유?
		// 우리가 변수를 사용한다고 하면 변수에 항상 자료형을 먼저 지정하게 되어 있다.
		// 여러 자료형으로 사용될 수 있는 변수가 있을 떄 우리는 제네릭 프로그래밍을 설계, 사용할 수 있다.
		// 변수를 기반으로 클래스를 만든다고 가정했을 떄 다양한 자료형으로 사용되기 때문에 여러개의
		// 클래스를 만들게 하거나 또는 변수명을 달리해서 코드에 복잡도도 올라가고 가독성이 떨어지게 된다.
		
		// 결론
		// 다양한 자료형이 적용될 수 있는 클래스를 만드는 것이 제네릭 프로그래밍 방식이라고 한다.
		
		// 제네릭 자료형의 정의
		// 클래스에서 사용하는 변수의 자료형이 여러개 일 수 있고, 그 기능(메서드)는 동일한 경우 클래스의 자료형을
		// 측정하지 않고 추후 해당 클래스를 사용할 때 지정할 수 있도록 선언 하는 것
		
		// 제네릭 사용하지 않는 경우 VS 제네릭을 사용하는 프로그램 방식
		
		
	} // end of main
	
} // end of class
