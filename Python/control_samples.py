# if else while for and exceptions all are called 'compound' statements.

# it will ask you which code sample to run here
run_sample = int(input("which sample? "))

#---------if
if  run_sample == 1:
    print("sample 1")

# syntax
# if expression:
#     indented
#     python
#     statements form
#     body of if
# statement after if is not indented


#---------Nested
if (run_sample == 2):

    age = 22
    print("sample 2")
    if age > 21:
        print("you can drink now")

#---------Nested and else
if (run_sample == 3):

    age = 20
    print("sample 3")
    if age > 21:
        print("you can drink now")
    else:
        print("drinking illegal")

#---------while
if (run_sample == 4):
    i = 0
    while i < 10:
        i += 1
        print(i, end=" ")
    print() # new line

#---------for i in range
# syntax

#for x in iterator:
#    body of for
if (run_sample == 5):
    for i in range(20):
        print(i, end=" ")
    print() # new line


#---------for i in list
if (run_sample == 6):
    for i in [11,22,23,55,2,13]:
        print(i,end=" ")


#--------for k,v in dict # special
if (run_sample == 7):
    d = { 'red':1, 'green':2, 'black':3}
    for k,v in d.items():
        print(k, " ", v)

#--------special statements
#    pass - do nothing but satisfy body placeholder
#    break - break out of loop
#    continue - go to top of current loop

#-------- if elif elif elif ... else
# with a while and break thrown in

if (run_sample == 8):
    while True:
        door = input("choose door A, B, or C or Q to quit").capitalize()
        if door == 'A':
            print("lose")
        elif door == 'B':
            print("win")
        elif door == 'C':
            print("lose")
        elif door == "Q":
            break
        else:
            print("WHAT WAS THAT")
    print("done")





