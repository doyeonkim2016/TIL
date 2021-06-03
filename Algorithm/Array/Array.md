# Arrays  : Left Rotation

1. Create a new n-element (where n is the length of arr) array named rotated to hold the rotated items.
2. Copy the contents of arr over to the new array in two parts
   - The d element contiguous segment from arr0 to arr(d-1) must be copied over to the contiguous segment  starting at rotated(n-d)
   - The n-d element contiguous segment from arrd to arr(n-1) must be copied over to the contiguous segment starting at rotated0
3. Reassign the reference to arr so that it points to rotated instead.




## Other Methods
1. We can also create a more general function that dos account for d >n cases by adding a modulo division
Each time the rotation equals the length of the array, the array appears unchanged. Thus, the final rotation for d is same as the rotation fo 
i = d mod length(a) and we use that for our slic index.

``` python

#complete the solve function below.
def solve(a,d):
  i = d%len(a)
  return (a[i:]+a[:i])
```


```java

import java.util.*;
import java.lang.System;

public class Solution{
   public static int[] rotateArray(int[] arr, int d){
     int n = arr.length;
     int[] rotated = new int[n];
     System.arraycopy(arr,d,rotated,0,n-d);
     System.arraycopy(arr,0,rotated,n-d,d);
     return rotated;
   }
}
