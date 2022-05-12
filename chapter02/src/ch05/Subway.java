package ch05;

public class Subway {

	// 호선 번호
	// 승객수
	// 수익금
	int num;
	int cnt;
	int money;
	
	// 생성자 - 호선번호를 받는 생성자
	public Subway(int num) {
		this.num = num;
	}
	// 메서드 take, showInfo
	public void take(int money) {
		this.money += money;
		cnt ++;
	}
	public void showInfo() {
		System.out.println("전철 번호 : " + num + " 번");
		System.out.println("승객수 : " + cnt + " 명");
		System.out.println("수익금 : " + money + " 원");
		System.out.println("==========================");
	}
}
