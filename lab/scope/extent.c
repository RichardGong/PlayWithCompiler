/*
extent.c
测试生存期。
 */
#include <stdio.h>
#include <stdlib.h>

int * fun(){
    int * b = (int*)malloc(1*sizeof(int)); //在堆中申请内存
    *b = 2;  //给该地址赋值2
    printf("in fun(): &b=%lu, b=%lu, *b=%d \n", (unsigned long)&b,(unsigned long)b, *b);
    return b;
}


int main(int argc, char **argv){
    int * p = fun();
    *p = 3;

    printf("after called fun: b=%lu *b=%d \n", (unsigned long)p, *p);
 
    free(p);
}
