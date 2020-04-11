package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerSample extends JFrame {
	ListenerSample() {
		//제목 달기
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//버튼 객체 생성
		JButton btn = new JButton("Action");
		MyActionListener listener = new MyActionListener();
		//이벤트발생할 소스(component).이벤트 연결자(이벤트 처리기)
		btn.addActionListener(listener);
		add(btn); //프레임에 버튼 부착
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenerSample();
	}
}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		System.out.println(b);
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}
