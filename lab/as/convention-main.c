/**
 * convention-main.c 测试调用约定。调用一个外部函数fun1
 */
#include <stdio.h>

//声明一个外部函数，在链接时会在其他模块中找到
extern int fun1(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8);

int main(int argc, char *argv[])
{
    printf("fun1: %d \n", fun1(1,2,3,4,5,6,7,8));
    return 0;
}
