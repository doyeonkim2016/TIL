# 객체 지향 핵심

1. 클래스 상속
- 새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속 받아서 속성이나 기능을 확장하여 클래스를 구현
- 이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할 때 기존 클래스를 상속
- extends 키워드 뒤에는 단 하나의 클래스만 올 수 있음
- 자바는 단일 상속(single inheritance)만을 지원함

2. 상속을 구현하는 경우
- 상위 클래스는 하위 클래스 보다 더 일반적인 개념과 기능을 가짐
- 하위 클래스는 상위 클래스보다 더 구체적인 개념과 기능을 가짐
- 하위 클래스가 상위 클래스의 속성과 기능을 확장 한다는 의미

eg) Cutomer and VIP Customer
```java
public class Customer{

  private int customerID;
  private String customerName;
  private String customerGrade;
  int bonusPoint;
  double bonusRatio;
  
  public Customer(){
    customerGrade ="SILVER";
    bonusRatio =0.01;
  }
  
  public int calcPrice(int price){
    bonusPoint += price * bonusRatio;
    return price;
  }

  public String show CustomerInfo(){
    return customerName + "님의 등급은 " + customerGrade  + "이며 , 보너스 포인트는 " +bonusPoint +"입니다.
  }
  
}
```
### 우수 고객 구현
- Customer Class 에 추가하면 코드의 복잡성 증가

```java

public class VIPCustomer extends Customer{
  double salesRatio;
  String agentID;
  
  public VIPCustomer(){
    bonusRatio =0.05;
    salesRatio =0.1;
    customerrade ="VIP";
  }
}

### protected 접근 제어자

- 상위 클래스에 선언된 private 멤버 변수는 하위 클래스에서 접근 x

### super 키워드

- 하위 클래스에서 가지는 상위 클래스에 대한 참조 값
- super()는 상위 클래스의 기본 생성자를 호출함
- 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출됨
- 상위 클래스의 기본 생성자가 없는 경우 하위 클래스에서는 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출
- super는 생성된 상위 클래스 인스턴스의 참조값을 가지므로 super를 이용하여 상위 클래스의 메서등나 멤버 변수에 접근할 수 있음


