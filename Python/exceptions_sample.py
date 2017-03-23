# exceptions section
import math

# programs have two general category of error:

# 1. syntax and 2. logic

# uncomment the next line and you would see a syntax error because there is no :
# for i in range(10)

# logic errors are when the program does not perform correctly when run
# sometimes this results in a situation where the python interpreter will
# just stop the program and raise a 'runtime error'

# uncomment the next line to see an example
# print(math.sqrt(-2))

# these type of runtime errors are called exceptions

# the beginner sees these exceptions as an error that is fatal to their program and should
# be avoided

# but many languages allow the program to intercept these errors and do something different
# so the program continues to run

# check out this code, this is a new compound statement call a 'try catch' block

x = float(input("input number: "))
try:
    print(math.sqrt(x))
except:
    print("your input of %g was a bad value" % (x))
    print("I am printing the square root of %g instead" % (abs(x)))
    print(math.sqrt(abs(x)))

# you may be writing a program that you have 'custom' reasons to cause your own runtime error
# in this case you can use the raise statement to do that:

x = float(input("input your income:  "))
if x < 0:
    raise RuntimeError("your income can't be negative")

# there is a lot more to exceptions that this, to know more check out the python online documentation