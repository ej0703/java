package javaTP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class UserControl {

    public LoginFrame lf;
    public JoinFrame jf;
    public MainFrame mf;
    public AdminFrame af;
    public UIMain view;
    public Courses courses;
    public CourseDAO cdao = new CourseDAO();
    public UserDAO udao = new UserDAO();

    public UserControl(LoginFrame lf, JoinFrame jf, MainFrame mf, AdminFrame af) {
        this.lf = lf;
        this.jf = jf;
        this.mf = mf;
        this.af = af;
    }


    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            Object obj = event.getSource();
            int studentNumber = Integer.valueOf(lf.txtID.getText());
            String password = lf.txtPW.getText();

            if (obj == lf.btnLogin) {
                try {
                    User user = udao.getUser(studentNumber);
                } catch (Exception e) {
                    System.out.println("non-existiting ID");
                }
                User user = udao.getUser(studentNumber);
                if (user.getPassword() == password) {
                    lf.setVisible(false);
                    mf.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(lf.mainPanel, "아이디 또는 비밀번호가 틀렸습니다.");
                    lf.RefreshUI();
                }
            }
        }
    }

    class JoinListener implements ActionListener{

        public void actionPerformed(ActionEvent event){

            Object obj = event.getSource();
            //int studentNumber = jf.txtID.getText();
            String name = jf.txtID.getText();
            String pw = jf.txtPW.getText();
            if(obj == jf.btnJoin){
                //if(udao.getUser(studentNumber))
            }

        }
    }

    class MainListener implements ActionListener{

        public void actionPerformed(ActionEvent event){
            Object obj = event.getSource();

            if(obj == mf.cbSubject)
            {}
        }
    }
}