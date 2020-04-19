package javaTP;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdminFrame extends JFrame {

	JPanel leftPanel, signPanel,
			mainPanel_1, mainPanel_2;
	// 왼쪽의 카테고리 패널, 위의 상태 표시 패널, 메인 패널1,2
	//메인패널 부분만 카드 레이아웃으로 바뀜

	JLabel lblAdminName, lblMsg;
	// 관리자이름,상태메시지 라벨
	JButton btn1, btn2, btn3; // 강의시간표관리, 회원수강내역조회,로그아웃 버튼
	JButton btnSearch, btnAdd, btnDelete, btnEdit;
	Controller Listener; //버튼 리스너

	LoginFrame LF; //로그아웃 한다면 필요할것
	//선언

	JComboBox cbType, cbSubject,cbCurriculum;
	//신청학과 이수구분 선택 콤보박스
	JTextField txtSearch;
	//강의 검색필드

	String type[] = {"전체", "학수번호", "이수구분", "교과목명", "교수명","학과명"};
	String subject[] = {"-선택-", "대양휴머니티칼리지" ,"컴퓨터공학과", "디지털컨텐츠"};
	String Curriculum[] = {"-선택-","교양필수/중핵필수" , "전공필수" ,"전공선택"};
	
	String columnNames[] = {"학과", "단과대", "학수번호", "교과목명", "교수명", "이수구분", "학년", "학점", "강의시간", "현재인원", "최대인원", "강의실"};

	String stColumnNames[] = {"학번", "이름", "전공", "단과대", "교양필수", "전공필수", "전공선택", "이수학점", "비고"};


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

		lblAdminName = new JLabel("admin"); //로그인시 이 자리에 ID
		lblAdminName.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		lblAdminName.setSize(250, 50);
		lblAdminName.setBounds(10, 10, 190, 50);
		leftPanel.add(lblAdminName); // 왼쪽 패널에 삽입

		btn1 = new JButton("강의시간표관리");
		btn1.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn1.setSize(250, 50);
		btn1.setBounds(0, 130, 250, 50);
		btn1.setBackground(Color.white);
		leftPanel.add(btn1); // 왼쪽패널에 삽입

		btn2 = new JButton("회원정보조회");
		btn2.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn2.setSize(250, 50);
		btn2.setBounds(0, 180, 250, 50);
		btn2.setBackground(Color.white);
		leftPanel.add(btn2); // 왼쪽패널에 삽입

		btn3 = new JButton("로그아웃");
		btn3.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn3.setSize(250, 50);
		btn3.setBounds(0, 410, 250, 50);
		btn3.setBackground(Color.white);
		leftPanel.add(btn3); // 왼쪽패널에 삽입

		signPanel = new JPanel();
		signPanel.setPreferredSize(new Dimension(950, 100));
		signPanel.setBackground(Color.white);
		signPanel.setBounds(250, 0, 950, 100);
		signPanel.setLayout(null);
		add(signPanel);

		lblMsg = new JLabel("안녕하세요. 세종대학교 수강신청 시스템 관리자 모드입니다.");
		lblMsg.setSize(290, 100);
		lblMsg.setBounds(5, 0, 950, 100);
		lblMsg.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
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
		cbType.setBounds(10, 0, 100, 30); // 글자 위치 설정
		cbType.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		cbType.setBackground(Color.white);
		cbType.setModel(new DefaultComboBoxModel(type));
		mainPanel_1.add(cbType);

		cbSubject = new JComboBox();
		cbSubject.setBounds(120, 0, 180, 30); // 글자 위치 설정
		cbSubject.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		cbSubject.setBackground(Color.white);
		cbSubject.setModel(new DefaultComboBoxModel(subject));
		mainPanel_1.add(cbSubject);
		cbSubject.setVisible(false);

		cbCurriculum = new JComboBox();
		cbCurriculum.setBounds(120, 0, 180, 30); // 글자 위치 설정
		cbCurriculum.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		cbCurriculum.setBackground(Color.white);
		cbCurriculum.setModel(new DefaultComboBoxModel(Curriculum));
		mainPanel_1.add(cbCurriculum);
		cbCurriculum.setVisible(false);

		txtSearch = new JTextField(100);
		txtSearch.setBounds(310, 0, 450, 30); // 글자 위치 설정
		txtSearch.setFont(new Font("나눔고딕",Font.BOLD,16)); // 글자 폰트 설정
		mainPanel_1.add(txtSearch);


		btnSearch = new JButton("검색");
		btnSearch.setBounds(770,0,150,30); // 글자 위치 설정
		btnSearch.setFont(new Font("나눔고딕",Font.BOLD,16)); // 글자 폰트 설정
		btnSearch.setBackground(Color.white);
		mainPanel_1.add(btnSearch);

		btnAdd = new JButton("강의 추가");
		btnAdd.setBounds(550,615,100,30); // 글자 위치 설정
		btnAdd.setFont(new Font("나눔고딕",Font.BOLD,16)); // 글자 폰트 설정
		btnAdd.setBackground(Color.white);
		mainPanel_1.add(btnAdd);

		btnDelete = new JButton("강의 삭제");
		btnDelete.setBounds(670,615,100,30); // 글자 위치 설정
		btnDelete.setFont(new Font("나눔고딕",Font.BOLD,16)); // 글자 폰트 설정
		btnDelete.setBackground(Color.white);
		mainPanel_1.add(btnDelete);

		btnEdit = new JButton("강의 수정");
		btnEdit.setBounds(790,615,100,30); // 글자 위치 설정
		btnEdit.setFont(new Font("나눔고딕",Font.BOLD,16)); // 글자 폰트 설정
		btnEdit.setBackground(Color.white);
		mainPanel_1.add(btnEdit);

		scrSearch.setBounds(0,50,935,550);
		mainPanel_1.add(scrSearch);

	
		jtSearch.getColumnModel().getColumn(0).setPreferredWidth(120);//학과셀
		jtSearch.getColumnModel().getColumn(1).setPreferredWidth(120);//단과대셀
		jtSearch.getColumnModel().getColumn(2).setPreferredWidth(70);//학수번호셀
		jtSearch.getColumnModel().getColumn(3).setPreferredWidth(120);//교과목명셀
		jtSearch.getColumnModel().getColumn(4).setPreferredWidth(70);//교수명셀
		jtSearch.getColumnModel().getColumn(5).setPreferredWidth(50);//이수구분셀
		jtSearch.getColumnModel().getColumn(6).setPreferredWidth(30);//학년셀
		jtSearch.getColumnModel().getColumn(7).setPreferredWidth(30);//학점셀
		jtSearch.getColumnModel().getColumn(8).setPreferredWidth(150);//강의시간셀
		jtSearch.getColumnModel().getColumn(9).setPreferredWidth(60);//현재인원셀
		jtSearch.getColumnModel().getColumn(10).setPreferredWidth(60);//최대인원셀
		jtSearch.getColumnModel().getColumn(11).setPreferredWidth(70);//강의실셀
	
		jtSearch.setAutoResizeMode(0);
		 
		scrStudent.setBounds(0,50,935,550);
		mainPanel_2.add(scrStudent);

		jtStudent.getColumnModel().getColumn(0).setPreferredWidth(120);//학과셀
		jtStudent.getColumnModel().getColumn(1).setPreferredWidth(120);//단과대셀
		jtStudent.getColumnModel().getColumn(2).setPreferredWidth(70);//학수번호셀
		jtStudent.getColumnModel().getColumn(3).setPreferredWidth(120);//교과목명셀
		jtStudent.getColumnModel().getColumn(4).setPreferredWidth(70);//교수명셀
		jtStudent.getColumnModel().getColumn(5).setPreferredWidth(50);//이수구분셀
		jtStudent.getColumnModel().getColumn(6).setPreferredWidth(30);//학년셀
		jtStudent.getColumnModel().getColumn(7).setPreferredWidth(30);//학점셀
		jtStudent.getColumnModel().getColumn(8).setPreferredWidth(150);//강의시간셀
		
		jtStudent.setAutoResizeMode(0);
		
		setTitle("세종대학교 수강신청 시스템 관리자 모드 메인 화면");
		setLocation(200, 10);
		setVisible(false);
		setResizable(false);
		setLayout(null);
		setSize(1200, 800);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Frame


	}//AdminFrame 생성자

	public void refreshUI() {
		btn1.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn2.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn3.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정

		btn1.setForeground(Color.black);
		btn2.setForeground(Color.black);
		btn3.setForeground(Color.black);

		mainPanel_1.setVisible(false);
		mainPanel_2.setVisible(false);
	
		cbType.setSelectedItem(type[0]);
		cbSubject.setSelectedItem(subject[0]);
		cbCurriculum.setSelectedItem(Curriculum[0]);

	}//refreshUI() 초기화

	public void setListener(Controller Listener){
		btn1.addActionListener(Listener);
		btn2.addActionListener(Listener);
		btn3.addActionListener(Listener);
		cbType.addActionListener(Listener);
	}

}//AdminFrame Class