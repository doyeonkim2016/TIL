/*
The method map of the Array prototype allows you to grab a hold of each element inside an array and apply function to them.
After map finishes iterating through the array, it will return a new array with the results of applying the function to the aforementioned elements.
*/

//Syntax
myAwesomeArray.map(myAwesomeFunction)
var names = ["Leia", "Anakin", "Luke", "Obi Wan Kenobi"];
var uppercaseNames = names.map(function(name) {
  return name.toUpperCase();
};
const arr = [1, 2, 3, 4];
const newArray = arr.map(element => element * 2);
console.log(newArray);
//[2, 4, 6, 8]
