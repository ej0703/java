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
	// 왼쪽의 카테고리 패널, 위의 상태 표시 패널, 메인 패널12345
	//메인패널 부분만 카드 레이아웃으로 바뀜

	JLabel lblStNum, lblStName, lblMsg;
	// 학번,이름,상태메시지 라벨
	JLabel lblNowScore, lblTotalScore;
	//학과 선택 ,신청학점, 전체학점 라벨(Main1)
	JLabel lblPrevPW, lblNewPW, lblNewPW2;
	//교양필수, 전공필수, 전공선택, 취득학점
	JLabel lbl1, lbl1Num, lbl2, lbl2Num, lbl3, lbl3Num, lbl4, lbl4Num;
	//회원정보수정패널(Main5) 라벨
	JButton btn1, btn2, btn3, btn4, btn5, btn6;
	// 수강신청~회원정보수정 버튼

	JButton btnSearch;
	//수강신청 강의검색버튼(Main1)
	JButton btnEdit;
	//회원정보 변경확인버튼(Main5)

	JPasswordField txtPrevPW, txtNewPW, txtNewPW2;
	//회원정보수정패널(Main5) 패스워드필드

	Controller Listener; //버튼 리스너

	JComboBox cbType, cbSubject,cbCurriculum;
	//신청학과선택 콤보박스
	JTextField txtSearch;
	//강의 검색필드
	LoginFrame LF; //로그아웃하면 로그인 화면으로 돌아가기
	CourseDAO cou; //컨트롤러

	//선언

	String type[] = {"- 전체 -", "학수번호", "이수구분", "교과목명", "교수명","학과명"};
	String subject[] = {"- 전체 -", "대양휴머니티칼리지" ,"컴퓨터공학과", "디지털컨텐츠"};
	String Curriculum[] = {"- 전체 -","교양필수/중핵필수" , "전공필수" ,"전공선택"};
	

	String columnNames[] = {"학과", "단과대", "학수번호", "교과목명", "교수명", "이수구분", "학년", "학점", "강의시간", "현재인원", "최대인원", "강의실"};

	Object rowData[][] = {};

	DefaultTableModel SCmodel = new DefaultTableModel(rowData, columnNames)  //테이블 모델 생성
	{
		@Override

		public boolean isCellEditable(int row11, int column11) {

			return false;

		}
	};
	JTable jtSearch = new JTable(SCmodel);
	JScrollPane scrSearch = new JScrollPane(jtSearch, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	//조회용 테이블 모델

	DefaultTableModel myModel = new DefaultTableModel(rowData, columnNames)  //테이블 모델 생성
	{
		@Override

		public boolean isCellEditable(int row11, int column11) {

			return false;

		}
	};
	JTable myJt = new JTable(myModel);
	JScrollPane myScr = new JScrollPane(myJt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	//나의 테이블 모델

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

		lblStNum = new JLabel("학번"); //로그인시 이 자리에 ID
		lblStNum.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		lblStNum.setSize(250, 50);
		lblStNum.setBounds(10, 10, 190, 50);
		leftPanel.add(lblStNum); // 왼쪽 패널에 삽입

		lblStName = new JLabel("이름"); //로그인시 이 자리에 이름
		lblStName.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		lblStName.setSize(250, 50);
		lblStName.setBounds(10, 60, 190, 50);
		leftPanel.add(lblStName); // 왼쪽패널에 삽입

		btn1 = new JButton("수강신청");
		btn1.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn1.setSize(250, 50);
		btn1.setBounds(0, 130, 250, 50);
		btn1.setBackground(Color.white);
		leftPanel.add(btn1); // 왼쪽패널에 삽입

		btn2 = new JButton("강의시간표조회");
		btn2.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn2.setSize(250, 50);
		btn2.setBounds(0, 180, 250, 50);
		btn2.setBackground(Color.white);
		leftPanel.add(btn2); // 왼쪽패널에 삽입

		btn3 = new JButton("수강내역조회");
		btn3.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn3.setSize(250, 50);
		btn3.setBounds(0, 230, 250, 50);
		btn3.setBackground(Color.white);
		leftPanel.add(btn3); // 왼쪽패널에 삽입

		btn4 = new JButton("관심과목담기");
		btn4.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn4.setSize(250, 50);
		btn4.setBounds(0, 280, 250, 50);
		btn4.setBackground(Color.white);
		leftPanel.add(btn4); // 왼쪽패널에 삽입

		btn5 = new JButton("회원정보수정");
		btn5.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn5.setSize(250, 50);
		btn5.setBounds(0, 360, 250, 50);
		btn5.setBackground(Color.white);
		leftPanel.add(btn5); // 왼쪽패널에 삽입

		btn6 = new JButton("로그아웃");
		btn6.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn6.setSize(250, 50);
		btn6.setBounds(0, 410, 250, 50);
		btn6.setBackground(Color.white);
		leftPanel.add(btn6); // 왼쪽패널에 삽입

		signPanel = new JPanel();
		signPanel.setPreferredSize(new Dimension(950, 100));
		signPanel.setBackground(Color.white);
		signPanel.setBounds(250, 0, 950, 100);
		signPanel.setLayout(null);
		add(signPanel);

		lblMsg = new JLabel("안녕하세요. 세종대학교 수강신청 시스템입니다.");
		lblMsg.setSize(290, 100);
		lblMsg.setBounds(5, 0, 950, 100);
		lblMsg.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
		signPanel.add(lblMsg);

		lblNowScore = new JLabel("0");
		lblNowScore.setBounds(680, 30, 950, 100);
		lblNowScore.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		lblNowScore.setForeground(Color.red);
		lblNowScore.setVisible(false);
		signPanel.add(lblNowScore);


		lblTotalScore = new JLabel("/18(현재신청학점/최대수강학점)");
		lblTotalScore.setBounds(700, 30, 950, 100);
		lblTotalScore.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
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
		txtSearch.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel_1.add(txtSearch);


		btnSearch = new JButton("검색");
		btnSearch.setBounds(770, 0, 150, 30); // 글자 위치 설정
		btnSearch.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		btnSearch.setBackground(Color.white);
		mainPanel_1.add(btnSearch);

		scrSearch.setBounds(0, 50, 935, 300);
		jtSearch.setSize(935, 300);
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

		jtSearch.setAutoResizeMode(0); //테이블 크기 자동 조절 끄기
		 	
		myScr.setBounds(0, 415, 935, 250);
		mainPanel_1.add(myScr);

		myJt.getColumnModel().getColumn(0).setPreferredWidth(120);//학과셀
		myJt.getColumnModel().getColumn(1).setPreferredWidth(120);//단과대셀
		myJt.getColumnModel().getColumn(2).setPreferredWidth(70);//학수번호셀
		myJt.getColumnModel().getColumn(3).setPreferredWidth(120);//교과목명셀
		myJt.getColumnModel().getColumn(4).setPreferredWidth(70);//교수명셀
		myJt.getColumnModel().getColumn(5).setPreferredWidth(50);//이수구분셀
		myJt.getColumnModel().getColumn(6).setPreferredWidth(30);//학년셀
		myJt.getColumnModel().getColumn(7).setPreferredWidth(30);//학점셀
		myJt.getColumnModel().getColumn(8).setPreferredWidth(150);//강의시간셀
		myJt.getColumnModel().getColumn(9).setPreferredWidth(60);//현재인원셀
		myJt.getColumnModel().getColumn(10).setPreferredWidth(60);//최대인원셀
		myJt.getColumnModel().getColumn(11).setPreferredWidth(70);//강의실셀
		
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

		lblPrevPW = new JLabel("현재 PW");
		lblPrevPW.setBounds(200, 200, 150, 50);
		lblPrevPW.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
		mainPanel_5.add(lblPrevPW); // 왼쪽 패널에 삽입

		lblNewPW = new JLabel("변경 PW");
		lblNewPW.setBounds(200, 250, 150, 50);
		lblNewPW.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
		mainPanel_5.add(lblNewPW); // 왼쪽 패널에 삽입

		lblNewPW2 = new JLabel("확인 PW");
		lblNewPW2.setBounds(200, 300, 150, 50);
		lblNewPW2.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
		mainPanel_5.add(lblNewPW2); // 왼쪽 패널에 삽입

		txtPrevPW = new JPasswordField(15);
		txtPrevPW.setBounds(330, 210, 170, 40); // 글자 위치 설정
		txtPrevPW.setFont(new Font("나눔고딕", Font.BOLD, 26)); // 글자 폰트 설정
		mainPanel_5.add(txtPrevPW);

		txtNewPW = new JPasswordField(15);
		txtNewPW.setBounds(330, 260, 170, 40); // 글자 위치 설정
		txtNewPW.setFont(new Font("나눔고딕", Font.BOLD, 26)); // 글자 폰트 설정
		mainPanel_5.add(txtNewPW);

		txtNewPW2 = new JPasswordField(15);
		txtNewPW2.setBounds(330, 310, 170, 40); // 글자 위치 설정
		txtNewPW2.setFont(new Font("나눔고딕", Font.BOLD, 26)); // 글자 폰트 설정
		mainPanel_5.add(txtNewPW2);

		btnEdit = new JButton("변경");
		btnEdit.setFont(new Font("나눔고딕", Font.PLAIN, 30)); // 글자 폰트 설정
		btnEdit.setSize(150, 50);
		btnEdit.setBounds(300, 360, 150, 50);
		btnEdit.setBackground(Color.white);
		mainPanel_5.add(btnEdit); // 왼쪽패널에 삽입

		lbl1 = new JLabel("교양필수/중핵필수");
		lbl1.setBounds(30, 330, 950, 100);
		lbl1.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel_3.add(lbl1);
		//교양필수 중핵필수

		lbl1Num = new JLabel("0");
		lbl1Num.setBounds(180, 330, 950, 100);
		lbl1Num.setForeground(Color.blue);
		lbl1Num.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel_3.add(lbl1Num);
		//교양필수 중핵필수 이수점수 (DB에서 받아와야함)

		lbl2 = new JLabel("전공필수");
		lbl2.setBounds(210, 330, 950, 100);
		lbl2.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel_3.add(lbl2);


		lbl2Num = new JLabel("0");
		lbl2Num.setBounds(290, 330, 950, 100);
		lbl2Num.setForeground(Color.blue);
		lbl2Num.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel_3.add(lbl2Num);

		lbl3 = new JLabel("전공선택");
		lbl3.setBounds(320, 330, 950, 100);
		lbl3.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel_3.add(lbl3);


		lbl3Num = new JLabel("0");
		lbl3Num.setBounds(400, 330, 950, 100);
		lbl3Num.setForeground(Color.blue);
		lbl3Num.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel_3.add(lbl3Num);

		lbl4 = new JLabel("취득학점");
		lbl4.setBounds(430, 330, 950, 100);
		lbl4.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel_3.add(lbl4);


		lbl4Num = new JLabel("0");
		lbl4Num.setBounds(520, 330, 950, 100);
		lbl4Num.setForeground(Color.blue);
		lbl4Num.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel_3.add(lbl4Num);


		setTitle("세종대학교 수강신청 시스템 메인 화면");
		setLocation(200, 10);
		setVisible(false);
		setResizable(false);
		setLayout(null);
		setSize(1200, 800);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Frame
	}//생성자


	public void refreshUI() {
		btn1.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn2.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn3.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn4.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정
		btn5.setFont(new Font("나눔고딕", Font.PLAIN, 25)); // 글자 폰트 설정

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

		lblMsg.setText("안녕하세요. 세종대학교 수강신청 시스템입니다.");
		cbType.setSelectedItem(type[0]);
		cbSubject.setSelectedItem(subject[0]);
		cbCurriculum.setSelectedItem(Curriculum[0]);
			
	}//refreshUI() 초기화

	public void refreshData() throws SQLException {
		ArrayList<Courses> datas;


		clearField();

		datas = cou.getAll();

		//데이터를 변경하면 콤보박스 데이터 갱신
		if (datas != null) {
			// ArrayList의 전체 데이터를 형식에 맞춰 출력

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