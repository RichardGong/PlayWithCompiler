/**
 * Scope.js
 * 测试JavaScript的作用域
 */

var a = 5;
var b = 5;
console.log("1: a=%d b=%d", a, b);

if (a > 0) {
    a = 4;
    console.log("2: a=%d b=%d", a, b);
    var b = 3; //看似声明了一个新变量，其实还是引用的外部变量
    console.log("3: a=%d b=%d", a, b);
}
else {
    var b = 4;
    console.log("4: a=%d b=%d", a, b);
}

console.log("5: a=%d b=%d", a, b);

for (var b = 0; b< 2; b++){
    console.log("6-%d: a=%d b=%d",b, a, b);
}

console.log("7: a=%d b=%d", a, b);