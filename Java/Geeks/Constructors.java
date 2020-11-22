//Java doesnt create a default copt constructor if you dont write on your own.

class Complex{
  private double re, im;
  
  public Complex(double re, double im){
    this.re =re;
    this.im = im;
  }
  
  Complex (Complex c){
    System.out.println("Copy constructor called");
    re= c.re;
    im = c.im;
  }
  
  //Overriding the toString of Object Class
  @Override
  public String toString(){
    return (re +im);
  }
  
  
}


public class Main{
  public static void main(String[] args){
  
    Complex c1 = new complex(10,15);
    
    Complex c2 = new Complex (c1);
    
    Complex c3 = c2;
    
    System.out.println(c2);// toString() of c2 is called.
  }
 }
  
  
 // Overloaded constructor is called based upon the parameters specified when new is executed.
 
 
 class Box
{
    double width, height,depth;

    // constructor used when all dimensions
    // specified
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume()
    {
        return width * height * depth;
    }
}



//========
// Java program to illustrate 
// Constructor Overloading 
class Box 
{ 
    double width, height, depth; 
  
    // constructor used when all dimensions 
    // specified 
    Box(double w, double h, double d) 
    { 
        width = w; 
        height = h; 
        depth = d; 
    } 
  
    // constructor used when no dimensions 
    // specified 
    Box() 
    { 
        width = height = depth = 0; 
    } 
  
    // constructor used when cube is created 
    Box(double len) 
    { 
        width = height = depth = len; 
    } 
  
    // compute and return volume 
    double volume() 
    { 
        return width * height * depth; 
    } 
} 
  
// Driver code 
public class Test 
{ 
    public static void main(String args[]) 
    { 
        // create boxes using the various 
        // constructors 
        Box mybox1 = new Box(10, 20, 15); 
        Box mybox2 = new Box(); 
        Box mycube = new Box(7); 
  
        double vol; 
  
        // get volume of first box 
        vol = mybox1.volume(); 
        System.out.println(" Volume of mybox1 is " + vol); 
  
        // get volume of second box 
        vol = mybox2.volume(); 
        System.out.println(" Volume of mybox2 is " + vol); 
  
        // get volume of cube 
        vol = mycube.volume(); 
        System.out.println(" Volume of mycube is " + vol); 
    } 
} 


class Box 
{ 
    double width, height, depth; 
    int boxNo; 
  
    // constructor used when all dimensions and 
    // boxNo specified 
    Box(double w, double h, double d, int num) 
    { 
        width = w; 
        height = h; 
        depth = d; 
        boxNo = num; 
    } 
  
    // constructor used when no dimensions specified 
    Box() 
    { 
        // an empty box 
        width = height = depth = 0; 
    } 
  
    // constructor used when only boxNo specified 
    Box(int num) 
    { 
        // this() is used for calling the default 
        // constructor from parameterized constructor 
        this(); 
  
        boxNo = num; 
    } 
  
    public static void main(String[] args) 
    { 
        // create box using only boxNo 
        Box box1 = new Box(1); 
  
        // getting initial width of box1 
        System.out.println(box1.width); 
    } 
} 
//By using this() statement inside, the default constructor Box() is implicitly called from it which will initialize dimension of Box with 0




