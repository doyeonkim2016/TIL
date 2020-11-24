//Polymorphism in Java

//Ability of a message to be displayed in more than one form.
//2 Types of polymorphism in Java
//1.Compile time Polymorphism
//2.Runtime Polymorphism


//1. Compile Time polymorphism
//Static Polymorphism.This type of polymorphism is achieved by function overloading or operator overloading.
//Method overloading is when there are multiple functions with same name but different parameters.
//Functions can be overloaded by change in number of arguments and change in type of arguments.

class MultiplyFun{
  static int Multiply(int a, int b){
    return a *b ;
  }
  
  static double Multiply(double a, double b){
    return a*b;
  }
}


class Main { 
    public static void main(String[] args) 
    { 
  
        System.out.println(MultiplyFun.Multiply(2, 4)); 
  
        System.out.println(MultiplyFun.Multiply(5.5, 6.3)); 
    } 
} 



//2.Runtime Polymorphism
//It is also known as Dynamic Method Dispatch.
//It is a process in which a function call to the overridden method is resolved at Runtime. 
//This type of polymorphism is achieved by Method Overriding

class Parent{
  void Print(){
    System.out.println("Parent class");
  }
}

class subclass1 extends Parent(){
  void Print(){
    System.out.println("subclass1");
  }
}

class TestPolymorphism3{
  public static void main(String[] args){
    Parent a;
    a = new subcalss1();
    a.Print();
    a= new subclass2();
    a.Print();
  }
}

//static method can not be overridden but can be overloaded.
