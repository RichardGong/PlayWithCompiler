/**
 * 演示循环的矢量化功能。
 */

/**
 * 下面这段代码会被直接矢量化
 * @param totalNums
 * @param nums
 * @return
 */
int loop1(int totalNums, int * nums){
    int sum = 0;
    for (int i = 0; i< totalNums; i++){
        sum += nums[i];
    }
    return sum;
}

/**
 * 这段代码要看看nums1和nums2在地址上是否存在重叠。
 * 编译程序会加上运行期的代码来做判断。如果有重叠，就使用标量的计算方式。
 * @param totalNums
 * @param nums1
 * @param nums2
 */
void loop2(int totalNums, int * nums1, int * nums2){
    for (int i = 0; i< 160; i++){
        nums2[i] += nums1[i];
    }
}

/**
 * 循环次数是确定的，生成的代码会根据这个常数做优化。
 * @param nums
 * @return
 */
int loop3(int * nums){
    int sum = 0;
    for (int i = 0; i< 160; i++){
        sum += nums[i];
    }
    return sum;
}