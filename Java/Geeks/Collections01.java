//Collections in Java
//Collection interface and Map interface are the two main root interfaces of Java collection classes.

//Collections class is a member of Java Collections Framework. Collection class is basically used with the static methods that operate on the collections or return th ecollection.
//1. Adding Elements
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
  
class AddingElements { 
    public static void main(String[] args) 
    { 
        // create a list 
        List<String> items = new ArrayList<>(); 
  
        // add items to the list 
        items.add("Shoes"); 
        items.add("Toys"); 
  
        // Add one or more elements 
        Collections.addAll(items, "Fruits", "Bat", "Ball"); 
  
        // print the list contents 
        for (int i = 0; i < items.size(); i++) { 
            System.out.print(items.get(i) + " "); 
        } 
    } 
}

//2.Sorting Colection
//java.util.Collections.sort() is used to sort the elements present in the specified list of collection in ascending order..
//java.util.Collections.reverseOrder() is used to sort in the descending order.
// Java program to demonstrate sorting a 
// Collections using sort() method 
  
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
  
class SortingCollectionExample { 
    public static void main(String[] args) 
    { 
          // create a list 
        List<String> items = new ArrayList<>(); 
            
          // add elements to the list 
        items.add("Shoes"); 
        items.add("Toys"); 
            
          // add one or more elements 
        Collections.addAll(items, "Fruits", "Bat", "Mouse"); 
  
        // sorting according to default ordering 
        Collections.sort(items); 
            
          // print the elements 
        for (int i = 0; i < items.size(); i++) { 
            System.out.print(items.get(i) + " "); 
        } 
        System.out.println(); 
  
        // sorting according to reverse ordering 
        Collections.sort(items, Collections.reverseOrder()); 
  
          // print the reverse order 
        for (int i = 0; i < items.size(); i++) { 
            System.out.print(items.get(i) + " "); 
        } 
    } 
}

//3.Searching in a Collection
//java.util.Collections..binarySearch() method returns the position of an object in  sorted list.
//To use this method, the list should be sorted in ascending order.
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
  
public class BinarySearchOnACollection { 
    public static void main(String[] args) 
    { 
          // create a list 
        List<String> items = new ArrayList<>(); 
            
          // Add elements 
        items.add("Shoes"); 
        items.add("Toys"); 
        items.add("Horse"); 
        items.add("Ball"); 
        items.add("Grapes"); 
  
          // sort the list 
        Collections.sort(items); 
            
          // binarySearch on the list 
        System.out.println( 
            "The index of Horse is "
            + Collections.binarySearch(items, "Horse")); 
            
          // binarySearch on the list 
        System.out.println( 
            "The index of Dog is "
            + Collections.binarySearch(items, "Dog")); 
    } 
}

//4.Copying Elements
//The copy() method of java.util.Collections class is used to copy all the elements from one list into another.
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
  
class CopyOneCollectionToAnother { 
    public static void main(String[] args) 
    { 
        // create destination list 
        List<String> destination_List = new ArrayList<>(); 
  
        // add elements 
        destination_List.add("Shoes"); 
        destination_List.add("Toys"); 
        destination_List.add("Horse"); 
        destination_List.add("Tiger"); 
  
        // print the elements 
        System.out.println( 
            "The Original Destination list is "); 
        for (int i = 0; i < destination_List.size(); i++) { 
            System.out.print(destination_List.get(i) + " "); 
        } 
        System.out.println(); 
  
        // create source list 
        List<String> source_List = new ArrayList<>(); 
        source_List.add("Bat"); 
        source_List.add("Frog"); 
        source_List.add("Lion"); 
  
        // copy the elements from source to destination 
        Collections.copy(destination_List, source_List); 
  
        // printing the modified list 
        System.out.println( 
            "The Destination List After copying is "); 
        for (int i = 0; i < destination_List.size(); i++) { 
            System.out.print(destination_List.get(i) + " "); 
        } 
    } 
}
