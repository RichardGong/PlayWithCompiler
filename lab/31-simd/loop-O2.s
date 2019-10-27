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
	movl	%edi, %r8d
	cmpl	$7, %edi
	ja	LBB0_4
## %bb.3:
	xorl	%edx, %edx
	xorl	%eax, %eax
	jmp	LBB0_12
LBB0_1:
	xorl	%eax, %eax
	popq	%rbp
	retq
LBB0_4:
	movl	%r8d, %edx
	andl	$-8, %edx
	leaq	-8(%rdx), %rdi
	movq	%rdi, %rcx
	shrq	$3, %rcx
	incq	%rcx
	movl	%ecx, %eax
	andl	$3, %eax
	cmpq	$24, %rdi
	jae	LBB0_6
## %bb.5:
	pxor	%xmm0, %xmm0
	xorl	%edi, %edi
	pxor	%xmm1, %xmm1
	testq	%rax, %rax
	jne	LBB0_9
	jmp	LBB0_11
LBB0_6:
	movl	$1, %edi
	subq	%rcx, %rdi
	leaq	-1(%rax,%rdi), %rcx
	pxor	%xmm0, %xmm0
	xorl	%edi, %edi
	pxor	%xmm1, %xmm1
	.p2align	4, 0x90
LBB0_7:                                 ## =>This Inner Loop Header: Depth=1
	movdqu	(%rsi,%rdi,4), %xmm2
	paddd	%xmm0, %xmm2
	movdqu	16(%rsi,%rdi,4), %xmm0
	paddd	%xmm1, %xmm0
	movdqu	32(%rsi,%rdi,4), %xmm1
	movdqu	48(%rsi,%rdi,4), %xmm3
	movdqu	64(%rsi,%rdi,4), %xmm4
	paddd	%xmm1, %xmm4
	paddd	%xmm2, %xmm4
	movdqu	80(%rsi,%rdi,4), %xmm2
	paddd	%xmm3, %xmm2
	paddd	%xmm0, %xmm2
	movdqu	96(%rsi,%rdi,4), %xmm0
	paddd	%xmm4, %xmm0
	movdqu	112(%rsi,%rdi,4), %xmm1
	paddd	%xmm2, %xmm1
	addq	$32, %rdi
	addq	$4, %rcx
	jne	LBB0_7
## %bb.8:
	testq	%rax, %rax
	je	LBB0_11
LBB0_9:
	leaq	16(%rsi,%rdi,4), %rcx
	negq	%rax
	.p2align	4, 0x90
LBB0_10:                                ## =>This Inner Loop Header: Depth=1
	movdqu	-16(%rcx), %xmm2
	paddd	%xmm2, %xmm0
	movdqu	(%rcx), %xmm2
	paddd	%xmm2, %xmm1
	addq	$32, %rcx
	incq	%rax
	jne	LBB0_10
LBB0_11:
	paddd	%xmm1, %xmm0
	pshufd	$78, %xmm0, %xmm1       ## xmm1 = xmm0[2,3,0,1]
	paddd	%xmm0, %xmm1
	pshufd	$229, %xmm1, %xmm0      ## xmm0 = xmm1[1,1,2,3]
	paddd	%xmm1, %xmm0
	movd	%xmm0, %eax
	cmpq	%r8, %rdx
	je	LBB0_13
	.p2align	4, 0x90
LBB0_12:                                ## =>This Inner Loop Header: Depth=1
	addl	(%rsi,%rdx,4), %eax
	incq	%rdx
	cmpq	%rdx, %r8
	jne	LBB0_12
LBB0_13:
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
	leaq	640(%rsi), %rax
	cmpq	%rdx, %rax
	jbe	LBB1_2
## %bb.1:
	leaq	640(%rdx), %rax
	cmpq	%rsi, %rax
	jbe	LBB1_2
## %bb.5:
	movl	$3, %eax
	.p2align	4, 0x90
LBB1_6:                                 ## =>This Inner Loop Header: Depth=1
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
	jne	LBB1_6
	jmp	LBB1_4
LBB1_2:
	movl	$12, %eax
	.p2align	4, 0x90
LBB1_3:                                 ## =>This Inner Loop Header: Depth=1
	movdqu	-48(%rsi,%rax,4), %xmm0
	movdqu	-32(%rsi,%rax,4), %xmm1
	movdqu	-48(%rdx,%rax,4), %xmm2
	paddd	%xmm0, %xmm2
	movdqu	-32(%rdx,%rax,4), %xmm0
	paddd	%xmm1, %xmm0
	movdqu	-16(%rdx,%rax,4), %xmm1
	movdqu	(%rdx,%rax,4), %xmm3
	movdqu	%xmm2, -48(%rdx,%rax,4)
	movdqu	%xmm0, -32(%rdx,%rax,4)
	movdqu	-16(%rsi,%rax,4), %xmm0
	paddd	%xmm1, %xmm0
	movdqu	(%rsi,%rax,4), %xmm1
	paddd	%xmm3, %xmm1
	movdqu	%xmm0, -16(%rdx,%rax,4)
	movdqu	%xmm1, (%rdx,%rax,4)
	addq	$16, %rax
	cmpq	$172, %rax
	jne	LBB1_3
LBB1_4:
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
	movdqu	(%rdi), %xmm0
	movdqu	16(%rdi), %xmm1
	movdqu	32(%rdi), %xmm2
	paddd	%xmm0, %xmm2
	movdqu	48(%rdi), %xmm0
	paddd	%xmm1, %xmm0
	movdqu	64(%rdi), %xmm1
	movdqu	80(%rdi), %xmm3
	movdqu	96(%rdi), %xmm4
	paddd	%xmm1, %xmm4
	paddd	%xmm2, %xmm4
	movdqu	112(%rdi), %xmm1
	paddd	%xmm3, %xmm1
	paddd	%xmm0, %xmm1
	movdqu	128(%rdi), %xmm0
	movdqu	144(%rdi), %xmm2
	movdqu	160(%rdi), %xmm3
	paddd	%xmm0, %xmm3
	movdqu	176(%rdi), %xmm0
	paddd	%xmm2, %xmm0
	movdqu	192(%rdi), %xmm2
	paddd	%xmm3, %xmm2
	paddd	%xmm4, %xmm2
	movdqu	208(%rdi), %xmm3
	paddd	%xmm0, %xmm3
	paddd	%xmm1, %xmm3
	movdqu	224(%rdi), %xmm0
	movdqu	240(%rdi), %xmm1
	movdqu	256(%rdi), %xmm4
	paddd	%xmm0, %xmm4
	movdqu	272(%rdi), %xmm0
	paddd	%xmm1, %xmm0
	movdqu	288(%rdi), %xmm1
	paddd	%xmm4, %xmm1
	movdqu	304(%rdi), %xmm4
	paddd	%xmm0, %xmm4
	movdqu	320(%rdi), %xmm0
	paddd	%xmm1, %xmm0
	paddd	%xmm2, %xmm0
	movdqu	336(%rdi), %xmm1
	paddd	%xmm4, %xmm1
	paddd	%xmm3, %xmm1
	movdqu	352(%rdi), %xmm2
	movdqu	368(%rdi), %xmm3
	movdqu	384(%rdi), %xmm4
	paddd	%xmm2, %xmm4
	movdqu	400(%rdi), %xmm2
	paddd	%xmm3, %xmm2
	movdqu	416(%rdi), %xmm3
	paddd	%xmm4, %xmm3
	movdqu	432(%rdi), %xmm4
	paddd	%xmm2, %xmm4
	movdqu	448(%rdi), %xmm2
	paddd	%xmm3, %xmm2
	movdqu	464(%rdi), %xmm3
	paddd	%xmm4, %xmm3
	movdqu	480(%rdi), %xmm4
	paddd	%xmm2, %xmm4
	paddd	%xmm0, %xmm4
	movdqu	496(%rdi), %xmm0
	paddd	%xmm3, %xmm0
	paddd	%xmm1, %xmm0
	movdqu	512(%rdi), %xmm1
	movdqu	528(%rdi), %xmm2
	movdqu	544(%rdi), %xmm3
	paddd	%xmm1, %xmm3
	movdqu	560(%rdi), %xmm1
	paddd	%xmm2, %xmm1
	movdqu	576(%rdi), %xmm2
	paddd	%xmm3, %xmm2
	movdqu	592(%rdi), %xmm3
	paddd	%xmm1, %xmm3
	movdqu	608(%rdi), %xmm1
	paddd	%xmm2, %xmm1
	paddd	%xmm4, %xmm1
	movdqu	624(%rdi), %xmm2
	paddd	%xmm3, %xmm2
	paddd	%xmm0, %xmm2
	paddd	%xmm1, %xmm2
	pshufd	$78, %xmm2, %xmm0       ## xmm0 = xmm2[2,3,0,1]
	paddd	%xmm2, %xmm0
	pshufd	$229, %xmm0, %xmm1      ## xmm1 = xmm0[1,1,2,3]
	paddd	%xmm0, %xmm1
	movd	%xmm1, %eax
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function

.subsections_via_symbols
