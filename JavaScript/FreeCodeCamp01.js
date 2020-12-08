//1.
function House(numBedrooms) {
  this.numBedrooms = numBedrooms;
}

// Only change code below this line
let myHouse = new House(5);

myHouse instanceof House // true;



//2.
//Understand  own properties

function Bird(name){
  this.name = name;
  this.numLegs= 2;
}
let duck = new Bird ("Donald");
let canary = new Bird("Tweety");

//name and numLegs are called own properties, becaues they are defined directly on the instance object.
// That means that duck and canary each has its own separate copy of these properites. In fact every instance of Bird will have its own copy of these properties.
//The following code adds all of the own properties of duck to the array ownProps

let ownProps=[];
for (let property in duck){
  if(duck.hasOwnProperty(property)){
      ownProps.push(peroperty);
  }
}
console.log(ownProps);


//3.
//Use properties to reduce duplicate code

Bird.prototype.numLegs=2;
//Now all instances of Bird have the numLegs property



//4.Iterate Over all properties
function Bird (name){
  this.name = name;
}
Bird.prototype.numLegs =2;
let duck = new Bird("Donald");

//Here is how you add duck's own properties to the array ownProps and prototype properties to the array prototypeProps
let ownProps =[];
let prototypeProps=[];

for(let property in duck){
  if(duck.hasOwnProperty(property)){
    ownPropse.push(property);
  }else{
    prototypeProps.push(property);
  }
}

console.log(ownProps);
console.log(prototypeProps);

//5.Constructor property
let duck = new Bird();
let beagle = new Dog();

console.log(duck.constructor === Bird);
console.log(beagle.constructor === Dog);

function joinBirdFraternity(candidate){
  if(candidate.constructor === Bird){
    return true;
  }else{
    return false;
  }
}

