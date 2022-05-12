package ch02;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame5 extends JFrame {

	JLabel label;
	JButton button;
	
	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("마우스이벤트");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("hello java ~");
		label.setSize(100,50);
		button = new JButton("mouse action practice");
		button.setSize(150, 100);
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		add(button);
		label.setLocation(12, 40);
		button.setLocation(12, 200);
	}
	
	private void addEventListener() {
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX() + " : 좌표값 X");
				System.out.println(e.getY() + " : 좌표값 y");
				button.setLocation(e.getX(), e.getY());
			}
		});
	}
	
	public static void main(String[] args) {
		new MyFrame5();
	}
}
