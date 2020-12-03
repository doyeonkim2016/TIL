/*Lifecycle and States of Thread in Java
1. New
-Whena new thread is created, it is in the new state.The thread has not yet started to run when thread is in this state.When a thread lies in the new state, 
its code is yet to be run and hasnt started to execute.

2. Runnable
-A thread that is ready to run is moved to runnable state. In this state, a thread might actually be running or it might be ready run 
at any instant of time. It is the responsibility of the thread scheduler to give the thread,time to run

3. Blocked
4. Waiting
When a thread is temporarily inactive, then it’s in one of the following states:
For example, when a thread is waiting for I/O to complete, it lies in the blocked state. It’s the responsibility of the thread scheduler to reactivate and schedule a blocked/waiting thread. A thread in this state cannot continue its execution any further until it is moved to runnable state. Any thread in these states does not consume any CPU cycle.
If a currently running thread is moved to blocked/waiting state, another thread in the runnable state is scheduled by the thread scheduler to run.


5. Time Waiting
A thread lies in timed waiting state when it calls a method with a time out parameter.A thread lies in this state until the timeout is completed or until a notification is received

6. Terminated

A thread terminates because of either of the following reasons:
Because it exists normally. This happens when the code of thread has entirely executed by the program.
Because there occurred some unusual erroneous event, like segmentation fault or an unhandled exception.
A thread that lies in a terminated state does no longer consumes any cycles of CPU.
*/

class thread implements Runnable 
{ 
    public void run() 
    { 
        // moving thread2 to timed waiting state 
        try
        { 
            Thread.sleep(1500); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        } 
          
        System.out.println("State of thread1 while it called join() method on thread2 -"+ 
            Test.thread1.getState()); 
        try
        { 
            Thread.sleep(200); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        }      
    } 
} 
  
public class Test implements Runnable 
{ 
    public static Thread thread1; 
    public static Test obj; 
      
    public static void main(String[] args) 
    { 
        obj = new Test(); 
        thread1 = new Thread(obj); 
          
        // thread1 created and is currently in the NEW state. 
        System.out.println("State of thread1 after creating it - " + thread1.getState()); 
        thread1.start(); 
          
        // thread1 moved to Runnable state 
        System.out.println("State of thread1 after calling .start() method on it - " +  
            thread1.getState()); 
    } 
      
    public void run() 
    { 
        thread myThread = new thread(); 
        Thread thread2 = new Thread(myThread); 
          
        // thread1 created and is currently in the NEW state. 
        System.out.println("State of thread2 after creating it - "+ thread2.getState()); 
        thread2.start(); 
          
        // thread2 moved to Runnable state 
        System.out.println("State of thread2 after calling .start() method on it - " +  
            thread2.getState()); 
          
        // moving thread1 to timed waiting state 
        try
        { 
            //moving thread1 to timed waiting state 
            Thread.sleep(200); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        } 
        System.out.println("State of thread2 after calling .sleep() method on it - "+  
            thread2.getState() ); 
          
          
        try 
        { 
            // waiting for thread2 to die 
            thread2.join(); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        } 
        System.out.println("State of thread2 when it has finished it's execution - " +  
            thread2.getState()); 
    } 
      
} 

/*
hen a new thread is created, the thread is in the NEW state. When .start() method is called on a thread, the thread scheduler moves it to Runnable state. Whenever join() method is called on a thread instance, the current thread executing that statement will wait for this thread to move to Terminated state. So, before the final statement is printed on the console, the program calls join() on thread2 making the thread1 wait while thread2 completes its execution and is moved to Terminated state. thread1 goes to Waiting state because it is waiting for thread2 to complete it’s execution as it has called join on thread2.
*/
