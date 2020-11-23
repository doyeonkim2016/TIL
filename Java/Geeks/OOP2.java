//Inheritance in java

//It is the mechanism in java by which one class is allow to inherit the features( fields and methods ) of another class

//1. Super Class
//The class whose features are inherited

//2.Sub class
//The class that inherits the other class is known as sub class- can add its own fields and methods in addition to superclass fields and methods.

//3. Reusability
//Reusing the fields and methods of existing class.


class derived class extends base-class
{
  //methods and fields
}


class Bicycle{
  public int gear;
  public int speed;
  
  public Bicycle (int gear, int speed){
    this.gear =gear;
    this.speed = speed;
  }
  
  public void applyBrake(int decrement){
    speed -= decrement;
  }
  
  public void speedUp(int increment){
    speed += increment;
  }
  
  public String toString(){
    return (gear +speed);
  }
  
}

//derived class
class MountainBike extends Bicycle{
  public int seatHeight;
  
  public MountainBike(int gear, int speed, int startHeight){
      super(gear, speed);
      seatHeight = startHeight;
  }
  public void setHeight(int newValue){
    seatHeight = newValue;
  }
  
  @Override
  public String toString(){
    return (super.toString()+seatHeight);
  }
}


// driver class 
public class Test  
{ 
    public static void main(String args[])  
    { 
          
        MountainBike mb = new MountainBike(3, 100, 25); 
        System.out.println(mb.toString()); 
              
    } 
} 

   
 
