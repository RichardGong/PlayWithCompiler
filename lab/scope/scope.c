/*
scope.c
测试作用域。
 */
#include <stdio.h>

int a = 1;

void fun()
{
    a = 2;
    //b = 3;    //出错，不知道b是谁
    int a = 3; //允许声明一个同名的变量吗？
    int b = a; //这里的a是哪个？
    printf("in func: a=%d b=%d \n", a, b);
}

int b = 4; //b的作用域从这里开始

int main(int argc, char **argv)
{
    printf("main--1: a=%d b=%d \n", a, b);

    fun();
    printf("main--2: a=%d b=%d \n", a, b);

    //用本地变量覆盖全局变量
    int a = 5;
    int b = 5;
    printf("main--3: a=%d b=%d \n", a, b);

    //测试块作用域
    if (a > 0){
        int b = 3; //允许在块里覆盖外面的变量
        printf("main--4: a=%d b=%d \n", a, b);
    }
    else{
        int b = 4;
        printf("main--5: a=%d b=%d \n", a, b);
    }

    printf("main--6: a=%d b=%d \n", a, b);
}
