#include <stdio.h>

int fun1(int a, int b){
    int c = 10;
    return a+b+c;
}

int main(int argc, char *argv[])
{
    printf("fun1: %d\n", fun1(1,2));
    return 0;
}