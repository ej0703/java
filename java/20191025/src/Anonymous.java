import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//4. Anonymous class
@SuppressWarnings("serial")
public class Anonymous extends JFrame {

	public static void main(String[] args) {
		//������ ��ü ����
		Anonymous t = new Anonymous();
		//������ ����
		t.setTitle("�͸���Ŭ���� ����...");
		//��ư ��ü ����
		JButton btn = new JButton("��ư�� �����ּ���.");
		//�����ӿ� ��ư ���̱�
		t.add(btn);
		//������ ũ�� ����
		t.setSize(300,300); //���� ���� ũ��
		t.setLocation(500,500); // ȭ�鿡 x,y ��ġ
		t.setVisible(true); //�������� ȭ�鿡 �����ֱ�
		//�̺�Ʈ �߻� ó��
		//��ư�� Ŭ�������� �̺�Ʈó���� ó����(�̺�Ʈ �ڵ鷯)����
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// �̺�Ʈ�� ������ ��ư�� �ִ� ���ڸ� ����
				String select = e.getActionCommand(); //��ư�� ���� ��������
				if(select.equals("��ư�� �����ּ���.")) {
					//�ý��� ���� == ���α׷� ���� 0 �Ǵ� �ٸ� ����
					//�ƹ��ų� ���� 0�� ���� ���.
					System.exit(0);
				}				
			}
		});

	}

}
