/* 
Addition of each elements of Linked List

Input  L1: 7-> 1-> 6 L2: 5->9->2
Result 2-> 1-> 9

*/
LinkedListNode addlists(LinkedListNode l1, LinkedListNode l2, int carry){
  if(l1 == null && l2 == null && carry ==0){
    return null;
  }
  
  LinkedListNode result = new LinkedListNode();
  int value = carry;
  if( l1 != null){
    value += l1.data;
  }
  if (l2 != null){
    value += l2.data;
  }
  result.data = value %10;
  
  if(l1!= null || l2 != null){
    LinkedListNode move= addLists(l1 == null ? null : l1.next,l2==null? null :l2.next, value >=10 ?1 :0)
  }
  result.setNext(move);
  }
  return result;
 }
