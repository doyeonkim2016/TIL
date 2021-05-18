# Class

- 객체의 속성은 클래스의 멤버 변수(member variable)로 선언함
```java
public class Student{

  int studentNumber;
  String studentName;
  int majorCode;
  String majorName;
  int grade;

}

public class Order{
  int orderId;
  String buyerId;
  String sellerId;
  int productId;
  String orderDate;
}

```

- 함수(function)
하나의 기능을 수행하는 일련의 코드
구현된 함수는 호출하여 상ㅇ하고 호출된 함수는 기능이 끝나면 제어가 반환됨
함수로 구현된 하나의 기능은 여러 곳에서 동일한 방식으로 호출되어 사용될 수 있음

```java

public class FunctionTest{
  
  public static int addNum(int num1, int num2){
    int result;
    result = num1+ num2;
    return result;
  }
  
  public static void sayHello(String greeting){
    System.out.println(greeting);
  }
  
  public static int calcSum(){
    int sum =0;
    int i;
    for(i=0; i <=100; i++){
      sum+= i;
    }
    return sum;
  }
  
  public static void main(String[] args){
    int n1 = 10;
    int n2 = 20;
    int total = addNum(n1,n2);
    System.out.println(total);
    sayHello("Hi");
    total = calcSum();
    System.out.println(total);
  }
  ```
  ### 객체 속석은 멤버변수,객체 기능은 메서드로 구현
  
```java

public class Student{
  public int studentID;
  public String studentName;
  public String address;
  
  public void showStudentInfo(){
    System.ot.println(studentID+"학번의 이름"+ studentName+"주소는"+address);
  }
}

public class StudentTest{
  public static void main(String[] args){
    //Called as INSTANCE!!
    Student studentLee = new Student();
    studentLee.studentID=1245;
    studentLee.setStudentName("lee");
    studentLee.address="Seoul";
    
    studentLee.showStudentInfo();
  }
}
```
### 인스턴스
- 클래스는 객체의 속성을 정의, 기능을 구현하여 만들어 놓은 코드 상태
- 실제 클래스 기반으로 생성된 객체는 각각 다른 멤버 변수 값을 가지게 됨
- new 키워드를 사용하여 인스턴스 생성

### 힙 메모리
- 생성된 인스턴스는 동젝 메모리(heap memeory)에 할당됨
- 하나의 클래스로 부터 여러개의 인스턴스가 생성되고 각각 다른 메모리 주소를 가지게됨.
