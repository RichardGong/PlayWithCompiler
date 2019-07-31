# convention-fun1.s 测试调用约定，_fun1将在外部被调用
	# 文本段,纯代码
	.section	__TEXT,__text,regular,pure_instructions
    
    .globl	_fun1          # .global伪指令让_fun1函数外部可见
_fun1:
	# 函数调用的序曲,设置栈指针
	pushq	%rbp	       # 把调用者的栈桢底部地址保存起来   
	movq	%rsp, %rbp     # 把调用者的栈桢顶部地址,设置为本栈桢的底部

	movl	$10, -4(%rbp)  # 变量c赋值为10,也可以写成 movl $10, (%rsp)

	# 做加法
    movl    %edi, %eax     # 第一个参数放进%eax
    addl    %esi, %eax     # 加参数2
    addl    %edx, %eax     # 加参数3
    addl    %ecx, %eax     # 加参数4
    addl    %r8d, %eax     # 加参数5
    addl    %r9d, %eax     # 加参数6
    addl    16(%rbp), %eax  # 加参数7
    addl    24(%rbp), %eax  # 加参数8
    
    addl 	-4(%rbp), %eax # 加上c的值

	# 函数调用的尾声,恢复栈指针为原来的值
    popq	%rbp           # 恢复调用者栈桢的底部数值
	retq				   # 返回




