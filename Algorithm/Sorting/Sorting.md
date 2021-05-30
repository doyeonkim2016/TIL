# Sorting

## Sorting Array

```java

public void givenIntArray_whenUsingSort_thenSortedArray(){
  Arrays.sort(toSort);
  assertrue(Arrays.equals(toSort,sortedInts));
}

// Sorting Part of an Array

Arrays.sort(int[] a, int from Index, int toIndex


```

## Sorting List

```java

//Use Collections.sort();

public void givenList_whenUsingSort_thenSortedList() {
    List<Integer> toSortList = Ints.asList(toSort);
    Collections.sort(toSortList);

    assertTrue(Arrays.equals(toSortList.toArray(), 
    ArrayUtils.toObject(sortedInts)));
}

public void givenSet_whenUsingSort_thenSortedSet() {
    Set<Integer> integersSet = new LinkedHashSet<>(Ints.asList(toSort));
    Set<Integer> descSortedIntegersSet = new LinkedHashSet<>(
      Arrays.asList(new Integer[] 
        {255, 200, 123, 89, 88, 66, 7, 5, 1}));
        
    List<Integer> list = new ArrayList<Integer>(integersSet);
    Collections.sort(Comparator.reverseOrder());
    integersSet = new LinkedHashSet<>(list);
        
    assertTrue(Arrays.equals(
      integersSet.toArray(), descSortedIntegersSet.toArray()));
}

public void givenMap_whenSortingByKeys_thenSortedMap() {
    Integer[] sortedKeys = new Integer[] { 6, 12, 22, 55, 66, 77 };

    List<Map.Entry<Integer, String>> entries 
      = new ArrayList<>(map.entrySet());
    Collections.sort(entries, new Comparator<Entry<Integer, String>>() {
        @Override
        public int compare(
          Entry<Integer, String> o1, Entry<Integer, String> o2) {
            return o1.getKey().compareTo(o2.getKey());
        }
    });
    Map<Integer, String> sortedMap = new LinkedHashMap<>();
    for (Map.Entry<Integer, String> entry : entries) {
        sortedMap.put(entry.getKey(), entry.getValue());
    }
        
    assertTrue(Arrays.equals(sortedMap.keySet().toArray(), sortedKeys));
}

public void givenMap_whenSortingByValues_thenSortedMap() {
    String[] sortedValues = new String[] 
      { "Apple", "Earl", "George", "John", "Pearl", "Rocky" };

    List<Map.Entry<Integer, String>> entries 
      = new ArrayList<>(map.entrySet());
    Collections.sort(entries, new Comparator<Entry<Integer, String>>() {
        @Override
        public int compare(
          Entry<Integer, String> o1, Entry<Integer, String> o2) {
            return o1.getValue().compareTo(o2.getValue());
        }
    });
    Map<Integer, String> sortedMap = new LinkedHashMap<>();
    for (Map.Entry<Integer, String> entry : entries) {
        sortedMap.put(entry.getKey(), entry.getValue());
    }
        
    assertTrue(Arrays.equals(sortedMap.values().toArray(), sortedValues));
}

```

Refer https://www.baeldung.com/java-sorting
