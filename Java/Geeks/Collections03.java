/* 
Implementing Iterator and Iterable Interface

Every Class that implement sIterable interface appropriately, can be used in the enhanced For loop.The need to implement the Iterator interface
arises while designing custom data structures.

1.Implement Iterable interface along with its methods in the said Data Structure.
2.Create an Iterator class which implements Iterator interface and corresponding methods.
*/
class CustomDataStructure implements Iterable<>{
  public Iterator<> iterator(){
    return new CustomIterator<>(this);
  }
}
class CustomIterator<> implements Iterator{
  CustomIterator<>(CustomDataStructure obj){
  }
  
  public boolean hasNext(){
  }
  
  public T next(){
  }
  
  public void remove(){
  }

}

/*
How next() and hasNext() work?
To implement an Iterator, we need a cursor or pointer to keep track of which element we currently are on.
Depending on the underlying data structure, we can progress from one element to another.This is done in the next() method which returns the current element and the cursor advances to the next element.

While(iterator.hasNext()){
  next();
}

