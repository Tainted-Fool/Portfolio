#$s0 = f + g $s1 = h + i
#$rsult($s3) = $s0 - $s1 $ra = return address
addi $a0, $0, 2	#arguments
addi $a1, $0, 3
addi $a2, $0, 4
addi $a3, $0, 5

jal diffofsums  #this is caller
add $t0, $v0, $0
j done

diffofsums:
add $t0, $a0, $a1 #$t0 = f + g
add $t1, $a2, $a3 #$t1 = h + i
sub $s0, $t0, $s1 #result = (f + g) - (h + i)
add $v0, $s0, $0 #put return value in $v0
jr $ra		 #return to caller

done:
