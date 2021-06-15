# Longest Substring -Sliding Window Question

1. Create a Hashmap that stores Characters in String as Keys and their index as their value.
2. Keep two pointers which keep the max substring
3. Move the right pointer to read the string.
4. Update the Hashmap.
5. If the character is already in the hashmap, then move left pointer to the right.

```java
public int lengthOfLongestSubstring(String s){
  if( s.length() == 0){
    return 0;
  }
  HashMap<Character,Integer> map = new HashMap<Character,Integer>();
  int  max =0;
  
  for (int i = 0,j = 0; s.length(); ++i)}
    if(map.containsKey(s.charAt(i))){
      j = Math.max(j,map.get(s.charAt(i))+1);
    }
    map.put(s.charAt(i),i);
    max= Math.max(max,i-j+1);
  }
return max;
}
```
