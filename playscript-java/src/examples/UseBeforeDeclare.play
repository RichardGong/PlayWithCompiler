/*
类和类成员的声明不受顺序限制。可以先使用，后声明。语义分析时能够正确的将它们解析。
*/


C1 obj = C1(2);
println("obj.a = " + obj.a);


class C1{
    C1(int value){
        foo();       //在声明之前就可以调用
        a = value;
        println("in C1(), obj2.b = : " + obj2.b);
    }

    void foo(){
        println("in foo: a = "+a);  //在a声明之前调用
    }

    int a = 1;
    C2 obj2 = C2();
}

class C2{
    int b = 3;
}

