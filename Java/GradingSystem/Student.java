package school;

import java.util.ArrayList;

public class Student{
  
  private int studentId;
  private String studentName;
  private Subject majorSubject;
  
  private ArrayList<score> scoreList = new ArrayList<Score>();
  
  public Student(int studentId, String studentName,Subject majorSubject){
    this.studentId = studentId;
    this.stuentName = studentName;
    this.majorSuject = majorSubject;
    
  }
  
  public void addSubjectScore(Score score){
    scoreList.add(score);
  }
  
  public int getStudentId(){
    return studentId;
  }
  
  public void setStudentId(int studentId){
    this.studentId = studentId;
  }
  
  public String getStudentName(){
    return studentName;
  }
  
  public void setStudentName(String studentName){
     this.studentName =studentName;
  }
  
  public Subject getSubject(){
    return subject;
  }
  
  public void setSubject(Suject subject){
    this.subject = subject;
  }
  public int getPoint(){
    return point;
  }
 
  public void setPoint(int point){
    this.point = point;
  }
  
  
  
  
  
    
