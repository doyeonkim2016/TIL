//Abstraction in Java

//Data abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details.
//In java abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

//1.Abstract class is a class that is declared with abstract keyword.
//2.An abstract method is a method that is declared without an implementation
//3.An abstract class may or may not have all abstract methods. Some of them can be concrete methods.
//4.Method defined abstract must always be redefined in the subclass, thus making overriding compulsory or either make subclass itself abstract.
//5.Any class that contains one or more abstract methods must also be declared with abstract keyword.
//6.There can be no objet of an abstract class.that is, an absract class can not be directly instantiated with new operator.
//7.An abstract class can have parametrised constructors and default constructor is alway spresent in an abstract class.


//Encapsulation is data hiding(information hiding) while Abstraction is detail hiding(implementation hiding).
//While encapsulation groups together dataand methods that act upon the data, data abstraction deals with exposing the interface to the user and hiding the details of implementation

//Advantages of Abstractino
//1.Reduces the complexity of viewing the things
//2.Avoids code duplication and increases reusability
//3.Helps to increas security of an app or program as only important details are provided to the user.


// Java program to illustrate the 
// concept of Abstraction 
abstract class Shape  
{ 
    String color; 
      
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 
      
    // abstract class can have constructor 
    public Shape(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
    // this is a concrete method 
    public String getColor() { 
        return color; 
    } 
} 
class Circle extends Shape 
{ 
    double radius; 
      
    public Circle(String color,double radius) { 
  
        // calling Shape constructor 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    @Override
    double area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    @Override
    public String toString() { 
        return "Circle color is " + super.color +  
                       "and area is : " + area(); 
    } 
      
} 
class Rectangle extends Shape{ 
  
    double length; 
    double width; 
      
    public Rectangle(String color,double length,double width) { 
        // calling Shape constructor 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    double area() { 
        return length*width; 
    } 
  
    @Override
    public String toString() { 
        return "Rectangle color is " + super.color +  
                           "and area is : " + area(); 
    } 
  
} 
public class Test  
{ 
    public static void main(String[] args) 
    { 
        Shape s1 = new Circle("Red", 2.2); 
        Shape s2 = new Rectangle("Yellow", 2, 4); 
          
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    } 
} 
