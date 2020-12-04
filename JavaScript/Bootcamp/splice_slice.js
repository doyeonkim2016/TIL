/*
The splice() method changes the contents of an arry by removing or replacing existing elements and/or adding new elements in place
The start index is at which to start changing the array
*/
const months =['Jan' ,'March' ,'April','June'];
months.splice(1,0,'Feb');
console.log(months);
months.splice(4,1,'May');
console.log(months);


/*The slice() method returns a shallow copy of a portion of an array into a new array object selected from start to end  where
start and end represent the index of items in that array.
*/

const animals=['ant','bison','camel','duck','elephant'];
console.log(animals.slice(2));
console.log(animals.slice(2,4));

