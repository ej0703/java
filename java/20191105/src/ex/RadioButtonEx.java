package ex;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
	Container contentPane;
	RadioButtonEx() {
		setTitle("���� ��ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("src/ex/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("src/ex/selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��",true);
		JRadioButton cherry = new JRadioButton("ü��",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
