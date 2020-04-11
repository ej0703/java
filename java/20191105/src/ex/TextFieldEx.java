package ex;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	Container contentPane;
	JTextField name = new JTextField(10);
	JTextField major = new JTextField("xxx���а�",10);
	JTextField address = new JTextField("����� ...",20);
	TextFieldEx() {
		setTitle("�ؽ�Ʈ �ʵ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("�̸�:"));
		contentPane.add(name);
		name.setBackground(Color.YELLOW);
		name.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				name.setBackground(Color.RED);
				System.out.println("�̸�:"+name.getText());
			}
		});		
		contentPane.add(new JLabel("�а�:"));
		contentPane.add(major);
		major.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�а�:"+major.getText());
			}
		});
		contentPane.add(new JLabel("�ּ�:"));
		contentPane.add(address);
		address.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ּ�:"+address.getText());
			}
		});
		
		setSize(350,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
