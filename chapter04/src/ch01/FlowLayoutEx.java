package ch01;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame{
	
//	private JButton[] buttons = new JButton[7];
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	final int JBUTTONS_SIZE = 6;
	// 문제 해결능력 C R U D
	// 분할엔정복방식 <---
	// 1. 생성방법
	// 2. 추가하는 방법
	// 3. 값을 출력하는 방법
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		
		setTitle("Flow Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT,1,10));
		
		// ArrayList를 사용하는 방법
		// ArrayList는 처음 사이즈가 0
		for (int i = 0; i < JBUTTONS_SIZE; i++) {
			buttons.add(new JButton((i+1) + "번쨰 버튼"));
		}
		
	} // end of initData
	
	private void setInitLayout() {
		setVisible(true);
		for (int i = 0; i <= buttons.size(); i++) {
			add(buttons.get(i));
		}
		
	} // end of setInitLayout
} // end of MyFrame2

public class FlowLayoutEx {
	
	public static void main(String[] args) {
		
		new MyFrame2();
		
		
	}

}
