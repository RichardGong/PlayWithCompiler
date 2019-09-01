/**
 * closure.js
 * 测试闭包特性
 * 作者：宫文学
 */

var a = 0;

var fun1 = function(){
    var b = 0;                //函数内的局部变量

    var inner = function(){   //内部的一个函数
        a = a+1;
        b = b+1;
        return b;             //返回内部的成员
    }

    return inner;             //返回一个函数
}

console.log("outside:  a=%d", a);
//console.log("outside: a=%d b=%d",a, b);     //在外层不能访问b

var fun2 = fun1();                            //生成闭包
for (var i = 0; i< 2; i++){
    console.log("fun2: b=%d a=%d",fun2(), a); //通过fun2()来访问b
}


var fun3 = fun1();                            //生成第二个闭包
for (var i = 0; i< 2; i++){
    console.log("fun3: b=%d a=%d",fun3(), a); //b等于1，重新开始
}

////测试更深层次的闭包
var fun4 = function(){
    var b = 0;                //函数内的局部变量

    var inner = function(){   //内部的一个函数
        var c = 0;
        var deepinner = function(){
            a++;
            b++;
            c++;
            console.log("deepinner: a=%d b=%d c=%d", a, b, c);
            return b + c;
        }

        return deepinner;     //返回内部的成员
    }

    var inner2 = inner();
    console.log("in fun4");
    inner2();
    inner2();

    return inner2;          //执行inner,返回deepinner
}

var fun5 = fun4();
fun5();
fun5();

var fun6 = fun4();
fun6();
fun6();
