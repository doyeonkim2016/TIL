# Sorting in Java

## Arrays.sort() 

```java
import java.util.Arrays;

public class Sort{
  public static void main(String[] args{
    int[] arr = {13,7,6,45,21,9,101,120}
    
    Arrays.sort(arr);
    
    System.out.println(Arrays.toString(arr));
  }
}


```

## Collection.sort()

- works for objects Collections like ArrayList and LinkedList.

```java

import java.util.*;

public class Test2{
  public static void main (String[] args){
  
  ArrayList<String> a1 = new ArrayList<String>();
  a1.add("ABC");
  a1.add("DEF");
  a1.add("GHI");
  
  Collections.sort(a1);
  System.out.println(a1);
}
```

## Sorting a List

```java

public void givenLst_whenUsingSort(){
  List<Integer> toSortList = Ints.asList(toSort);
  Collectiosn.sort(toSortList);
}

```

## Sorting  a SET

```java

Set<Integer> integersSet =new LinkedHashSet<>(Ints.asList(toSort));
Set<Integer> descSortedIntegersSet = new LinkedHashSet<>( Arrays.asList (new Integer [] {255,200,123,89,8,66,7,5,1}));

List<Integer> list = new ArrayList<Integer>(integersSet);
Collections.sort(Comparator.reverseOrder());
integersSet = new LinkedHashSet<>(list);
```
  
  
## Sorting Map

```java

public void initVariables(){
  HashMap<Integer,String> map = new HashMap<>();
  map.put(55,"John");
  map.put(22,"Apple");
  map.put(66,"Earl");
}  
//Sorting by Keys

public void givenMap_SortByKeys(){
  Integer[] sortedKeys= new Integer[] {6,12,22,55,66,77};
  
  List<Map.Entry<Integer,String>> entries = new ArrayList<>(map.entrySet));
  Collections.sort(entries, new Comparator<Entry<Integer,String>>(){
    @Override
    public int compare(
      Entry<Integer,String> o1,Entry<Integer,String> o2){
        return o1.getKey().compareTo(o2.getKey());
    }
  });
  Map<Integer, String> sortedMap = new LinkedHashMap<>();
  for(Map.Entry<integer,String> entry: entries){
    sortedMap.put(entry.getKey(), entry.getValue());
  }
  
}

``` 
# Entry 
1. Map 인터페이스의 내부 인터페이스입니다.
2. Map 에 저장되는 Key-value쌍을 다루기 위해 내부적으로 Entry 인터페이스를 정의해 놓았습니다.
3. Map 인터페이스를 구현하는 크래스에서는 Map.entry interface도 구현해야합니다.

```java
 Map<String, String> hashmap = new HashMap();
        hashmap.put("1", "프랑스");
        hashmap.put("2", "한국");
        hashmap.put("3", "미국");
        hashmap.put("4", "아랍에미리트");
        hashmap.put("5", "일본");

        System.out.println();
        System.out.println("변경전");
        for (Map.Entry m : hashmap.entrySet()) {
            System.out.printf("[번호 : %s\t국가 : %s]\n", m.getKey(), m.getValue());
        }

        // Value가 '일본'인 entry의 Value를 '중국'으로 변경
        for (Map.Entry m : hashmap.entrySet()) {
            if (m.getValue().equals("일본")) {
                m.setValue("중국");
            }
        
 ```
