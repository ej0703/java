package ex;

import javax.swing.*;
import java.awt.*;
/* JFrame
 * ������ JFrame�� AWT�� Frame�� �޸� �� ������ ������ �Ǿ� �ִ�. ������ ��ü�� �����Ǿ� �ִ� ���� �ƴ϶� �� �ȿ� 4���� ����(Pane)�� ������ �����Ǿ� �ִ�.
 * 1. JRootPane   : �������� ������ ����� �����ϴ� �淮�� �����̳��̴�.
 * 				        ��� ��������� �����̳� ��������� ��������, �ٸ� ������Ʈ��� �� ��ȭ�� �� �� �ֵ��� �����ֱ� �����̴�.
 * 				    GlassPane�� layerdPane���� �����Ǿ� �ְ�, layoutPane�� JMenuBar, contentPane�� �����Ѵ�.
 * 2. layeredPane : ��Ʈ ���ο� ���� ���̾ �� �� �ֵ��� ���� ���� �г��� ���� �� �� �ִ� �гη� ���� ������Ʈ�� ���� ������(������Ʈ ���� �ٸ� ������Ʈ�� ���̴� �۾�)�� �� �ֵ��� �Ѵ�.
 * 					�� �κ��� JMenuBar, �Ʒ��κ��� contentPane���� �̷���� �ִ�.
 * 3. contentPane : �Ϲ����� ������Ʈ�� ���� �� �ִ� �г�, ������ ��ü�� getContentPane()�� �̿��ؼ� ���� �� �ִ�.
 * 4. glassPane   : �⺻������ ������ ���·� �Ǿ� �ִ�. �ٸ� �г� ���� �����ϴ� �г��̴�.
 * 					�ַ� ���콺 �̺�Ʈ�� ó���ϱ� ���� ���� ���� ��Ʈ���ο� �߰��ȴ�.
 * 5. JMenuBar    : �������� �޴��� �����ϴ� ���ҷ� ������ �����ϴ�.
 * 					JMeny, JMenuItem���� �̿��ؼ� �޴��� �����Ͽ� setJMenuBaer()�� �̿��ؼ� ����� �� �ִ�. 
 */
public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("Flow Layout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		add(new JButton("add"));
		add(new JButton("aub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Calculator"));
		
//		setSize(300,250);
		setBounds(500,500,500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}
