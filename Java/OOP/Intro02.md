# OverLoading
### 생성자 정의 하기
- 생성자를 구현해서 사용할 수 있음
- 클래스에 생성자를 따로 구현하면 기본 생성자는 제공되지 않음
- 생성자를 호출하는 코드에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있음.

# Encapsulation

### 정보 은닉을 활용한 캡슐화
- 꼭 필요한 정보와 기능만 외부에 오픈함
-  대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여 일관된 기능을 구현하게 함
-  각각의 메서드나 멤버 변수를 접든함으로써 발생 오류 최소화


```java

public class MakeReport{
  
  StringBuffer buffer = new StringBuffer();
  
  private String line="======";
  private String title =" 이름 \t";
  
  private void makeHeader(){
    buffer.append(line);
    buffer.append(title);
  }
  
  public String getReport(){
    makeHeader();
    return buffer.toString();
    
  }
  
}


public class MakeReportTest{
  public static static void main(String[] args){
      MakeReport builder = new MakeReport();
      String report = builder.getReport();
      System.out.println(report);
  }
}
```

### This 객체 자신을 가르키는

- 인스턴스 자신의 메모리를 가리킴
- 생성자에서 또 다른 생성자를 호출할 때 사용
- 자신의 주소 참조값을 반환함

### 생성된 인스턴스 메모리의 주소를 가짐

- 클래스 내에서 참조변수가 가지는 주소 값과 동일한 주소 값을 가지는 키워드

### 생성자에서 다른 생성자를 호출하는 this
- 클래스에 생성자가 여러개인 경우,this 를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
- 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement 사용 불가

```java
public class Person{
  String name;
  int age;
  public Person(){
  
    this("no name",1);
  }
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  
  
  public static void main(String[] args){
    Persone p = new Person();
    
  }

}
