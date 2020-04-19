package javaTP;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginFrame extends JFrame {
	JPanel mainPanel; // 메인 패널
	JLabel lblTitle1, lblTitle2, lblID, lblPW, lbl; // 타이틀, 아이디, 비밀번호 라벨
	JButton btnLogin, btnJoin; // 로그인, 회원가입 버튼
	JTextField txtID;
	JPasswordField txtPW;// 아이디, 비밀번호 입력창
	Controller Listener; //로그인 및 회원가입 확인 리스너
	JoinFrame JF; // 회원가입 프레임
	MainFrame MF; // 메인 프레임
	AdminFrame AF;// 관리자용 프레임

	//선언

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

		lblTitle1 = new JLabel("세종대학교");
		lblTitle1.setBounds(185, 25, 500, 100); // 글자 위치 설정
		lblTitle1.setFont(new Font("나눔고딕", Font.BOLD, 50)); // 글자 폰트 설정
		mainPanel.add(lblTitle1); // 메인패널에 삽입

		lblTitle2 = new JLabel("수강신청 시스템");
		lblTitle2.setBounds(125, 90, 500, 100); // 글자 위치 설정
		lblTitle2.setFont(new Font("나눔고딕", Font.BOLD, 50)); // 글자 폰트 설정
		mainPanel.add(lblTitle2); // 메인패널에 삽입

		lblID = new JLabel("ID");
		lblID.setBounds(45, 180, 500, 100); // 글자 위치 설정
		lblID.setFont(new Font("나눔고딕", Font.BOLD, 36)); // 글자 폰트 설정
		mainPanel.add(lblID); // 메인패널에 삽입

		lblPW = new JLabel("PW");
		lblPW.setBounds(45, 230, 500, 100); // 글자 위치 설정
		lblPW.setFont(new Font("나눔고딕", Font.BOLD, 36)); // 글자 폰트 설정
		mainPanel.add(lblPW); // 메인패널에 삽입

		txtID = new JTextField(12);
		txtID.setBounds(135, 210, 170, 40); // 글자 위치 설정
		txtID.setFont(new Font("나눔고딕", Font.BOLD, 26)); // 글자 폰트 설정
		mainPanel.add(txtID); // 메인패널에 삽입

		txtPW = new JPasswordField(12);
		txtPW.setBounds(135, 260, 170, 40); // 글자 위치 설정
		txtPW.setFont(new Font("나눔고딕", Font.BOLD, 26)); // 글자 폰트 설정
		mainPanel.add(txtPW); // 메인패널에 삽입

		btnLogin = new JButton("로그인");
		btnLogin.setBounds(325, 210, 100, 90);
		btnLogin.setBackground(Color.white);
		btnLogin.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel.add(btnLogin);

		btnJoin = new JButton("회원가입");
		btnJoin.setBounds(435, 210, 100, 90);
		btnJoin.setBackground(Color.white);
		btnJoin.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel.add(btnJoin);

		lbl = new JLabel("객체지향설계기술 2조");
		lbl.setBounds(465, 300, 500, 100); // 글자 위치 설정
		lbl.setFont(new Font("나눔고딕", Font.BOLD, 12)); // 글자 폰트 설정
		mainPanel.add(lbl); // 메인패널에 삽입

		btnLogin.addActionListener(Listener);
		btnJoin.addActionListener(Listener);

		setTitle("세종대학교 수강신청 시스템 로그인 화면");
		setLocation(500, 200);
		setVisible(true);
		setResizable(false);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Frame

	} //LoginPanel 생성자

	public void RefreshUI() {
		txtID.setText("");
		txtPW.setText("");

	}//RefreshUI() 초기화 메소드
}//LoginPanel Class