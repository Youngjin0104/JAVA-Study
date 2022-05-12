package ch04;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame4 extends JFrame {
	
	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	BufferedImage imageIcon1; 
	
	MyImagePanel myImagePanel;
	
	public MyFrame4() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
			imageIcon1 = ImageIO.read(new File("among2.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
		myImagePanel = new MyImagePanel();
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(myImagePanel);
	}
	
	private class MyImagePanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);		
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, 200, 200, 80, 80, null);
			g.drawImage(imageIcon1, 130, 200, 80, 80, null);
		}
	} // end of inner class
	
	public static void main(String[] args) {
		new MyFrame4();
		
		
	}

}
