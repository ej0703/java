package javaTP;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginFrame extends JFrame {
	JPanel mainPanel; // ���� �г�
	JLabel lblTitle1, lblTitle2, lblID, lblPW, lbl; // Ÿ��Ʋ, ���̵�, ��й�ȣ ��
	JButton btnLogin, btnJoin; // �α���, ȸ������ ��ư
	JTextField txtID;
	JPasswordField txtPW;// ���̵�, ��й�ȣ �Է�â
	Controller Listener; //�α��� �� ȸ������ Ȯ�� ������
	JoinFrame JF; // ȸ������ ������
	MainFrame MF; // ���� ������
	AdminFrame AF;// �����ڿ� ������

	//����

	public LoginFrame() {

		JF = new JoinFrame(this);
		MF = new MainFrame(this, new CourseDAO());
		AF = new AdminFrame(this);
		Listener = new Controller(this, MF, JF, AF);

		JF.setListener(Listener);
		MF.setListener(Listener);
		AF.setListener(Listener);

		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(600, 400));
		mainPanel.setBackground(Color.white);
		mainPanel.setLayout(null);
		add(mainPanel);

		lblTitle1 = new JLabel("�������б�");
		lblTitle1.setBounds(185, 25, 500, 100); // ���� ��ġ ����
		lblTitle1.setFont(new Font("�������", Font.BOLD, 50)); // ���� ��Ʈ ����
		mainPanel.add(lblTitle1); // �����гο� ����

		lblTitle2 = new JLabel("������û �ý���");
		lblTitle2.setBounds(125, 90, 500, 100); // ���� ��ġ ����
		lblTitle2.setFont(new Font("�������", Font.BOLD, 50)); // ���� ��Ʈ ����
		mainPanel.add(lblTitle2); // �����гο� ����

		lblID = new JLabel("ID");
		lblID.setBounds(45, 180, 500, 100); // ���� ��ġ ����
		lblID.setFont(new Font("�������", Font.BOLD, 36)); // ���� ��Ʈ ����
		mainPanel.add(lblID); // �����гο� ����

		lblPW = new JLabel("PW");
		lblPW.setBounds(45, 230, 500, 100); // ���� ��ġ ����
		lblPW.setFont(new Font("�������", Font.BOLD, 36)); // ���� ��Ʈ ����
		mainPanel.add(lblPW); // �����гο� ����

		txtID = new JTextField(12);
		txtID.setBounds(135, 210, 170, 40); // ���� ��ġ ����
		txtID.setFont(new Font("�������", Font.BOLD, 26)); // ���� ��Ʈ ����
		mainPanel.add(txtID); // �����гο� ����

		txtPW = new JPasswordField(12);
		txtPW.setBounds(135, 260, 170, 40); // ���� ��ġ ����
		txtPW.setFont(new Font("�������", Font.BOLD, 26)); // ���� ��Ʈ ����
		mainPanel.add(txtPW); // �����гο� ����

		btnLogin = new JButton("�α���");
		btnLogin.setBounds(325, 210, 100, 90);
		btnLogin.setBackground(Color.white);
		btnLogin.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel.add(btnLogin);

		btnJoin = new JButton("ȸ������");
		btnJoin.setBounds(435, 210, 100, 90);
		btnJoin.setBackground(Color.white);
		btnJoin.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel.add(btnJoin);

		lbl = new JLabel("��ü���⼳���� 2��");
		lbl.setBounds(465, 300, 500, 100); // ���� ��ġ ����
		lbl.setFont(new Font("�������", Font.BOLD, 12)); // ���� ��Ʈ ����
		mainPanel.add(lbl); // �����гο� ����

		btnLogin.addActionListener(Listener);
		btnJoin.addActionListener(Listener);

		setTitle("�������б� ������û �ý��� �α��� ȭ��");
		setLocation(500, 200);
		setVisible(true);
		setResizable(false);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Frame

	} //LoginPanel ������

	public void RefreshUI() {
		txtID.setText("");
		txtPW.setText("");

	}//RefreshUI() �ʱ�ȭ �޼ҵ�
}//LoginPanel Class