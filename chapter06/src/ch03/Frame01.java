package ch03;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame01 extends JFrame {

	BufferedImage background1;
	BufferedImage image1;
	BufferedImage image2;
	int xPoint = 100;
	int yPoint = 100;
	ImagePanel panel;
	int x = 100;
	int y = 350;

	public Frame01() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("연습용");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		try {
			background1 = ImageIO.read(new File("background1.jpg"));
			image1 = ImageIO.read(new File("among1.png"));
			image2 = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		panel = new ImagePanel();

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		this.add(panel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
					yPoint = (yPoint < 0) ? 0 : yPoint - 10;
				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint = (yPoint > 400) ? 400 : yPoint + 10;
				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint = (xPoint > 400) ? 400 : xPoint + 10;
				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint = (xPoint < 0) ? 0 : xPoint - 10;
				}
				repaint();
			}
		});
	}

	private class ImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background1, 0, 0, 500, 500, null);
			g.drawImage(image1, xPoint, yPoint, 80, 80, null);
			g.drawImage(image2, x, y, 80, 80, null);

		}
	}
	
	

	public static void main(String[] args) {

		new Frame01();
	}

}
