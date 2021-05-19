# Method Overriding

## 하위 클래스에서 메서드 재정의 하기

- Overriding :  상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음


```java
@Override
public int calcPrice(int price){
  bonusPoint += price * bonusRatio;
  price -= (int) (price *salesRatio);
  return price;
}
```

# Polymorphism

- 하나의 코드가 여러 자료형으로 구현되어 나오는 것
- 같은 코드에서 여러 다른 실행 결과가 나옴
- 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나
- 다형성을 잘 활용하면 유연하고 확장성 있고, 유지보수가 편리한 프로그램을 만들 수 있다.

```java
class Animal{
  public void move(){
    System.out.println("Animal moving");
  }

}

class Human extends Animal{

  @Override 
  public void move(){
    System.out.println("2feet");
  }
  
  public void readBook(){
    System.out.println("Reading...");
  } 
}

public class AnimalTest{
  public static void main(String[] args){
  
    Animal hAnimal = new Human();
    AnimalTest test= new AnimalTest();
    test.moveAnimal(hAnimal);
  
  }
  
  public void moveAnimal(Animal animal){
    animal.move();
  }

}  
  
```
# insatnce of
## 다운 캐스팅
- 업캐스팅된 클래스를 다시 원래의 타입으로 형 변환
- 하위 클래스로의 형 변환은 명시적으로 해야함

```java
Customer vc = new VIPCustomer();
VIPCustomer vCustomer = (VIPCustomer)vc;
```

# 추상 클래스
- 구현 코드 없이 메서드의 선언만 있는 추상 메서드를 포함한 클래스
- 메서드 선언 (declaration): 반환타입,메서드 이름, 매개변수로 구성
- 메서드 정의(definition):메서드 구현 (implementation)과 동일한 의미 구현부(body)를 가짐
- abstract 예약어 사용
- 추상클래스는 new 할 수 없음(인스턴스화 할 수 없음)

## 추상 클래스 구현하기
- 메서드에 구현 코드가 없으면 abstract 선언
- abstract로 선언된 메서드를 가진 클래스는abstract로 선언
- 모든 메서드가 구현된 클래스라도 abstract로 선언되면 추상 클래스로 인스턴스화 불가능
- 추상 클래스의 추상메서드는 하위클래스가 상속하여 구현

```java

public class Computer{
  
  public abstract void display();
  public abstract void typing();
  
  void turnOn(){
    System.out.println("Turn on");
  }
  void turnOff(){
    System.out.println("Turn off");
  }
}

public class Desktop extends Computer{

  @Override
  public void display{
    Syetem.out.println("Desktop");
  }
  
}
```  

# 인터페이스 (interface)

- 인터페이스는 구현코드가 없다
- 모든 메서드가 추상메서드로 선언됨 public abstract
- 모든 변수는 상수로 선언됨 public static final

interface test{
  public static final float pi =3.14F;
  public void makeSomething();
}

- 클래스가 implements 구현하다.
- implement해도 호출 가능












