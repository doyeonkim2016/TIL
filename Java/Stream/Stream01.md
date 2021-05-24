# Stream 

- 자료의 대상과 관계없이 동일한 연산 수행
- 배열, 컬렉션을 대상으로 연산을 수해함
- 일관서 있는 연산으로 자료의 처리를 쉽고 간단하게 함
- 자료 처리에 대한 추상화가 구현되었다고 함

- 한번 생성하고 사용한 스트림은 재사용 불가
- 자료에 대한 스트림을 생성하여 연산을 수행하면 스트림은 소모됨
- 다른 연산을 수행하기 위해서는 스트림을 다시 생성해야함

- 스트림 연산은 기존 자료를 변경하지 않음
- 자료에 대한 스트림을 생성하면 스트림이 사용하는 메모리 공간은 별도로 생성

- 스트림 연산은 중간 연산과 최종 연산으로 구분 됨
- 스트림에 대해 중간 연산은 여러 개의 연산이 적용될 수 잇지만 최종연산은 마지막에 한 번만 적용됨
- 최종 연산이 호출되어야 중간 연산에 대한 수행이 이루어 지고 그 결과가 만들어짐
- 따라서 중간 연산에 대한 결과를 연산 중에 알 수 없음
- 지연 연산




```java

public class intArrayStreamTest{
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        for(int num :arr){
            System.out.println(num);
        }
        //forEach 는 하나씩 꺼냄
        Arrays.stream.forEach(n->System.out.println(n));
      
        IntStream is = Arrays.stream(arr);
        is.forEach(n->System.out.prinln(n));
      //또 다른 연산을 하기 위해서는 새로 생성
        int sum =Arrrays.stream(arr).sum();
        System.out.println(sum);
    }
}
```

### 중간 연산과 최종 연산

- 중간 연산의 예 - filter(), map(), sorted()등
- 조건에 맞는 요소를 추출 하거나 요소를 변환함
- 최종 연산이 호출 될 때 중간 연산이 수행되고 결과가 생서됨
- 문자열 리스트에서 문자열의 길이가 5 이상인 요소만 출력

```java
sList.stream().filter(s->s.length() > = 5).forEach(s->Systm.out.println(s));

customerList.stream().map(c->c.getName()).forEach(s->System.out.prinln(s));
```
