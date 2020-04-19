package javaTP;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdminFrame extends JFrame {

	JPanel leftPanel, signPanel,
			mainPanel_1, mainPanel_2;
	// ������ ī�װ� �г�, ���� ���� ǥ�� �г�, ���� �г�1,2
	//�����г� �κи� ī�� ���̾ƿ����� �ٲ�

	JLabel lblAdminName, lblMsg;
	// �������̸�,���¸޽��� ��
	JButton btn1, btn2, btn3; // ���ǽð�ǥ����, ȸ������������ȸ,�α׾ƿ� ��ư
	JButton btnSearch, btnAdd, btnDelete, btnEdit;
	Controller Listener; //��ư ������

	LoginFrame LF; //�α׾ƿ� �Ѵٸ� �ʿ��Ұ�
	//����

	JComboBox cbType, cbSubject,cbCurriculum;
	//��û�а� �̼����� ���� �޺��ڽ�
	JTextField txtSearch;
	//���� �˻��ʵ�

	String type[] = {"��ü", "�м���ȣ", "�̼�����", "�������", "������","�а���"};
	String subject[] = {"-����-", "����޸Ӵ�ƼĮ����" ,"��ǻ�Ͱ��а�", "������������"};
	String Curriculum[] = {"-����-","�����ʼ�/�����ʼ�" , "�����ʼ�" ,"��������"};
	
	String columnNames[] = {"�а�", "�ܰ���", "�м���ȣ", "�������", "������", "�̼�����", "�г�", "����", "���ǽð�", "�����ο�", "�ִ��ο�", "���ǽ�"};

	String stColumnNames[] = {"�й�", "�̸�", "����", "�ܰ���", "�����ʼ�", "�����ʼ�", "��������", "�̼�����", "���"};


	Object rowData[][] = { };
	Object rowStData[][] = { };


	DefaultTableModel SCmodel = new DefaultTableModel(rowData,columnNames);
	JTable jtSearch = new JTable(SCmodel);
	JScrollPane scrSearch = new JScrollPane(jtSearch, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	DefaultTableModel stModel = new DefaultTableModel(rowStData,stColumnNames);
	JTable jtStudent = new JTable(stModel);
	JScrollPane scrStudent = new JScrollPane(jtStudent, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	
	public AdminFrame(LoginFrame loginFrame) {
		LF = loginFrame;

		leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(250, 800));
		leftPanel.setBackground(Color.white);
		leftPanel.setLayout(null);
		leftPanel.setBounds(0, 0, 250, 800);
		add(leftPanel);

		lblAdminName = new JLabel("admin"); //�α��ν� �� �ڸ��� ID
		lblAdminName.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		lblAdminName.setSize(250, 50);
		lblAdminName.setBounds(10, 10, 190, 50);
		leftPanel.add(lblAdminName); // ���� �гο� ����

		btn1 = new JButton("���ǽð�ǥ����");
		btn1.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn1.setSize(250, 50);
		btn1.setBounds(0, 130, 250, 50);
		btn1.setBackground(Color.white);
		leftPanel.add(btn1); // �����гο� ����

		btn2 = new JButton("ȸ��������ȸ");
		btn2.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn2.setSize(250, 50);
		btn2.setBounds(0, 180, 250, 50);
		btn2.setBackground(Color.white);
		leftPanel.add(btn2); // �����гο� ����

		btn3 = new JButton("�α׾ƿ�");
		btn3.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn3.setSize(250, 50);
		btn3.setBounds(0, 410, 250, 50);
		btn3.setBackground(Color.white);
		leftPanel.add(btn3); // �����гο� ����

		signPanel = new JPanel();
		signPanel.setPreferredSize(new Dimension(950, 100));
		signPanel.setBackground(Color.white);
		signPanel.setBounds(250, 0, 950, 100);
		signPanel.setLayout(null);
		add(signPanel);

		lblMsg = new JLabel("�ȳ��ϼ���. �������б� ������û �ý��� ������ ����Դϴ�.");
		lblMsg.setSize(290, 100);
		lblMsg.setBounds(5, 0, 950, 100);
		lblMsg.setFont(new Font("�������", Font.BOLD, 30)); // ���� ��Ʈ ����
		signPanel.add(lblMsg);

		mainPanel_1 = new JPanel();
		mainPanel_1.setPreferredSize(new Dimension(950, 700));
		mainPanel_1.setBackground(Color.white);
		mainPanel_1.setBounds(250, 100, 950, 700);
		mainPanel_1.setLayout(null);
		mainPanel_1.setVisible(false);
		add(mainPanel_1);

		mainPanel_2 = new JPanel();
		mainPanel_2.setPreferredSize(new Dimension(950, 700));
		mainPanel_2.setBackground(Color.white);
		mainPanel_2.setBounds(250, 100, 950, 700);
		mainPanel_2.setLayout(null);
		mainPanel_2.setVisible(false);
		add(mainPanel_2);


		cbType = new JComboBox();
		cbType.setBounds(10, 0, 100, 30); // ���� ��ġ ����
		cbType.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		cbType.setBackground(Color.white);
		cbType.setModel(new DefaultComboBoxModel(type));
		mainPanel_1.add(cbType);

		cbSubject = new JComboBox();
		cbSubject.setBounds(120, 0, 180, 30); // ���� ��ġ ����
		cbSubject.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		cbSubject.setBackground(Color.white);
		cbSubject.setModel(new DefaultComboBoxModel(subject));
		mainPanel_1.add(cbSubject);
		cbSubject.setVisible(false);

		cbCurriculum = new JComboBox();
		cbCurriculum.setBounds(120, 0, 180, 30); // ���� ��ġ ����
		cbCurriculum.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		cbCurriculum.setBackground(Color.white);
		cbCurriculum.setModel(new DefaultComboBoxModel(Curriculum));
		mainPanel_1.add(cbCurriculum);
		cbCurriculum.setVisible(false);

		txtSearch = new JTextField(100);
		txtSearch.setBounds(310, 0, 450, 30); // ���� ��ġ ����
		txtSearch.setFont(new Font("�������",Font.BOLD,16)); // ���� ��Ʈ ����
		mainPanel_1.add(txtSearch);


		btnSearch = new JButton("�˻�");
		btnSearch.setBounds(770,0,150,30); // ���� ��ġ ����
		btnSearch.setFont(new Font("�������",Font.BOLD,16)); // ���� ��Ʈ ����
		btnSearch.setBackground(Color.white);
		mainPanel_1.add(btnSearch);

		btnAdd = new JButton("���� �߰�");
		btnAdd.setBounds(550,615,100,30); // ���� ��ġ ����
		btnAdd.setFont(new Font("�������",Font.BOLD,16)); // ���� ��Ʈ ����
		btnAdd.setBackground(Color.white);
		mainPanel_1.add(btnAdd);

		btnDelete = new JButton("���� ����");
		btnDelete.setBounds(670,615,100,30); // ���� ��ġ ����
		btnDelete.setFont(new Font("�������",Font.BOLD,16)); // ���� ��Ʈ ����
		btnDelete.setBackground(Color.white);
		mainPanel_1.add(btnDelete);

		btnEdit = new JButton("���� ����");
		btnEdit.setBounds(790,615,100,30); // ���� ��ġ ����
		btnEdit.setFont(new Font("�������",Font.BOLD,16)); // ���� ��Ʈ ����
		btnEdit.setBackground(Color.white);
		mainPanel_1.add(btnEdit);

		scrSearch.setBounds(0,50,935,550);
		mainPanel_1.add(scrSearch);

	
		jtSearch.getColumnModel().getColumn(0).setPreferredWidth(120);//�а���
		jtSearch.getColumnModel().getColumn(1).setPreferredWidth(120);//�ܰ��뼿
		jtSearch.getColumnModel().getColumn(2).setPreferredWidth(70);//�м���ȣ��
		jtSearch.getColumnModel().getColumn(3).setPreferredWidth(120);//�������
		jtSearch.getColumnModel().getColumn(4).setPreferredWidth(70);//������
		jtSearch.getColumnModel().getColumn(5).setPreferredWidth(50);//�̼����м�
		jtSearch.getColumnModel().getColumn(6).setPreferredWidth(30);//�г⼿
		jtSearch.getColumnModel().getColumn(7).setPreferredWidth(30);//������
		jtSearch.getColumnModel().getColumn(8).setPreferredWidth(150);//���ǽð���
		jtSearch.getColumnModel().getColumn(9).setPreferredWidth(60);//�����ο���
		jtSearch.getColumnModel().getColumn(10).setPreferredWidth(60);//�ִ��ο���
		jtSearch.getColumnModel().getColumn(11).setPreferredWidth(70);//���ǽǼ�
	
		jtSearch.setAutoResizeMode(0);
		 
		scrStudent.setBounds(0,50,935,550);
		mainPanel_2.add(scrStudent);

		jtStudent.getColumnModel().getColumn(0).setPreferredWidth(120);//�а���
		jtStudent.getColumnModel().getColumn(1).setPreferredWidth(120);//�ܰ��뼿
		jtStudent.getColumnModel().getColumn(2).setPreferredWidth(70);//�м���ȣ��
		jtStudent.getColumnModel().getColumn(3).setPreferredWidth(120);//�������
		jtStudent.getColumnModel().getColumn(4).setPreferredWidth(70);//������
		jtStudent.getColumnModel().getColumn(5).setPreferredWidth(50);//�̼����м�
		jtStudent.getColumnModel().getColumn(6).setPreferredWidth(30);//�г⼿
		jtStudent.getColumnModel().getColumn(7).setPreferredWidth(30);//������
		jtStudent.getColumnModel().getColumn(8).setPreferredWidth(150);//���ǽð���
		
		jtStudent.setAutoResizeMode(0);
		
		setTitle("�������б� ������û �ý��� ������ ��� ���� ȭ��");
		setLocation(200, 10);
		setVisible(false);
		setResizable(false);
		setLayout(null);
		setSize(1200, 800);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Frame


	}//AdminFrame ������

	public void refreshUI() {
		btn1.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn2.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn3.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����

		btn1.setForeground(Color.black);
		btn2.setForeground(Color.black);
		btn3.setForeground(Color.black);

		mainPanel_1.setVisible(false);
		mainPanel_2.setVisible(false);
	
		cbType.setSelectedItem(type[0]);
		cbSubject.setSelectedItem(subject[0]);
		cbCurriculum.setSelectedItem(Curriculum[0]);

	}//refreshUI() �ʱ�ȭ

	public void setListener(Controller Listener){
		btn1.addActionListener(Listener);
		btn2.addActionListener(Listener);
		btn3.addActionListener(Listener);
		cbType.addActionListener(Listener);
	}

}//AdminFrame Class