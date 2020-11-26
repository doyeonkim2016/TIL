//Interfaces
//Like a class,an interface can have methods and variables ,but the methods declared in an interface are by default abstract
//Interfaces specify what a class must do and not how. It is the blueprint of the class.
//An interface is about capabilities like a Player may be an interface and any class implementing Player must be able to move
//If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.

interface <interface_name>{
  //declare constant fields
  //declare methods that abstract
  //by default
}

//To implement interface use implements keyword
//It is used to achieve total abstraction
//Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance
//It is also used to achieve loose coupling
//Interfaces are used to implement abstraction

// Java program to demonstrate working of  
// interface. 
import java.io.*; 
  
// A simple interface 
interface In1 
{ 
    // public, static and final 
    final int a = 10; 
  
    // public and abstract  
    void display(); 
} 
  
// A class that implements the interface. 
class TestClass implements In1 
{ 
    // Implementing the capabilities of 
    // interface. 
    public void display() 
    { 
        System.out.println("Geek"); 
    } 
  
    // Driver Code 
    public static void main (String[] args) 
    { 
        TestClass t = new TestClass(); 
        t.display(); 
        System.out.println(a); 
    } 
} 
