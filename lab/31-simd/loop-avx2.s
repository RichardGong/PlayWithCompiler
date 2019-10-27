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
	movl	%edi, %ecx
	cmpl	$31, %edi
	ja	LBB0_4
## %bb.3:
	xorl	%edx, %edx
	xorl	%eax, %eax
	jmp	LBB0_11
LBB0_1:
	xorl	%eax, %eax
	popq	%rbp
	retq
LBB0_4:
	movl	%ecx, %edx
	andl	$-32, %edx
	leaq	-32(%rdx), %rdi
	movq	%rdi, %rax
	shrq	$5, %rax
	incq	%rax
	movl	%eax, %r8d
	andl	$1, %r8d
	testq	%rdi, %rdi
	je	LBB0_5
## %bb.6:
	movl	$1, %edi
	subq	%rax, %rdi
	leaq	-1(%r8,%rdi), %rax
	vpxor	%xmm0, %xmm0, %xmm0
	xorl	%edi, %edi
	vpxor	%xmm1, %xmm1, %xmm1
	vpxor	%xmm2, %xmm2, %xmm2
	vpxor	%xmm3, %xmm3, %xmm3
	.p2align	4, 0x90
LBB0_7:                                 ## =>This Inner Loop Header: Depth=1
	vpaddd	(%rsi,%rdi,4), %ymm0, %ymm0
	vpaddd	32(%rsi,%rdi,4), %ymm1, %ymm1
	vpaddd	64(%rsi,%rdi,4), %ymm2, %ymm2
	vpaddd	96(%rsi,%rdi,4), %ymm3, %ymm3
	vpaddd	128(%rsi,%rdi,4), %ymm0, %ymm0
	vpaddd	160(%rsi,%rdi,4), %ymm1, %ymm1
	vpaddd	192(%rsi,%rdi,4), %ymm2, %ymm2
	vpaddd	224(%rsi,%rdi,4), %ymm3, %ymm3
	addq	$64, %rdi
	addq	$2, %rax
	jne	LBB0_7
## %bb.8:
	testq	%r8, %r8
	je	LBB0_10
LBB0_9:
	vpaddd	96(%rsi,%rdi,4), %ymm3, %ymm3
	vpaddd	64(%rsi,%rdi,4), %ymm2, %ymm2
	vpaddd	32(%rsi,%rdi,4), %ymm1, %ymm1
	vpaddd	(%rsi,%rdi,4), %ymm0, %ymm0
LBB0_10:
	vpaddd	%ymm3, %ymm1, %ymm1
	vpaddd	%ymm2, %ymm0, %ymm0
	vpaddd	%ymm1, %ymm0, %ymm0
	vextracti128	$1, %ymm0, %xmm1
	vpaddd	%ymm1, %ymm0, %ymm0
	vpshufd	$78, %xmm0, %xmm1       ## xmm1 = xmm0[2,3,0,1]
	vpaddd	%ymm1, %ymm0, %ymm0
	vpshufd	$229, %xmm0, %xmm1      ## xmm1 = xmm0[1,1,2,3]
	vpaddd	%xmm1, %xmm0, %xmm0
	vmovd	%xmm0, %eax
	cmpq	%rcx, %rdx
	je	LBB0_12
	.p2align	4, 0x90
LBB0_11:                                ## =>This Inner Loop Header: Depth=1
	addl	(%rsi,%rdx,4), %eax
	incq	%rdx
	cmpq	%rdx, %rcx
	jne	LBB0_11
LBB0_12:
	popq	%rbp
	vzeroupper
	retq
LBB0_5:
	vpxor	%xmm0, %xmm0, %xmm0
	xorl	%edi, %edi
	vpxor	%xmm1, %xmm1, %xmm1
	vpxor	%xmm2, %xmm2, %xmm2
	vpxor	%xmm3, %xmm3, %xmm3
	testq	%r8, %r8
	jne	LBB0_9
	jmp	LBB0_10
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
	jbe	LBB1_4
## %bb.1:
	leaq	640(%rdx), %rax
	cmpq	%rsi, %rax
	jbe	LBB1_4
## %bb.2:
	movl	$3, %eax
	.p2align	4, 0x90
LBB1_3:                                 ## =>This Inner Loop Header: Depth=1
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
	jne	LBB1_3
## %bb.5:
	popq	%rbp
	retq
LBB1_4:
	vmovdqu	(%rdx), %ymm0
	vmovdqu	32(%rdx), %ymm1
	vmovdqu	64(%rdx), %ymm2
	vmovdqu	96(%rdx), %ymm3
	vpaddd	(%rsi), %ymm0, %ymm0
	vpaddd	32(%rsi), %ymm1, %ymm1
	vpaddd	64(%rsi), %ymm2, %ymm2
	vpaddd	96(%rsi), %ymm3, %ymm3
	vmovdqu	%ymm0, (%rdx)
	vmovdqu	%ymm1, 32(%rdx)
	vmovdqu	%ymm2, 64(%rdx)
	vmovdqu	%ymm3, 96(%rdx)
	vmovdqu	128(%rdx), %ymm0
	vmovdqu	160(%rdx), %ymm1
	vmovdqu	192(%rdx), %ymm2
	vmovdqu	224(%rdx), %ymm3
	vpaddd	128(%rsi), %ymm0, %ymm0
	vpaddd	160(%rsi), %ymm1, %ymm1
	vpaddd	192(%rsi), %ymm2, %ymm2
	vpaddd	224(%rsi), %ymm3, %ymm3
	vmovdqu	%ymm0, 128(%rdx)
	vmovdqu	%ymm1, 160(%rdx)
	vmovdqu	%ymm2, 192(%rdx)
	vmovdqu	%ymm3, 224(%rdx)
	vmovdqu	256(%rdx), %ymm0
	vmovdqu	288(%rdx), %ymm1
	vmovdqu	320(%rdx), %ymm2
	vmovdqu	352(%rdx), %ymm3
	vpaddd	256(%rsi), %ymm0, %ymm0
	vpaddd	288(%rsi), %ymm1, %ymm1
	vpaddd	320(%rsi), %ymm2, %ymm2
	vpaddd	352(%rsi), %ymm3, %ymm3
	vmovdqu	%ymm0, 256(%rdx)
	vmovdqu	%ymm1, 288(%rdx)
	vmovdqu	%ymm2, 320(%rdx)
	vmovdqu	%ymm3, 352(%rdx)
	vmovdqu	384(%rdx), %ymm0
	vmovdqu	416(%rdx), %ymm1
	vmovdqu	448(%rdx), %ymm2
	vmovdqu	480(%rdx), %ymm3
	vpaddd	384(%rsi), %ymm0, %ymm0
	vpaddd	416(%rsi), %ymm1, %ymm1
	vpaddd	448(%rsi), %ymm2, %ymm2
	vpaddd	480(%rsi), %ymm3, %ymm3
	vmovdqu	%ymm0, 384(%rdx)
	vmovdqu	%ymm1, 416(%rdx)
	vmovdqu	%ymm2, 448(%rdx)
	vmovdqu	%ymm3, 480(%rdx)
	vmovdqu	512(%rdx), %ymm0
	vmovdqu	544(%rdx), %ymm1
	vmovdqu	576(%rdx), %ymm2
	vmovdqu	608(%rdx), %ymm3
	vpaddd	512(%rsi), %ymm0, %ymm0
	vpaddd	544(%rsi), %ymm1, %ymm1
	vpaddd	576(%rsi), %ymm2, %ymm2
	vpaddd	608(%rsi), %ymm3, %ymm3
	vmovdqu	%ymm0, 512(%rdx)
	vmovdqu	%ymm1, 544(%rdx)
	vmovdqu	%ymm2, 576(%rdx)
	vmovdqu	%ymm3, 608(%rdx)
	popq	%rbp
	vzeroupper
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
	vmovdqu	128(%rdi), %ymm0
	vmovdqu	160(%rdi), %ymm1
	vmovdqu	192(%rdi), %ymm2
	vmovdqu	224(%rdi), %ymm3
	vpaddd	(%rdi), %ymm0, %ymm0
	vpaddd	32(%rdi), %ymm1, %ymm1
	vpaddd	64(%rdi), %ymm2, %ymm2
	vpaddd	96(%rdi), %ymm3, %ymm3
	vpaddd	256(%rdi), %ymm0, %ymm0
	vpaddd	288(%rdi), %ymm1, %ymm1
	vpaddd	320(%rdi), %ymm2, %ymm2
	vpaddd	352(%rdi), %ymm3, %ymm3
	vpaddd	384(%rdi), %ymm0, %ymm0
	vpaddd	416(%rdi), %ymm1, %ymm1
	vpaddd	448(%rdi), %ymm2, %ymm2
	vpaddd	480(%rdi), %ymm3, %ymm3
	vpaddd	512(%rdi), %ymm0, %ymm0
	vpaddd	544(%rdi), %ymm1, %ymm1
	vpaddd	576(%rdi), %ymm2, %ymm2
	vpaddd	%ymm0, %ymm1, %ymm0
	vpaddd	608(%rdi), %ymm3, %ymm1
	vpaddd	%ymm1, %ymm2, %ymm1
	vpaddd	%ymm1, %ymm0, %ymm0
	vextracti128	$1, %ymm0, %xmm1
	vpaddd	%ymm1, %ymm0, %ymm0
	vpshufd	$78, %xmm0, %xmm1       ## xmm1 = xmm0[2,3,0,1]
	vpaddd	%ymm1, %ymm0, %ymm0
	vpshufd	$229, %xmm0, %xmm1      ## xmm1 = xmm0[1,1,2,3]
	vpaddd	%xmm1, %xmm0, %xmm0
	vmovd	%xmm0, %eax
	popq	%rbp
	vzeroupper
	retq
	.cfi_endproc
                                        ## -- End function

.subsections_via_symbols
