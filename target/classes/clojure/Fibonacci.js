/**
 * Fibonacci.js
 * 用闭包实现斐波那契数列。斐波那契数列是这样的数字：1,1,2,3,5,8,13...  每个数字是前面两个数字的和。
 * 作者：宫文学
 */
var fibonacci = (function () {
    var i = 1;
    var j = 1;
    return function (n) {
        var result = j;
        for (var k = 3; k <= n; k++) {
            result = i + j;
            i = j;
            j = result;
        }
        return result;
    }
})();