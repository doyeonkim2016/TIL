# 자바에서 제공되는 자료구조 구현 클래스들 - Collection Framework
- Data structure
- Collection -> (list(ArrayList,Vector,LinkedList)),(Set(HashSet,TreeSet)) =Iterator=> Map(Hashtable,HashMap,TreeMap)

## LIST-순차적으로 자료를 관리하는 List 인터페이스를 구현한 클래스와 그 활용

```java

// Creating ArrayList
//ArrayList is a generic class -> parameterize it with any type you want
//1.1 Default No-arg constructor
List<String> list = new ArrayList<>();
assertTrue(list.isEmpty());


//1.2 Constructor Accepting Initial Capacity
List<String> list = new ArrayList<>(20);

//1.3 Add Elements to ArrayList
List<long> list = new ArrayList<>();
list.add(1L);
list.add(2L);
list.add(1,3L);
assertThat(Arrays.asList(1L,3L,2L),equalTo(list));

//1.4 Iterate over the ArrayList
//2 types: Iterator and ListIterator
//Iterator gives you an opportunity to traverse the list in one direction, the latter allows you to traverse it in both directions

List<Integer> list = new ArrayList<>(
  IntStream.range(0,10).boxed().collect(toColection(ArrayList::new)));
ListIterator<Integer> it = list.listIterator(list.size());
List<Integer> result = new ArrayList<>(list.size());
while(it.hasPrevious()){
  result.add(it.previous());
}
Collections.reverse(list);
assertThat(result,equalto(list)

//1.5 Search the ArrayList 
List<String> list = LongSream.range(0,16)
  .boxed()
  .map(Long::toHexString)
  .collect(toCollection(ArrayList::new));
 
List<String> stringsToSearch = new ArrayList<>(list);
stringsToSearch.addAll(list);

//In order to find an element you may use indexOf() or lastIndexOf() method.
assertEquals(10,stringsToSearch.indexOf("a"));
assertEquals(26,stringsToSearch.lastIndexOf("a"));

//predicate-Java 8 stream API
Set<String> matchStrings = new HashSeT<>(Arrays.asList("a","c","9"));
List<String> result = stringsToSearch
  .stream()
  .filter(matchingStrings::contains)
  .collect(toCollection(ArrayList::new));
  
assertEquals(6,result.size());


//forloop or Iterator
Iterator<String> it = stringsToSearch.iterator();
Set<String> matchingStrings = new HashSet<>(Arrays.asList("a","c","9"));

List<String> result = new ArrayList<>();
while(it.hasNext()){
  String s = it.next();
  if(matchingStrings.contains(s)){
    result.add(s);
  }
}


//5.2 Searhcing a Sorted list
List<String> copy = new ArrayList<>(stringsToSearch);
Collections.sort(copy);
int index = Collections.binarySearch(copy,"f");
assertThat(index,not(equaltTo(-1));
//If an element is not found then -1 will be returned.

 
