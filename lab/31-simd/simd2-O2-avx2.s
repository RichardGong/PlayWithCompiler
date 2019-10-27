	.section	__TEXT,__text,regular,pure_instructions
	.build_version macos, 10, 15	sdk_version 10, 15
	.globl	_simd_sum               ## -- Begin function simd_sum
	.p2align	4, 0x90
_simd_sum:                              ## @simd_sum
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	shrl	$2, %edi
	je	LBB0_1
## %bb.2:
	movl	%edi, %edx
	leaq	-1(%rdx), %rcx
	movl	%edx, %eax
	andl	$3, %eax
	cmpq	$3, %rcx
	jae	LBB0_8
## %bb.3:
	vpxor	%xmm0, %xmm0, %xmm0
	xorl	%ecx, %ecx
	testq	%rax, %rax
	jne	LBB0_5
	jmp	LBB0_7
LBB0_1:
	vpxor	%xmm0, %xmm0, %xmm0
	jmp	LBB0_7
LBB0_8:
	leaq	96(%rsi), %rdi
	subq	%rax, %rdx
	vpxor	%xmm0, %xmm0, %xmm0
	xorl	%ecx, %ecx
	.p2align	4, 0x90
LBB0_9:                                 ## =>This Inner Loop Header: Depth=1
	vpaddq	-96(%rdi), %ymm0, %ymm0
	vpaddq	-64(%rdi), %ymm0, %ymm0
	vpaddq	-32(%rdi), %ymm0, %ymm0
	vpaddq	(%rdi), %ymm0, %ymm0
	addq	$4, %rcx
	subq	$-128, %rdi
	cmpq	%rcx, %rdx
	jne	LBB0_9
## %bb.4:
	testq	%rax, %rax
	je	LBB0_7
LBB0_5:
	shlq	$5, %rcx
	addq	%rcx, %rsi
	negq	%rax
	.p2align	4, 0x90
LBB0_6:                                 ## =>This Inner Loop Header: Depth=1
	vpaddq	(%rsi), %ymm0, %ymm0
	addq	$32, %rsi
	incq	%rax
	jne	LBB0_6
LBB0_7:
	vextracti128	$1, %ymm0, %xmm1
	vpaddq	%ymm1, %ymm0, %ymm0
	vpshufd	$78, %xmm0, %xmm1       ## xmm1 = xmm0[2,3,0,1]
	vpaddq	%xmm1, %xmm0, %xmm0
	vmovq	%xmm0, %rax
	popq	%rbp
	vzeroupper
	retq
	.cfi_endproc
                                        ## -- End function
	.section	__TEXT,__literal4,4byte_literals
	.p2align	2               ## -- Begin function main
LCPI1_0:
	.long	1232348160              ## float 1.0E+6
	.section	__TEXT,__text,regular,pure_instructions
	.globl	_main
	.p2align	4, 0x90
_main:                                  ## @main
	.cfi_startproc
## %bb.0:
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset %rbp, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register %rbp
	pushq	%r15
	pushq	%r14
	pushq	%r13
	pushq	%r12
	pushq	%rbx
	subq	$24, %rsp
	.cfi_offset %rbx, -56
	.cfi_offset %r12, -48
	.cfi_offset %r13, -40
	.cfi_offset %r14, -32
	.cfi_offset %r15, -24
	movl	$32, %edi
	movl	$1280000000, %esi       ## imm = 0x4C4B4000
	callq	_aligned_alloc
	movq	%rax, %r13
	xorl	%ebx, %ebx
	xorl	%edi, %edi
	callq	_time
	movl	%eax, %edi
	callq	_srand
	movabsq	$-6640827866535438581, %r14 ## imm = 0xA3D70A3D70A3D70B
	.p2align	4, 0x90
LBB1_1:                                 ## =>This Inner Loop Header: Depth=1
	callq	_rand
	movslq	%eax, %rcx
	movq	%rcx, %rax
	imulq	%r14
	addq	%rcx, %rdx
	movq	%rdx, %rax
	shrq	$63, %rax
	sarq	$6, %rdx
	addq	%rax, %rdx
	imulq	$100, %rdx, %rax
	subq	%rax, %rcx
	movq	%rcx, (%r13,%rbx,8)
	incq	%rbx
	cmpq	$160000000, %rbx        ## imm = 0x9896800
	jne	LBB1_1
## %bb.2:
	movl	$28, %ebx
	callq	_clock
	vpxor	%xmm3, %xmm3, %xmm3
	movq	%rax, %r14
	vpxor	%xmm0, %xmm0, %xmm0
	vpxor	%xmm1, %xmm1, %xmm1
	vpxor	%xmm2, %xmm2, %xmm2
	.p2align	4, 0x90
LBB1_3:                                 ## =>This Inner Loop Header: Depth=1
	vpaddq	-224(%r13,%rbx,8), %ymm3, %ymm3
	vpaddq	-192(%r13,%rbx,8), %ymm0, %ymm0
	vpaddq	-160(%r13,%rbx,8), %ymm1, %ymm1
	vpaddq	-128(%r13,%rbx,8), %ymm2, %ymm2
	vpaddq	-96(%r13,%rbx,8), %ymm3, %ymm3
	vpaddq	-64(%r13,%rbx,8), %ymm0, %ymm0
	vpaddq	-32(%r13,%rbx,8), %ymm1, %ymm1
	vpaddq	(%r13,%rbx,8), %ymm2, %ymm2
	addq	$32, %rbx
	cmpq	$160000028, %rbx        ## imm = 0x989681C
	jne	LBB1_3
## %bb.4:
	vpaddq	%ymm3, %ymm0, %ymm0
	vpaddq	%ymm0, %ymm1, %ymm0
	vpaddq	%ymm0, %ymm2, %ymm0
	vextracti128	$1, %ymm0, %xmm1
	vpaddq	%ymm1, %ymm0, %ymm0
	vpshufd	$78, %xmm0, %xmm1       ## xmm1 = xmm0[2,3,0,1]
	vpaddq	%xmm1, %xmm0, %xmm0
	vmovq	%xmm0, %r15
	movl	$128, %ebx
	vzeroupper
	callq	_clock
	vpxor	%xmm1, %xmm1, %xmm1
	movq	%rax, %r12
	.p2align	4, 0x90
LBB1_5:                                 ## =>This Inner Loop Header: Depth=1
	vpaddq	-128(%r13,%rbx), %ymm1, %ymm0
	vpaddq	-96(%r13,%rbx), %ymm0, %ymm0
	vpaddq	-64(%r13,%rbx), %ymm0, %ymm0
	vpaddq	-32(%r13,%rbx), %ymm0, %ymm0
	vpaddq	(%r13,%rbx), %ymm0, %ymm1
	addq	$160, %rbx
	cmpq	$1280000128, %rbx       ## imm = 0x4C4B4080
	jne	LBB1_5
## %bb.6:
	vextracti128	$1, %ymm1, %xmm0
	vpaddq	%ymm0, %ymm1, %ymm0
	vpshufd	$78, %xmm0, %xmm1       ## xmm1 = xmm0[2,3,0,1]
	vpaddq	%xmm1, %xmm0, %xmm0
	vmovdqa	%xmm0, -64(%rbp)        ## 16-byte Spill
	vzeroupper
	callq	_clock
	movq	%rax, %rbx
	movq	%r12, %rax
	subq	%r14, %rax
	js	LBB1_7
## %bb.8:
	vcvtsi2ssq	%rax, %xmm4, %xmm0
	jmp	LBB1_9
LBB1_7:
	movq	%rax, %rcx
	shrq	%rcx
	andl	$1, %eax
	orq	%rcx, %rax
	vcvtsi2ssq	%rax, %xmm4, %xmm0
	vaddss	%xmm0, %xmm0, %xmm0
LBB1_9:
	vmovdqa	-64(%rbp), %xmm1        ## 16-byte Reload
	vmovq	%xmm1, %r14
	vdivss	LCPI1_0(%rip), %xmm0, %xmm0
	vcvtss2sd	%xmm0, %xmm0, %xmm0
	leaq	L_.str(%rip), %rdi
	movq	%r15, %rsi
	movb	$1, %al
	callq	_printf
	subq	%r12, %rbx
	js	LBB1_10
## %bb.11:
	vcvtsi2ssq	%rbx, %xmm4, %xmm0
	jmp	LBB1_12
LBB1_10:
	movq	%rbx, %rax
	shrq	%rax
	andl	$1, %ebx
	orq	%rax, %rbx
	vcvtsi2ssq	%rbx, %xmm4, %xmm0
	vaddss	%xmm0, %xmm0, %xmm0
LBB1_12:
	vdivss	LCPI1_0(%rip), %xmm0, %xmm0
	vcvtss2sd	%xmm0, %xmm0, %xmm0
	leaq	L_.str.1(%rip), %rdi
	movq	%r14, %rsi
	movb	$1, %al
	callq	_printf
	xorl	%eax, %eax
	addq	$24, %rsp
	popq	%rbx
	popq	%r12
	popq	%r13
	popq	%r14
	popq	%r15
	popq	%rbp
	retq
	.cfi_endproc
                                        ## -- End function
	.section	__TEXT,__cstring,cstring_literals
L_.str:                                 ## @.str
	.asciz	"scalar : %lld, in %f s\n"

L_.str.1:                               ## @.str.1
	.asciz	"vector : %lld, in %f s\n"


.subsections_via_symbols
