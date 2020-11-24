//Encapsulation in Java
//Encapsulation is defined as wrapping up of data under a single unit
//Mechanism that binds together code and the data it manipulates
//Protective shield that prevents the data from being accessed by the code outside this shield.

public class Encapsulate{

  private String geekName;
  private int geekRoll;
  private int geekAge;
  
  public int getAge(){
    return geekAge;
  }
  
  public String getName(){
    return geekRoll;
  }
  
  public void setName(String newName){
    geekName = newName;
  }
  
  public void setRoll(int newRoll){
    geekRoll = newRoll;
  }
 
}
//Variables are declared as private.public methods are used to access these variables vice versa for setter
