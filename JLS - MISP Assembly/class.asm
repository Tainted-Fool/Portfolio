nop
nop
la $t0, stuff1			#load address of stuff to $t0
lw $t2, 0($t0)			#loads the word of $t0 to $t2

.data
stuff: .word 35 		#in the data segment put 35 in the first word
stuff1: .word 36
.text
