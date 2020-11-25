//Exception is unwanted or unexpected event, which occurs during the execution of a program 
//Error: An Error indicates serious problem that a reasonable application should not try to catch
//Exception: Exception indicates conditions that a reasonable application might try to catch

//Exception Hierarchy
//All exception and errors types are sub classes of class Throwable, which is base class of hierarchy.


//Q. How programmer handles an exception?
//Customised exception handling. Java exception handling is managed via five keywords: try, catch, throw , throws and finally.
//To manually throw an exception, use the keyword throw. Any exception that is thrown out of a method must be specified as such by throws clause.

try{ 
//block of code to monitor for errors
// the code you think can raise an exception
}
catch( ExceptionType1 exOb){
//exception handler for ExceptionType1
}
catch(ExceptionType2 exOb){
//exception handler for ExceptionType2
}
//optional
finally{
//block of code to be executed after try block ends
}

//In a method, there can be more than one statements that might throw exception,so put all these statements within its own try block
//If an exception occurs within the try block, that exception is handled by the exception handler associated with it.
//Each catch block is a exception handler that handles the exception of the type indicated by its argument. The argument, ExceptionType 
//declares the type of the exception that it can handle and must be the name of the class that inherits from Throwable class.
