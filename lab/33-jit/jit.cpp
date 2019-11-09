#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/mman.h>

/*
 * 机器码，对应下面函数的功能：
 * int fun1(int a){
 *     return a + 2;
 * }
 */
uint8_t machine_code[] = {
        0x55, 0x48, 0x89, 0xe5,
        0x8d, 0x47, 0x02, 0x5d, 0xc3
};

//省略了三行汇编代码的机器码：
uint8_t machine_code1[] = {
        0x8d, 0x47, 0x02, 0xc3
};

/*
 * 执行动态生成的机器码。
 */
int main(int argc, char **argv) {
    //分配一块内存，设置权限为读和写
    void *mem = mmap(NULL, sizeof(machine_code), PROT_READ | PROT_WRITE,
                     MAP_ANONYMOUS | MAP_PRIVATE, -1, 0);
    if (mem == MAP_FAILED) {
        perror("mmap");
        return 1;
    }

    //把机器码写到刚才的内存中
    memcpy(mem, machine_code, sizeof(machine_code));

    //把这块内存的权限改为读和执行
    if (mprotect(mem, sizeof(machine_code), PROT_READ | PROT_EXEC) == -1) {
        perror("mprotect");
        return 2;
    }

    //用一个函数指针指向这块内存，并执行它
    int32_t(*fn)(int32_t) = (int32_t(*)(int32_t)) mem;
    int32_t result = fn(1);
    printf("result = %d\n", result);

    //释放这块内存
    if (munmap(mem, sizeof(machine_code)) == -1) {
        perror("munmap");
        return 3;
    }

    return 0;
}