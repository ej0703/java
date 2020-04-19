package javaTP;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class MainFrame extends JFrame {

	JPanel leftPanel, signPanel,
			mainPanel_1, mainPanel_2, mainPanel_3, mainPanel_4, mainPanel_5;
	// ������ ī�װ� �г�, ���� ���� ǥ�� �г�, ���� �г�12345
	//�����г� �κи� ī�� ���̾ƿ����� �ٲ�

	JLabel lblStNum, lblStName, lblMsg;
	// �й�,�̸�,���¸޽��� ��
	JLabel lblNowScore, lblTotalScore;
	//�а� ���� ,��û����, ��ü���� ��(Main1)
	JLabel lblPrevPW, lblNewPW, lblNewPW2;
	//�����ʼ�, �����ʼ�, ��������, �������
	JLabel lbl1, lbl1Num, lbl2, lbl2Num, lbl3, lbl3Num, lbl4, lbl4Num;
	//ȸ�����������г�(Main5) ��
	JButton btn1, btn2, btn3, btn4, btn5, btn6;
	// ������û~ȸ���������� ��ư

	JButton btnSearch;
	//������û ���ǰ˻���ư(Main1)
	JButton btnEdit;
	//ȸ������ ����Ȯ�ι�ư(Main5)

	JPasswordField txtPrevPW, txtNewPW, txtNewPW2;
	//ȸ�����������г�(Main5) �н������ʵ�

	Controller Listener; //��ư ������

	JComboBox cbType, cbSubject,cbCurriculum;
	//��û�а����� �޺��ڽ�
	JTextField txtSearch;
	//���� �˻��ʵ�
	LoginFrame LF; //�α׾ƿ��ϸ� �α��� ȭ������ ���ư���
	CourseDAO cou; //��Ʈ�ѷ�

	//����

	String type[] = {"- ��ü -", "�м���ȣ", "�̼�����", "�������", "������","�а���"};
	String subject[] = {"- ��ü -", "����޸Ӵ�ƼĮ����" ,"��ǻ�Ͱ��а�", "������������"};
	String Curriculum[] = {"- ��ü -","�����ʼ�/�����ʼ�" , "�����ʼ�" ,"��������"};
	

	String columnNames[] = {"�а�", "�ܰ���", "�м���ȣ", "�������", "������", "�̼�����", "�г�", "����", "���ǽð�", "�����ο�", "�ִ��ο�", "���ǽ�"};

	Object rowData[][] = {};

	DefaultTableModel SCmodel = new DefaultTableModel(rowData, columnNames)  //���̺� �� ����
	{
		@Override

		public boolean isCellEditable(int row11, int column11) {

			return false;

		}
	};
	JTable jtSearch = new JTable(SCmodel);
	JScrollPane scrSearch = new JScrollPane(jtSearch, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	//��ȸ�� ���̺� ��

	DefaultTableModel myModel = new DefaultTableModel(rowData, columnNames)  //���̺� �� ����
	{
		@Override

		public boolean isCellEditable(int row11, int column11) {

			return false;

		}
	};
	JTable myJt = new JTable(myModel);
	JScrollPane myScr = new JScrollPane(myJt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	//���� ���̺� ��

	Controller controller;


	public MainFrame(LoginFrame loginFrame, CourseDAO cou) {
		LF = loginFrame;
		this.cou = cou;


		leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(250, 800));
		leftPanel.setBackground(Color.white);
		leftPanel.setLayout(null);
		leftPanel.setBounds(0, 0, 250, 800);
		add(leftPanel);

		lblStNum = new JLabel("�й�"); //�α��ν� �� �ڸ��� ID
		lblStNum.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		lblStNum.setSize(250, 50);
		lblStNum.setBounds(10, 10, 190, 50);
		leftPanel.add(lblStNum); // ���� �гο� ����

		lblStName = new JLabel("�̸�"); //�α��ν� �� �ڸ��� �̸�
		lblStName.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		lblStName.setSize(250, 50);
		lblStName.setBounds(10, 60, 190, 50);
		leftPanel.add(lblStName); // �����гο� ����

		btn1 = new JButton("������û");
		btn1.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn1.setSize(250, 50);
		btn1.setBounds(0, 130, 250, 50);
		btn1.setBackground(Color.white);
		leftPanel.add(btn1); // �����гο� ����

		btn2 = new JButton("���ǽð�ǥ��ȸ");
		btn2.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn2.setSize(250, 50);
		btn2.setBounds(0, 180, 250, 50);
		btn2.setBackground(Color.white);
		leftPanel.add(btn2); // �����гο� ����

		btn3 = new JButton("����������ȸ");
		btn3.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn3.setSize(250, 50);
		btn3.setBounds(0, 230, 250, 50);
		btn3.setBackground(Color.white);
		leftPanel.add(btn3); // �����гο� ����

		btn4 = new JButton("���ɰ�����");
		btn4.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn4.setSize(250, 50);
		btn4.setBounds(0, 280, 250, 50);
		btn4.setBackground(Color.white);
		leftPanel.add(btn4); // �����гο� ����

		btn5 = new JButton("ȸ����������");
		btn5.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn5.setSize(250, 50);
		btn5.setBounds(0, 360, 250, 50);
		btn5.setBackground(Color.white);
		leftPanel.add(btn5); // �����гο� ����

		btn6 = new JButton("�α׾ƿ�");
		btn6.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn6.setSize(250, 50);
		btn6.setBounds(0, 410, 250, 50);
		btn6.setBackground(Color.white);
		leftPanel.add(btn6); // �����гο� ����

		signPanel = new JPanel();
		signPanel.setPreferredSize(new Dimension(950, 100));
		signPanel.setBackground(Color.white);
		signPanel.setBounds(250, 0, 950, 100);
		signPanel.setLayout(null);
		add(signPanel);

		lblMsg = new JLabel("�ȳ��ϼ���. �������б� ������û �ý����Դϴ�.");
		lblMsg.setSize(290, 100);
		lblMsg.setBounds(5, 0, 950, 100);
		lblMsg.setFont(new Font("�������", Font.BOLD, 30)); // ���� ��Ʈ ����
		signPanel.add(lblMsg);

		lblNowScore = new JLabel("0");
		lblNowScore.setBounds(680, 30, 950, 100);
		lblNowScore.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		lblNowScore.setForeground(Color.red);
		lblNowScore.setVisible(false);
		signPanel.add(lblNowScore);


		lblTotalScore = new JLabel("/18(�����û����/�ִ��������)");
		lblTotalScore.setBounds(700, 30, 950, 100);
		lblTotalScore.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		lblTotalScore.setVisible(false);
		signPanel.add(lblTotalScore);


		mainPanel_1 = new JPanel();
		mainPanel_1.setPreferredSize(new Dimension(950, 700));
		mainPanel_1.setBackground(Color.white);
		mainPanel_1.setBounds(250, 100, 950, 700);
		mainPanel_1.setLayout(null);
		mainPanel_1.setVisible(false);
		add(mainPanel_1);

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
		txtSearch.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel_1.add(txtSearch);


		btnSearch = new JButton("�˻�");
		btnSearch.setBounds(770, 0, 150, 30); // ���� ��ġ ����
		btnSearch.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		btnSearch.setBackground(Color.white);
		mainPanel_1.add(btnSearch);

		scrSearch.setBounds(0, 50, 935, 300);
		jtSearch.setSize(935, 300);
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

		jtSearch.setAutoResizeMode(0); //���̺� ũ�� �ڵ� ���� ����
		 	
		myScr.setBounds(0, 415, 935, 250);
		mainPanel_1.add(myScr);

		myJt.getColumnModel().getColumn(0).setPreferredWidth(120);//�а���
		myJt.getColumnModel().getColumn(1).setPreferredWidth(120);//�ܰ��뼿
		myJt.getColumnModel().getColumn(2).setPreferredWidth(70);//�м���ȣ��
		myJt.getColumnModel().getColumn(3).setPreferredWidth(120);//�������
		myJt.getColumnModel().getColumn(4).setPreferredWidth(70);//������
		myJt.getColumnModel().getColumn(5).setPreferredWidth(50);//�̼����м�
		myJt.getColumnModel().getColumn(6).setPreferredWidth(30);//�г⼿
		myJt.getColumnModel().getColumn(7).setPreferredWidth(30);//������
		myJt.getColumnModel().getColumn(8).setPreferredWidth(150);//���ǽð���
		myJt.getColumnModel().getColumn(9).setPreferredWidth(60);//�����ο���
		myJt.getColumnModel().getColumn(10).setPreferredWidth(60);//�ִ��ο���
		myJt.getColumnModel().getColumn(11).setPreferredWidth(70);//���ǽǼ�
		
		myJt.setAutoResizeMode(0);

		mainPanel_2 = new JPanel();
		mainPanel_2.setPreferredSize(new Dimension(950, 700));
		mainPanel_2.setBackground(Color.white);
		mainPanel_2.setBounds(250, 100, 950, 700);
		mainPanel_2.setLayout(null);
		mainPanel_2.setVisible(false);
		add(mainPanel_2);

		mainPanel_3 = new JPanel();
		mainPanel_3.setPreferredSize(new Dimension(950, 700));
		mainPanel_3.setBackground(Color.white);
		mainPanel_3.setBounds(250, 100, 950, 700);
		mainPanel_3.setLayout(null);
		mainPanel_3.setVisible(false);
		add(mainPanel_3);

		mainPanel_4 = new JPanel();
		mainPanel_4.setPreferredSize(new Dimension(950, 700));
		mainPanel_4.setBackground(Color.white);
		mainPanel_4.setBounds(250, 100, 950, 700);
		mainPanel_4.setLayout(null);
		mainPanel_4.setVisible(false);
		add(mainPanel_4);

		mainPanel_5 = new JPanel();
		mainPanel_5.setPreferredSize(new Dimension(950, 700));
		mainPanel_5.setBackground(Color.white);
		mainPanel_5.setLayout(null);
		mainPanel_5.setBounds(250, 100, 950, 700);
		mainPanel_5.setVisible(false);
		add(mainPanel_5);

		lblPrevPW = new JLabel("���� PW");
		lblPrevPW.setBounds(200, 200, 150, 50);
		lblPrevPW.setFont(new Font("�������", Font.BOLD, 30)); // ���� ��Ʈ ����
		mainPanel_5.add(lblPrevPW); // ���� �гο� ����

		lblNewPW = new JLabel("���� PW");
		lblNewPW.setBounds(200, 250, 150, 50);
		lblNewPW.setFont(new Font("�������", Font.BOLD, 30)); // ���� ��Ʈ ����
		mainPanel_5.add(lblNewPW); // ���� �гο� ����

		lblNewPW2 = new JLabel("Ȯ�� PW");
		lblNewPW2.setBounds(200, 300, 150, 50);
		lblNewPW2.setFont(new Font("�������", Font.BOLD, 30)); // ���� ��Ʈ ����
		mainPanel_5.add(lblNewPW2); // ���� �гο� ����

		txtPrevPW = new JPasswordField(15);
		txtPrevPW.setBounds(330, 210, 170, 40); // ���� ��ġ ����
		txtPrevPW.setFont(new Font("�������", Font.BOLD, 26)); // ���� ��Ʈ ����
		mainPanel_5.add(txtPrevPW);

		txtNewPW = new JPasswordField(15);
		txtNewPW.setBounds(330, 260, 170, 40); // ���� ��ġ ����
		txtNewPW.setFont(new Font("�������", Font.BOLD, 26)); // ���� ��Ʈ ����
		mainPanel_5.add(txtNewPW);

		txtNewPW2 = new JPasswordField(15);
		txtNewPW2.setBounds(330, 310, 170, 40); // ���� ��ġ ����
		txtNewPW2.setFont(new Font("�������", Font.BOLD, 26)); // ���� ��Ʈ ����
		mainPanel_5.add(txtNewPW2);

		btnEdit = new JButton("����");
		btnEdit.setFont(new Font("�������", Font.PLAIN, 30)); // ���� ��Ʈ ����
		btnEdit.setSize(150, 50);
		btnEdit.setBounds(300, 360, 150, 50);
		btnEdit.setBackground(Color.white);
		mainPanel_5.add(btnEdit); // �����гο� ����

		lbl1 = new JLabel("�����ʼ�/�����ʼ�");
		lbl1.setBounds(30, 330, 950, 100);
		lbl1.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel_3.add(lbl1);
		//�����ʼ� �����ʼ�

		lbl1Num = new JLabel("0");
		lbl1Num.setBounds(180, 330, 950, 100);
		lbl1Num.setForeground(Color.blue);
		lbl1Num.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel_3.add(lbl1Num);
		//�����ʼ� �����ʼ� �̼����� (DB���� �޾ƿ;���)

		lbl2 = new JLabel("�����ʼ�");
		lbl2.setBounds(210, 330, 950, 100);
		lbl2.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel_3.add(lbl2);


		lbl2Num = new JLabel("0");
		lbl2Num.setBounds(290, 330, 950, 100);
		lbl2Num.setForeground(Color.blue);
		lbl2Num.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel_3.add(lbl2Num);

		lbl3 = new JLabel("��������");
		lbl3.setBounds(320, 330, 950, 100);
		lbl3.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel_3.add(lbl3);


		lbl3Num = new JLabel("0");
		lbl3Num.setBounds(400, 330, 950, 100);
		lbl3Num.setForeground(Color.blue);
		lbl3Num.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel_3.add(lbl3Num);

		lbl4 = new JLabel("�������");
		lbl4.setBounds(430, 330, 950, 100);
		lbl4.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel_3.add(lbl4);


		lbl4Num = new JLabel("0");
		lbl4Num.setBounds(520, 330, 950, 100);
		lbl4Num.setForeground(Color.blue);
		lbl4Num.setFont(new Font("�������", Font.BOLD, 16)); // ���� ��Ʈ ����
		mainPanel_3.add(lbl4Num);


		setTitle("�������б� ������û �ý��� ���� ȭ��");
		setLocation(200, 10);
		setVisible(false);
		setResizable(false);
		setLayout(null);
		setSize(1200, 800);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Frame
	}//������


	public void refreshUI() {
		btn1.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn2.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn3.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn4.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����
		btn5.setFont(new Font("�������", Font.PLAIN, 25)); // ���� ��Ʈ ����

		btn1.setForeground(Color.black);
		btn2.setForeground(Color.black);
		btn3.setForeground(Color.black);
		btn4.setForeground(Color.black);
		btn5.setForeground(Color.black);

		mainPanel_1.setVisible(false);
		mainPanel_2.setVisible(false);
		mainPanel_3.setVisible(false);
		mainPanel_4.setVisible(false);
		mainPanel_5.setVisible(false);

		lblNowScore.setVisible(false);
		lblTotalScore.setVisible(false);

		lblMsg.setText("�ȳ��ϼ���. �������б� ������û �ý����Դϴ�.");
		cbType.setSelectedItem(type[0]);
		cbSubject.setSelectedItem(subject[0]);
		cbCurriculum.setSelectedItem(Curriculum[0]);
			
	}//refreshUI() �ʱ�ȭ

	public void refreshData() throws SQLException {
		ArrayList<Courses> datas;


		clearField();

		datas = cou.getAll();

		//�����͸� �����ϸ� �޺��ڽ� ������ ����
		if (datas != null) {
			// ArrayList�� ��ü �����͸� ���Ŀ� ���� ���

			for (Courses c : datas) {
				Object rowDatas[] = {c.getMajor(), c.getCollege(), c.getCourseNumber(), c.getCourseName(), c.getProfessor(), c.getCurriculum(), c.getGrade(), c.getCredit(), c.getCourseTime(), c.getParticipants(), c.getMaxParticipants(), c.getLocation()};
				SCmodel.addRow(rowDatas);
				//System.out.println("asdasd");
			}
		} else {

		}
	}

	public void setListener(Controller Listener){
		btn1.addActionListener(Listener);
		btn2.addActionListener(Listener);
		btn3.addActionListener(Listener);
		btn4.addActionListener(Listener);
		btn5.addActionListener(Listener);
		btn6.addActionListener(Listener);
		btnEdit.addActionListener(Listener);
		cbType.addActionListener(Listener);
		btnSearch.addActionListener(Listener);
	}

	public void clearField() {
		SCmodel.setNumRows(0);
	}
}//MainFrame Class