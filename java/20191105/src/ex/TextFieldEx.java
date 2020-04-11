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
	JTextField major = new JTextField("xxx공학과",10);
	JTextField address = new JTextField("서울시 ...",20);
	TextFieldEx() {
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("이름:"));
		contentPane.add(name);
		name.setBackground(Color.YELLOW);
		name.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				name.setBackground(Color.RED);
				System.out.println("이름:"+name.getText());
			}
		});		
		contentPane.add(new JLabel("학과:"));
		contentPane.add(major);
		major.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("학과:"+major.getText());
			}
		});
		contentPane.add(new JLabel("주소:"));
		contentPane.add(address);
		address.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("주소:"+address.getText());
			}
		});
		
		setSize(350,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
