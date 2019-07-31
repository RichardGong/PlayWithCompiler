# function-call2-craft.s 函数调用和参数传递，多于6个参数
	# 文本段,纯代码
	.section	__TEXT,__text,regular,pure_instructions

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

	.globl	_main          # .global伪指令让_main函数外部可见
_main:                                  ## @main
	
	# 函数调用的序曲,设置栈指针
	pushq	%rbp	       # 把调用者的栈桢底部地址保存起来  
	movq	%rsp, %rbp     # 把调用者的栈桢顶部地址,设置为本栈桢的底部
	
    subq    $16, %rsp      # 这里是为了让栈桢16字节对齐，实际使用可以更少

	# 设置参数
    movl    $1, %edi     # 参数1
    movl    $2, %esi     # 参数2
    movl	$3, %edx     # 参数3
	movl	$4, %ecx     # 参数4
	movl	$5, %r8d     # 参数5
	movl	$6, %r9d     # 参数6
	movl	$7, (%rsp)   # 参数7
	movl	$8, 8(%rsp)  # 参数8

    callq	_fun1                # 调用函数

	# 为pritf设置参数
	leaq	L_.str(%rip), %rdi   # 第一个参数是字符串的地址
    movl	%eax, %esi           # 第二个参数是前一个参数的返回值

	callq	_printf              # 调用函数

	# 设置返回值。这句也常用 xorl %esi, %esi 这样的指令,都是置为零
	movl	$0, %eax

    addq    $16, %rsp
	
	# 函数调用的尾声,恢复栈指针为原来的值
	popq	%rbp         # 恢复调用者栈桢的底部数值
	retq				 # 返回

	# 文本段,保存字符串字面量	                                
	.section	__TEXT,__cstring,cstring_literals
L_.str:                                 ## @.str
	.asciz	"Hello World! :%d \n"


