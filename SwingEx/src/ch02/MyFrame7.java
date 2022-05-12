package ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame {
	
	JTextArea area;
	
	
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("키 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.add(area);
		
	}
	
	private void addEventListener() {
//		area.addKeyListener(this);
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					area.append("left\n");
				}else if (e.getKeyCode() == KeyEvent.VK_UP) {
					area.append("up\n");
				}else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					area.append("right\n");
				}else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append("down\n");
				}
			}
		});
	}

	// 문자를 눌렀을 떄 호출 (문자키에만 반응 합니다)
//	@Override
//	public void keyTyped(KeyEvent e) {
////		System.out.println("keyTyped : " + e.getID());
//	}
//	
//	// 키보드를 눌렀을 떄 호출, 모든 키보드에 반응합니다
//	@Override
//	public void keyPressed(KeyEvent e) {
////		System.out.println(e.getKeyCode());
////		area.setText(e.getKeyCode() + "");
////		area.append(e.getKeyCode() + "\n");
//		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//			area.append("left\n");
//		}else if (e.getKeyCode() == KeyEvent.VK_UP) {
//			area.append("up\n");
//		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//			area.append("right\n");
//		}else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//			area.append("down\n");
//		}
//	}
//
//	// 키보드를 떼었을 떄 호출, 모든 키보드에 반응합니다.
//	@Override
//	public void keyReleased(KeyEvent e) {
////		System.out.println("keyReleased : " + e.getID());
//	}

}
