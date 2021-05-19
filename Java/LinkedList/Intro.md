# Linked List


```java

package list.linkedlist.implementation;

public class LinkedList{
}


public class Main{
  public static void main(String[] args){
    LinkedList numebrs = new LinkedList();
```

- Linked List 에서 가장 중요한것은 노드의 구현이다.
- 노드는 실제로 데이터가 저장되는 그릇이다. 노드는 객체로 만들이 딱 조ㅎ은 대상
- 대부분 private으로 지정
- head 는 첫번째 노드를 지정하는 참조값 Tail은 꼬리.

```java
public class LinkedList{
  private Node headl
  private Node tail;
  private int size = 0;
  private class Node{
    private Object data;
    priavte Node next;
    public Node(Object input){
      this.data =input;
      this.next = null;
    }
   
   public String toString(){
    return String.valueOf(this.data);
   }
}
```
- 데이터 추가
```java

public void addFirst(Object input){
  Node newNode = new Node(input);
  newNode.next = head;
  head =newNode;
  size++
  if(head.next == null){
    tail = head;
  }
}

```

```java

public void addLast(Object input){
  Node newNode = new Node(input);
  if(size == 0){
  addFirst(input);
  }
  else{
  tail.next = newNode;
  tail = newNode;
  size++;
}

```
```java
public void add(int k , Object input){
  if k == 0
    addFirst(input);
  else{
    Node temp1 =node(k-1);
    Node temp2 = temp1.next;
    
    Node newNode = new Node(input);
    newNode.next = temp2;
    size++;
    
    if(newNode.next == null){
      tail = newNode;
    }
    
  }
}
```

