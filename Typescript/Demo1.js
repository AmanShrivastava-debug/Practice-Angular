//Explicit
var userName = "Vinothkumar";
console.log(userName);
//Implicit
var myName = "ashokkumar";
console.log(typeof myName);
var data = "modi";
console.log(data);
data = 34; // no error as it can be "any" type
console.log(data);
var data1 = ["modi", 34];
//data = 34; // no error as it can be "any" type
console.log(data1);
var studentName = [];
studentName.push("Vinoth");
studentName.push("Ashok");
console.log(studentName);
var studentName1 = ["Vinoth", "Ashok"];
console.log(studentName1[0]);
console.log(studentName1[1]);
console.log("Length " + studentName1.length);
/******* Read Only */
var names = ["Vinothkumar", "Ashokkumar"];
//names[3]="Selva";
console.log(names);
/**************  */ 
