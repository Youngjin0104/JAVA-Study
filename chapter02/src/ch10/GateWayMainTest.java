package ch10;

public class GateWayMainTest {

	public static void main(String[] args) {
		
		GateWay gateWay1 = new GateWay(1);
		GateWay gateWay2 = new GateWay(1);
		GateWay gateWay3 = new GateWay(1);
		
		Zealot zealot1 = gateWay1.createZealot();
		Zealot zealot2 = gateWay1.createZealot();
		Zealot zealot3 = gateWay1.createZealot();
		
		zealot1.showInfo();
		System.out.println("���� ������ ���� �� : " + GateWay.zealotCount);
		
		// static ������ �ν��ҽ����� ������ �� �ִ� �����̴�.
		// ��ü�� �������� �ʰ� Ŭ���� �̸����� ������ �����ϴ�.
		// ex) �¾�(��ü�� �����Ǳ����� �޸𸮿� �ö� �ִ�)

	}
}
