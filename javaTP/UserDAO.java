package javaTP;

import java.sql.*;
import java.util.*;

public class UserDAO {
    private String jdbcDriver = "com.mysql.jdbc.Driver";
    private String jdbcUrl = "jdbc:mysql://localhost/javadb?autoReconnect=true&useSSL=false";
    private Connection conn;

    private PreparedStatement pstmt;
    private ResultSet rs;

    private String sql;

    public ArrayList<User> getAll() {
        connectDB();
        sql = "select * from course";

        // 전체 검색 데이터를 전달하는 ArrayList
        ArrayList<User> datas = new ArrayList<User>();

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                User u = new User();
                u.setStudentNumber(rs.getString("studentNumber"));
                u.setPassword(rs.getString("password"));
                u.setName(rs.getString("name"));
                u.setGrade(rs.getInt("grade"));
                u.setCollege(rs.getString("college"));
                u.setCredit(rs.getInt("credit"));
                u.setTotalCredit(rs.getInt("totalCredit"));
                u.setMsg(rs.getString("msg"));
                datas.add(u);
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        closeDB();
        return datas;
    }

    public User getUser(int studentNumber){
        sql = "select * from user where studentNumber = ?";
        connectDB();

        User u = null;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,studentNumber);
            rs = pstmt.executeQuery();

            rs.next();
            u = new User();
            u.setStudentNumber(rs.getString("studentNumber"));
            u.setPassword(rs.getString("password"));
            u.setName(rs.getString("name"));
            u.setGrade(rs.getInt("grade"));
            u.setCollege(rs.getString("college"));
            u.setCredit(rs.getInt("credit"));
            u.setTotalCredit(rs.getInt("totalCredit"));
            u.setMsg(rs.getString("msg"));
        } catch(SQLException e){
            e.printStackTrace();
        }

        return u;
    }


    public boolean newUser(User user){
        boolean result =false;
        connectDB();

        sql = "insert into courses values(?,?,?,?,?,?,?,?,?,?,?,?)";

        pstmt = null;

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getStudentNumber());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(5, user.getCollege());

            pstmt.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        closeDB();
        return result;
    }


    public void connectDB(){
        try {
            // JDBC 드라이버 로드
            Class.forName(jdbcDriver);

            // 데이터베이스 연결
            conn = DriverManager.getConnection(jdbcUrl, "root", "robotics");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void closeDB(){
        try {
            // 연결 해제
            pstmt.close();
            rs.close();
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}