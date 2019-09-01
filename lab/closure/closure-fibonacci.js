/**
 * Fibonacci.js
 * 用闭包实现斐波那契数列。斐波那契数列是这样的数字：1,1,2,3,5,8,13...  每个数字是前面两个数字的和。
 * 作者：宫文学
 */
var fib = (function () {
    var a = 0;
    var b = 1;
    return function () {
        var c = a;
        a = b;
        b = a+c;
        return c;
    }
})();

for (var i = 0; i< 80; i++){
    console.log(fib());
}