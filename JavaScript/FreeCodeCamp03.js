/*When an object inherits its prototype from another object, it also inherits the supertype's constructor property.

function Bird(){}
Bird.prototype = Object.create(Animal.prototype);
let duck = new Bird();
duck.constructor

But duck and all instances of Bird should show that they were constructed by Bird and not Animal.
To do so, you can manually set Bird's constructor property to Bird object

Bird.prototype.constructor =Bird;
duck.constructor
*/

/*
Add methods after inheritance

A constructor function that inherits its prototype object from a supertype constructor function can still have its own methods in addition to inherited methods.
Bird is a constructor that inherits its prototype from Animal.

function Animal(){}
Animal.prototype.eat =function(){
  console.log("Nom");
};
function Bird(){}
Bird.prototype = Object.create(Animal.protype);
Bird.prototype.constructor= Bird;

*/


