# Convert Iterator to a List in Java

```java

Iterator<Intger> iterator = Arrays.asList(1,2,3).iterator();

```

## Using While Loop

```java

List<Integer> actualList = new ArrayList<Integer>();
while(iterator.hasNext(){
  actualList.add(iterator.next());
}

assertThat(actualList,containsInAnyOrder(1,2,3));
      
```

## Using Java 8 Iterator.forEachRemaining

In java 8 and later, we can use the Iterator's forEachRemaining() method to build our List.
We will pass add() method of the List interface as a method reference.

```java

List<Intger> actualList = new ArrayList<Integer>();
iterator.forEachRemaining(actualList::add);

assertThat(actualList,containsInAnyOrder(1,2,3));

```

## Using the Java 8 Streams API

Next, we will use the Java 8 Streams API to convert the Iterator to a List. In order to use the Stream API.
We need to first convert the Iterator to an Iterable. We can do this using Java 8 Lambda.

```java
Iterable<Integer> iterable =() -> iterator;

List <Integer> actualList = streamSupport.stream(iterable.spliterator(),false).collect(Collectors.toLsit());
```

