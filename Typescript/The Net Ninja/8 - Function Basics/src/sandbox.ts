let greet: Function;

// greet = 'hello';

greet = () => {
  console.log("hello, again");
};

//const add = (a: number, b: number,) => {
//const add = (a: number, b: number, c?: number | string ) => {
//const add = (a: number, b: number, c: number | string = 10) => {
const add = (a: number, b: number, c: number | string = 10): void => {
  console.log(a + b);
  console.log(c);
};

//add(5, 10);
//add(5, '10');
//add(5, 10, 20);
add(5, 10, "20");

const minus = (a: number, b: number): number => {
  return a + b;
};

let result = minus(10, 7);
//result = 'Something else';
