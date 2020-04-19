package javaTP;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JoinFrame extends JFrame//회원가입 패널
{

	JPanel mainPanel; // 메인 패널
	JLabel lblTitle1, lblTitle2, lblTitle3, lblID, lblSubject, lblPW, lblName;
	// 타이틀, 아이디, 비밀번호, 이름 라벨
	JButton btnJoin; // 가입하기 버튼
	JTextField txtID, txtName;
	JComboBox cbSubject;
	JPasswordField txtPW;// 아이디, 이름, 비밀번호 입력창
	LoginFrame LF;
	//선언

	String subject[] = {"학과", "컴퓨터공학과", "디지털콘텐츠"};

	public JoinFrame(LoginFrame loginFrame) {

		LF = loginFrame;

		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(500, 380));
		mainPanel.setBackground(new Color(220, 255, 220));
		mainPanel.setLayout(null);
		add(mainPanel);

		lblTitle1 = new JLabel("세종대학교");
		lblTitle1.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
		lblTitle1.setBounds(175, 10, 500, 50); // 글자 위치 설정
		mainPanel.add(lblTitle1); // 메인패널에 삽입

		lblTitle2 = new JLabel("수강신청 시스템");
		lblTitle2.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
		lblTitle2.setBounds(140, 45, 500, 50); // 글자 위치 설정
		mainPanel.add(lblTitle2); // 메인패널에 삽입

		lblTitle2 = new JLabel("회원가입");
		lblTitle2.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
		lblTitle2.setBounds(190, 80, 500, 50); // 글자 위치 설정
		mainPanel.add(lblTitle2); // 메인패널에 삽입

		lblID = new JLabel("ID");
		lblID.setBounds(80, 150, 100, 30); // 글자 위치 설정
		lblID.setFont(new Font("나눔고딕", Font.BOLD, 20)); // 글자 폰트 설정
		mainPanel.add(lblID); // 메인패널에 삽입

		lblName = new JLabel("이름");
		lblName.setBounds(70, 190, 100, 30); // 글자 위치 설정
		lblName.setFont(new Font("나눔고딕", Font.BOLD, 20)); // 글자 폰트 설정
		mainPanel.add(lblName); // 메인패널에 삽입

		lblSubject = new JLabel("학과");
		lblSubject.setBounds(70, 230, 100, 30); // 글자 위치 설정
		lblSubject.setFont(new Font("나눔고딕", Font.BOLD, 20)); // 글자 폰트 설정
		mainPanel.add(lblSubject); // 메인패널에 삽입

		lblPW = new JLabel("PW");
		lblPW.setBounds(75, 270, 100, 30); // 글자 위치 설정
		lblPW.setFont(new Font("나눔고딕", Font.BOLD, 20)); // 글자 폰트 설정
		mainPanel.add(lblPW); // 메인패널에 삽입


		txtID = new JTextField(15);
		txtID.setBounds(120, 150, 170, 30); // 글자 위치 설정
		txtID.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel.add(txtID); // 메인패널에 삽입

		txtName = new JTextField(15);
		txtName.setBounds(120, 190, 170, 30); // 글자 위치 설정
		txtName.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel.add(txtName); // 메인패널에 삽입


		cbSubject = new JComboBox();
		cbSubject.setBounds(120, 230, 170, 30); // 글자 위치 설정
		cbSubject.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		cbSubject.setBackground(Color.white);
		cbSubject.setModel(new DefaultComboBoxModel(subject));

		mainPanel.add(cbSubject); // 메인패널에 삽입

		txtPW = new JPasswordField(15);
		txtPW.setBounds(120, 270, 170, 30); // 글자 위치 설정
		txtPW.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel.add(txtPW); // 메인패널에 삽입

		btnJoin = new JButton("가입하기");
		btnJoin.setBounds(330, 170, 100, 90);
		btnJoin.setBackground(Color.white);
		btnJoin.setFont(new Font("나눔고딕", Font.BOLD, 16)); // 글자 폰트 설정
		mainPanel.add(btnJoin);


		setTitle("세종대학교 수강신청 시스템 회원가입 화면");
		setLocation(500, 200);
		setVisible(false);
		setResizable(false);
		setSize(500, 380);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Frame

	}    //생성자

	public void RefreshUI() {
		txtID.setText("");
		txtPW.setText("");
		txtName.setText("");

	}//RefreshUI() 초기화 메소드

	public void setListener(Controller Listener){
		btnJoin.addActionListener(Listener);
	}

}//JoinPanel Class