/*
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU.
Each part of such program is called a thread. So threads are light weight processes within a process.

Threads can be created by using 2 mechanisms
1.Extending the Thread class
2. Implementing the Runnable Interface

Thread creation by extending the Thread Class

Create a class that extends the java.lang.Thread class. The class Overrides the run () method available in the Thread class. A trhead begins tis
life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. Start()
invokes the run() method on the Thread object.

*/

class Multithreading Demo extends Thread{
  public void run(){
    try{
      System.out.printoln(Thread.currentThread().getId());
    }
    catch(Exception e){
      System.out.println("Exception");
    }
  }
}

public class Multithread{
  public static void main(String[] args){
    int n = 8; 
    for (int i =0; i < n ; i ++)}
      MultithreadingDemo object = new Multithreading Demo();
      object.start();
    }
}

/*
Thread creation by Implementing the Runnable interface
We create a new class which implements java.lang.Runnable interface and override run() method. Then we instantiate a Thread object and call start() method on this object
*/

class MutithreadingDemo implements Runnable{
  public void run(){
    try{
      System.out.println(Thread.currentThread().getId());
    }
    catch(Exception e){
      System.out.prntln("Exception);
    }
  }
}
class Multithread{
  public static void main(String[] args){
    int n = 8; 
    for (int i = 0; i < n; i++){
      Thread object = new Thread(new MultithreadingDemo());
      object.start();
    }
  }
}
  
  
/*Thread Class vs Runnable Interface
1. If we extend the Thread class,our class cannot extend any other class because Java doesnt support multiple inheritance. But, if we 
implement the Runnable interface, our class can still extend other base classes.

2. We can achieve basic functionality of a thread by extending Thread Class because it provides some inbuilt methods like yield(),interrtupt() that are not available in Runnable Interface.
