package ch05;

public class DownCastingTest {

	// main
	public static void main(String[] args) {
		
		// 1. �ٳ����� origin ��� ������ �߰�
		Fruit fruit = new Banana();
		// �����Ϸ��� �θ�Ÿ�� �ν��Ͻ� ���� Ÿ���� �ٶ󺸰� �ִ� ����
//		fruit.origin;
		// �ٿ� ĳ������ ����Ѵٸ� ����
		//(�����Ϸ����� �ڽ� ��ü Ÿ������ �ٶ� ����� ���)
		String origin = ((Banana)fruit).origin;
		System.out.println("������ : " + origin);
		// ������ Ÿ��
		
		// ��Ÿ��
		
	} // end of main
} // end of class
