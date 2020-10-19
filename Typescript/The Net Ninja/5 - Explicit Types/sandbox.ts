// explicit types
let character: string;
let age: number;
let isLoggedIn: boolean;

//age = 'neeraj';
age = 5;

//isLoggedIn = 5;
isLoggedIn = false;

// arrays

let ninjas: string[];

// ninjas.push("raj");
// ninjas = [10, 23];
ninjas = ["neeraj", "sachin"];

// union types
let mixed: (string | number | boolean)[] = [];

mixed.push("hello");
mixed.push(20);
mixed.push(false);

console.log(mixed);

let uid: string | number;
uid = "123";
uid = 123;
//uid = false;

// objects
let ninjaOne: object;
ninjaOne = { name: "yoshi", age: 30 };
// ninjaOne = "neeraj";
ninjaOne = [];

let ninjaTwo: {
  name: string;
  age: number;
  beltColour: string;
};

// ninjaTwo = {};
ninjaTwo = { name: "Neeraj", age: 26, beltColour: "black" };
