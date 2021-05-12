package school;

import java.util.ArrayList;

public class Subject{
  private String subjectName;
  private int subject Id;
  private int gradeType;
  
  private ArrayList<Student> studentList = new arrayList<Sturdent>();
  
  public Subject(String subjectName, int subjectId){
    this.subjectName = subjectName;
    this.subjectId= subjectId;
    this.gradeType = Define.AB_TYPE;
  }
  
  public String getSubjectName(){
    return subjectName;
  }
  
  public void setSubjetName(String subjectName){
    this.subjectName= subjectName;
  }
  
  public int getSubjectId(){
    return subjectId;
  }
  
  public void setSubjectId(int subjectId){
      this.subjectId =subjectId;
  }
  
  public void setGradeType(int gradeType){
    this.gradeType= gradeType;
  }
  
 /*
 package utils;
 
 public class Define{
 
  public static final int KOREAN = 1001;
  public static final int MATH =2001;
  
  public static final int AB_TYPE =0;
  public static final int SAB_TYPE =1;
  
}
  

    
