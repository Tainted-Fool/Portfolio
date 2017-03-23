#CS 51
#Lab 3
#Lazaro Herrera

.data						#data from random access memory
	prompt: .asciiz "an = 2 x an - 1 + 5 \nEnter n value:"
	message: .asciiz "Your an is:"
	number: .word 0
	answer: .word 0
.text	
	main:					#instructions
		li $v0, 4			#prints out prompt
		la $a0, prompt
		syscall
		
		li $v0, 5			#gets input from user
		syscall
		
		sw $v0, number			#store number into $v0
		lw $a0, number			#store number into $a0
		jal function			#jumps to label and executes code
		sw $v0, answer
		
		li $v0, 4			#prints out message
		la $a0, message
		syscall
		
		li $v0, 1			#prints the answer
		lw $a0, answer
		syscall
		
		li $v0, 10			#this stops the program
		syscall
		
	function:
		addi $sp, $sp, -4		
		sw $ra, 0($sp)			#stores the value of return address to the stack so we know to return to caller
		#sw $s0, 4($sp)			#stores the vlaue of $s0 to the second position of the stack
		
		slti $t0, $a0, 2		#set $t0 to 1 true or 0 false if arugment is less than 2
		beq $t0, $0, else		#if false go to else otherwise do below
		
		addi $v0, $0, 3			#if true then argument must return 3
		j return
		
	else:
		sub $a0, $a0, 1			#an - 1
		jal function			#keeps calling function
		
		addi $t1, $0, 2			#$t1 = 2
		mul $t2, $t1, $v0		#t2 = 2 * $v0
		addi $t3, $0, 5			#$t3 = 5
		add $t4, $t2, $t3		#t4 = (2 * $v0) + 5
		move $v0, $t4
		

	return:
		lw $ra, 0($sp)			#load return address
		#lw $s0, 4($sp)			#loads local variable
		addi $sp, $sp, 4		#restores stack
		
		jr $ra				#goes back to where it was called, return to caller
	
