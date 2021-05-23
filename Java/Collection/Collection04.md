# Comparale & Comparator interface

## TreeSet

- 객체의 정렬에 사용하는 클래스
- Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬
- 내부적으로 이진검색트리(Binary Search Tree)로 구현됨
- 이진검색트리에 저장하기 위해 각 객체를 비교해야함
- 비교 대상이 되는 객체에 Comparable 이나 Comparator 인터페이스를 구현해야 TreeSet에 추가될 수 있음
- String, Integer 등 JDK의 많은 클래스들이 이미 Comparable 구현

```java

//매개변수 1개
public class Member implements Comparable<Member>{
@Override
  public int compareTo(Member member){
    //travere then i will be in ascending order

    if(this.memberId> member.memberId){
      return 1;
    }else if(this.memberId < member.memberId)
      return -1;
    else return 0;

   //
   return(this.memberId -member.memberId);
  }
}

//매개변수 2개
public class Member implements Comparator<Member>{
@Override
  public int compare(Member member1,Member member2){
    return (member2.memberId- member1.memberId;
  }
}
