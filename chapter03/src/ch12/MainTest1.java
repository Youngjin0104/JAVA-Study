package ch12;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		Book book1 = new Book(1, "���̾�", "�츣�� �켼");
		Book book2 = new Book(1, "���̾�", "�츣��");
		
		System.out.println(book1 == book2);
		
		boolean result = "a".equals("a");
		System.out.println(result);
		System.out.println("a" == "a");
		
		// equals �޼��带 ������ �ߵ�(book Ŭ���� �ȿ���)
		if (book1.equals(book2)) {
			System.out.println("���� å�Դϴ�.");
		}else {
			System.out.println("�ٸ� å�Դϴ�.");
		}
		
	} // end of main

}