package ch01;

public class ThreadTest4 {
	
	public static void main(String[] args) {
		
		// Thread 란?
		// process : 프로그램이 실행되면 OS로 부터 메모르를 할당 받아 프로세스 상태가 된다.
		// Thread : 하나의 프로세스는 하나 이상의 thread를 가지게 되고, 실제 작업을 수행하는
		// 단위는 thread 이다.
		
		// multi threading
		// 여러 thread가 동시에 수행되는 프로그래밍, 여러 작업이 동시에 실행되는 효과
		// thread는 각각 자신만의 작업 공간을 가질 수 있다.(context)
		
		// 여러 thread가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는
		// race condition이 발생할 수 있다.(의도하지 않은 결과를 생성할 수 있다.)
		// --> 이렇게 여러 thread가 공유하는 자원 중 경쟁이 발생하는 부분을 critical section 이라고 한다.(임계영역)
		// 동기화 : critical section에 대한 동기화(일종에 순차적으로 수행)을 구현하게 설계해야 한다.
		
		
	}

}
