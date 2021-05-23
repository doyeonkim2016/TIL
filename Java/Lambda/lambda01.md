# Lambda Expression

## 함수형 프로그래밍과 람다식

- 자바는 객체 지향 프로그래밍: 기능을 수행하기 위해서는 객체를 만들고 그 객체 내부에 멤버 변수를 선언하고 기능을 수행하는 메서드를 구현
- 자바8부터 함수형 프로그래밍 방식을 지원하고 이를 람다식이라 함
- 함수의 구현과 호출만으로 프로그래밍이 되는 방식

### 람다식 문법
- 익명 함수 만들기
- 매개 변수와 배개변수를 이용한 실행문(매개변수)-> (실행문)
- 두 수를 입력 받아 더하는 add() 함수 예

```java
int add(int x, int y){
  return x+y;
}

// in LAMBDA
(int x, int y) -> (return x+y);

//매개변수가 하나인 경우 자료형과 괄호 생략 가능
//매개 변수가 두개 이상인 경우 괄호 생략 불가

public interface Add{
  public int add(int x , int y);
}

public class AddTest{
  public static void main(String[] args){
    Add addL =(x,y) -> {return x+y;};
    System.out.println(addL.add(2,3));
    

```
### 함수형 인터페이스 선언

- 람다식을 선언하기 위한 인터페이스
- 익병 함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메서드만을 선택
- @FunctionalInterface Annotation
- 여러개의 메서드를 선언하면 에러남



- 람다식 구현과 호출

```java
@Functionalinterface
public interface MyNumber{
  int getMax(int num1, int num2);
}

public class TestMyNumber{
  public static void main(String[] args){
    MyNumber max = (x,y) ->(x>=y)?x:y;
    System.out.println(myNumber.getMax(10,20));
  }
}
```

