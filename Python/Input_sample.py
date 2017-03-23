# Python input and string formatting

# note conversion on strings to numeric type with float() or int()
name = input("input your name: ")
programming_age = float(input("input years programming: "))
programming_count = int(input("how many programs have you writen: "))

programs_per_year = programming_count/programming_age

print("you have written ", programs_per_year, 'program per year')

