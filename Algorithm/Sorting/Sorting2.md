## Selection Sort

-선택 정렬을 가장 작은 데이터를 앞으로 보내는 과정을 n-1번 반복하여 정렬이 완료되도로간다.

```py
array = [7,5,9,0,3,1,6,2,4,8]

for i in range(len(array)):
  min_index =i
  for j in range(i+1,len(array)):
    if array[min_index] > array[j]:
      min_index = j
  aray[i],array[min_index] = array[min_index],array[i]
  
print(array)
```

선택 정렬은 N-1번만큼 가장 작은 수를 찾아서 맨 앞으로 보내야한다.
연산 횟수는  N+ N-1 + N-2 +... +2


## Insertion Sort

-삽입 정렬은 특정한 데이터를 적절한 위치에 삽입한다는 의미에서 Insertion Sort이라고 부른다. 
-삽입 정렬은 두번째 부터 시작

```py
array =[7,5,9,0,3,1,6,2,4,8]

for i in range(1,len(array)):
  for j in range(i,0,-1):// 인덱스 i 부터 1까지 감소하며 반복하는 문법
    if array[j] < array[j-1]:
      arra[j],array[j-1] = array[j-1],array[j]
    else:
      break
#ON^2

```


## Quick Sort

퀵 정렬 - 기준 데이터를 설정하고 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾸면 어떨까?
퀵 정렬은 기준을 설정한 다음 큰 수와 작은 수를 교환한 후 리스트를 반으로 나누는 방식으로 동작한다.
퀵정렬에서는 Pivot이 사용된다. 
```py
array =[5,7,9,0,3,1,6,2,4,8]

def quick_sort(array, start, end):
  if start >= end:
    return
  pivot = start
  left = start +1
  right = end
  while left <= right:
    while left <= end and array[left] <=array[pivot]:
      left+=1;
    while right > start and array[right] >= array[pivot]:
      right-=1;
    if left > right:
      array[right],array[pivot] = array[pivot],array[right];
    else:
      array[left],array[right] = array[right],array[left]

quicksort(array,start,right-1);
quicksort(array,right+1,end);

```
