"use strict";
var logDetails = function (uid, item) {
    console.log(item + " has a uid of " + uid);
};
//const greet = (user: { name: string; uid: string | number }) => {
//const greet = (user: { name: string; uid: StringOrNum }) => {
var greet = function (user) {
    console.log(user.name + " says hello");
};
var greetAgain = function (user) {
    console.log(user.name + " says hello");
};
