//Abstract Classes in Java

abstract class Shape{
  int color;
  abstract void draw();
}

//1.An instance of an abstract class cannot be created, we can have references of abstract class type though.
//2.An abstract class can contain constructors in Java. Constructor of abstract class is called when an instance of an inherited class is created
//3.Abstract classes can aso have final methods
//4.We are not allowed to create an object. 


//Difference between Abstract Class and Interface in Java

//Abstraction - Hiding the internal implementation and only showing the functionality to the users


//1. Type of methods - Interface can have only abstract methods. Abstract class can have abstract and non-abstract methods.
//2. Final Variables - Variables declared in Java interface are by default final. An abstract may contain non-final variables.
//3. Type of variables - Abstract class can have final, non final, static and non-static variables. Interface has only static and final variables
//4. Abstract class can provide the implementation of interface.Interface cant provide the implementation of abstract class
//5. Inheritance vs Abstraction : A Java interface can be implemented using keyword "implements" and abstract class can be extended using keyword "extends"
//6. Multiple implementation : An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces
//7. Accessibility of Data Members :Members of Java interface are public by default.

//When to use what

//Consider using abstract classes if any of these statements apply to the situation
//In java application, there are some related classes that need to share some lines of code then you can put these lines of code within abstract class and 
//this abstract class should be extended by all these related classes
//You can define non-static or non-final fields in abstract class, so that via a method you can access and modify the state of Object to which they belong.
//You can expect that the classes that extend an abstract class have many common methods or fields, or require access modifiers other than public.
