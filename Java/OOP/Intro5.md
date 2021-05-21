# DAO 구현하기

- DB에 회원 정보를 넣은 DAO( Data Access Object) 를 여러 DB제품이 지원될 수 있게 구현함

```java
public class UserInfor{

  private String userId;
  private String password;
  private String userName;
  
}


public interface UserInfoDao{

  void insertUserInfor(UserInfor userInfo);
  void updateUserInfor(UserInfor userInfo);
  void deleteUserInfor(UserInfor userInfo);

}


public class UserInfoMySqlDao implements UserInfoDao{

  @Override
  public void insertUserInfor(UserInfo userInfo){
    System.out.println(userInfo.getUserID());
  }
  //...
  
}

```

# 인터페이스의 여러가지 요소

- Default Method
- 구현을 가지는 메서드 , 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수있는 기본 메서드
- default 사용



# 여러 인터페이스 구현하기, 인터페이스의 상속

## 클래스 상속과 인터페이스 구현

```java
public class Shelf{
  protected ArrayList<String> shelf;
  public Shelf(){
    shelf = new ArrayList();
  }
  public ArrayList<String> getShelf(){
    return shelf;
  }
  
  void int getCount(){
    return shelf.size();
  }
}

public interface Queue{
  void enQueue(String title);
  String deQueue();
  int getSize();
}

public class BookShelf extends Shelf implements Queue{
  @Override
  public void enQueue(String title){
    shelf.add(title);
  }
  
  @Override
  public String deQueue(){
    return shelf.remove(0);
  }
}


public class BookShelftest{
  public static void main(String[] args){
    Queue bookQueue= bew BooksShelf();
    bookQueue.enQueue("str1");
    System.out.println(bookQueue.getSize());
  }
}

}

