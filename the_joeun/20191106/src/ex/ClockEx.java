package ex;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ClockEx extends JFrame implements ActionListener, Runnable {
	private Button bt = new Button("시작");
	
	public ClockEx() {
		super("시계");
		setLayout(new BorderLayout());
		add("South",bt);
		bt.addActionListener(this);
		
		setSize(600,300);
		setVisible(true);
	}
	@Override
	public void run() {
		while(true) {
			repaint(); //그리기(paint()) 다시 호출
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getStackTrace());
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt) {
			bt.setEnabled(false);
			Thread tt = new Thread(this);
			tt.start();
		}
	};
	// Graphics 그림을 그리는 도구를 갖고있음
	// paint-->repaint호출하면->update->paint 호출
	public void paint(Graphics g) {
		Calendar ca = Calendar.getInstance();
		Date da = ca.getTime();
		g.setFont(new Font("궁서체", Font.BOLD,30));
		g.drawString(da.toString(), 50, 100);
	}
	
	public static void main(String[] args) {
		ClockEx cs = new ClockEx();
	}
}
