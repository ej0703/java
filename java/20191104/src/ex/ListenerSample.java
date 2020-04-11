package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerSample extends JFrame {
	ListenerSample() {
		//���� �ޱ�
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ư ��ü ����
		JButton btn = new JButton("Action");
		MyActionListener listener = new MyActionListener();
		//�̺�Ʈ�߻��� �ҽ�(component).�̺�Ʈ ������(�̺�Ʈ ó����)
		btn.addActionListener(listener);
		add(btn); //�����ӿ� ��ư ����
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
			b.setText("�׼�");
		else
			b.setText("Action");
	}
}
