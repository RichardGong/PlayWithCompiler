#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#include "immintrin.h"

int64_t simd_sum(unsigned totalNums, int64_t * nums){
    //初始值设为0
    __m256i sum=_mm256_setzero_si256();

    //做矢量的汇总计算
    __m256i * vectorptr = (__m256i *) nums;
    for (int i = 0; i < totalNums/4; i++) {

        //从内存加载256位到寄存器
        __m256i a = _mm256_load_si256(vectorptr+i);

        //矢量加法
        sum=_mm256_add_epi64(sum,a);
    }

    //把4个标量取出来，汇总
    int64_t total = 0;
    int64_t * n = (int64_t *) &sum;
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

    //simd
    int64_t total2 = simd_sum(totalNums, nums);
    clock_t time3 = clock();

    printf("scalar : %lld, in %f s\n", total1, (float)(time2 - time1)/CLOCKS_PER_SEC);
    printf("vector : %lld, in %f s\n", total2, (float)(time3 - time2)/CLOCKS_PER_SEC);

    return 0;
}