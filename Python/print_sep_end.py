#########################
# print end and sep

# print( v1, v2, v3 ... ) will print the v1, v2 and v3 normally separated by one space
# print( v1, v2, v3 ... , sep="text")
# will use the text as the separator between v1,v2, and v3

# example
print( "Joe", "Tom", "Sally", "Kim", sep=" works for " )

print( "Joe", "Tom", "Sally", "Kim", sep=", " ) # turn multi line to one line

# print( v1, v2, v3 ... end = "text") normally a new line is printed at end
# the end='text' parameter can change that so it stays on the same line
print("joe")
print("tom")
print("sam")

print("vs")

print("joe" ,end=' ')
print("tom" ,end=' ')
print("sam" ,end=' ')
print("end")
# note that the last print goes on same line,
# since there was not new line

# end=""  is used when looping to create a column of numbers often.
# simular to using java print instead of println