package ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {
	
	JButton button1;
	JButton button2;
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("익명구현객체 사용해보기");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
	}
	
	private void addEventListener() {
		
		ActionListener ac = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭됨");
				System.out.println("추후 알아서 구분 코드 작성");
			}
		};
		// 익명 구현 객체
		// 일회성의 인터페이스를 익명 구현 객체로 만들어 사용할 수 있다.
		button1.addActionListener(ac);
		button2.addActionListener(ac);
	}
	public static void main(String[] args) {
//		MyFrame4 mf = new MyFrame4();
//		mf.button.setText("안녕하세요");
		
		// 익명 클래스(인스턴스 변수가 없기 때문에 지속적으로 접근해서 사용할수는 없다)
		new MyFrame4();
	}

}
