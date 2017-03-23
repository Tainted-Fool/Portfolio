# $s0 = array base address, $s1 = i
# initialization code
#int array[1000];
#int i;
#
#for (i = 0; i < 1000; i = i + 1)
#	array[i] = array[i] * 8;

lui  $s0, 0x23B8        # $s0 = 0x23B80000
ori  $s0, $s0, 0xF000   # $s0 = 0x23B8F000
addi $s1, $0, 0         # i = 0
addi $t2, $0, 1000      # $t2 = 1000

loop:
slt  $t0, $s1, $t2      # i < 1000?
beq  $t0, $0, done      # if not then done
sll  $t0, $s1, 2        # $t0 = i * 4 (byte offset) 2 to the i so this is 2^2 = 4
add  $t0, $t0, $s0      # address of array[i]
lw   $t1, 0($t0)        # $t1 = array[i]
sll  $t1, $t1, 3        # $t1 = array[i] * 8 so this is 2^3 = 8
sw   $t1, 0($t0)        # array[i] = array[i] * 8
addi $s1, $s1, 1        # i = i + 1
j    loop               # repeat
done:
