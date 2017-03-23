# Python input and string formatting

name = input("input your name: ")
programming_age = float(input("input years programming: "))
programming_count = int(input("how many programs have you writen: "))

programs_per_year = programming_count/programming_age

print("you have written ", programs_per_year, 'program per year')

exit()


# FORMATTING
# best web tutorial on string formatting is at
# http://www.python-course.eu/python3_formatted_output.php

#                 --------------------------------------------
#                 v                                          ^
# s = "my name is %s and I make $ %.2f dollars an hour." % ( 25, 18.50 )
#                                 ^                              v
#                                 --------------------------------
#
#   syntax   format_string % tuple

line1 = "My name is %s and I average %.1f programs per year" % (name, programs_per_year)

line2 = "I have been programming for %d years" % (programming_count)

print(line1)
print(line2)

# lining up columns of floats and ints with the width specifier

format = "%10d%12.2f"
print( "%10s%12s" % ("Number", "Sales")) # put titles in columns 10 and 12
print( format % ( 1, 12345.67))
print( format % ( 100, 1.0))
print( format % ( 1000, 0.55))
print( format % ( 11, 100000.00))
print( format % ( 11200, 1.2))
print( format % ( 1199999, 12.5))
