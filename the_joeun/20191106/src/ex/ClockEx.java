package ex;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ClockEx extends JFrame implements ActionListener, Runnable {
	private Button bt = new Button("����");
	
	public ClockEx() {
		super("�ð�");
		setLayout(new BorderLayout());
		add("South",bt);
		bt.addActionListener(this);
		
		setSize(600,300);
		setVisible(true);
	}
	@Override
	public void run() {
		while(true) {
			repaint(); //�׸���(paint()) �ٽ� ȣ��
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
	// Graphics �׸��� �׸��� ������ ��������
	// paint-->repaintȣ���ϸ�->update->paint ȣ��
	public void paint(Graphics g) {
		Calendar ca = Calendar.getInstance();
		Date da = ca.getTime();
		g.setFont(new Font("�ü�ü", Font.BOLD,30));
		g.drawString(da.toString(), 50, 100);
	}
	
	public static void main(String[] args) {
		ClockEx cs = new ClockEx();
	}
}
