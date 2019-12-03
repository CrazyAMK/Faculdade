	.text
	.file	"sum.c"
	.globl	sum                     # -- Begin function sum
	.p2align	4, 0x90
	.type	sum,@function
sum:                                    # @sum
	.cfi_startproc
# %bb.0:
	movl	8(%esp), %eax
	addl	4(%esp), %eax
	retl
.Lfunc_end0:
	.size	sum, .Lfunc_end0-sum
	.cfi_endproc
                                        # -- End function

	.ident	"clang version 9.0.0-2 (tags/RELEASE_900/final)"
	.section	".note.GNU-stack","",@progbits
