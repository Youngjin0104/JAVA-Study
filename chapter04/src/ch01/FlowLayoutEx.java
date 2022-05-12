package ch01;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame{
	
//	private JButton[] buttons = new JButton[7];
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	final int JBUTTONS_SIZE = 6;
	// ���� �ذ�ɷ� C R U D
	// ���ҿ�������� <---
	// 1. �������
	// 2. �߰��ϴ� ���
	// 3. ���� ����ϴ� ���
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		
		setTitle("Flow Layout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT,1,10));
		
		// ArrayList�� ����ϴ� ���
		// ArrayList�� ó�� ����� 0
		for (int i = 0; i < JBUTTONS_SIZE; i++) {
			buttons.add(new JButton((i+1) + "���� ��ư"));
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
