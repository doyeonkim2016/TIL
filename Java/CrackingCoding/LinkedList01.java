//Linked List (one way)
Class  Node{
  Node next = null;
  int data;
  public Node(int d){
    data = d;
  }
  
  void appendToTail(int d){
    Node end = new Node(d);
    Node n = this;
    while(n.next != null){
      n= n.next;
    }
    n.next = end;
  }
}

//Adding node into Linked List
//1. New node from the start of the list
public void  push(int new_data){
  Node new_node = new Node(new_data);
  new_node.next =head;
  head =new_node;
}

//2.Add in the middle
public void insertAfter(Node prev_node, int new_data){
  if (prev_node == null){
    return null;
  }
  Node new_node = new Node(new_data);
  new_node.next = prev.node.next;
  prev_node.next=new_node;
}



//Removing duplicates from the linked list
Node deleteNode(Node head, int d){
  Node n = head;
  if(n.data ==d){
    return head.next;
  }
  while (n.next != null){
    if(n.next.data ==d){
      n.next =n.next.next;
      return head;
  }
  n= n.next;
}
return head;

}
