package ch04;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	
	private Image image;
	
	public ImagePanel(String imageName) {
		image = new ImageIcon(imageName).getImage();
	}
	
	public ImagePanel() {
		image = new ImageIcon("image.jpg").getImage();
//		image1 = new ImageIcon("image.jpg").getImage();		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
//		g.drawImage(image1, , 0, getWidth(), getHeight(), null);
	}
}

public class MyFrame3 extends JFrame {
	
	private ImagePanel imagePanel;
	private ImagePanel imagePanel1;
	
	public MyFrame3() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("Jpanel에 이미지 넣기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		imagePanel1 = new ImagePanel("image.jpg");
		
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 1));
		add(imagePanel);
		add(imagePanel1);

	}
	
	public static void main(String[] args) {
		
		new MyFrame3();
	}

}
