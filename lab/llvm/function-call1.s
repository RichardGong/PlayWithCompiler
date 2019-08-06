	.section	__TEXT,__text,regular,pure_instructions
	.macosx_version_min 10, 14
	.globl	_fun1                   ## -- Begin function fun1
	.p2align	4, 0x90
_fun1:                                  ## @fun1
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	movl	%edi, -12(%rbp)
	movl	%esi, -8(%rbp)
	movl	$10, -4(%rbp)
	movl	-12(%rbp), %eax
	addl	-8(%rbp), %eax
	addl	-4(%rbp), %eax
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function

.subsections_via_symbols
