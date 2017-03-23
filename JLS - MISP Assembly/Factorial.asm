#int factorial(int n)
#{
#	if (n <= 1)
#		return 1;
#	else
#		return (n * factorial (n-1));
#}

main:
addi $a0, $0, 5
jal factorial

factorial:
addi $t0, $0, 1
beq $a0, $t0, basecase		#If n = 1 then go to return

addi $sp, $sp, -8
sw $ra, 4($sp)
sw $a0, 0($sp)
addi $a0, $a0, -1
jal factorial

lw $t1, 0($sp)
lw $ra, 4($sp)
addi $sp, $sp, 8
mult $t1, $v0
mflo $v0
jr $ra 

basecase:
addi $v0, $0, 1
jr $ra
