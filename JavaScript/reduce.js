/* 
The reduce() method applies a function against an accumulator and each value of the array to rreduce it to a single value.

arr.reduce(callback[,initialvalue])

var total = [0,1,2,3].reduce(function(a,b){
  return a+b;
  });
//total ==6

var flattened = [[0,1].[2.3].[4.5]]/reduce(function(a,b){
  return a.concat(b);
 },[])'
 //flattened is [0,1,2,3,4,5]
