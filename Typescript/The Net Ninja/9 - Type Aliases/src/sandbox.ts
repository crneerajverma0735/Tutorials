type StringOrNum = string | number;
type objWithName = { name: string; uid: StringOrNum };

const logDetails = (uid: StringOrNum, item: string) => {
  console.log(`${item} has a uid of ${uid}`);
};

//const greet = (user: { name: string; uid: string | number }) => {
//const greet = (user: { name: string; uid: StringOrNum }) => {
const greet = (user: objWithName) => {
  console.log(`${user.name} says hello`);
};

const greetAgain = (user: { name: string; uid: StringOrNum }) => {
  console.log(`${user.name} says hello`);
};
