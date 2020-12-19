//Destructuring Assignment

const student ={
  name :'Anna',
  level:1,
};

{
  const name = student.name;
  const level = student.level;
  console.log(name,level);
}

{
  const {name,level} = student;
  const { name: studentName, level:studentLevle} =student;
  
 //spread Syntax
  {
  const obj1 = {key : 'key1'};
  const obj2 = {key : 'key2'};
  const array= [obj1,obj2];
  
  const arrayCopy =[...array];
  console.log(array,arrayCopy);
  
  const arrayCopy2=[...array,{key : 'key3'}];
  obj1.key ='newKey';
  
  
  
  
