/*
1.Until now, you have been adding properties to the prototype individually

Bird.prototype.numLegs = 2;

More efficient way is to set the prototype to a new object that already contains the properties.This way
the properties are added all at once.
*/

Bird.prototype ={
  numLegs :2,
  eat: function(){
    console.log("nom nom");
  },
  describe : function() {
    console.log("My name is" + this.name);
  }
};

//2. Remember to set the constructor property when changing the prototype

function Dog(name) {
  this.name = name;
}

// Only change code below this line
Dog.prototype = {
  constructor:Dog,
  numLegs: 4,
  eat: function() {
    console.log("nom nom nom");
  },
  describe: function() {
    console.log("My name is " + this.name);
  }
};

/*
3.Understand where an object's prototype comes from
Object inherits its prototype directly from the constructor function that creatd it.
Bird constructor creates the duck object
*/
function Bird(name){
  this.name =name;
}
let duck = new Bird("Donald");
Bird.prototype.isPrototypeOf(duck);

//4.Inheritance

Bird.prototype = {
  constructor: Bird,
  describe: function() {
    console.log("My name is " + this.name);
  }
};

Dog.prototype = {
  constructor: Dog,
  describe: function() {
    console.log("My name is " + this.name);
  }
};

//The describe method is repeated in 2 places
//function Animal(){};
Animal.prototype ={
  constructor :Animal.
  describe : function(){
    console.log(this.name);
  }
};
Bird.prototype = {
  constructor: Bird
};

Dog.prototype = {
  constructor: Dog
};


//5. Inherit Behaviours from a supertype

function Animal(){};
Animal.prototype.eat = function(){
  console.log("nom nom");
}
let animal = new Animal();
