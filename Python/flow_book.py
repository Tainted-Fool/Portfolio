# CODE FROM BOOK:

counter = 1
while counter <= 5:
    print("Hello, world")
    counter = counter + 1 # you can use counter += 1 like java/C++

## NOTE you should always use 4 spaces to indent or set up your editor to insert
## 4 spaces when you type a tab, pyCharm has this a default

# you can use complex boolean expression in while, if, or for
done = True
while counter <= 10 and not done:
    pass # this is a statement place holder for body

for item in [5,10,25,99]:
    print(item)
print()

for item in range(10,4,-2):
    print(item)
print()

#nesting
import math
words = ['cat', 'dog', 'rabbit']
letters = [ ] # empty list
for a_word in words:
    for a_letter in a_word:
        letters.append(a_letter)
print(letters,"\n")  #extra new line

# if else
n = 144
if n<0:
    print("sorry, value is negative")
else:
    print("sqrt of", n, "is", math.sqrt(n))

# nested if
score = 75
print()

if score >= 90:
   print('A')
else:
   if score >=80:
      print('B')
   else:
      if score >= 70:
         print('C')
      else:
         if score >= 60:
            print('D')
         else:
            print('F')
print()

# better to use if elif elif elif ... else
if score >= 90:
   print('A')
elif score >=80:
   print('B')
elif score >= 70:
   print('C')
elif score >= 60:
   print('D')
else:
   print('F')

print()

# single selection

if n<0:
    n = abs(n)

print('\nafter single selection:', math.sqrt(n) )

# this is not in the book, but is is the if else ternary 'expression'
#  <expression if true> if <boolean expression> else <expression if false>

n  =  abs(n) if n<0 else n # example

# list comprehension, special syntax for creating a list using for and optional if

# list of squares:
# normal way

sq_list = []
for x in range(1,11):
    sq_list.append(x*x)
    
# same with list comprehension:
sq_list = [ x*x for x in range(1,11)]

# only squares of odd number 1,3,5,7,9
sq_list_odd = [ x*x for x in range(1,11) if x%2 != 0]

# list of no vowels and changed to caps
print("\n", [ch.upper() for ch in 'compreh  ension' if ch not in 'aeiou'])