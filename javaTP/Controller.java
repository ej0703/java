package javaTP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Controller implements ActionListener {

    public LoginFrame LF;
    public JoinFrame JF;
    public MainFrame MF;
    public AdminFrame AF;
    public Courses courses;
    public CourseDAO cdao = new CourseDAO();
    public UserDAO udao = new UserDAO();

    public Controller(LoginFrame LF, MainFrame MF, JoinFrame JF, AdminFrame AF) {
        this.LF = LF;
        this.MF = MF;
        this.JF = JF;
        this.AF = AF;
    }

    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource(); // 클래스의 모든 오브젝트 불러오기

//---------------------------------------------------------------------------------------------------------------------------------------
        //LoginFrame Listener
        if (obj == LF.btnLogin) {
            //System.out.println("로그인");
            if (true)//아이디, 비밀번호가 일치할 경우
            {
                String str = LF.txtID.getText();
                if (str.equals("admin")) {
                    LF.setVisible(false);
                    AF.setVisible(true);
                } else {
                    LF.setVisible(false);
                    MF.setVisible(true);
                }
                //관리자의경우 AdminFrame, 기본은 MainFrame으로 전환
            } else {
                JOptionPane.showMessageDialog(LF.mainPanel, "아이디 또는 비밀번호가 틀렸습니다.");
                //일치하지 않을경우 시스템 메시지 아이디 비밀번호 확인해주세요
            }

            LF.RefreshUI();

        }//if 로그인 버튼 누를경우
        else if (obj == LF.btnJoin) {
            JF.setVisible(true);
            //JoinFrame 소환
            LF.RefreshUI();
        }//else if 회원가입 버튼 누를경우

        /*
        int studentNumber = Integer.valueOf(LF.txtID.getText());
        String password = LF.txtPW.getText();

        if (obj == LF.btnLogin) {
            try {
                User user = udao.getUser(studentNumber);
            } catch (Exception e) {
                System.out.println("non-existiting ID");
            }
            User user = udao.getUser(studentNumber);
            if (user.getPassword() == password) {
                LF.setVisible(false);
                MF.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(LF.mainPanel, "아이디 또는 비밀번호가 틀렸습니다.");
                LF.RefreshUI();
            }
        }
        */

//---------------------------------------------------------------------------------------------------------------------------------------
        // AdminFrame Listener

        if (obj == AF.btn1) {
            AF.refreshUI();
            AF.btn1.setFont(new Font("나눔고딕", Font.BOLD, 27)); // 글자 폰트 설정
            AF.btn1.setForeground(Color.red);

            AF.lblMsg.setText("강의시간표관리 페이지 입니다.");
            AF.mainPanel_1.setVisible(true);


        } // if 수강신청 버튼 누르면
        else if (obj == AF.btn2) {
            AF.refreshUI();

            AF.btn2.setFont(new Font("나눔고딕", Font.BOLD, 27)); // 글자 폰트 설정
            AF.btn2.setForeground(Color.red);
            AF.lblMsg.setText("회원정보를 조회합니다.");

            AF.mainPanel_2.setVisible(true);

        }//else if 강의시간조회 버튼
        else if (obj == AF.btn3) {

            JOptionPane.showMessageDialog(AF.leftPanel, "시스템으로부터 로그아웃 되었습니다.");

            AF.refreshUI();
            AF.setVisible(false); // 회원가입 프레임 닫기
            LF.setVisible(true);//로그인 프레임 열기

        }//로그아웃 버튼
        
        if(obj == AF.cbType)
        {
        	if(AF.cbType.getSelectedItem().toString() == "학과명")
        	{
        		AF.cbSubject.setVisible(true);
        		AF.cbCurriculum.setVisible(false);
        		AF.txtSearch.setEnabled(false);
        	}
        	else if(AF.cbType.getSelectedItem().toString() == "이수구분")
        	{
        		
        		AF.cbSubject.setVisible(false);
        		AF.cbCurriculum.setVisible(true);
        		AF.txtSearch.setEnabled(false);      	
        	}
        	else
        	{    
        		MF.cbSubject.setVisible(false);
        		MF.cbCurriculum.setVisible(false);
        		MF.txtSearch.setEnabled(true);
            	
        	}
        }//콤보박스
        

        //int studentNumber = jf.txtID.getText();
        String name = JF.txtID.getText();
        String pw = JF.txtPW.getText();
        if (obj == JF.btnJoin) {
            //if(udao.getUser(studentNumber))
        }


//-----------------------------------------------------------------------------------------------------------------------------------
        // MainFrame Listener

        if (obj == MF.btn1) {
            MF.refreshUI();
            MF.btn1.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
            MF.btn1.setForeground(Color.red);

            MF.lblMsg.setText("수강신청 페이지 입니다.");
            MF.lblNowScore.setVisible(true);
            MF.lblTotalScore.setVisible(true);

            MF.mainPanel_1.setVisible(true);
            MF.mainPanel_1.add(MF.cbType);
            MF.mainPanel_1.add(MF.cbSubject);
            MF.mainPanel_1.add(MF.txtSearch);
            MF.mainPanel_1.add(MF.btnSearch);
            MF.mainPanel_1.add(MF.scrSearch);
            MF.mainPanel_1.add(MF.myScr);


        } // if 수강신청 버튼 누르면
        else if (obj == MF.btn2) {
            MF.refreshUI();

            MF.btn2.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
            MF.btn2.setForeground(Color.red);
            MF.lblMsg.setText("강의시간조회 페이지 입니다.");

            MF.mainPanel_2.setVisible(true);
            MF.mainPanel_2.add(MF.cbType);
            MF.mainPanel_2.add(MF.cbSubject);
            MF.mainPanel_2.add(MF.txtSearch);
            MF.mainPanel_2.add(MF.btnSearch);
            MF.mainPanel_2.add(MF.scrSearch);

        }//else if 강의시간조회 버튼
        else if (obj == MF.btn3) {
            MF.refreshUI();
            MF.lblNowScore.setVisible(true);
            MF.lblTotalScore.setVisible(true);
            MF.mainPanel_3.add(MF.scrSearch);

            MF.btn3.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
            MF.btn3.setForeground(Color.red);
            MF.lblMsg.setText("수강내역조회 페이지 입니다.");

            MF.mainPanel_3.setVisible(true);

        }//수강내역조회 버튼
        else if (obj == MF.btn4) {
            MF.refreshUI();

            MF.btn4.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
            MF.btn4.setForeground(Color.red);
            MF.lblMsg.setText("관심과목담기 페이지 입니다.");

            MF.mainPanel_4.add(MF.cbType);
            MF.mainPanel_4.add(MF.cbSubject);
            MF.mainPanel_4.add(MF.txtSearch);
            MF.mainPanel_4.add(MF.btnSearch);
            MF.mainPanel_4.add(MF.scrSearch);
            MF.mainPanel_4.add(MF.myScr);
            MF.mainPanel_4.setVisible(true);

        }//관심과목담기 버튼
        else if (obj == MF.btn5) {
            MF.refreshUI();

            MF.btn5.setFont(new Font("나눔고딕", Font.BOLD, 30)); // 글자 폰트 설정
            MF.btn5.setForeground(Color.red);
            MF.lblMsg.setText("회원정보를 수정합니다.");


            MF.mainPanel_5.setVisible(true);

        }//회원정보수정 버튼
        else if (obj == MF.btn6) {

            JOptionPane.showMessageDialog(MF.leftPanel, "시스템으로부터 로그아웃 되었습니다.");

            MF.refreshUI();
            MF.setVisible(false); // 메인 프레임 닫기
            LF.setVisible(true);//로그인 프레임 열기

        }//로그아웃 버튼
        else if (obj == MF.btnEdit) {
            //기존 비밀번호와도 일치하는지 확인
            String str1 = MF.txtNewPW.getText();
            String str2 = MF.txtNewPW2.getText();

            if (str1.isEmpty() || str2.isEmpty())//입력창이 비어있는 경우
            {
                JOptionPane.showMessageDialog(MF.btnEdit, "비밀번호가 입력되지 않았습니다. 다시 변경해주세요.");
                MF.txtPrevPW.setText("");
                MF.txtNewPW.setText("");
                MF.txtNewPW2.setText("");
            } else if (str1.equals(str2)) {
                //DB에 새 비밀번호를 전송한다
                JOptionPane.showMessageDialog(MF.btnEdit, "비밀번호가 변경 되었습니다.");

                MF.txtPrevPW.setText("");
                MF.txtNewPW.setText("");
                MF.txtNewPW2.setText("");
                MF.refreshUI();
                //비밀번호가 맞을 경우
            } else {
                JOptionPane.showMessageDialog(MF.btnEdit, "비밀번호가 일치하지 않습니다. 다시 변경해주세요.");
                MF.txtPrevPW.setText("");
                MF.txtNewPW.setText("");
                MF.txtNewPW2.setText("");
            }
            //비밀번호가 틀린 경우
        }//비밀번호 변경확인버튼
        
        if(obj == MF.cbType)
        {
        	if(MF.cbType.getSelectedItem().toString() == "학과명")
        	{
        		MF.cbSubject.setVisible(true);
        		MF.cbCurriculum.setVisible(false);
        		MF.txtSearch.setEnabled(false);
        	}
        	else if(MF.cbType.getSelectedItem().toString() == "이수구분")
        	{
        		
        		MF.cbSubject.setVisible(false);
        		MF.cbCurriculum.setVisible(true);
        		MF.txtSearch.setEnabled(false);      	
        	}
        	else
        	{    
        		MF.cbSubject.setVisible(false);
        		MF.cbCurriculum.setVisible(false);
        		MF.txtSearch.setEnabled(true);
            	
        	}
        }//콤보박스
        

        if (obj == MF.btnSearch) {
            if (MF.cbType.getSelectedItem().equals("전체")) {
                System.out.println("check");
                try {
                    MF.refreshData();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }//검색버튼
            else if(MF.cbType.getSelectedItem().equals("학수번호")){

            }

        }

//———————————————————————————————————————————————————————————————————
        // JoinFrame Listener

        if (obj == JF.btnJoin) {
            if (true) // 아이디가 DB에 존재하지 않을 경우 (조건 바꿔야함)
            {
                //아이디,비밀번호,이름 정보 받아 DB로보내기
                JOptionPane.showMessageDialog(JF.mainPanel, "가입을 축하드립니다! 로그인 화면으로 넘어갑니다.");
                JF.RefreshUI(); // 입력창 초기화
                JF.setVisible(false); // 회원가입 프레임 닫기
                LF.setVisible(true);//로그인 프레임 열기
            } else {
                JOptionPane.showMessageDialog(JF.mainPanel, "이미 존재하는 아이디 입니다.");

            } // 아이디가 이미 존재할 경우
        }
    }

}