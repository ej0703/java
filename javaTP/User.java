package javaTP;

public class User {
    private String studentNumber;
    private String password;
    private String name;
    private int grade;
    private String college;
    private int credit;
    private int totalCredit;
    private String msg;

    public String getStudentNumber(){
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public String getCollege(){
        return college;
    }

    public void setCollege(String college){
        this.college = college;
    }

    public int getCredit(){
        return credit;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    public int getTotalCredit(){
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit){
        this.totalCredit = totalCredit;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}