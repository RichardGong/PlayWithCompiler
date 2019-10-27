	.section	__TEXT,__text,regular,pure_instructions
	.build_version macos, 10, 15	sdk_version 10, 15
	.globl	_loop1                  ## -- Begin function loop1
	.p2align	4, 0x90
_loop1:                                 ## @loop1
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	testl	%edi, %edi
	jle	LBB0_1
## %bb.2:
	movl	%edi, %edi
	leaq	-1(%rdi), %rax
	movl	%edi, %ecx
	andl	$7, %ecx
	cmpq	$7, %rax
	jae	LBB0_8
## %bb.3:
	xorl	%edx, %edx
	xorl	%eax, %eax
	testq	%rcx, %rcx
	jne	LBB0_5
	jmp	LBB0_7
LBB0_1:
	xorl	%eax, %eax
	popq	%rbp
	retq
LBB0_8:
	subq	%rcx, %rdi
	xorl	%edx, %edx
	xorl	%eax, %eax
	.p2align	4, 0x90
LBB0_9:                                 ## =>This Inner Loop Header: Depth=1
	addl	(%rsi,%rdx,4), %eax
	addl	4(%rsi,%rdx,4), %eax
	addl	8(%rsi,%rdx,4), %eax
	addl	12(%rsi,%rdx,4), %eax
	addl	16(%rsi,%rdx,4), %eax
	addl	20(%rsi,%rdx,4), %eax
	addl	24(%rsi,%rdx,4), %eax
	addl	28(%rsi,%rdx,4), %eax
	addq	$8, %rdx
	cmpq	%rdx, %rdi
	jne	LBB0_9
## %bb.4:
	testq	%rcx, %rcx
	je	LBB0_7
LBB0_5:
	leaq	(%rsi,%rdx,4), %rdx
	xorl	%esi, %esi
	.p2align	4, 0x90
LBB0_6:                                 ## =>This Inner Loop Header: Depth=1
	addl	(%rdx,%rsi,4), %eax
	incq	%rsi
	cmpq	%rsi, %rcx
	jne	LBB0_6
LBB0_7:
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function
	.globl	_loop2                  ## -- Begin function loop2
	.p2align	4, 0x90
_loop2:                                 ## @loop2
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	movl	$3, %eax
	.p2align	4, 0x90
LBB1_1:                                 ## =>This Inner Loop Header: Depth=1
	movl	-12(%rsi,%rax,4), %ecx
	addl	%ecx, -12(%rdx,%rax,4)
	movl	-8(%rsi,%rax,4), %ecx
	addl	%ecx, -8(%rdx,%rax,4)
	movl	-4(%rsi,%rax,4), %ecx
	addl	%ecx, -4(%rdx,%rax,4)
	movl	(%rsi,%rax,4), %ecx
	addl	%ecx, (%rdx,%rax,4)
	addq	$4, %rax
	cmpq	$163, %rax
	jne	LBB1_1
## %bb.2:
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function
	.globl	_loop3                  ## -- Begin function loop3
	.p2align	4, 0x90
_loop3:                                 ## @loop3
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	xorl	%eax, %eax
	movl	$7, %ecx
	.p2align	4, 0x90
LBB2_1:                                 ## =>This Inner Loop Header: Depth=1
	addl	-28(%rdi,%rcx,4), %eax
	addl	-24(%rdi,%rcx,4), %eax
	addl	-20(%rdi,%rcx,4), %eax
	addl	-16(%rdi,%rcx,4), %eax
	addl	-12(%rdi,%rcx,4), %eax
	addl	-8(%rdi,%rcx,4), %eax
	addl	-4(%rdi,%rcx,4), %eax
	addl	(%rdi,%rcx,4), %eax
	addq	$8, %rcx
	cmpq	$167, %rcx
	jne	LBB2_1
## %bb.2:
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function

.subsections_via_symbols
