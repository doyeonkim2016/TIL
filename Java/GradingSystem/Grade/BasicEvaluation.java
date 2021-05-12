package grade;

public class BasicEvaluation implements GradeEvaluation[
  
  
  @Override
  public String getGrade(int point){
    String grade;
    
    if(point >=90 && point <=100){
      grade ="A";
    }
    
    return grade;
 }
