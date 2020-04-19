package javaTP;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JoinFrame extends JFrame//ȸ������ �г�
{

	JPanel mainPanel; // ���� �г�
	JLabel lblTitle1, lblTitle2, lblTitle3, lblID, lblSubject, lblPW, lblName;
	// Ÿ��Ʋ, ���̵�, ��й�ȣ, �̸� ��
	JButton btnJoin; // �����ϱ� ��ư
	JTextField txtID, txtName;
	JComboBox cbSubject;
	JPasswordField txtPW;// ���̵�, �̸�, ��й�ȣ �Է�â
	LoginFrame LF;
	//����

	String subject[] = {"�а�", "��ǻ�Ͱ��а�", "������������"};

	public JoinFrame(LoginFrame loginFrame) {

		LF = loginFrame;

		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(500, 380));
		mainPanel.setBackground(new Color(220, 255, 220));
		mainPanel.setLayout(null);
		add(mainPanel);

		lblTitle1 = new JLabel("�������б�");
		lblTitle1.setFont(new Font("�������", Font.BOLD, 30)); // ���� ��Ʈ ����
		lblTitle1.setBounds(175, 10, 500, 50); // ���� ��ġ ����
		mainPanel.add(lblTitle1); // �����гο� ����

		lblTitle2 = new JLabel("������û �ý���");
		lblTitle2.setFont(new Font("�������", Font.BOLD, 30)); // ���� ��Ʈ ����
		lblTitle2.setBounds(140, 45, 500, 50); // ���� ��ġ ����
		mainPanel.add(lblTitle2); // �����гο� ����

		lblTitle2 = new JLabel("ȸ������");
		lblTitle2.setFont(new Font("�������", Font.BOLD, 30)); // ���� ��Ʈ ����
		lblTitle2.setBounds(190, 80, 500, 50); // ���� ��ġ ����
		mainPanel.add(lblTitle2); // �����гο� ����

		lblID = new JLabel("ID");
		lblID.setBounds(80, 150, 100, 30); // ���� ��ġ ����
		lblID.setFont(new Font("�������", Font.BOLD, 20)); // ���� ��Ʈ ����
		mainPanel.add(lblID); // �����гο� ����

		lblName = new JLabel("�̸�");
		lblName.setBounds(70, 190, 100, 30); // ���� ��ġ ����
		lblName.setFont(new Font("�������", Font.BOLD, 20)); // ���� ��Ʈ ����
		mainPanel.add(lblName); // �����гο� ����

		lblSubject = new JLabel("�а�");
		lblSubject.setBounds(70, 230, 100, 30); // ���� ��ġ ����
		lblSubject.setFont(new Font("�������", Font.BOLD, 20)); // ���� ��Ʈ ����
		mainPanel.add(lblSubject); // �����гο� ����

		lblPW = new JLabel("PW");
		lblPW.setBounds(75, 270, 100, 30); // ���� ��ġ ����
		lblPW.setFont(new Font("�������", Font.BOLD, 20)); // ���� ��Ʈ ����
		mainPanel.add(lblPW); // �����гο� ����


		txtID = new JTextField(15);
		txtID.setBounds(120, 150, 170, 30); // ���� ��ġ ����
		txtID.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel.add(txtID); // �����гο� ����

		txtName = new JTextField(15);
		txtName.setBounds(120, 190, 170, 30); // ���� ��ġ ����
		txtName.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel.add(txtName); // �����гο� ����


		cbSubject = new JComboBox();
		cbSubject.setBounds(120, 230, 170, 30); // ���� ��ġ ����
		cbSubject.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		cbSubject.setBackground(Color.white);
		cbSubject.setModel(new DefaultComboBoxModel(subject));

		mainPanel.add(cbSubject); // �����гο� ����

		txtPW = new JPasswordField(15);
		txtPW.setBounds(120, 270, 170, 30); // ���� ��ġ ����
		txtPW.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel.add(txtPW); // �����гο� ����

		btnJoin = new JButton("�����ϱ�");
		btnJoin.setBounds(330, 170, 100, 90);
		btnJoin.setBackground(Color.white);
		btnJoin.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel.add(btnJoin);


		setTitle("�������б� ������û �ý��� ȸ������ ȭ��");
		setLocation(500, 200);
		setVisible(false);
		setResizable(false);
		setSize(500, 380);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Frame

	}    //������

	public void RefreshUI() {
		txtID.setText("");
		txtPW.setText("");
		txtName.setText("");

	}//RefreshUI() �ʱ�ȭ �޼ҵ�

	public void setListener(Controller Listener){
		btnJoin.addActionListener(Listener);
	}

}//JoinPanel Class