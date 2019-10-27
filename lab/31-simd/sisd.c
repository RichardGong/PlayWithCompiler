#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    //做1.6亿数据的计算
    unsigned  totalNums = 160000000;

    //申请一块32位对齐的内存。
    //注意：这个函数C11标准才支持
    int64_t * nums = aligned_alloc(32, totalNums * sizeof(int64_t));

    //赋值0到99的随机数
    srand(time(NULL));
    for(unsigned i = 0; i<totalNums; i++){
        nums[i] = (int64_t)rand()%100;
    }

    //循环相加
    clock_t time1 = clock();
    int64_t total1 = 0;
    for (unsigned i = 0; i< totalNums; i++){
        total1 += nums[i];
    }
    clock_t time2 = clock();

    printf("scalar : %lld, in %f s\n", total1, (float)(time2 - time1)/CLOCKS_PER_SEC);

    return 0;
}