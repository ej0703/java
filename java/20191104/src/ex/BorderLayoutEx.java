package ex;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	BorderLayoutEx() {
		setTitle("BorderLayout Smple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		add(new JButton("add"),BorderLayout.NORTH);
		add(new JButton("sub"),BorderLayout.SOUTH);
		add(new JButton("mul"),BorderLayout.EAST);
		add(new JButton("div"),BorderLayout.WEST);
		add(new JButton("Calculator"),BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
