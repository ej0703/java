package javaTP;

import java.sql.*;
import java.util.*;

public class CourseDAO {
    private String jdbcDriver = "com.mysql.jdbc.Driver";
    private String jdbcUrl = "jdbc:mysql://localhost/javadb?autoReconnect=true&useSSL=false";
    private Connection conn;

    private PreparedStatement pstmt;
    private ResultSet rs;

    private String sql;

    public ArrayList<Courses> getAll() {
        connectDB();
        sql = "select * from courses";

        // 전체 검색 데이터를 전달하는 ArrayList
        ArrayList<Courses> datas = new ArrayList<Courses>();

        // 관리번호 콤보박스 데이터를 위한 벡터 초기화

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Courses c = new Courses();
                c.setMajor(rs.getString("major"));
                c.setCollege(rs.getString("college"));
                c.setCourseNumber(rs.getString("courseNumber"));
                c.setCourseName(rs.getString("courseName"));
                c.setProfessor(rs.getString("professor"));
                c.setCurriculum(rs.getString("curriculum"));
                c.setGrade(rs.getInt("grade"));
                c.setCredit(rs.getInt("credit"));
                c.setCourseTime(rs.getString("courseTime"));
                c.setParticipants(rs.getInt("participant"));
                c.setMaxParticipants(rs.getInt("maxParticipants"));
                c.setLocation(rs.getString("location"));
                datas.add(c);
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        closeDB();
        return datas;
    }

    public Courses getCoursesByCourseNumber(String courseNumber){
        sql = "select * from courses where courseNumber = ?";
        connectDB();

        Courses c = null;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,courseNumber);
            rs = pstmt.executeQuery();

            rs.next();
            c = new Courses();
            c.setMajor(rs.getString("major"));
            c.setCollege(rs.getString("college"));
            c.setCourseNumber(rs.getString("courseNumber"));
            c.setCourseName(rs.getString("courseName"));
            c.setProfessor(rs.getString("professor"));
            c.setCurriculum(rs.getString("curriculum"));
            c.setGrade(rs.getInt("grade"));
            c.setCredit(rs.getInt("credit"));
            c.setCourseTime(rs.getString("courseTime"));
            c.setParticipants(rs.getInt("participant"));
            c.setMaxParticipants(rs.getInt("maxParticipants"));
            c.setLocation(rs.getString("location"));
        } catch(SQLException e){
            e.printStackTrace();
        }

        return c;
    }
    public Courses getCoursesByCourseName(String courseName){
        sql = "select * from courses where courseName = ?";
        connectDB();

        Courses c = null;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,courseName);
            rs = pstmt.executeQuery();

            rs.next();
            c = new Courses();
            c.setMajor(rs.getString("major"));
            c.setCollege(rs.getString("college"));
            c.setCourseNumber(rs.getString("courseNumber"));
            c.setCourseName(rs.getString("courseName"));
            c.setProfessor(rs.getString("professor"));
            c.setCurriculum(rs.getString("curriculum"));
            c.setGrade(rs.getInt("grade"));
            c.setCredit(rs.getInt("credit"));
            c.setCourseTime(rs.getString("courseTime"));
            c.setParticipants(rs.getInt("participant"));
            c.setMaxParticipants(rs.getInt("maxParticipants"));
            c.setLocation(rs.getString("location"));
        } catch(SQLException e){
            e.printStackTrace();
        }

        return c;
    }

    public Courses getCoursesByProfessor(String professor){
        sql = "select * from courses where professor = ?";
        connectDB();

        Courses c = null;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,professor);
            rs = pstmt.executeQuery();

            rs.next();
            c = new Courses();
            c.setMajor(rs.getString("major"));
            c.setCollege(rs.getString("college"));
            c.setCourseNumber(rs.getString("courseNumber"));
            c.setCourseName(rs.getString("courseName"));
            c.setProfessor(rs.getString("professor"));
            c.setCurriculum(rs.getString("curriculum"));
            c.setGrade(rs.getInt("grade"));
            c.setCredit(rs.getInt("credit"));
            c.setCourseTime(rs.getString("courseTime"));
            c.setParticipants(rs.getInt("participant"));
            c.setMaxParticipants(rs.getInt("maxParticipants"));
            c.setLocation(rs.getString("location"));
        } catch(SQLException e){
            e.printStackTrace();
        }

        return c;
    }


    public boolean newCourses(Courses course){
        boolean result =false;
        connectDB();

        sql = "insert into courses values(?,?,?,?,?,?,?,?,?,?,?,?)";

        pstmt = null;

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, course.getMajor());
            pstmt.setString(2, course.getCollege());
            pstmt.setString(3, course.getCourseNumber());
            pstmt.setString(4, course.getCourseName());
            pstmt.setString(5, course.getProfessor());
            pstmt.setString(6, course.getCurriculum());
            pstmt.setInt(7, course.getGrade());
            pstmt.setInt(8, course.getCredit());
            pstmt.setString(9, course.getCourseTime());
            pstmt.setInt(10, course.getParticipants());
            pstmt.setInt(11, course.getMaxParticipants());
            pstmt.setString(12, course.getLocation());

            pstmt.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public boolean delProduct(int courseNumber) {
        boolean result = false;

        connectDB();
        pstmt = null;

        sql = "delete from product where courseNumber=?";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, courseNumber);

            pstmt.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean updateProduct(Courses course){
        boolean result = false;
        connectDB();
        sql = "update courses set college = ?, major = ? courseNumber = ?, courseName = ?, professor = ?, curriculum = ?, grade = ?, credit = ?, courseTime = ?, participants = ?, maxParticipants = ?, location = ? where courseNumber = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, course.getMajor());
            pstmt.setString(2, course.getCollege());
            pstmt.setString(3, course.getCourseNumber());
            pstmt.setString(4, course.getCourseName());
            pstmt.setString(5, course.getProfessor());
            pstmt.setString(6, course.getCurriculum());
            pstmt.setInt(7, course.getGrade());
            pstmt.setInt(8, course.getCredit());
            pstmt.setString(9, course.getCourseTime());
            pstmt.setInt(10, course.getParticipants());
            pstmt.setInt(11, course.getMaxParticipants());
            pstmt.setString(12, course.getLocation());



            pstmt.executeUpdate();
            result = true;
        } catch (SQLException e){
            e.printStackTrace();
        }

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