#int array[5]
#array[0] = array[0] * 2;
#array[1] = array[1] * 2;
# array base address = $s0

lui $s0, 0x1234        	# 0x1234 in upper half of $S0
ori $s0, $s0, 0x8000   	# 0x8000 in lower half of $s0

lw $t1, 0($s0)        	# $t1 = array[0]
sll $t1, $t1, 1        	# $t1 = $t1 * 2
sw $t1, 0($s0)        	# array[0] = $t1

lw $t1, 4($s0)        	# $t1 = array[1]
sll $t1, $t1, 1        	# $t1 = $t1 * 2
sw $t1, 4($s0)        	# array[1] = $t1
