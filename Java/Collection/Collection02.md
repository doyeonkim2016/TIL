# TreeSet in Java

- Tree Set is sorted collection that extends the AbstractSet class and implements NavigableSet interface
- Unique Values
- Doesnt Preserve the insertion order
- sorts in ascending
- not thread safe

```java
Set<String> treeSet= new TreeSet<>();

Set<String> treeSet = new TreeSet<>(Comparator.comparing(String::length);
Set<String> syncTreeSet = Collections.synchronizedSet(treeSet);

//2.1 add()
public void whenAddingElement){
  Set<String> treeSet =new TreeSet<>();
  assertTrue(treeSet.add("String Added"));
}

//2.3 contains() 
public void SearchForelemenr(){
  Set<String> treeSetContains = new TreeSet<>();
  treeSetContains.add("String Added");
  assertTrue(treeSetContains.contains("String Added"));
}

//2.4 iterator()
public void IteratingTreeSet(){
  Set<String> treeSet = new TreeSet<>();
  treeSet.add("First");
  treeSet.add("Second");
  Iterator<String> itr = treeSet.iterator();
  while(itr.hasNext()){
    System.out.println(itr.next());
  }
}

//Elements inserted into the TreeSet must either implement Comparable interface.All such elements must be mutually comparable
//e1.compareTo(e2) or comparator .compare(e1,e2) must not throw ClassCastException

