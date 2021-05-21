# Converting Iterator to List

```java
Iterator<Integer> iterator = Arrays.asList(1,2,3).iterator();

//Using while loop
List<Integer> actualList = new ArrayList<Integer>();
while(iterator.hasNext()){
  acualList.add(iterator.next());
}


//Iterator.forEachRemaining

List<Integer>actualList = new ArrayList<Integer>();
iterator.forEachRemaining(actualList::add);


//Java8 Streams API
//First convert the Iterator to Iterable

Iterable<Integer> iterable = () -> iterator;

// Use the StreamSupport class ' stream() and collect methods to build the List
List<Integer> actualList = StreamSupport.stream(iterable.sppliterator(),false).collect(Collectors.toList());

```


