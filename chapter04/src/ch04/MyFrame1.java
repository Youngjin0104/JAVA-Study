package ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyFrame1 extends JFrame {
	
	MyPanel myPanel;
	
	public MyFrame1() {
		initData();
		setInitLayOut();
	}
	
	private void initData() {
		setTitle("java 2D Test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();
	}
	
	private void setInitLayOut() {
		setVisible(true);
		add(myPanel);
	}
	
	// 내부클래스 static (정적 내부 클래스)(인스턴스,내부클래스)
	static class MyPanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("HOUSE", 155, 90);
			g.drawLine(100, 100, 175, 25);
			g.drawLine(175, 25, 250, 100);
			g.drawLine(205, 140, 205, 190);
			g.drawLine(180, 165, 230, 165);
			g.drawRect(100, 100, 150, 150);
			g.drawRect(180, 140, 50, 50);
				
		}
	}
	
	public static void main(String[] args) {
		
		new MyFrame1();
	}
	

}
