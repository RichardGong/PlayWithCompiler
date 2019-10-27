#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#include "immintrin.h"

double simd_sum(unsigned totalNums, double * nums){
    __m256i sum;

    //做矢量的汇总计算
    for (int i = 0; i < totalNums; i+=4) {
        //从内存加载256位到寄存器
        __m256i a = _mm256_load_pd(nums + i);

        if (i == 0){
            sum = a;
        }
        else{
            //矢量加法
            sum = _mm256_add_pd(a, sum);
        }
    }

    //把4个标量取出来，汇总
    double total = 0;
    double * n = (double *) &sum;
    for (int i =0; i < 4; i++){
        total += n[i];
    }
    return total;
}

int main() {
    //做1.6亿数据的计算
    unsigned  totalNums = 160000000;

    //申请一块32位对齐的内存。
    //注意：这个函数C11标准才支持
    double * nums = aligned_alloc(32, totalNums * sizeof(double));

    //赋值0到99的随机数
    srand(time(NULL));
    for(unsigned i = 0; i<totalNums; i++){
        nums[i] = (double)(rand()%100);
    }

    //循环相加
    clock_t time1 = clock();
    double total1 = 0;
    for (unsigned i = 0; i< totalNums; i++){
        total1 += nums[i];
    }
    clock_t time2 = clock();

    //simd
    double total2 = simd_sum(totalNums, nums);
    clock_t time3 = clock();

    printf("scalar : %lf, in %lf s\n", total1, (double)(time2 - time1)/CLOCKS_PER_SEC);
    printf("vector : %lf, in %lf s\n", total2, (double)(time3 - time2)/CLOCKS_PER_SEC);

    return 0;
}