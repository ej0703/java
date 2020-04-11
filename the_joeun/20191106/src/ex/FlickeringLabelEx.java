package ex;

import java.awt.*;
import javax.swing.*;
/* ����ȭ : �������� �����ϴ� ���� �����ϱ� ���� ���
 * 	�Ӱ迵�� : ��Ƽ�����忡 ���� �����ڿ��� ������ �� �ִ� �ڵ��� ������ ���Ѵ�.
 * 	��Ƽ ������ ���α׷����� �Ӱ迵���� ó���ϴ� ��� �ɰ��� ������ �߻��� �� �ִ�.
 * 	�̷��� ��Ȳ�� �ذ��� �� �ִ� ����� ����ȭ�� �̿��ϴ� ���̴�.
 * 	����ȭ�� ó���ϱ� ���� ��� ��ü ��(Lock)�� ���Խ�Ų��.
 * 	Lock : ���� ��ü�� ���� �����尡 ���ÿ� �������� ���ϵ��� �ϱ� ���� ������ ��� ��ü�� �� ������ ������ �� �ڵ����� ���������.
 * 		 * �߸� ����ȭ ��Ű�� DEAD LOCK�� �ɸ�
 *  ����ȭ ���
 * //�޼ҵ��� : �� �� ������ ������� ������.�ӵ� ������
 *   - public synchronized void synchronizedEx() {
 *    		//�Ӱ迵�� �ڵ�
 *     }
 * 	
 * //����ȭ ������ �پ�ȭ �� �� �ִ�.
 * 	 - public void nomalMethod() {
 * 		//this : ����ȭ�� ����� �˸��� �뵵�� ���
 * 		//�޼ҵ尡 ȣǳ�� �ν��Ͻ� �ڽ��� ����(synchronized)�� ������� ����ȭ�� �����ϴ� ����
 * 		synchronized(����ȭ�� ��ü, Ŭ������) {
 * 			//�Ӱ迵�� �ڵ�
 * 		}
 * 	}
 *  * DEAD LOCK(���� ����)
 *  * �ΰ��̻��� �����尡 �������� ���ϴ� ���·� ��� ��ٸ��� �߻��Ѵ�. 
 */
class FlickeringLabel extends JLabel implements Runnable {
	public FlickeringLabel(String text) {
		super(text);
		setOpaque(true);
		
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		int n=0;
		while(true) {
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0) n=1;
			else n=0;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("����");
		
		JLabel label = new JLabel("�ȱ���");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����");
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}
