package ch01;

public class StringTest2 {
	
	public static void main(String[] args) {
		
		// �ѹ� ������ String�� �Һ�(immutable)
		
		// String�� �����ϸ� ������ String�� ����Ǵ� ���� �ƴ� ���ο� ���ڿ��� �����ȴ�.
		String java = new String("java");
		String android = new String("Android");
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		// java = java + android;
		java = java.concat(android);
		System.out.println(java);
		
		System.out.println(System.identityHashCode(java));
		
	} // end of main

} // end of class
