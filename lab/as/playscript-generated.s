	.section	__TEXT,__text,regular,pure_instructions

## 过程:fun1
	.globl _fun1
_fun1:

	# 序曲
	pushq	%rbp
	movq	%rsp, %rbp

	# 设置栈顶
	subq	$16, %rsp

	# 过程体
	movl	$10, -4(%rbp)
	movl	%edi, %eax
	addl	%esi, %eax
	addl	%edx, %eax
	addl	%ecx, %eax
	addl	%r8d, %eax
	addl	%r9d, %eax
	addl	16(%rbp), %eax
	addl	24(%rbp), %eax
	addl	-4(%rbp), %eax

	# 返回值
	# 返回值在之前的计算中,已经存入%eax

	# 恢复栈顶
	addq	$16, %rsp

	# 尾声
	popq	%rbp
	retq

## 过程:main
	.globl _main
_main:

	# 序曲
	pushq	%rbp
	movq	%rsp, %rbp

	# 设置栈顶
	subq	$0, %rsp

	# 过程体

	# 为参数而扩展栈
	subq	$16, %rsp

	# 设置参数
	movl	$1, %edi
	movl	$2, %esi
	movl	$3, %edx
	movl	$4, %ecx
	movl	$5, %r8d
	movl	$6, %r9d
	movl	$7, (%rsp)
	movl	$8, 8(%rsp)

	# 调用函数
	callq	_fun1

	# 收回参数的栈空间
	addq	$16, %rsp

	# 设置参数
	leaq	L.str.0(%rip), %rdi
	movl	%eax, %esi

	# 调用函数
	callq	_printf

	# 恢复栈顶
	addq	$0, %rsp

	# 返回值
	xorl	%eax, %eax

	# 尾声
	popq	%rbp
	retq

# 字符串字面量
	.section	__TEXT,__cstring,cstring_literals
L.str.0:
	.asciz	"fun1: %d"

