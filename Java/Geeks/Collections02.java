//Collection vs Collections in Java with Example

/*
Collection
: Collection is a interface present in java.util.package. It is used to represent a group of individual objects as a single unit. It is similar
to the container in the C++ language. The collection is considered as the root interface of the collectino framework. It provides several classes
and interfaces to represent a group of individual objects as a single unit.

add(),remove(),clear(),size() and contains() are the important methods of the Collection interface

Collections 
: Collections is a utility class present in java.util.package. It defines several utility methods like sorting and searching which is used to oeprate on collection.
It has all static methods. These methods provide much needed convenience to developers,allowing them to effectively work with Collection Framework.
*/

import java.util.*; 
  
class GFG { 
    
    public static void main (String[] args)  
    { 
        
      // Creating an object of List<String> 
      List<String> arrlist = new ArrayList<String>();  
        
      // Adding elements to arrlist 
      arrlist.add("geeks"); 
      arrlist.add("for"); 
      arrlist.add("geeks"); 
        
      // Printing the elements of arrlist 
      // before operations 
      System.out.println("Elements of arrlist before the operations:"); 
      System.out.println(arrlist); 
        
      System.out.println("Elements of arrlist after the operations:"); 
        
      // Adding all the specified elements 
      // to the specified collection 
      Collections.addAll(arrlist, "web", "site"); 
        
      // Printing the arrlist after 
      // performing addAll() method 
      System.out.println(arrlist); 
        
      // Sorting all the elements of the   
      // specified collection according to  
      // default sorting order 
      Collections.sort(arrlist); 
          
      // Printing the arrlist after 
      // performing sort() method 
      System.out.println(arrlist); 
          
    } 
}
