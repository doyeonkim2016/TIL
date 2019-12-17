// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'

//Solution3
function reverse(str) {
   return str.split('').reduce((reveresed, character) => {
    return character +reveresed;
   },'');
    
}

module.exports = reverse;

//#Solution 1
//Logic
//1. Turn 'str' into an arry
//2. Call 'reverse' Method  on to array
//3. Join the Array back into a string
//4. Reverse the result

// function reverse(str) { 
//     const arr = str.split('');
//     arr.reverse();
//     return arr.join('');  
// }

//Solution 2
//Logic
//Create an empty string called 'reversed'
//For each character in the provided string
//Take the character and add it to the start of reversed
//Return the variable reversed 
// function reverse(str) {
//     let reversed ='';
//     for(let character of str){
//         reversed = character + reversed;
//     }
//     return reversed
// }
