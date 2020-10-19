let character = "mario";
let age = 30;
let isBlackBelt = false;

//character = 20;
character = "neeraj";

//age = 'yoshi';
age = 40;

//isBlackBelt = 'yes';
isBlackBelt = true;

// const circ = (diameter) => {
//   return diameter * Math.PI;
// };

const circ = (diameter: number) => {
  return diameter * Math.PI;
};

//console.log(circ("hello"));
console.log(circ(7.5));
