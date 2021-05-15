class Complex{
  private double re, im;
  
  //normal parametrized constructor
  public Complex(double re, double im){
    this.re = re;
    this.im = im;
  }
  
  //copy Constructor
  Complex(Complex c){
    System.out.println("Copy constructor called");
    re = c.re;
    im =c.im;
  }
  
  //Overriding the toString of Object Class
  @Override
  public String toString(){
    return "(" +re + " + " +im+"i)";
  }
}

public class Main{
  public static void main(String[] args){
    Complex c1 = new Complex(10,15);
    Complex c2 = new complex(c1);
    Complex c3  c2;
  }
}
