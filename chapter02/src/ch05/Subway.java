package ch05;

public class Subway {

	// ȣ�� ��ȣ
	// �°���
	// ���ͱ�
	int num;
	int cnt;
	int money;
	
	// ������ - ȣ����ȣ�� �޴� ������
	public Subway(int num) {
		this.num = num;
	}
	// �޼��� take, showInfo
	public void take(int money) {
		this.money += money;
		cnt ++;
	}
	public void showInfo() {
		System.out.println("��ö ��ȣ : " + num + " ��");
		System.out.println("�°��� : " + cnt + " ��");
		System.out.println("���ͱ� : " + money + " ��");
		System.out.println("==========================");
	}
}
