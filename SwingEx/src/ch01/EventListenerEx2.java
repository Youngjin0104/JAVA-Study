package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends SuperMyFrame implements ActionListener{

	ArrayList<JButton> button = new ArrayList<JButton>();
	JButton button1;
	JButton button2;
	JButton button3;
	
	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	@Override
	protected void initData() {
		setTitle("이벤트 리스너 연습2");
		setSize(500, 500);
		button1 = new JButton("event button1");
		button2 = new JButton("event button2");
		button3 = new JButton("event button3");
	}
	
	@Override
	protected void setInitLayout() {
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);		
	}
	
	@Override
	protected void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼이 눌러 졌습니다.");
		JButton clickButton = (JButton) e.getSource();
		System.out.println(clickButton.getText() + "이 클릭되었습니다.");
		// 문자열을 비교해서 화면에 1번 버튼이 클릭되었습니다. 출력
		if (clickButton.getText().equals(button1.getText())){
			System.out.println("1번 버튼이 클릭되엇습니다.");
		}else if (clickButton.getText() == "event button2") {
			System.out.println("2번 버튼이 클릭되었습니다.");
		}else if (clickButton.getText() == "event button3") {
			System.out.println("3번 버튼이 클릭되었습니다.");
		}
	}
	
}
public class EventListenerEx2 {

	public static void main(String[] args) {
		
		new MyFrame2();
		
	}
}
