# $s0 = i, $s1 = sum
#for (i = 1; i < 101; i = i * 2)
#{
#	sum = sum + i;
#}
addi $s1, $0, 0
add  $s0, $0, $0
addi $t0, $0, 101
loop:
slt $t1, $s0, $t0
beq  $t1, $0, done
add  $s1, $s1, $s0
sll $s0, $s0, 1
j loop
done:
