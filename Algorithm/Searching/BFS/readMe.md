# BFS Maze Solver in Java

We will explore possible ways to navigate maze using java

## DFS 
Algorithm
One fairly obvious approach is to explore all possible paths, whicih will ultimately find a pth if it exists.
But such an approach will have exponential complexity and will not scale well.
However, its possible to customise the brute force solution mentioned above, by backtracking and marking visited node, 
to obtain a path in a reasonable time.

1. If we are at the wall or and already visited node, return failure.
2. Else if we are the exit node. then return success
3. Else add the node in path list and recursively travel in all four directions.If failure is returned, remove the node from the path and return failure.
4. 

```java
//Define four directions. We can define this in terms of coordinates.
private static int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

private Coordinate getNextCoordinate{
  (int row, int col, int i, intj){
    return new Coordinate (row+i,col +j);
}

