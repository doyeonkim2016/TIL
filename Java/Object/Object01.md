# Object 클래스의 메서드 활용

```java
class Book{

  private String title;
  private String author;
  
  public Book(String title, String author){
    this.title =title;
    this.author = author;
  }
  
  @Override
  public String toString(){
    retur title;
  }
}

public class BookTest{
  public static void main(String[] args)
    Book book = new Book("1","2");
    System.out.println(book.toString());
  }
}

```

## equals() method
- 두 인스턴스의 주소 값을 비교하여 True/False 를 반환
- 재정의하여 두 인스턴스가 논리적으로 동일함 여부를 구현
- 인스턴스가 다르더라도 논리적으로 동일한 경우 true 반환


## hashcode() method
- hashCode() 는 인스턴스의 저장 주소를 반환함
- 힙메모리에 인스턴스가 저장되는 방식이 hash방식
- has: 정보를 저장,검색하는 자료구조
- 자료의 특정 값(키 값)에 대한 저장 위치를 반환해주는 해시 함수 이용.
- index = hash(key)

```java

public class Student{
  private int studentNum;
  private String studentName;
  
  public Studnet(int studentNum, String studentName){
    this.studentNum = studentNum;
    this.studentName = studentName;
  }
  
  public String toString(){
    return studentNum;
  }
  public boolean equals(Object obj){
    if(obj instanceof Student){
      Student std = (Student)obj;
      if(this.stuentNum == std.studentNum){
        return true;
      }else return false;
    }
}

public class EqualsTest{
    public static void main(String[] args){
      student std1 = new Student (100, "Lee");
      student std2 = new Student (100, "Lee");
      
      //sopl(st1 ==st2) ->false
      //sopl(std1.equals(std2)); ->false
      //
