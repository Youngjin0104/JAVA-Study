package ch01;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx extends JFrame {
	
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	final int MAX_COUNT = 5;
	
	public NoLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("No Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		for (int i = 0; i < MAX_COUNT; i++) {
			buttons.add(new JButton((i + 1) + "버튼"));
		}
//		buttons.add(new JButton("2"));
//		buttons.add(new JButton("3"));
		
	}
	
	private void setInitLayout() {
		
		// 좌표값으로 컴포넌트 위치를 지정할떄는
		setLayout(null);
		
		buttons.get(0).setSize(50,50);
		buttons.get(1).setSize(150,50);
		buttons.get(2).setSize(100,100);
		buttons.get(3).setSize(100,100);
		buttons.get(4).setSize(100,100);
		
		buttons.get(0).setLocation(10,10);
		buttons.get(1).setLocation(110,100);
		buttons.get(2).setLocation(210,210);
		buttons.get(3).setLocation(310,210);
		buttons.get(4).setLocation(410,310);
		
		// add
		for (int i = 0; i < buttons.size(); i++) {
			add(buttons.get(i));			
		}
//		add(buttons.get(1));
//		add(buttons.get(2));
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NoLayoutEx();
	}
} // end of class
