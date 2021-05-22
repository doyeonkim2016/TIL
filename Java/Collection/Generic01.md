# Generic Programming

## 제네릭 자료형 정의

- 클래스에서 사용하는 변수의 자료형이 여러개일수도 있고, 그 기능은 동일한 경우 클래스의 자료형을 특정하지 않고 추후 해당 클래스를 사용할 때 지정할 수 있도로 서넝ㄴ
- 실제 사용되는 자료형의 변환은 compiler에 의해 검증되므로 안정적인 프로그래밍 방식
- collection framework에서 많이 사용되고 있음


## Generic Method 활용
- 자료형 매개변수를 메서드의 매개변수나 반환 값으로 가지는 메서드
- 자료형 매개변수가 하나 이상인 경우도 있음
- 제네렉 클래스가 아니어도 내부에 제네릭 메서드는 구현하여 사용 가능
- public <자료형 매개변수> 반황형 메서드 이름 (자료형 매개변수...){}

```java

public class Point<T,V>{
  T x;
  V y;
  
  Point(T x, V y){
    this.x =x;
    this.y =y;
  }
  
  public T getX(){
    return x;
  }
  
  public V getY(){
    return y;
  }
}

public GenericMethod{

  public static <T , V > double makeRectangle(Point <T, V> p1, Point <T, V> p2){
    double left= ((Number)p1.getX()).doubleValue();
    double right=((Number)p1.getX()).doubleValue();
    double top = ((Number)p1.getY()).doubleValue();
    double bottom = ((Number)p1.getY()).doubleValue();
 
    double width = right - left;
    double height = bottom-top;
    
    return width *hegiht;
  }
  
  public static void main(String][ args){
    Point<Integer,Double> p1 = new Point<Integer,Double>(0,0.0);
    Point<Integer, Double> p2 = new Point<>(10,10.0);
    
    double size = GenericMethod.<Integer, Double>makeRectangle(p1,p2);
  }
}














