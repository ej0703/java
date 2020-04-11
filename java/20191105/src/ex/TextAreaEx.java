package ex;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{
	Container contentPane;
	TextAreaEx() {
		setTitle("�ؽ�Ʈ ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyCenterPanel(), BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}

	class MyCenterPanel extends JPanel {
		JTextField tf;
		JButton btn;
		JTextArea ta;
		MyCenterPanel() {
			tf = new JTextField(20);
			btn = new JButton("�߰�");
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText()+"\n");
				}
			});
			ta = new JTextArea("hello",7,20);
			add(new JLabel("�Ʒ� â�� ���ڿ��� �Է��ϰ� ��ư�� Ŭ���ϼ���"));
			add(tf);
			add(btn);
			add(new JScrollPane(ta));
			ta.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if(e.getClickCount()==2)
						remove(ta);
				}
			});
		}
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
