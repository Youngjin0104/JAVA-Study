package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{

	BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = {"북", "센터", "남", "동", "서"};
	String[] directions = {BorderLayout.NORTH,
			BorderLayout.CENTER,
			BorderLayout.SOUTH,
			BorderLayout.EAST,
			BorderLayout.WEST};
	
	public BorderLayoutEx() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		super.setTitle("BorderLayout 연습");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400,400);
		
		borderLayout = new BorderLayout();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(titles[i]);
		}
	}
	
	private void setInitLayout() {
		borderLayout = new BorderLayout();
		setVisible(true);
		// for
		for (int i = 0; i < buttons.length; i++) {
			// add JFrame
			add(buttons[i], directions[i]);
		}
//		
//		super.add(buttons[1], BorderLayout.CENTER);
//		super.add(buttons[2], BorderLayout.SOUTH);
//		super.add(buttons[3], BorderLayout.EAST);
//		super.add(buttons[4], BorderLayout.WEST);
		
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
