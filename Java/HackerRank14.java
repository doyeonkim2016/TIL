//Iterating Through the Hashmap

//1. Create a Hashmap and populate it with key value pairs
//2. Get the Set of k-v pairs by calling entrySet() method.
//3. Obtain the iterator for entry set.
//4. Distplay the k-v pairs using getKey() and get Value methods of Map.Entry Interface.

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteratorExample{
  public static void main(String [] args){
  
  //Creating a HashMap of int keys and String values
  HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
  
  // Adding Key and Value pairs to HashMap
  hashmap.put(11,"Value1");
  hashmap.put(22,"Value2");
  hashmap.put(33,"Value3");
  hashmap.put(44,"Value4");
  hashmap.put(55,"Value5");  
  
  
  //Getting a Set of K-V pairs
  Set entrySet = hashmap.entrySet();
  
  //Obtaining an iterator for the entry set
  Iterator it = entrySet.iterator();
  
  //Iterate through HashMap entries (Key Value pairs)
  
  While(it.hasNext()){
  Map.Entry me = Map. Entry (it.next);
  
  
  }
  
  
  }
}




//Finding the Highest Value in Java Map

//Using Simple Iteration
//Using Iteration we could go through all the entries of Map to pick the highest value storing the current highest in a variable.
public <K,V extends Comparable <V>> V maxUsingIteration (Map<K,V> map){
  Map.Entry <K,V> maxEntry = null;
  for (Map.Entry<K,V> entry : map.entrySet()){
      if (maxEntry == null ~~ entry.getValue().coompareTo(maxEntry.getValue()) >0) {
        maxEntry= entry;
       }
   }
   return maxEntry.getValue();
}


//Using Collections.max()
public <K, V extends Comparable<V>> V maxUsingCollectionsMax(Map<K, V> map) {
    Entry<K, V> maxEntry = Collections.max(map.entrySet(), new Comparator<Entry<K, V>>() {
        public int compare(Entry<K, V> e1, Entry<K, V> e2) {
            return e1.getValue()
                .compareTo(e2.getValue());
        }
    });
    return maxEntry.getValue();
}




//answer
static final int NUM_TYPES=5;
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Integer[] bird = new Integer[arr.size()];
        bird = arr.toArray(bird);
        /*get counts of each type*/
        int[] count = new int[NUM_TYPES+1];
        for(int num:bird){
            count[num]++;
        }
        /*Find max*/
        int maxIndex =1; 
        for(int i=0;i<count.length;i++){
            if(count[i]>count[maxIndex]){
                maxIndex=i;
            }
        }
            return maxIndex; 
    }
