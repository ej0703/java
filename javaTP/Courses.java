package javaTP;

public class Courses {
    private String major;
    private String college;
    private String courseNumber;
    private String courseName;
    private String professor;
    private String curriculum;
    private int grade;
    private int credit;
    private String courseTime;
    private int participants;
    private int maxParticipants;
    private String location;

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getCollege(){
        return college;
    }

    public void setCollege(String college){
        this.college = college;
    }

    public String getCourseNumber(){
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getProfessor(){
        return professor;
    }

    public void setProfessor(String professor){
        this.professor = professor;
    }

    public String getCurriculum(){
        return curriculum;
    }
    public void setCurriculum(String curriculum){
        this.curriculum = curriculum;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getCredit(){
        return credit;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    public String getCourseTime(){
        return courseTime;
    }

    public void setCourseTime(String courseTime){
        this.courseTime = courseTime;
    }

    public int getParticipants(){
        return participants;
    }

    public void setParticipants(int participants){
        this.participants = participants;
    }

    public int getMaxParticipants(){
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants){
        this.maxParticipants = maxParticipants;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }
}