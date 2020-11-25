//throw vs throws

//Throw keyword in Java is used to throw an exception from a method or any block of code.
class ThrowExcep 
{ 
    static void fun() 
    { 
        try
        { 
            throw new NullPointerException("demo"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.println("Caught inside fun()."); 
            throw e; // rethrowing the exception 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        try
        { 
            fun(); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.println("Caught in main."); 
        } 
    } 
} 


//throws
//throws is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions.
// Java program to illustrate throws 
class tst  
{ 
    public static void main(String[] args)throws InterruptedException 
    { 
        Thread.sleep(10000); 
        System.out.println("Hello Geeks"); 
    } 
} 

// Java program to demonstrate working of throws 
class ThrowsExecp 
{ 
    static void fun() throws IllegalAccessException 
    { 
        System.out.println("Inside fun(). "); 
        throw new IllegalAccessException("demo"); 
    } 
    public static void main(String args[]) 
    { 
        try
        { 
            fun(); 
        } 
        catch(IllegalAccessException e) 
        { 
            System.out.println("caught in main."); 
        } 
    } 
} 

//throws keyword is required only for checked exception and usage of throws keyword for unchecked exception is meaningless
//throws keyword is required only to convince compiler and usage of throws keyword does not prevent abnormal termination of program
//By the help of throws keyword we can provide information to the caller of the method about the exception.
