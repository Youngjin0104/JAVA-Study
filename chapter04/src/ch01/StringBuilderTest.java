package ch01;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// StringBuilder, StringBuffer Ȱ��
		// ���������� �������� char[]�� ��� ������ ����.
		// ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� �����ϴ�.
		// StringBuffer�� ��Ƽ������ ���α׷��ֿ��� ����ȭ�� ����
		// ���� ������ ���α׷������� StringBuilder ����ϱ⸦ ����
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.append(android);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		// ���� 1 append �޼��� ����ؼ� 3�� (�ּҰ� Ȯ���ϱ�)
		builder.append("Hello");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		builder.append(123);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		// ����2
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
	}
}
